package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public class k6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f242757d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17404xbaa82c2d f242758e;

    public k6(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17404xbaa82c2d activityC17404xbaa82c2d, android.widget.LinearLayout linearLayout) {
        this.f242758e = activityC17404xbaa82c2d;
        this.f242757d = linearLayout;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = 0;
        while (true) {
            android.widget.LinearLayout linearLayout = this.f242757d;
            if (i17 >= linearLayout.getChildCount()) {
                break;
            }
            android.widget.TextView textView = (android.widget.TextView) linearLayout.getChildAt(i17);
            if (com.p314xaae8f345.mm.R.id.f568867ob5 != textView.getId()) {
                textView.setCompoundDrawablesWithIntrinsicBounds(com.p314xaae8f345.mm.R.raw.f80936xc6307b2b, 0, 0, 0);
            }
            i17++;
        }
        ((android.widget.TextView) view).setCompoundDrawablesWithIntrinsicBounds(com.p314xaae8f345.mm.R.raw.f80939xfe2298a3, 0, 0, 0);
        int intValue = ((java.lang.Integer) gm0.j1.u().c().l(7, 0)).intValue();
        int intValue2 = ((java.lang.Integer) view.getTag()).intValue();
        if ((intValue2 == 0) == ((intValue & com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb) == 0)) {
            yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        boolean z17 = intValue2 == 0;
        int i18 = z17 ? intValue & (-16777217) : intValue | com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb;
        int i19 = z17 ? 2 : 1;
        gm0.j1.u().c().w(7, java.lang.Integer.valueOf(i18));
        r45.p53 p53Var = new r45.p53();
        p53Var.f464294d = 35;
        p53Var.f464295e = i19;
        ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
        ((com.p314xaae8f345.mm.app.o7) f14.g.a()).Zi();
        view.post(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.j6(this));
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
