package ku3;

/* loaded from: classes10.dex */
public final class e0 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.i0 f393734d;

    public e0(ku3.i0 i0Var) {
        this.f393734d = i0Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        zt3.b bVar = (zt3.b) obj;
        int i17 = bVar.f557118a;
        ku3.i0 i0Var = this.f393734d;
        if (i17 == 1) {
            i0Var.f393784d.S6(9, new ku3.a0(i0Var));
            ku3.b0 b0Var = new ku3.b0(i0Var);
            zt3.a aVar = i0Var.f393784d;
            aVar.S6(5, b0Var);
            aVar.S6(6, new ku3.c0(i0Var));
            aVar.S6(7, new ku3.d0(i0Var));
            return;
        }
        if (i17 != 2) {
            return;
        }
        jz5.f0 f0Var = null;
        android.os.Bundle bundle = bVar.f557119b;
        java.lang.Integer valueOf = bundle != null ? java.lang.Integer.valueOf(bundle.getInt("PARAM_1_INT")) : null;
        if (valueOf != null) {
            valueOf.intValue();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = i0Var.a().mo7946xf939df19();
            if (!(mo7946xf939df19 instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.f2)) {
                mo7946xf939df19 = null;
            }
            if (mo7946xf939df19 != null) {
                mo7946xf939df19.m8147xed6e4d18(valueOf.intValue());
                f0Var = jz5.f0.f384359a;
            }
            if (f0Var != null) {
                return;
            }
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df192 = i0Var.a().mo7946xf939df19();
        if (mo7946xf939df192 != null) {
            mo7946xf939df192.m8146xced61ae5();
        }
    }
}
