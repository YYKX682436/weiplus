package um5;

/* loaded from: classes10.dex */
public final class d0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um5.i0 f510678d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f510679e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f510680f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ um5.b0 f510681g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(um5.i0 i0Var, android.graphics.Bitmap bitmap, java.lang.String str, um5.b0 b0Var) {
        super(0);
        this.f510678d = i0Var;
        this.f510679e = bitmap;
        this.f510680f = str;
        this.f510681g = b0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int m97623x3164f87f = com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97623x3164f87f(3553);
        um5.i0 i0Var = this.f510678d;
        xm5.b.c(i0Var.f510700t, "newBitmapInputTexture id:" + m97623x3164f87f, new java.lang.Object[0]);
        android.opengl.GLES20.glBindTexture(3553, m97623x3164f87f);
        android.graphics.Bitmap bitmap = this.f510679e;
        android.opengl.GLUtils.texImage2D(3553, 0, bitmap, 0);
        android.opengl.GLES20.glTexParameterf(3553, 10241, 9729.0f);
        android.opengl.GLES20.glTexParameterf(3553, com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb, 9729.0f);
        android.opengl.GLES20.glTexParameterf(3553, 10242, 10497.0f);
        android.opengl.GLES20.glTexParameterf(3553, 10243, 10497.0f);
        android.opengl.GLES20.glBindTexture(3553, 0);
        i0Var.f510701u.add(new um5.z(this.f510680f, new um5.a0(m97623x3164f87f, false, bitmap.getWidth(), bitmap.getHeight(), 0, null), this.f510681g));
        return jz5.f0.f384359a;
    }
}
