package aa3;

/* loaded from: classes15.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aa3.z f2606d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(aa3.z zVar) {
        super(0);
        this.f2606d = zVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        aa3.z zVar = this.f2606d;
        zVar.f2628g.setVisibility(8);
        zVar.f2625d.clearFocus();
        aa3.o oVar = (aa3.o) zVar.f2627f;
        oVar.getClass();
        oVar.f2567a.e(android.graphics.Insets.of(0, 0, 0, 0));
        zVar.f2628g.post(new aa3.u(zVar));
        return jz5.f0.f302826a;
    }
}
