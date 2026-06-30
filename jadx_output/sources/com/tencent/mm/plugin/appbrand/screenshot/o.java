package com.tencent.mm.plugin.appbrand.screenshot;

/* loaded from: classes5.dex */
public final class o implements com.tencent.mm.sdk.platformtools.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f88537a;

    public o(android.graphics.Bitmap bitmap) {
        this.f88537a = bitmap;
    }

    @Override // com.tencent.mm.sdk.platformtools.w
    public final void a(java.io.OutputStream outputStream) {
        android.graphics.Bitmap bitmap = this.f88537a;
        if (bitmap != null) {
            try {
                bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, outputStream);
            } finally {
            }
        }
        vz5.b.a(outputStream, null);
    }
}
