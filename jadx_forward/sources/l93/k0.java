package l93;

/* loaded from: classes2.dex */
public abstract class k0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.mp {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f398817d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f398818e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f398819f;

    public k0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f398817d = activity;
        this.f398818e = abstractC14490x69736cb5;
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderDrawerAnimateListener", "[onDrawerDetach]");
        if (this.f398819f) {
            if (g()) {
                k();
            } else {
                h();
            }
        }
        this.f398819f = false;
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a
    public void d() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.mp
    public void e() {
        if (g()) {
            k();
        } else {
            h();
        }
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a
    public void f() {
    }

    public final boolean g() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject2;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f398818e;
        return (abstractC14490x69736cb5 == null || (feedObject = abstractC14490x69736cb5.getFeedObject()) == null || (feedObject2 = feedObject.getFeedObject()) == null || (m76802x2dd01666 = feedObject2.m76802x2dd01666()) == null || m76802x2dd01666.m76964x7f025288() != 4) ? false : true;
    }

    public final void h() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = this.f398817d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((uo2.v) pf5.z.f435481a.a(activity).a(uo2.v.class)).T6();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.mp
    public void i() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderDrawerAnimateListener", "[onBackFromFullScreen]");
        if (this.f398819f) {
            if (g()) {
                k();
            } else {
                h();
            }
        }
        this.f398819f = false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.mp
    public void j() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderDrawerAnimateListener", "[onReachTop]");
        this.f398819f = true;
        boolean g17 = g();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = this.f398817d;
        if (g17) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nb0) pf5.u.f435469a.e(zy2.b6.class).c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nb0.class))).c7(activity);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            ((uo2.v) pf5.z.f435481a.a(activity).a(uo2.v.class)).S6();
        }
    }

    public final void k() {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nb0) pf5.u.f435469a.e(zy2.b6.class).c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nb0.class))).f7(this.f398817d);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.mp
    public void m() {
        boolean g17 = g();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = this.f398817d;
        if (g17) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nb0) pf5.u.f435469a.e(zy2.b6.class).c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nb0.class))).c7(activity);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            ((uo2.v) pf5.z.f435481a.a(activity).a(uo2.v.class)).S6();
        }
    }
}
