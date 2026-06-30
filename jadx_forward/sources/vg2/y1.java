package vg2;

/* loaded from: classes3.dex */
public final class y1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f518155a;

    /* renamed from: b, reason: collision with root package name */
    public final tg2.h f518156b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.a f518157c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f518158d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.PopupWindow f518159e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f518160f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f518161g;

    /* renamed from: h, reason: collision with root package name */
    public final vg2.u1 f518162h;

    /* renamed from: i, reason: collision with root package name */
    public r45.kv1 f518163i;

    /* renamed from: j, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f518164j;

    public y1(android.content.Context context, tg2.h onBatchSelect, yz5.a onDismiss) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onBatchSelect, "onBatchSelect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onDismiss, "onDismiss");
        this.f518155a = context;
        this.f518156b = onBatchSelect;
        this.f518157c = onDismiss;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.aro, (android.view.ViewGroup) null);
        this.f518158d = inflate;
        android.widget.PopupWindow popupWindow = new android.widget.PopupWindow(inflate, -1, -2, true);
        this.f518159e = popupWindow;
        this.f518160f = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.a4f);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f518161g = linkedList;
        vg2.u1 u1Var = new vg2.u1(this, linkedList);
        this.f518162h = u1Var;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) inflate.findViewById(com.p314xaae8f345.mm.R.id.lqa);
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(c1163xf1deaba4.getContext(), 0, false));
        c1163xf1deaba4.setVerticalFadingEdgeEnabled(false);
        c1163xf1deaba4.setVerticalScrollBarEnabled(false);
        c1163xf1deaba4.setOverScrollMode(2);
        c1163xf1deaba4.mo7960x6cab2c8d(u1Var);
        this.f518164j = c1163xf1deaba4;
        c1163xf1deaba4.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.d2q);
        c1163xf1deaba4.N(new vg2.v1(this));
        popupWindow.setOutsideTouchable(true);
    }
}
