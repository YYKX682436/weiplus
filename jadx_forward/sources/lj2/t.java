package lj2;

/* loaded from: classes3.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f400480a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.TextView f400481b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.TextView f400482c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f400483d;

    /* renamed from: e, reason: collision with root package name */
    public int f400484e;

    /* renamed from: f, reason: collision with root package name */
    public int f400485f;

    public t(android.view.View root) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        this.f400480a = root;
        android.widget.TextView textView = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.eoc);
        this.f400481b = textView;
        android.widget.TextView textView2 = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.eof);
        this.f400482c = textView2;
        android.widget.TextView textView3 = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.eoe);
        this.f400483d = textView3;
        this.f400484e = 2;
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
    }

    public final void a() {
        int i17 = this.f400484e;
        android.view.View view = this.f400480a;
        this.f400481b.setText(i17 == 2 ? this.f400485f == 3 ? view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m8r) : view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573207dw4) : view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573205dw1));
    }

    public final void b(int i17) {
        android.view.View view = this.f400480a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveNewBattleAnchorTipWidget$ApplyViewHolder", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveNewBattleAnchorTipWidget$ApplyViewHolder", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
