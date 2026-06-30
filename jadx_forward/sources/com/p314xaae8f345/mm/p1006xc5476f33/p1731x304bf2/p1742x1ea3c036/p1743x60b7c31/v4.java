package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes.dex */
public class v4 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f221293d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sd.b f221294e;

    public v4(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.x4 x4Var, java.lang.String str, sd.b bVar) {
        this.f221293d = str;
        this.f221294e = bVar;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        boolean z17 = bundle.getBoolean("backRet");
        java.io.OutputStream outputStream = null;
        sd.b bVar = this.f221294e;
        if (!z17) {
            bVar.c("exceed_size", null);
            return;
        }
        boolean z18 = bundle.getBoolean("backIsFile", false);
        java.lang.String string = bundle.getString("backFileName");
        if (z18 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSetGameData", "store data to file. fileName:%s", string);
            ew4.c.c().getClass();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                java.lang.String str = this.f221293d;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    int length = str.getBytes().length;
                    java.lang.String str2 = ew4.d.P0() + string;
                    com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(ew4.d.P0());
                    if (!r6Var.m() || !r6Var.y()) {
                        r6Var.J();
                    }
                    try {
                        byte[] bytes = str.getBytes();
                        outputStream = com.p314xaae8f345.mm.vfs.w6.K(str2, false);
                        outputStream.write(bytes);
                    } catch (java.io.IOException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewDataCenter", "savePageCache: " + e17.getMessage());
                    }
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (java.io.IOException unused) {
                        }
                    }
                }
            }
        }
        bVar.a();
    }
}
