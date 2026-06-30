package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes2.dex */
public final class jb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15048xbc5a5f5e f210926d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dm.pd f210927e;

    public jb(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15048xbc5a5f5e activityC15048xbc5a5f5e, dm.pd pdVar) {
        this.f210926d = activityC15048xbc5a5f5e;
        this.f210927e = pdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15048xbc5a5f5e activityC15048xbc5a5f5e = this.f210926d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = activityC15048xbc5a5f5e.E;
        if (abstractC14490x69736cb5 != null) {
            boolean m59311x25315bf4 = abstractC14490x69736cb5.getFeedObject().m59311x25315bf4();
            dm.pd pdVar = this.f210927e;
            if (m59311x25315bf4) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c9 c9Var = activityC15048xbc5a5f5e.f210170w;
                if (c9Var == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                    throw null;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15307x329a684e c15307x329a684e = c9Var.f188507m;
                if (c15307x329a684e == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("liveLikeDrawer");
                    throw null;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject = abstractC14490x69736cb5.getFeedObject();
                java.lang.String str = pdVar.f66131xdec927b;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15307x329a684e.w(c15307x329a684e, null, feedObject, null, 0, str == null ? "" : str, null, 40, null);
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c9 c9Var2 = activityC15048xbc5a5f5e.f210170w;
            if (c9Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 q07 = c9Var2.m56068x4905e9fa().q0(0, false);
            in5.s0 s0Var = q07 instanceof in5.s0 ? (in5.s0) q07 : null;
            if (s0Var != null) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC15048xbc5a5f5e.mo55332x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.a4 a4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.a4) pf5.z.f435481a.a(mo55332x76847179).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.a4.class);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c9 c9Var3 = activityC15048xbc5a5f5e.f210170w;
                if (c9Var3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                    throw null;
                }
                a4Var.R6(null, abstractC14490x69736cb5, s0Var, c9Var3.l());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c9 c9Var4 = activityC15048xbc5a5f5e.f210170w;
            if (c9Var4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15307x329a684e l17 = c9Var4.l();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject2 = abstractC14490x69736cb5.getFeedObject();
            java.lang.String str2 = pdVar.f66131xdec927b;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15307x329a684e.w(l17, null, feedObject2, null, 0, str2 == null ? "" : str2, null, 40, null);
        }
    }
}
