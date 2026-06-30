package com.p314xaae8f345.mm.ui;

/* loaded from: classes14.dex */
public final class zg {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f294154a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f294155b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f294156c;

    /* renamed from: d, reason: collision with root package name */
    public final int f294157d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f294158e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f294159f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f294160g;

    /* renamed from: h, reason: collision with root package name */
    public int f294161h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.RelativeLayout f294162i;

    /* renamed from: j, reason: collision with root package name */
    public int f294163j;

    /* renamed from: k, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f294164k;

    /* renamed from: l, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f294165l;

    /* renamed from: m, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.k0 f294166m;

    public zg(android.content.Context context, java.lang.String filePath, java.lang.String fileExt, int i17, yz5.a aVar, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i18 & 8) != 0 ? 3 : i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileExt, "fileExt");
        this.f294154a = context;
        this.f294155b = filePath;
        this.f294156c = fileExt;
        this.f294157d = i17;
        this.f294166m = new com.p314xaae8f345.mm.ui.yg(this);
    }

    public final void a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View view = this.f294158e;
        if (view != null) {
        }
        android.view.View view2 = this.f294158e;
        android.widget.TextView textView = view2 != null ? (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.mba) : null;
        this.f294159f = textView;
        if (textView != null) {
            textView.setVisibility(4);
        }
        android.view.View view3 = this.f294158e;
        android.view.View findViewById = view3 != null ? view3.findViewById(com.p314xaae8f345.mm.R.id.mbb) : null;
        this.f294160g = findViewById;
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/ScreenProfileReadyPluginUI", "applyClickEvent", "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/ui/ScreenProfileReadyPluginUI", "applyClickEvent", "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view4 = this.f294158e;
        android.widget.RelativeLayout relativeLayout = view4 != null ? (android.widget.RelativeLayout) view4.findViewById(com.p314xaae8f345.mm.R.id.mbd) : null;
        this.f294162i = relativeLayout;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(4);
        }
        android.widget.RelativeLayout relativeLayout2 = this.f294162i;
        if (relativeLayout2 != null) {
            relativeLayout2.setOnClickListener(new com.p314xaae8f345.mm.ui.xg(this, context));
        }
    }

    public final void b() {
        android.widget.RelativeLayout relativeLayout = this.f294162i;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
        android.view.View view = this.f294158e;
        android.view.View findViewById = view != null ? view.findViewById(com.p314xaae8f345.mm.R.id.mbb) : null;
        this.f294160g = findViewById;
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/ScreenProfileReadyPluginUI", "refreshIndexLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/ui/ScreenProfileReadyPluginUI", "refreshIndexLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView = this.f294159f;
        if (textView != null) {
            textView.setVisibility(0);
        }
        android.widget.TextView textView2 = this.f294159f;
        if (textView2 == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f294161h + 1);
        sb6.append('/');
        sb6.append(this.f294163j);
        textView2.setText(sb6.toString());
    }
}
