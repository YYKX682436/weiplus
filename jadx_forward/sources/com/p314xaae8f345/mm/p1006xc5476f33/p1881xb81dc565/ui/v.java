package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui;

/* loaded from: classes11.dex */
public class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ActivityC16583xfeb834f3 f231838d;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ActivityC16583xfeb834f3 activityC16583xfeb834f3) {
        this.f231838d = activityC16583xfeb834f3;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/multitalk/ui/MultiTalkSelectContactUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view instanceof android.widget.ImageView) {
            java.lang.String str = (java.lang.String) view.getTag();
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ActivityC16583xfeb834f3 activityC16583xfeb834f3 = this.f231838d;
            com.p314xaae8f345.mm.ui.p2690x38b72420.p4 b76 = activityC16583xfeb834f3.b7();
            if (c01.z1.r().equals(str)) {
                yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/MultiTalkSelectContactUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            activityC16583xfeb834f3.Y6();
            if (activityC16583xfeb834f3.F.contains(str)) {
                if (activityC16583xfeb834f3.H) {
                    activityC16583xfeb834f3.I.b(str);
                }
                activityC16583xfeb834f3.F.remove(str);
                activityC16583xfeb834f3.G.remove(str);
            }
            ((sj3.q5) activityC16583xfeb834f3.f231783J.mo7946xf939df19()).B(activityC16583xfeb834f3.G, activityC16583xfeb834f3.N);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = activityC16583xfeb834f3.f231783J;
            int mo1894x7e414b06 = c1163xf1deaba4.mo7946xf939df19().mo1894x7e414b06() - 1;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(java.lang.Integer.valueOf(mo1894x7e414b06));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(c1163xf1deaba4, arrayList2.toArray(), "com/tencent/mm/plugin/multitalk/ui/MultiTalkSelectContactUI$2", "onClick", "(Landroid/view/View;)V", "Undefined", "scrollToPosition", "(I)V");
            c1163xf1deaba4.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(c1163xf1deaba4, "com/tencent/mm/plugin/multitalk/ui/MultiTalkSelectContactUI$2", "onClick", "(Landroid/view/View;)V", "Undefined", "scrollToPosition", "(I)V");
            b76.notifyDataSetChanged();
            activityC16583xfeb834f3.w7();
            activityC16583xfeb834f3.K.setContentDescription(((sj3.q5) activityC16583xfeb834f3.f231783J.mo7946xf939df19()).y().toString());
        }
        yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/MultiTalkSelectContactUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
