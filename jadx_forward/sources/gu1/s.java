package gu1;

/* loaded from: classes15.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f357446a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f357447b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f357448c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f357449d;

    public s(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, android.view.View view) {
        this.f357446a = view;
    }

    public void a() {
        java.lang.Integer num = (java.lang.Integer) xt1.t0.Di().a("key_share_card_show_type");
        if (num == null) {
            num = 0;
        }
        if (num.intValue() == 0 || eu1.f.b()) {
            android.view.View view = this.f357447b;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/sharecard/ui/ShareCardNoLocalCityController", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/card/sharecard/ui/ShareCardNoLocalCityController", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.f357447b;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/card/sharecard/ui/ShareCardNoLocalCityController", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/card/sharecard/ui/ShareCardNoLocalCityController", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f357448c.setVisibility(0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1312xa1bac36f.p1313x633fb29.C13039x2a59e0bd c13039x2a59e0bd = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1312xa1bac36f.p1313x633fb29.C13039x2a59e0bd();
        if (android.text.TextUtils.isEmpty(c13039x2a59e0bd.C(10))) {
            this.f357448c.setVisibility(8);
        } else {
            this.f357448c.setVisibility(0);
            this.f357448c.setText(c13039x2a59e0bd.C(10));
        }
        if (android.text.TextUtils.isEmpty("")) {
            this.f357449d.setVisibility(8);
        } else {
            this.f357449d.setVisibility(0);
            this.f357449d.setText("");
        }
    }
}
