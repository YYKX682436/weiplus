package dv2;

/* loaded from: classes2.dex */
public final class e2 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: i, reason: collision with root package name */
    public static final int f325375i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.concurrent.CopyOnWriteArrayList f325376m;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f325377d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f325378e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f325379f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f325380g;

    /* renamed from: h, reason: collision with root package name */
    public final dv2.b2 f325381h;

    static {
        new dv2.x1(null);
        i95.m c17 = i95.n0.c(cq.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        f325375i = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Xe).mo141623x754a37bb()).r()).intValue();
        f325376m = new java.util.concurrent.CopyOnWriteArrayList();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f325377d = jz5.h.b(dv2.a2.f325345d);
        this.f325378e = jz5.h.b(new dv2.z1(activity));
        this.f325379f = jz5.h.b(new dv2.c2(this));
        this.f325381h = new dv2.b2(this);
    }

    public static final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 O6(dv2.e2 e2Var) {
        android.view.View mo144222x4ff8c0f0;
        if (e2Var.m158354x19263085() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15036x1a33c799) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = e2Var.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            android.view.View m7474xfb86a31b = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca.class)).m63052x8f02c6c().m7474xfb86a31b();
            mo144222x4ff8c0f0 = m7474xfb86a31b != null ? m7474xfb86a31b.findViewById(com.p314xaae8f345.mm.R.id.m6e) : null;
        } else {
            mo144222x4ff8c0f0 = e2Var.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.m6e);
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = mo144222x4ff8c0f0 instanceof com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 ? (com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00) mo144222x4ff8c0f0 : null;
        if (c22801x87cbdc00 != null) {
            return c22801x87cbdc00.m82555x4905e9fa();
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
        boolean z17 = m158354x19263085() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15036x1a33c799;
        dv2.b2 b2Var = this.f325381h;
        if (!z17) {
            android.app.Activity context = m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            java.lang.Object a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            fc2.c n17 = zy2.ra.n1((zy2.ra) a17, 0, 1, null);
            if (n17 != null) {
                n17.a(b2Var);
                return;
            }
            return;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 abstractC15124x7bae6180 : ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca.class)).getFragments()) {
            android.app.Activity context2 = m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
            pf5.z zVar2 = pf5.z.f435481a;
            if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            fc2.c Y6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).Y6(abstractC15124x7bae6180.f210798p);
            if (Y6 != null) {
                Y6.a(b2Var);
            }
        }
    }
}
