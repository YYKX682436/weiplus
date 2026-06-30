package b33;

/* loaded from: classes8.dex */
public final class f extends b33.i implements oa.c, xg5.a, p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener {

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f99196f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f99197g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f99198h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f99196f = jz5.h.b(new b33.a(this));
        this.f99197g = jz5.h.b(new b33.e(this));
        this.f99198h = jz5.h.b(new b33.c(this));
    }

    public void V6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MPFooterUIC", "hideFooter: ");
        W6(true);
        ((android.widget.FrameLayout) ((jz5.n) this.f99198h).mo141623x754a37bb()).setVisibility(8);
    }

    public final void W6(boolean z17) {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((b33.o) pf5.z.f435481a.a(activity).a(b33.o.class)).U6().m78873x6e5cce43(z17);
    }

    public void X6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MPFooterUIC", "showFooter: ");
        W6(false);
        ((android.widget.FrameLayout) ((jz5.n) this.f99198h).mo141623x754a37bb()).setVisibility(0);
    }

    @Override // oa.c
    public void h0(oa.i iVar) {
        java.lang.Object obj;
        if (iVar == null || (obj = iVar.f425311a) == null || !(obj instanceof b33.p)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MPFooterUIC", "onTabReselected " + obj);
    }

    @Override // oa.c
    public void l4(oa.i iVar) {
        java.lang.Object obj;
        if (iVar == null || (obj = iVar.f425311a) == null || !(obj instanceof b33.p)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MPFooterUIC", "onTabUnselected " + obj);
        ((b33.p) obj).a(false);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        java.lang.String string;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MPFooterUIC", "onCreate");
        int[] intArrayExtra = m158354x19263085().getIntent().getIntArrayExtra("MediaTabTypeList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(intArrayExtra, "null cannot be cast to non-null type kotlin.IntArray");
        int length = intArrayExtra.length;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            jz5.g gVar = this.f99197g;
            if (i17 >= length) {
                ((com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff) ((jz5.n) gVar).mo141623x754a37bb()).a(this);
                U6().m80821xa5a25773(this);
                return;
            }
            int i19 = intArrayExtra[i17];
            int i27 = i18 + 1;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
            oa.i l17 = ((com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff) ((jz5.n) gVar).mo141623x754a37bb()).l();
            android.app.Activity context = m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            if (i19 == 1) {
                string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571517hg);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            } else if (i19 == 2) {
                string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571940u4);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            } else if (i19 == 3) {
                string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571950ue);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            } else if (i19 != 4) {
                string = "";
            } else {
                string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ng9);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            }
            b33.p pVar = new b33.p(m158354x19263085, l17, i19, i18, string);
            ((com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff) ((jz5.n) gVar).mo141623x754a37bb()).d(pVar.f99212a, false);
            if (i18 == T6()) {
                pVar.a(true);
            }
            i17++;
            i18 = i27;
        }
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrollStateChanged */
    public void mo8331xcb2941fe(int i17) {
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrolled */
    public void mo8332xf210c75a(int i17, float f17, int i18) {
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageSelected */
    public void mo8333x510f45c9(int i17) {
        oa.i k17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MPFooterUIC", "onPageSelected position = " + i17);
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff) ((jz5.n) this.f99197g).mo141623x754a37bb();
        if (c2718xca2902ff == null || (k17 = c2718xca2902ff.k(i17)) == null || k17.a()) {
            return;
        }
        k17.b();
    }

    @Override // oa.c
    public void u1(oa.i iVar) {
        java.lang.Object obj;
        if (iVar == null || (obj = iVar.f425311a) == null || !(obj instanceof b33.p)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MPFooterUIC", "onTabSelected " + obj);
        b33.p pVar = (b33.p) obj;
        pVar.a(true);
        U6().m80845x940d026a(pVar.f99214c, false);
        ((android.widget.FrameLayout) ((jz5.n) this.f99198h).mo141623x754a37bb()).removeAllViews();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activity).a(b33.o.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        ((b33.o) a17).V6(pVar.f99213b, new b33.d(this));
    }
}
