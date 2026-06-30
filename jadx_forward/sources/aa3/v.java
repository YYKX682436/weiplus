package aa3;

/* loaded from: classes15.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aa3.z f84139d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(aa3.z zVar) {
        super(0);
        this.f84139d = zVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        aa3.z zVar = this.f84139d;
        zVar.f84161g.setVisibility(8);
        zVar.f84158d.clearFocus();
        aa3.o oVar = (aa3.o) zVar.f84160f;
        oVar.getClass();
        oVar.f84100a.e(android.graphics.Insets.of(0, 0, 0, 0));
        zVar.f84161g.post(new aa3.u(zVar));
        return jz5.f0.f384359a;
    }
}
