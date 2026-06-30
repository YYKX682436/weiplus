package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2;

/* loaded from: classes11.dex */
public class f0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.C13353xcecbd7a3 f179892d;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.C13353xcecbd7a3 c13353xcecbd7a3) {
        this.f179892d = c13353xcecbd7a3;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2TabView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int intValue = ((java.lang.Integer) view.getTag()).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.h0 h0Var = this.f179892d.f179859o;
        if (h0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.m0 m0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.m0) h0Var;
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.ActivityC13354x79b4d90b activityC13354x79b4d90b = m0Var.f179908f;
            if (intValue != activityC13354x79b4d90b.f179868h) {
                m0Var.f179906d.m80845x940d026a(intValue, false);
            }
            activityC13354x79b4d90b.f179868h = intValue;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2TabView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
