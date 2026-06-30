package gf2;

/* loaded from: classes10.dex */
public final class k implements p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1485x1fb0fe64.p1486x373aa5.C14195x2dafdb49 f352822d;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1485x1fb0fe64.p1486x373aa5.C14195x2dafdb49 c14195x2dafdb49) {
        this.f352822d = c14195x2dafdb49;
    }

    public final void a(int i17) {
        java.util.ArrayList arrayList = this.f352822d.f193115q;
        if (arrayList == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("postViewList");
            throw null;
        }
        android.view.View view = (android.view.View) kz5.n0.a0(arrayList, i17);
        android.view.View findViewById = view != null ? view.findViewById(com.p314xaae8f345.mm.R.id.ci6) : null;
        if (findViewById == null) {
            return;
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) findViewById.findViewById(com.p314xaae8f345.mm.R.id.v6f);
        if (c22789xd23e9a9b != null) {
            c22789xd23e9a9b.m82582x3ae760af(0.0d);
        }
        if (c22789xd23e9a9b != null) {
            c22789xd23e9a9b.n();
        }
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrollStateChanged */
    public void mo8331xcb2941fe(int i17) {
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrolled */
    public void mo8332xf210c75a(int i17, float f17, int i18) {
        a(this.f352822d.f193117s + 1);
        a(r1.f193117s - 1);
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageSelected */
    public void mo8333x510f45c9(int i17) {
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorMilestoneShareView", "onPageSelected " + i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1485x1fb0fe64.p1486x373aa5.C14195x2dafdb49 c14195x2dafdb49 = this.f352822d;
        c14195x2dafdb49.f193117s = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.C14288xbc18f594 c14288xbc18f594 = c14195x2dafdb49.f193109h;
        if (c14288xbc18f594 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("circleIndicator");
            throw null;
        }
        c14288xbc18f594.a(i17);
        java.util.ArrayList arrayList = c14195x2dafdb49.f193115q;
        if (arrayList == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("postViewList");
            throw null;
        }
        android.view.View view = (android.view.View) kz5.n0.a0(arrayList, i17);
        android.view.View findViewById = view != null ? view.findViewById(com.p314xaae8f345.mm.R.id.ci6) : null;
        if (findViewById == null || (c22789xd23e9a9b = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) findViewById.findViewById(com.p314xaae8f345.mm.R.id.v6f)) == null) {
            return;
        }
        c22789xd23e9a9b.g();
    }
}
