package ww1;

/* loaded from: classes15.dex */
public class h2 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5967xa7660a29 f531744d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f531745e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ww1.j2 f531746f;

    public h2(ww1.j2 j2Var, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5967xa7660a29 c5967xa7660a29, android.content.Context context) {
        this.f531746f = j2Var;
        this.f531744d = c5967xa7660a29;
        this.f531745e = context;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        ww1.j2 j2Var = this.f531746f;
        android.app.Dialog dialog = j2Var.f531754d;
        if (dialog != null && dialog.isShowing()) {
            j2Var.f531754d.dismiss();
            j2Var.f531754d = null;
        }
        gm0.j1.d().q(1800, this);
        ww1.q1 q1Var = (ww1.q1) m1Var;
        boolean z17 = q1Var.f295564i;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5967xa7660a29 c5967xa7660a29 = this.f531744d;
        if (!z17 && !q1Var.f295565m) {
            am.vs vsVar = c5967xa7660a29.f136265h;
            r45.wu5 wu5Var = q1Var.f531803r;
            vsVar.f89746b = wu5Var.f471010f;
            vsVar.f89747c = wu5Var.f471011g;
        }
        if (q1Var.f295565m) {
            am.vs vsVar2 = c5967xa7660a29.f136265h;
            java.lang.String str2 = q1Var.f531803r.f471009e;
            vsVar2.f89745a = str2;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                this.f531744d.f136265h.f89745a = this.f531745e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l0g);
            }
        }
        if (q1Var.f295564i) {
            java.lang.String str3 = q1Var.f295562g;
            c5967xa7660a29.f136265h.f89745a = str3;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                this.f531744d.f136265h.f89745a = this.f531745e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l0g);
            }
        }
        ((e04.w0) c5967xa7660a29.f136264g.f89667e).run();
    }
}
