package com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui;

/* loaded from: classes9.dex */
public class u0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f236760d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f236761e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f236762f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.C21391x3d89d23a f236763g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f236764h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f236765i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f236766m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.C21391x3d89d23a f236767n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f236768o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ActivityC16960x141f579b f236769p;

    public u0(com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ActivityC16960x141f579b activityC16960x141f579b, android.view.View view, android.widget.TextView textView, int i17, com.p314xaae8f345.mm.ui.C21391x3d89d23a c21391x3d89d23a, android.view.View view2, android.widget.TextView textView2, int i18, com.p314xaae8f345.mm.ui.C21391x3d89d23a c21391x3d89d23a2, android.widget.TextView textView3) {
        this.f236769p = activityC16960x141f579b;
        this.f236760d = view;
        this.f236761e = textView;
        this.f236762f = i17;
        this.f236763g = c21391x3d89d23a;
        this.f236764h = view2;
        this.f236765i = textView2;
        this.f236766m = i18;
        this.f236767n = c21391x3d89d23a2;
        this.f236768o = textView3;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recharge/ui/RechargeUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f236760d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/recharge/ui/RechargeUI$15", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/recharge/ui/RechargeUI$15", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f236761e.setTextColor(this.f236762f);
        this.f236763g.setVisibility(0);
        android.view.View view3 = this.f236764h;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/recharge/ui/RechargeUI$15", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/recharge/ui/RechargeUI$15", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f236765i.setTextColor(this.f236766m);
        this.f236767n.setVisibility(8);
        int count = this.f236769p.f236663o.getCount();
        android.widget.TextView textView = this.f236768o;
        if (count == 0) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recharge/ui/RechargeUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
