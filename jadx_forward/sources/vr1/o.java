package vr1;

/* loaded from: classes8.dex */
public final class o extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f521115d;

    /* renamed from: e, reason: collision with root package name */
    public final xr1.g f521116e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f521117f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f521118g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f521119h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f521120i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f521121m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f521122n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f521123o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f521124p;

    /* renamed from: q, reason: collision with root package name */
    public int f521125q;

    /* renamed from: r, reason: collision with root package name */
    public int f521126r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f521115d = new java.util.LinkedHashSet();
        this.f521116e = new xr1.g();
        this.f521120i = jz5.h.b(new vr1.b(this));
        this.f521121m = jz5.h.b(new vr1.n(this));
        this.f521122n = jz5.h.b(new vr1.i(activity));
        this.f521123o = jz5.h.b(new vr1.k(this, activity));
        this.f521124p = jz5.h.b(new vr1.j(this));
    }

    public final xm3.t0 O6() {
        return (xm3.t0) ((jz5.n) this.f521124p).mo141623x754a37bb();
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe P6() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe) ((jz5.n) this.f521123o).mo141623x754a37bb();
    }

    /* renamed from: getRecyclerView */
    public final com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 m172525x4905e9fa() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f521121m).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) mo141623x754a37bb;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
        this.f521116e.f537726d = P6();
        m172525x4905e9fa().mo7967x900dcbe1((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) ((jz5.n) this.f521122n).mo141623x754a37bb());
        m172525x4905e9fa().mo7960x6cab2c8d(O6());
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 m172525x4905e9fa = m172525x4905e9fa();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.z zVar = new p012xc85e97e9.p103xe821e364.p104xd1075a44.z();
        zVar.f93701c = 100L;
        zVar.f93702d = 150L;
        zVar.f93703e = 100L;
        m172525x4905e9fa.m7964x8d4ad49c(zVar);
        m172525x4905e9fa().m82903x154839fc(80);
        O6().B = new vr1.c(this);
        this.f521117f = com.p314xaae8f345.mm.ui.id.b(m80379x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569751kv, (android.view.ViewGroup) m172525x4905e9fa(), false);
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(m80379x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569749kt, (android.view.ViewGroup) null, false);
        this.f521118g = inflate;
        android.widget.TextView textView = inflate != null ? (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568070lm0) : null;
        this.f521119h = textView;
        android.text.TextPaint paint = textView != null ? textView.getPaint() : null;
        if (paint != null) {
            paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        }
        android.text.TextPaint paint2 = textView != null ? textView.getPaint() : null;
        if (paint2 != null) {
            paint2.setStrokeWidth(0.8f);
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.BizPCRecentReadUI");
        android.view.View decorView = ((com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1295x37f74295.p1296x14eafa71.ActivityC12994x7e10022b) m158354x19263085).getWindow().getDecorView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = ((java.lang.Number) ((jz5.n) this.f521120i).mo141623x754a37bb()).intValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "layoutParams.topMargin = " + layoutParams.topMargin);
        ((android.view.ViewGroup) decorView).addView(this.f521118g, layoutParams);
        O6().F = new vr1.e(this);
        m172525x4905e9fa().i(new vr1.g(this));
    }
}
