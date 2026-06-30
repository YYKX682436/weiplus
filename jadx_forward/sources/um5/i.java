package um5;

/* loaded from: classes10.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um5.p f510699d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(um5.p pVar) {
        super(0);
        this.f510699d = pVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        um5.p pVar = this.f510699d;
        if (pVar.f510710u.f510683a > 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("destroy extern input textureId:");
            um5.f fVar = pVar.f510710u;
            sb6.append(fVar.f510683a);
            xm5.b.c(pVar.f510709t, sb6.toString(), new java.lang.Object[0]);
            android.opengl.GLES20.glDeleteTextures(1, new int[]{fVar.f510683a}, 0);
        }
        return jz5.f0.f384359a;
    }
}
