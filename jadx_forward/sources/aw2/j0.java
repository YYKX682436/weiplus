package aw2;

/* loaded from: classes2.dex */
public final class j0 implements ya2.r1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f96290d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15305x8b2e5786 f96291e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f96292f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f96293g;

    /* renamed from: h, reason: collision with root package name */
    public r45.ao2 f96294h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s f96295i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f96296m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f96297n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f96298o;

    public j0(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f96290d = activity;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0 ad0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.f207935a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15305x8b2e5786 c15305x8b2e5786 = ((java.lang.Boolean) ad0Var.a().r()).booleanValue() ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15305x8b2e5786) activity.findViewById(com.p314xaae8f345.mm.R.id.f567893ur3) : (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15305x8b2e5786) activity.findViewById(com.p314xaae8f345.mm.R.id.f567892l03);
        this.f96291e = c15305x8b2e5786;
        this.f96296m = jz5.h.b(new aw2.g0(this));
        this.f96297n = jz5.h.b(new aw2.i0(this));
        this.f96298o = jz5.h.b(new aw2.h0(this));
        java.lang.String string = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.evz);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        c15305x8b2e5786.m62140x6fd9aa19(string);
        c15305x8b2e5786.m62139x783f7bd3(com.p314xaae8f345.mm.R.raw.f80204x19cbc0d8);
        c15305x8b2e5786.m62142x7daa20f8(com.p314xaae8f345.mm.R.raw.f79826x98ab9e98);
        c15305x8b2e5786.setOnClickListener(new aw2.d0(this));
        if (((java.lang.Boolean) ad0Var.a().r()).booleanValue()) {
            int dimension = (int) activity.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561239d1);
            int dimension2 = (int) activity.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs);
            android.view.View findViewById = c15305x8b2e5786.findViewById(com.p314xaae8f345.mm.R.id.f565252kk1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
            com.p314xaae8f345.mm.ui.kk.e(findViewById, dimension);
            android.view.ViewGroup.LayoutParams layoutParams = c15305x8b2e5786.findViewById(com.p314xaae8f345.mm.R.id.buj).getLayoutParams();
            layoutParams.width = dimension2;
            layoutParams.height = dimension2;
        }
    }
}
