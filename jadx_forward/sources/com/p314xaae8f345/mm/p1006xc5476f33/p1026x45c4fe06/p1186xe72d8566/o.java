package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566;

/* loaded from: classes5.dex */
public final class o implements com.p314xaae8f345.mm.sdk.p2603x2137b148.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f170070a;

    public o(android.graphics.Bitmap bitmap) {
        this.f170070a = bitmap;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.w
    public final void a(java.io.OutputStream outputStream) {
        android.graphics.Bitmap bitmap = this.f170070a;
        if (bitmap != null) {
            try {
                bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, outputStream);
            } finally {
            }
        }
        vz5.b.a(outputStream, null);
    }
}
