package kl2;

/* loaded from: classes3.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f390291a;

    /* renamed from: b, reason: collision with root package name */
    public final jl2.a f390292b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.a f390293c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.a f390294d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f390295e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f390296f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 f390297g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f390298h;

    /* renamed from: i, reason: collision with root package name */
    public final r45.f82 f390299i;

    /* renamed from: j, reason: collision with root package name */
    public final kl2.g f390300j;

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f390301k;

    public e0(android.content.Context context, jl2.a service, android.view.View rootView, r45.f82 dataInfo, yz5.a hideForNextPanel, yz5.a reOpen, yz5.l parentOption) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataInfo, "dataInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hideForNextPanel, "hideForNextPanel");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reOpen, "reOpen");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentOption, "parentOption");
        this.f390291a = context;
        this.f390292b = service;
        this.f390293c = hideForNextPanel;
        this.f390294d = reOpen;
        this.f390295e = parentOption;
        this.f390300j = new kl2.g(context, service, new kl2.z(this), new kl2.a0(this));
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.oax);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById;
        this.f390296f = viewGroup;
        viewGroup.setOnClickListener(new kl2.w(this));
        android.view.View findViewById2 = rootView.findViewById(com.p314xaae8f345.mm.R.id.m1l);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) findViewById2;
        this.f390297g = viewOnClickListenerC22631x1cc07cc8;
        android.view.View findViewById3 = rootView.findViewById(com.p314xaae8f345.mm.R.id.oap);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById3;
        this.f390298h = textView;
        b(viewOnClickListenerC22631x1cc07cc8.f292896x);
        viewOnClickListenerC22631x1cc07cc8.m81396xb3e0a10a(new kl2.x(this));
        this.f390299i = dataInfo;
        r45.ql1 ql1Var = (r45.ql1) dataInfo.m75936x14adae67(2);
        if (ql1Var != null) {
            if (ql1Var.m75939xb282bd08(0) == 1) {
                viewOnClickListenerC22631x1cc07cc8.m81392x52cfa5c6(true);
                viewGroup.setVisibility(0);
                textView.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ebm, java.lang.Long.valueOf(ql1Var.m75942xfb822ef2(1))));
            } else {
                viewOnClickListenerC22631x1cc07cc8.m81392x52cfa5c6(false);
                viewGroup.setVisibility(8);
            }
        }
        this.f390301k = jz5.h.b(new kl2.d0(this));
    }

    public static final void a(kl2.e0 e0Var, boolean z17) {
        r45.ql1 ql1Var;
        r45.f82 f82Var = e0Var.f390299i;
        if (f82Var != null && (ql1Var = (r45.ql1) f82Var.m75936x14adae67(2)) != null) {
            ql1Var.set(0, java.lang.Integer.valueOf(z17 ? 1 : 0));
            e0Var.f390296f.setVisibility(z17 ? 0 : 8);
            e0Var.f390298h.setText(e0Var.f390291a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ebm, java.lang.Long.valueOf(ql1Var.m75942xfb822ef2(1))));
            ((il2.r) e0Var.f390292b).u1(ql1Var, true);
        }
        e0Var.b(z17);
    }

    public final void b(boolean z17) {
        android.content.Context context = this.f390291a;
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ebk);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = this.f390297g;
        if (z17) {
            if (viewOnClickListenerC22631x1cc07cc8 != null) {
                viewOnClickListenerC22631x1cc07cc8.setContentDescription(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.efy, string));
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("switchBtn");
                throw null;
            }
        }
        if (viewOnClickListenerC22631x1cc07cc8 != null) {
            viewOnClickListenerC22631x1cc07cc8.setContentDescription(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.efx, string));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("switchBtn");
            throw null;
        }
    }
}
