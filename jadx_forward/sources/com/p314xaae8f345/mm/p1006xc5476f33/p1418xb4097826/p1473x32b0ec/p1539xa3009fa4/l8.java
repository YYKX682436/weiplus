package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class l8 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements zy2.p8 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea f198755d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ProgressBar f198756e;

    /* renamed from: f, reason: collision with root package name */
    public r45.a73 f198757f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f198758g;

    /* renamed from: h, reason: collision with root package name */
    public long f198759h;

    /* renamed from: i, reason: collision with root package name */
    public long f198760i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f198761m;

    /* renamed from: n, reason: collision with root package name */
    public final yz5.p f198762n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f198758g = new java.util.ArrayList();
        this.f198762n = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.k8(this, activity);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        java.util.ArrayList arrayList;
        java.util.LinkedList m75941xfb821914;
        java.util.LinkedList<r45.z63> m75941xfb8219142;
        this.f198761m = m158354x19263085() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14039xbe936a66;
        r45.a73 a73Var = (r45.a73) g92.b.f351302e.k2().e().m75936x14adae67(11);
        java.lang.String l17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(a73Var != null ? a73Var.mo14344x5f01b1f6() : null);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l17)) {
            r45.a73 a73Var2 = new r45.a73();
            try {
                a73Var2.mo11468x92b714fd(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h(l17));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                a73Var2 = null;
            }
            this.f198757f = a73Var2;
            if (a73Var2 != null && (m75941xfb8219142 = a73Var2.m75941xfb821914(0)) != null) {
                for (r45.z63 z63Var : m75941xfb8219142) {
                    if (z63Var != null) {
                        zl2.r.f555471a.a(z63Var, "SimpleUIComponent_get");
                    }
                }
            }
        }
        this.f198759h = m158354x19263085().getIntent().getLongExtra("LIVE_ID", 0L);
        this.f198760i = m158354x19263085().getIntent().getLongExtra("OBJECT_ID", 0L);
        this.f198755d = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea) m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.i_l);
        this.f198756e = (android.widget.ProgressBar) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.imc);
        r45.a73 a73Var3 = this.f198757f;
        if (a73Var3 != null) {
            if ((a73Var3 == null || (m75941xfb821914 = a73Var3.m75941xfb821914(0)) == null || m75941xfb821914.isEmpty()) ? false : true) {
                r45.a73 a73Var4 = this.f198757f;
                java.util.LinkedList m75941xfb8219143 = a73Var4 != null ? a73Var4.m75941xfb821914(0) : null;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea c13728x20aad6ea = this.f198755d;
                if (m75941xfb8219143 != null && c13728x20aad6ea != null) {
                    java.util.Iterator it = m75941xfb8219143.iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        arrayList = this.f198758g;
                        if (!hasNext) {
                            break;
                        }
                        r45.z63 z63Var2 = (r45.z63) it.next();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(z63Var2);
                        arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.h8(z63Var2));
                    }
                    c13728x20aad6ea.mo7967x900dcbe1(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8(m158354x19263085()));
                    c13728x20aad6ea.mo7960x6cab2c8d(new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.finder.live.viewmodel.FinderLiveVisitorGameRankSwitchUIC$onCreate$1$2
                        @Override // in5.s
                        /* renamed from: getItemConvert */
                        public in5.r mo43555xf2bb75ea(int type) {
                            if (type == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.h8.class.hashCode()) {
                                return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.g8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.l8.this.f198762n);
                            }
                            ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).getClass();
                            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.z2();
                        }
                    }, arrayList, false));
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.i0 i0Var = new p012xc85e97e9.p103xe821e364.p104xd1075a44.i0(m158354x19263085(), 1);
                    i0Var.d(m158354x19263085().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563179z1));
                    c13728x20aad6ea.N(i0Var);
                }
            }
        }
        if (this.f198761m) {
            i95.m c17 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ml2.r0.Rj((ml2.r0) c17, 4, null, 0, 6, null);
        }
    }
}
