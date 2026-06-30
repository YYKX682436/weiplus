package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public class m6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f242848d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f242849e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17404xbaa82c2d f242850f;

    public m6(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17404xbaa82c2d activityC17404xbaa82c2d, android.widget.LinearLayout linearLayout, int i17) {
        this.f242850f = activityC17404xbaa82c2d;
        this.f242848d = linearLayout;
        this.f242849e = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = 0;
        while (true) {
            android.widget.LinearLayout linearLayout = this.f242848d;
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
        int intValue = ((java.lang.Integer) view.getTag()).intValue();
        int i18 = this.f242849e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsAboutSystemUI", "choice: %d, %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(intValue));
        if (i18 == intValue) {
            yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            view.post(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.l6(this, intValue));
            yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
