package jn1;

/* loaded from: classes4.dex */
public final class c0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f382021a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f382022b;

    public c0(android.graphics.Bitmap bitmap, java.lang.String str) {
        this.f382021a = bitmap;
        this.f382022b = str;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.w
    public final void a(java.io.OutputStream outputStream) {
        try {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Avatar.HdAvatarUpdateSmallFilePPC", "update small bitmap result:" + this.f382021a.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, outputStream) + " username:" + this.f382022b);
            } finally {
                try {
                } finally {
                    try {
                        outputStream.close();
                    } catch (java.lang.Exception unused) {
                    }
                }
            }
        } catch (java.lang.Exception unused2) {
        }
    }
}
