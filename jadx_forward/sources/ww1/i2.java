package ww1;

/* loaded from: classes15.dex */
public class i2 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5967xa7660a29 f531750d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f531751e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ww1.j2 f531752f;

    public i2(ww1.j2 j2Var, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5967xa7660a29 c5967xa7660a29, android.content.Context context) {
        this.f531752f = j2Var;
        this.f531750d = c5967xa7660a29;
        this.f531751e = context;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        ww1.j2 j2Var = this.f531752f;
        android.app.Dialog dialog = j2Var.f531754d;
        if (dialog != null && dialog.isShowing()) {
            j2Var.f531754d.dismiss();
            j2Var.f531754d = null;
        }
        gm0.j1.d().q(2811, this);
        xw1.e eVar = (xw1.e) m1Var;
        boolean z17 = eVar.f295564i;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5967xa7660a29 c5967xa7660a29 = this.f531750d;
        if (!z17 && !eVar.f295565m) {
            am.vs vsVar = c5967xa7660a29.f136265h;
            r45.av5 av5Var = eVar.f539200r;
            vsVar.f89746b = av5Var.f451812f;
            vsVar.f89747c = av5Var.f451813g;
        }
        if (eVar.f295565m) {
            am.vs vsVar2 = c5967xa7660a29.f136265h;
            java.lang.String str2 = eVar.f539200r.f451811e;
            vsVar2.f89745a = str2;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                this.f531750d.f136265h.f89745a = this.f531751e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l0g);
            }
        }
        if (eVar.f295564i) {
            java.lang.String str3 = eVar.f295562g;
            c5967xa7660a29.f136265h.f89745a = str3;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                this.f531750d.f136265h.f89745a = this.f531751e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l0g);
            }
        }
        ((e04.w0) c5967xa7660a29.f136264g.f89667e).run();
    }
}
