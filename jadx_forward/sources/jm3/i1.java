package jm3;

/* loaded from: classes11.dex */
public class i1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jm3.j1 f381858d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.C16656xe36a44b1 f381859e;

    public i1(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.C16656xe36a44b1 c16656xe36a44b1, jm3.j1 j1Var) {
        this.f381859e = c16656xe36a44b1;
        this.f381858d = j1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/WeCheckBox$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.C16656xe36a44b1 c16656xe36a44b1 = this.f381859e;
        boolean z17 = !c16656xe36a44b1.f232425r;
        c16656xe36a44b1.f232425r = z17;
        jm3.j1 j1Var = this.f381858d;
        if (j1Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.c cVar = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.c) j1Var;
            b21.r rVar = cVar.f232469a;
            if (rVar == null) {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.ActivityC16662x5873ebce.H;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MusicMainUINew", "musicWrapper is null, do nothing");
            } else if (z17) {
                int i18 = com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.ActivityC16662x5873ebce.H;
                com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.ActivityC16662x5873ebce activityC16662x5873ebce = cVar.f232470b;
                activityC16662x5873ebce.U6(rVar, true);
                activityC16662x5873ebce.f232446s = true;
            } else {
                rk4.z8 z8Var = (rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class));
                if (rVar.f98879e.equals(z8Var.Vi(rVar.f98878d))) {
                    z8Var.zj();
                }
            }
        }
        if (c16656xe36a44b1.f232425r) {
            c16656xe36a44b1.setImageResource(com.p314xaae8f345.mm.R.raw.f80239x9628fc48);
        } else {
            c16656xe36a44b1.setImageResource(com.p314xaae8f345.mm.R.raw.f80269xfa4f757a);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/WeCheckBox$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
