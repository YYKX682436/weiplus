package cj5;

/* loaded from: classes.dex */
public final class o3 implements com.p314xaae8f345.mm.ui.p2690x38b72420.m4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cj5.u3 f123741a;

    public o3(cj5.u3 u3Var) {
        this.f123741a = u3Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.m4
    public void a() {
        cj5.u3 u3Var = this.f123741a;
        u3Var.V6().b().clearFocus();
        u3Var.V6().j().requestFocus();
        u3Var.V6().j().setVisibility(8);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 k17 = u3Var.V6().k();
        if (k17 != null) {
            k17.setImportantForAccessibility(0);
        }
        u3Var.m174141x36654fab();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.m4
    public void b() {
        this.f123741a.m174141x36654fab();
    }
}
