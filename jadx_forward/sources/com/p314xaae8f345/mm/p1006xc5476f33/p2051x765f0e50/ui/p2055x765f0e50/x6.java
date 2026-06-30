package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public class x6 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17413x56438321 f243262d;

    public x6(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17413x56438321 activityC17413x56438321) {
        this.f243262d = activityC17413x56438321;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsAliasUI$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17413x56438321 activityC17413x56438321 = this.f243262d;
        if (activityC17413x56438321.f241850e.getText() != null) {
            java.lang.String charSequence = activityC17413x56438321.f241850e.getText().toString();
            int indexOf = charSequence.indexOf(58);
            if (indexOf >= 0 && indexOf < charSequence.length()) {
                charSequence = charSequence.substring(indexOf + 1).trim();
            }
            android.text.SpannableString spannableString = new android.text.SpannableString(activityC17413x56438321.f241850e.getText());
            spannableString.setSpan(new android.text.style.BackgroundColorSpan(activityC17413x56438321.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560835vi)), indexOf + 1, activityC17413x56438321.f241850e.getText().length(), 33);
            activityC17413x56438321.f241850e.setText(spannableString);
            rl5.r rVar = new rl5.r(activityC17413x56438321, activityC17413x56438321.f241850e);
            rVar.f478884u = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.u6(this);
            rVar.f478887x = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.v6(this, charSequence);
            rVar.L = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.w6(this);
            rVar.m();
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAliasUI$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
