package vg2;

/* loaded from: classes3.dex */
public class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f517998a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.ViewGroup f517999b;

    /* renamed from: c, reason: collision with root package name */
    public final tg2.h f518000c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f518001d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f518002e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f518003f;

    /* renamed from: g, reason: collision with root package name */
    public final vg2.w f518004g;

    /* renamed from: h, reason: collision with root package name */
    public ce2.i f518005h;

    /* renamed from: i, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f518006i;

    public a0(android.content.Context context, android.view.ViewGroup parentRoot, tg2.h onBatchSelect) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentRoot, "parentRoot");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onBatchSelect, "onBatchSelect");
        this.f517998a = context;
        this.f517999b = parentRoot;
        this.f518000c = onBatchSelect;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.aro, (android.view.ViewGroup) null);
        this.f518001d = inflate;
        this.f518002e = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.a4f);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f518003f = linkedList;
        vg2.w wVar = new vg2.w(this, linkedList);
        this.f518004g = wVar;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) inflate.findViewById(com.p314xaae8f345.mm.R.id.lqa);
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(c1163xf1deaba4.getContext(), 0, false));
        c1163xf1deaba4.setVerticalFadingEdgeEnabled(false);
        c1163xf1deaba4.setVerticalScrollBarEnabled(false);
        c1163xf1deaba4.setOverScrollMode(2);
        c1163xf1deaba4.mo7960x6cab2c8d(wVar);
        this.f518006i = c1163xf1deaba4;
        c1163xf1deaba4.N(new vg2.x(this));
    }

    public final void a() {
        android.view.View view = this.f518001d;
        if (view.getVisibility() == 0) {
            android.view.View view2 = this.f518001d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/gift/widget/GiftBatchSelectPanelWidget", "hideWidget", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/gift/widget/GiftBatchSelectPanelWidget", "hideWidget", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f517999b.removeView(view);
        }
    }
}
