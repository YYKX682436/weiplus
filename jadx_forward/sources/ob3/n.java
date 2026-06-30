package ob3;

/* loaded from: classes5.dex */
public class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f425606d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f425607e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f425608f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f425609g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.p1823xed060d07.ActivityC16326x540b7c63 f425610h;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.p1823xed060d07.ActivityC16326x540b7c63 activityC16326x540b7c63, boolean z17, android.widget.EditText editText, android.view.View view, int i17) {
        this.f425610h = activityC16326x540b7c63;
        this.f425606d = z17;
        this.f425607e = editText;
        this.f425608f = view;
        this.f425609g = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/appbrand/ui/prepare/WxaLuckyMoneyPrepareUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.p1823xed060d07.ActivityC16326x540b7c63 activityC16326x540b7c63 = this.f425610h;
        boolean isShown = activityC16326x540b7c63.f226573t.isShown();
        android.widget.EditText editText = this.f425607e;
        boolean z17 = this.f425606d;
        if (isShown && !z17) {
            com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3 c27990xda3033a3 = activityC16326x540b7c63.f226571r;
            if (c27990xda3033a3 != null) {
                c27990xda3033a3.m121469xce4186ff(editText);
            }
        } else if (!activityC16326x540b7c63.f226573t.isShown() && !z17) {
            ((android.view.inputmethod.InputMethodManager) activityC16326x540b7c63.mo55332x76847179().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new ob3.m(this), 200L);
        } else if (z17) {
            android.view.View view2 = activityC16326x540b7c63.f226573t;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/appbrand/ui/prepare/WxaLuckyMoneyPrepareUI$16", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/appbrand/ui/prepare/WxaLuckyMoneyPrepareUI$16", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((android.view.inputmethod.InputMethodManager) activityC16326x540b7c63.mo55332x76847179().getSystemService("input_method")).showSoftInput(editText, 0);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/appbrand/ui/prepare/WxaLuckyMoneyPrepareUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
