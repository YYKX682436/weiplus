package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class WelcomeSelectView extends com.tencent.mm.plugin.account.ui.WelcomeView {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f73696d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f73697e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f73698f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f73699g;

    /* renamed from: h, reason: collision with root package name */
    public android.content.Context f73700h;

    public WelcomeSelectView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        b(context);
    }

    public final void b(android.content.Context context) {
        this.f73700h = context;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.d_b, this);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.mjf);
        this.f73696d = findViewById;
        kotlin.jvm.internal.o.g(findViewById, "<this>");
        com.tencent.mm.ui.a4.e(findViewById, true, false, 2, null);
        this.f73697e = (android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.mje);
        this.f73698f = (android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.mjy);
        this.f73699g = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f487728pl5);
        android.view.View view = this.f73696d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/WelcomeSelectView", "initView", "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/account/ui/WelcomeSelectView", "initView", "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f73699g.setVisibility(8);
        this.f73699g.setText(com.tencent.mm.sdk.platformtools.m2.g(context, com.tencent.mm.R.array.f478007v, com.tencent.mm.R.string.f490464vs));
        this.f73699g.setAccessibilityDelegate(new com.tencent.mm.plugin.account.ui.tj(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public WelcomeSelectView(android.content.Context context) {
        super(context);
        b(context);
    }
}
