package lj2;

/* loaded from: classes10.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f400470a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.TextView f400471b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.TextView f400472c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f400473d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f400474e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f400475f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f400476g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f400477h;

    /* renamed from: i, reason: collision with root package name */
    public int f400478i;

    /* renamed from: j, reason: collision with root package name */
    public int f400479j;

    public s(android.view.View root) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        this.f400470a = root;
        android.widget.TextView textView = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.eo9);
        this.f400471b = textView;
        android.widget.TextView textView2 = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.eo_);
        this.f400472c = textView2;
        android.widget.TextView textView3 = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.f566097eo4);
        this.f400473d = textView3;
        android.widget.TextView textView4 = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.f566100ep1);
        this.f400474e = textView4;
        this.f400475f = (android.view.ViewGroup) root.findViewById(com.p314xaae8f345.mm.R.id.eo7);
        android.widget.TextView textView5 = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.eo6);
        this.f400476g = textView5;
        this.f400477h = root.findViewById(com.p314xaae8f345.mm.R.id.eo8);
        this.f400478i = 2;
        android.content.Context context = root.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        java.lang.Object systemService = context.getSystemService("window");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        android.view.Display defaultDisplay = ((android.view.WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        float f17 = (12.0f * displayMetrics.density) / context.getResources().getDisplayMetrics().density;
        textView.setTextSize(1, f17);
        textView2.setTextSize(1, f17);
        textView3.setTextSize(1, f17);
        textView5.setTextSize(1, f17);
        textView4.setVisibility(8);
        textView4.setTextSize(1, f17);
    }

    public final void a(int i17) {
        android.view.View view = this.f400470a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveNewBattleAnchorTipWidget$AcceptViewHolder", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveNewBattleAnchorTipWidget$AcceptViewHolder", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void b() {
        int i17 = this.f400478i;
        android.view.View view = this.f400470a;
        this.f400472c.setText(i17 == 2 ? this.f400479j == 3 ? view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m8r) : view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573207dw4) : view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573205dw1));
    }
}
