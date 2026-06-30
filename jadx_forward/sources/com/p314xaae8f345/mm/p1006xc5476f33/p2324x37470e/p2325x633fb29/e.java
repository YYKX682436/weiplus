package com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29;

/* loaded from: classes10.dex */
public final class e implements wm5.f {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.l f257112a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22979xbb268bc f257113b;

    /* renamed from: c, reason: collision with root package name */
    public final uq5.a f257114c;

    /* renamed from: d, reason: collision with root package name */
    public int f257115d;

    /* renamed from: e, reason: collision with root package name */
    public int f257116e;

    /* renamed from: f, reason: collision with root package name */
    public int f257117f;

    public e(yz5.l blendBitmapProvider, com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22979xbb268bc c22979xbb268bc) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(blendBitmapProvider, "blendBitmapProvider");
        this.f257112a = blendBitmapProvider;
        this.f257113b = c22979xbb268bc;
        uq5.y g17 = c22979xbb268bc != null ? c22979xbb268bc.g(uq5.k.BlendEffect) : null;
        this.f257114c = g17 instanceof uq5.a ? (uq5.a) g17 : null;
    }

    @Override // wm5.f
    public void a(long j17) {
        tq5.f fVar;
        com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22979xbb268bc c22979xbb268bc;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) this.f257112a.mo146xb9724478(java.lang.Long.valueOf(j17));
        boolean z17 = false;
        if (bitmap != null) {
            this.f257116e = bitmap.getWidth();
            this.f257117f = bitmap.getHeight();
            if (this.f257115d == 0) {
                int[] iArr = new int[1];
                android.opengl.GLES20.glGenTextures(1, iArr, 0);
                android.opengl.GLES20.glBindTexture(3553, iArr[0]);
                android.opengl.GLES20.glBindTexture(3553, 0);
                this.f257115d = iArr[0];
            }
            android.opengl.GLES20.glBindTexture(3553, this.f257115d);
            android.opengl.GLUtils.texImage2D(3553, 0, bitmap, 0);
            android.opengl.GLES20.glTexParameterf(3553, 10241, 9729.0f);
            android.opengl.GLES20.glTexParameterf(3553, com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb, 9729.0f);
            android.opengl.GLES20.glTexParameterf(3553, 10242, 10497.0f);
            android.opengl.GLES20.glTexParameterf(3553, 10243, 10497.0f);
            android.opengl.GLES20.glBindTexture(3553, 0);
            fVar = new tq5.f(this.f257115d, this.f257116e, this.f257117f, false, 0);
        } else {
            fVar = null;
        }
        if (fVar != null) {
            uq5.a aVar = this.f257114c;
            if (aVar != null && aVar.f511800a == 0) {
                z17 = true;
            }
            if (z17 && (c22979xbb268bc = this.f257113b) != null) {
                c22979xbb268bc.c(aVar);
            }
            if (aVar != null) {
                int i17 = fVar.f502789a;
                int i18 = fVar.f502790b;
                int i19 = fVar.f502791c;
                uq5.x xVar = aVar.f511764d;
                xVar.getClass();
                com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22985x615f1ce6.f39989x4fbc8495.m83858x4535dc5b(xVar.f511799a.f511802c, i17, i18, i19);
            }
            if (aVar != null) {
                uq5.x xVar2 = aVar.f511764d;
                xVar2.getClass();
                com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22985x615f1ce6.f39989x4fbc8495.m83843xdf10fd27(xVar2.f511799a.f511802c, true);
            }
        }
    }

    @Override // wm5.f
    public void b() {
        int i17 = this.f257115d;
        if (i17 != 0) {
            android.opengl.GLES20.glDeleteTextures(1, new int[]{i17}, 0);
            this.f257115d = 0;
        }
    }
}
