package q35;

/* loaded from: classes5.dex */
public class f implements com.p314xaae8f345.mm.sdk.p2603x2137b148.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f441511a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap.CompressFormat f441512b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f441513c;

    public f(android.graphics.Bitmap bitmap, android.graphics.Bitmap.CompressFormat compressFormat, int i17) {
        this.f441511a = bitmap;
        this.f441512b = compressFormat;
        this.f441513c = i17;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.w
    public void a(java.io.OutputStream outputStream) {
        try {
            try {
                this.f441511a.compress(this.f441512b, this.f441513c, outputStream);
                outputStream.flush();
                try {
                    outputStream.close();
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VideoUtil", e17, "", new java.lang.Object[0]);
                }
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VideoUtil", e18, "", new java.lang.Object[0]);
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (java.io.IOException e19) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VideoUtil", e19, "", new java.lang.Object[0]);
                    }
                }
            }
        } catch (java.lang.Throwable th6) {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (java.io.IOException e27) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VideoUtil", e27, "", new java.lang.Object[0]);
                }
            }
            throw th6;
        }
    }
}
