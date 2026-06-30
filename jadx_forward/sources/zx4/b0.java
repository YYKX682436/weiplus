package zx4;

/* loaded from: classes4.dex */
public final class b0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f558647a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f558648b;

    public b0(java.lang.String str, android.graphics.Bitmap bitmap) {
        this.f558647a = str;
        this.f558648b = bitmap;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.w
    public void a(java.io.OutputStream os6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(os6, "os");
        try {
            boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f558647a);
            android.graphics.Bitmap bitmap = this.f558648b;
            if (K0) {
                bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, os6);
            } else {
                bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, os6);
            }
            vz5.b.a(os6, null);
        } catch (java.lang.Throwable th6) {
            try {
                throw th6;
            } catch (java.lang.Throwable th7) {
                vz5.b.a(os6, th6);
                throw th7;
            }
        }
    }
}
