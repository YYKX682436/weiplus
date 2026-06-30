package cj5;

/* loaded from: classes.dex */
public final class u3 extends zm3.b {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f42250d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f42251e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f42252f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f42250d = jz5.h.b(new cj5.r3(this));
        this.f42251e = true;
        this.f42252f = new java.util.ArrayList();
    }

    public static final void U6(cj5.u3 u3Var, boolean z17, java.lang.String str) {
        if (z17) {
            u3Var.getClass();
            if (r26.n0.N(str)) {
                if (!(!u3Var.f42252f.isEmpty())) {
                    u3Var.V6().j().setVisibility(8);
                    com.tencent.mm.view.recyclerview.WxRecyclerView k17 = u3Var.V6().k();
                    if (k17 == null) {
                        return;
                    }
                    k17.setImportantForAccessibility(0);
                    return;
                }
                u3Var.V6().j().setVisibility(0);
                u3Var.V6().a().r(null, u3Var.f42252f);
                com.tencent.mm.view.recyclerview.WxRecyclerView k18 = u3Var.V6().k();
                if (k18 == null) {
                    return;
                }
                k18.setImportantForAccessibility(4);
                return;
            }
        }
        u3Var.V6().j().setVisibility(8);
        com.tencent.mm.view.recyclerview.WxRecyclerView k19 = u3Var.V6().k();
        if (k19 == null) {
            return;
        }
        k19.setImportantForAccessibility(0);
    }

    public final em.l2 V6() {
        return (em.l2) ((jz5.n) this.f42250d).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        j75.f Q6;
        wi5.n0 n0Var;
        super.onActivityResult(i17, i18, intent);
        if (intent == null || i17 != 3) {
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
        if ((stringExtra == null || r26.n0.N(stringExtra)) || (Q6 = Q6()) == null || (n0Var = (wi5.n0) Q6.getState()) == null) {
            return;
        }
        if (n0Var.e()) {
            j75.f Q62 = Q6();
            if (Q62 != null) {
                Q62.B3(new wi5.j0(r26.n0.f0(stringExtra, new java.lang.String[]{","}, false, 0, 6, null), i17));
                return;
            }
            return;
        }
        j75.f Q63 = Q6();
        if (Q63 != null) {
            Q63.B3(new wi5.c0(r26.n0.f0(stringExtra, new java.lang.String[]{","}, false, 0, 6, null), i17));
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f stateCenter;
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 == null || (stateCenter = P6.getStateCenter()) == null) {
            return;
        }
        stateCenter.L2(getActivity(), new cj5.q3(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        if (this.f42251e) {
            this.f42251e = false;
            pm0.v.K(null, new cj5.t3(this));
        }
    }
}
