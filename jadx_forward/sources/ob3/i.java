package ob3;

/* loaded from: classes5.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f425594d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ob3.k f425595e;

    public i(ob3.k kVar, android.view.View view) {
        this.f425595e = kVar;
        this.f425594d = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        ob3.k kVar = this.f425595e;
        boolean isShown = kVar.f425600g.f226573t.isShown();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.p1823xed060d07.ActivityC16326x540b7c63 activityC16326x540b7c63 = kVar.f425600g;
        android.view.View view = this.f425594d;
        if (!isShown && view.isShown()) {
            android.view.View view2 = activityC16326x540b7c63.f226573t;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/appbrand/ui/prepare/WxaLuckyMoneyPrepareUI$14$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/appbrand/ui/prepare/WxaLuckyMoneyPrepareUI$14$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        activityC16326x540b7c63.f226571r.m121476x53eb72f9(kVar.f425598e);
        activityC16326x540b7c63.f226571r.m121469xce4186ff((android.widget.EditText) view);
        ((android.view.inputmethod.InputMethodManager) activityC16326x540b7c63.mo55332x76847179().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}
