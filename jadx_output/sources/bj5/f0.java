package bj5;

/* loaded from: classes.dex */
public final class f0 extends zm3.b {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f21182d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f21182d = jz5.h.b(new bj5.e0(this));
    }

    public static final void U6(bj5.f0 f0Var, int i17) {
        j75.f stateCenter;
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = f0Var.P6();
        if (P6 == null || (stateCenter = P6.getStateCenter()) == null) {
            return;
        }
        stateCenter.B3(new wi5.t(i17));
    }

    public final em.l2 V6() {
        return (em.l2) ((jz5.n) this.f21182d).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f stateCenter;
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 == null || (stateCenter = P6.getStateCenter()) == null) {
            return;
        }
        stateCenter.L2(getActivity(), new bj5.d0(this));
    }
}
