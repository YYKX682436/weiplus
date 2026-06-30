package aa3;

/* loaded from: classes15.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aa3.z f2624d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(aa3.z zVar) {
        super(0);
        this.f2624d = zVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        aa3.z zVar = this.f2624d;
        aa3.p0 p0Var = zVar.f2628g;
        nl1.b bVar = zVar.f2629h;
        if (bVar == null) {
            p0Var.getClass();
        } else {
            p0Var.setInputEventReceiver(bVar);
            p0Var.setVisibility(0);
        }
        ((aa3.o) zVar.f2627f).f2567a.d();
        return jz5.f0.f302826a;
    }
}
