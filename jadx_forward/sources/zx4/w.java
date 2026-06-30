package zx4;

/* loaded from: classes5.dex */
public final class w implements com.p314xaae8f345.mm.sdk.p2603x2137b148.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f558738a;

    public w(android.graphics.Bitmap bitmap) {
        this.f558738a = bitmap;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.w
    public final void a(java.io.OutputStream outputStream) {
        try {
            this.f558738a.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, outputStream);
            vz5.b.a(outputStream, null);
        } finally {
        }
    }
}
