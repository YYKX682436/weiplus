package sx3;

/* loaded from: classes10.dex */
public final class m extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f495098d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f495099e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f495100f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f495101g;

    /* renamed from: h, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de f495102h;

    /* renamed from: i, reason: collision with root package name */
    public final sx3.l f495103i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f495098d = jz5.h.b(new sx3.g(this));
        this.f495099e = jz5.h.b(new sx3.e(this));
        this.f495100f = jz5.h.b(new sx3.f(this));
        this.f495102h = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(activity, 1, false);
        this.f495103i = new sx3.l(this, activity);
    }

    public final com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 O6() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f495099e).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864) mo141623x754a37bb;
    }

    public final com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 P6() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f495100f).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) mo141623x754a37bb;
    }

    public final void Q6() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f495098d).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        android.view.View view = (android.view.View) mo141623x754a37bb;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/ringtone/history/RingtoneHistoryInfo", "showNoResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/ringtone/history/RingtoneHistoryInfo", "showNoResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        P6().setVisibility(8);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.c3) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.c3.class)).f239907f = 3;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
        O6().m82945xba09cf09(new sx3.h(this));
        P6().mo7967x900dcbe1(this.f495102h);
        P6().m7965x440a0e9(10);
        P6().N(new cy3.r(m158354x19263085()));
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f435481a;
        java.lang.Object a17 = zVar.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.v.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf n66 = ed0.r0.n6((ed0.r0) a17, false, 1, null);
        this.f495101g = n66;
        n66.f374637n = new sx3.j(this);
        n66.F = this.f495103i;
        P6().mo7960x6cab2c8d(this.f495101g);
        android.content.ComponentCallbacks2 m80379x76847179 = m80379x76847179();
        p012xc85e97e9.p093xedfae76a.y yVar = m80379x76847179 instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) m80379x76847179 : null;
        if (yVar != null) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
            ((sx3.b) zVar.a(activity2).a(sx3.b.class)).f495079d.mo7806x9d92d11c(yVar, new sx3.d(this));
        }
        O6().m82914x4c6bcf83().f411739p = true;
        O6().m82914x4c6bcf83().f411740q = false;
        O6().m82947x7297cce8(false);
    }
}
