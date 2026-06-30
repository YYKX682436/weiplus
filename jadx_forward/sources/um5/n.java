package um5;

/* loaded from: classes10.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um5.p f510706d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f510707e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(um5.p pVar, android.graphics.Bitmap bitmap) {
        super(0);
        this.f510706d = pVar;
        this.f510707e = bitmap;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        um5.p pVar = this.f510706d;
        int i17 = pVar.f510710u.f510683a;
        if (i17 > 0) {
            android.opengl.GLES20.glDeleteTextures(1, new int[i17], 0);
        }
        int m97623x3164f87f = com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97623x3164f87f(3553);
        um5.f fVar = pVar.f510710u;
        fVar.f510683a = m97623x3164f87f;
        xm5.b.c(pVar.f510709t, "create input textureId:" + fVar.f510683a, new java.lang.Object[0]);
        fVar.f510684b = false;
        android.opengl.GLES20.glBindTexture(3553, fVar.f510683a);
        android.graphics.Bitmap bitmap = this.f510707e;
        android.opengl.GLUtils.texImage2D(3553, 0, bitmap, 0);
        android.opengl.GLES20.glTexParameterf(3553, 10241, 9729.0f);
        android.opengl.GLES20.glTexParameterf(3553, com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb, 9729.0f);
        android.opengl.GLES20.glTexParameterf(3553, 10242, 10497.0f);
        android.opengl.GLES20.glTexParameterf(3553, 10243, 10497.0f);
        android.opengl.GLES20.glBindTexture(3553, 0);
        fVar.f510685c = bitmap.getWidth();
        fVar.f510686d = bitmap.getHeight();
        fVar.f510687e = 0;
        return jz5.f0.f384359a;
    }
}
