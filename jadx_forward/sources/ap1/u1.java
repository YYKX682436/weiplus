package ap1;

/* loaded from: classes5.dex */
public class u1 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public j75.f f94279d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        em.c4 c4Var = new em.c4(m80380x71e92c1d());
        c4Var.e().setOnClickListener(new ap1.q1(this));
        j75.f fVar = this.f94279d;
        if (fVar == null) {
            fVar = Q6();
            this.f94279d = fVar;
        }
        if (fVar != null) {
            fVar.z3(m158354x19263085(), ap1.r1.f94267d);
        }
        ap1.t1 t1Var = new ap1.t1(c4Var);
        j75.f fVar2 = this.f94279d;
        if (fVar2 == null) {
            fVar2 = Q6();
            this.f94279d = fVar2;
        }
        if (fVar2 != null) {
            fVar2.L2(m158354x19263085(), new ap1.s1(t1Var));
        }
    }
}
