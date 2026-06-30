package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes2.dex */
public final class kb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15048xbc5a5f5e f210960d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f210961e;

    public kb(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15048xbc5a5f5e activityC15048xbc5a5f5e, long j17) {
        this.f210960d = activityC15048xbc5a5f5e;
        this.f210961e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15048xbc5a5f5e activity = this.f210960d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = activity.E;
        if (abstractC14490x69736cb5 != null) {
            long j17 = this.f210961e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            java.lang.Object a17 = pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            ec2.d e27 = zy2.ra.e2((zy2.ra) a17, 0, 1, null);
            if (e27 != null) {
                ec2.a aVar = new ec2.a(6, abstractC14490x69736cb5.mo2128x1ed62e84(), abstractC14490x69736cb5.w());
                aVar.f332483h = new ec2.c(0, false, false, 0, 0L, 0, 52, null);
                e27.a(aVar);
            }
            if (activity.f210173z || hc2.b0.i(abstractC14490x69736cb5) || !hc2.s.f(abstractC14490x69736cb5.getContact())) {
                z17 = false;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.b3(2);
                z17 = true;
            }
            int i17 = activity.D ? 10002 : 0;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c9 c9Var = activity.f210170w;
            if (c9Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.f5 g17 = c9Var.g();
            if (g17 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c9 c9Var2 = activity.f210170w;
                if (c9Var2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                    throw null;
                }
                p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 q07 = c9Var2.m56068x4905e9fa().q0(0, false);
                in5.s0 s0Var = q07 instanceof in5.s0 ? (in5.s0) q07 : null;
                if (s0Var != null) {
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activity.mo55332x76847179();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.a4) pf5.z.f435481a.a(mo55332x76847179).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.a4.class)).P6(null, abstractC14490x69736cb5, s0Var, g17);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.f5.c(g17, abstractC14490x69736cb5.getFeedObject(), false, j17, true, false, null, z17, i17, null, false, 0L, 0, ((java.lang.Number) ((jz5.n) activity.G).mo141623x754a37bb()).intValue(), null, 0, 28466, null);
            }
        }
    }
}
