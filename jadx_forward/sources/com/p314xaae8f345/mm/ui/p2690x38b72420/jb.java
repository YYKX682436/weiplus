package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes4.dex */
public class jb extends com.p314xaae8f345.mm.ui.p2690x38b72420.d4 {

    /* renamed from: h, reason: collision with root package name */
    public final int f288508h;

    /* renamed from: i, reason: collision with root package name */
    public final vg3.x3 f288509i;

    public jb(android.content.Context context, java.util.List list, java.util.List list2, boolean z17) {
        super(context, list, list2, z17);
        this.f288508h = ((android.app.Activity) context).getIntent().getIntExtra("CONTACT_INFO_UI_SOURCE", 10);
        this.f288509i = (vg3.x3) gm0.j1.s(vg3.x3.class);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.d4
    public int a() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bin;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.d4
    public int c(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        qy.i iVar = (qy.i) i95.n0.c(qy.i.class);
        java.lang.String d17 = z3Var.d1();
        ((py.a) iVar).getClass();
        java.util.List m17 = c01.v1.m(d17);
        int i17 = 0;
        int i18 = 0;
        while (true) {
            java.util.LinkedList linkedList = (java.util.LinkedList) m17;
            if (i17 >= linkedList.size()) {
                return i18;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) this.f288509i).Bi().n((java.lang.String) linkedList.get(i17), true);
            if (n17 != null) {
                java.lang.String d18 = n17.d1();
                boolean z17 = !android.text.TextUtils.isEmpty(d18) && d18.contains("@openim");
                if (n17.r2() && !z17 && !c01.z1.J(n17.d1())) {
                    i18++;
                }
            }
            i17++;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.d4, android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2 = super.getView(i17, view, viewGroup);
        ((com.p314xaae8f345.mm.ui.p2690x38b72420.k4) view2.getTag()).f288526e.setOnClickListener(new com.p314xaae8f345.mm.ui.p2690x38b72420.ib(this, (com.p314xaae8f345.mm.p2621x8fb0427b.z3) this.f288194e.get(i17)));
        return view2;
    }
}
