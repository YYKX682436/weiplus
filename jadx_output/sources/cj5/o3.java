package cj5;

/* loaded from: classes.dex */
public final class o3 implements com.tencent.mm.ui.contact.m4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cj5.u3 f42208a;

    public o3(cj5.u3 u3Var) {
        this.f42208a = u3Var;
    }

    @Override // com.tencent.mm.ui.contact.m4
    public void a() {
        cj5.u3 u3Var = this.f42208a;
        u3Var.V6().b().clearFocus();
        u3Var.V6().j().requestFocus();
        u3Var.V6().j().setVisibility(8);
        com.tencent.mm.view.recyclerview.WxRecyclerView k17 = u3Var.V6().k();
        if (k17 != null) {
            k17.setImportantForAccessibility(0);
        }
        u3Var.hideVKB();
    }

    @Override // com.tencent.mm.ui.contact.m4
    public void b() {
        this.f42208a.hideVKB();
    }
}
