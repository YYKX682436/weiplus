package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

/* loaded from: classes10.dex */
public final class v1 implements in5.y {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16689xafe4de36 f233499d;

    public v1(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16689xafe4de36 c16689xafe4de36) {
        this.f233499d = c16689xafe4de36;
    }

    @Override // in5.y
    public boolean c(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        r45.os4 os4Var;
        java.lang.String str;
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) adapter;
        if (i17 < 0 && i17 >= c22848x6ddd90cf.mo1894x7e414b06()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MusicMvCommentView", "invalid position:" + i17);
            return false;
        }
        long j17 = ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.m1) c22848x6ddd90cf.m82898xfb7e5820().get(i17)).f233431d.f233453a.f463177g;
        java.lang.String str2 = ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.m1) c22848x6ddd90cf.m82898xfb7e5820().get(i17)).f233431d.f233453a.f463179i;
        java.lang.String str3 = str2 == null ? "" : str2;
        r45.ls4 ls4Var = ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.m1) c22848x6ddd90cf.m82898xfb7e5820().get(i17)).f233431d.f233453a.f463174d;
        java.lang.String str4 = (ls4Var == null || (os4Var = ls4Var.f461334e) == null || (str = os4Var.f464029d) == null) ? "" : str;
        boolean z17 = ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.m1) c22848x6ddd90cf.m82898xfb7e5820().get(i17)).f233431d.f233453a.f463181n == 1;
        long j18 = ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.m1) c22848x6ddd90cf.m82898xfb7e5820().get(i17)).f233431d.f233453a.f463182o;
        java.lang.String str5 = ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.m1) c22848x6ddd90cf.m82898xfb7e5820().get(i17)).f233431d.f233453a.f463183p;
        java.lang.Long valueOf = java.lang.Long.valueOf(j18);
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16689xafe4de36 c16689xafe4de36 = this.f233499d;
        c16689xafe4de36.getClass();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(c16689xafe4de36.getContext(), 1, false);
        k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.q1(c16689xafe4de36, z17);
        k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.r1(str4, c16689xafe4de36, valueOf, str5, j17, str3);
        k0Var.v();
        return true;
    }
}
