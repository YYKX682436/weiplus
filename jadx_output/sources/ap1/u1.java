package ap1;

/* loaded from: classes5.dex */
public class u1 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public j75.f f12746d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        em.c4 c4Var = new em.c4(getRootView());
        c4Var.e().setOnClickListener(new ap1.q1(this));
        j75.f fVar = this.f12746d;
        if (fVar == null) {
            fVar = Q6();
            this.f12746d = fVar;
        }
        if (fVar != null) {
            fVar.z3(getActivity(), ap1.r1.f12734d);
        }
        ap1.t1 t1Var = new ap1.t1(c4Var);
        j75.f fVar2 = this.f12746d;
        if (fVar2 == null) {
            fVar2 = Q6();
            this.f12746d = fVar2;
        }
        if (fVar2 != null) {
            fVar2.L2(getActivity(), new ap1.s1(t1Var));
        }
    }
}
