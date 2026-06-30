package dt2;

/* loaded from: classes3.dex */
public final class h extends android.widget.FrameLayout {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f324712h = 0;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f324713d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f324714e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f324715f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f324716g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.aye, (android.view.ViewGroup) this, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f324714e = inflate;
        addView(inflate);
        setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.l47);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f324713d = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.cut);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.l3x);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f324715f = (android.view.ViewGroup) findViewById3;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.kwq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f324716g = findViewById4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setDimension */
    public final void m126201x1a7c9f24(float f17) {
        android.view.ViewGroup viewGroup = this.f324715f;
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (f17 > 1.0f) {
            layoutParams.width = (int) getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561203c7);
            layoutParams.height = (int) getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.by);
        } else {
            layoutParams.width = (int) getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.by);
            layoutParams.height = (int) getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561203c7);
        }
        viewGroup.setLayoutParams(layoutParams);
    }

    /* renamed from: setFragment */
    public final void m126202x143580d2(r45.w94 fragment) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        android.view.View view = this.f324716g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/replay/widget/FinderLiveReplayFragmentThumbView", "setFragment", "(Lcom/tencent/mm/protocal/protobuf/LiveReplayWonderfulFragment;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/replay/widget/FinderLiveReplayFragmentThumbView", "setFragment", "(Lcom/tencent/mm/protocal/protobuf/LiveReplayWonderfulFragment;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb()).a(new mn2.q3(fragment.m75945x2fec8307(2), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f));
        dt2.g gVar = new dt2.g(this, fragment);
        a17.getClass();
        a17.f529406d = gVar;
        a17.f();
    }
}
