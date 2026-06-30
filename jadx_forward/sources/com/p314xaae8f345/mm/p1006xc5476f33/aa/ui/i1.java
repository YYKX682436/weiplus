package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes11.dex */
public class i1 implements com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.j1 f154213a;

    public i1(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.j1 j1Var) {
        this.f154213a = j1Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c
    public android.view.View a(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569408ac, viewGroup, false);
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.g1 g1Var = this.f154213a.D;
        g1Var.f154182a = inflate.findViewById(com.p314xaae8f345.mm.R.id.mjb);
        g1Var.f154183b = inflate.findViewById(com.p314xaae8f345.mm.R.id.mjc);
        g1Var.f154188g = (android.widget.CheckBox) inflate.findViewById(com.p314xaae8f345.mm.R.id.mie);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.a_4);
        g1Var.f154184c = imageView;
        imageView.setImportantForAccessibility(2);
        g1Var.f154185d = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.ovg);
        g1Var.f154186e = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568697nr3);
        g1Var.f154187f = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.cut);
        inflate.setTag(g1Var);
        return inflate;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c
    public boolean b(android.content.Context context, android.view.View view, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c
    public void c(android.content.Context context, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.b bVar, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar, boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.g1 g1Var = (com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.g1) bVar;
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.j1 j1Var = (com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.j1) dVar;
        java.lang.String str = j1Var.f288352z;
        if (str == null || str.length() <= 0) {
            g1Var.f154184c.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bhm);
        } else {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(g1Var.f154184c, j1Var.f288352z, 0.1f);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(j1Var.f288351y)) {
            g1Var.f154185d.setVisibility(8);
        } else {
            g1Var.f154185d.setText(j1Var.f288351y);
            g1Var.f154185d.setVisibility(0);
            g1Var.f154185d.setSingleLine(false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.j1 j1Var2 = this.f154213a;
        if (j1Var2.f288369e) {
            if (z17) {
                g1Var.f154188g.setChecked(true);
                g1Var.f154188g.setEnabled(false);
                g1Var.f154188g.setBackgroundResource(com.p314xaae8f345.mm.ui.bk.C() ? com.p314xaae8f345.mm.R.raw.f78844x4a24e2e : com.p314xaae8f345.mm.R.raw.f78843x2ecb5687);
            } else if (com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.j1.g(j1Var2, j1Var)) {
                g1Var.f154188g.setChecked(false);
                g1Var.f154188g.setEnabled(false);
            } else {
                g1Var.f154188g.setChecked(z18);
                g1Var.f154188g.setEnabled(true);
            }
            g1Var.f154188g.setVisibility(0);
        } else {
            g1Var.f154188g.setVisibility(8);
        }
        if (j1Var2.f288373i) {
            g1Var.f154182a.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562843q6);
        } else {
            g1Var.f154182a.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562199u);
        }
        g1Var.f154187f.post(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.h1(this, g1Var, context));
        java.lang.String str2 = j1Var2.f288370f;
        if (j1Var.B.F0() == 1) {
            g1Var.f154187f.setVisibility(0);
            g1Var.f154187f.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571248o));
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            g1Var.f154187f.setVisibility(8);
        } else {
            g1Var.f154187f.setVisibility(0);
            g1Var.f154187f.setText(str2);
        }
        if (!com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.j1.g(j1Var2, j1Var)) {
            g1Var.f154185d.setAlpha(1.0f);
            g1Var.f154187f.setAlpha(1.0f);
            g1Var.f154184c.setAlpha(1.0f);
            g1Var.f154186e.setVisibility(4);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactDataItem", "data.username：%s", j1Var.f288352z);
            return;
        }
        g1Var.f154185d.setAlpha(0.3f);
        g1Var.f154187f.setAlpha(0.3f);
        g1Var.f154184c.setAlpha(0.3f);
        java.lang.String a17 = t41.g.a(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(j1Var.f288352z, true));
        g1Var.f154186e.setVisibility(0);
        g1Var.f154186e.setText(a17);
        g1Var.f154186e.setTextSize(12.0f);
        g1Var.f154186e.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0m));
        g1Var.f154186e.setAlpha(0.3f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactDataItem", "data.username：%s,subName:%s", j1Var.f288352z, a17);
    }
}
