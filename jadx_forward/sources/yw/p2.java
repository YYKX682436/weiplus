package yw;

/* loaded from: classes.dex */
public final class p2 implements k70.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f547956a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f547957b;

    public p2(java.lang.String str, yz5.l lVar) {
        this.f547956a = str;
        this.f547957b = lVar;
    }

    @Override // k70.u
    public final void a(android.graphics.Bitmap bitmap, byte[] bArr) {
        java.lang.String str = this.f547956a;
        yz5.l lVar = this.f547957b;
        if (bitmap == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizFlutterShareMsgHelper", "downloadImage result is null");
            if (lVar != null) {
                lVar.mo146xb9724478(null);
                return;
            }
            return;
        }
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(bitmap, 100, android.graphics.Bitmap.CompressFormat.JPEG, str, true);
            if (lVar != null) {
                lVar.mo146xb9724478(str);
            }
        } catch (java.io.IOException e17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("downloadImage save image cause io exception:");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizFlutterShareMsgHelper", sb6.toString());
            if (lVar != null) {
                lVar.mo146xb9724478(null);
            }
        } catch (java.lang.Exception e18) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("downloadImage save image cause exception:");
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e18));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizFlutterShareMsgHelper", sb7.toString());
            if (lVar != null) {
                lVar.mo146xb9724478(null);
            }
        }
    }
}
