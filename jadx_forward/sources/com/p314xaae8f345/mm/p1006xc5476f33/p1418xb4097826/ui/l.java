package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes3.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15007xc74afeba f210982d;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15007xc74afeba activityC15007xc74afeba) {
        this.f210982d = activityC15007xc74afeba;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderActivityDescUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15007xc74afeba activityC15007xc74afeba = this.f210982d;
        r45.e21 e21Var = activityC15007xc74afeba.L;
        activityC15007xc74afeba.getClass();
        if (e21Var != null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) e21Var.m75936x14adae67(15);
            if (c19786x6a1e2862 != null) {
                activityC15007xc74afeba.f7(e21Var, c19786x6a1e2862);
            } else {
                c19786x6a1e2862 = null;
            }
            if (c19786x6a1e2862 == null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) e21Var.m75936x14adae67(1);
                if (c19782x23db1cfa == null || (str = c19782x23db1cfa.m76197x6c03c64c()) == null) {
                    str = "";
                }
                sb6.append(str);
                sb6.append(':');
                sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s0());
                java.lang.String sb7 = sb6.toString();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC15007xc74afeba.mo55332x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
                java.lang.String m75945x2fec8307 = e21Var.m75945x2fec8307(9);
                java.lang.String str2 = m75945x2fec8307 == null ? "" : m75945x2fec8307;
                java.lang.String m75945x2fec83072 = e21Var.m75945x2fec8307(10);
                i0Var.ll(mo55332x76847179, str2, m75945x2fec83072 == null ? "" : m75945x2fec83072, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.n.f34699x366c91de, sb7);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderActivityDescUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
