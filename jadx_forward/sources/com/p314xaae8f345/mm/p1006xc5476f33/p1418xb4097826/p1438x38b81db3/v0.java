package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class v0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.is {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f186287a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15379x1d4ea971 f186288b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.b1 f186289c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f186290d;

    public v0(in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15379x1d4ea971 c15379x1d4ea971, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.b1 b1Var, long j17) {
        this.f186287a = s0Var;
        this.f186288b = c15379x1d4ea971;
        this.f186289c = b1Var;
        this.f186290d = j17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.is
    public boolean a(android.view.MotionEvent e17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15379x1d4ea971 c15379x1d4ea971 = this.f186288b;
        return new android.graphics.Rect(0, 0, c15379x1d4ea971.getWidth(), c15379x1d4ea971.getBottom()).contains((int) e17.getX(), (int) e17.getY());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.is
    public void b(android.view.View view, android.view.MotionEvent e17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        in5.s0 s0Var = this.f186287a;
        android.content.Context context = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15477xbd78f833.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15477xbd78f833 c15477xbd78f833 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15477xbd78f833) a17;
        c15477xbd78f833.c7(s0Var, e17, -1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.b1 b1Var = this.f186289c;
        long j17 = this.f186290d;
        b1Var.B = j17;
        b1Var.f184453x.mo147xb9724478(view, java.lang.Long.valueOf(j17), java.lang.Boolean.TRUE);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.b1.v(b1Var, s0Var, true);
        if (c15477xbd78f833.f215183u) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 o17 = s0Var.o();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = o17 != null ? o17.getLayoutManager() : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 c15415x74224fd8 = layoutManager instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8) layoutManager : null;
            if (c15415x74224fd8 != null) {
                c15415x74224fd8.D = false;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.is
    public java.lang.Integer c(android.view.MotionEvent motionEvent) {
        android.view.ViewConfiguration viewConfiguration;
        in5.s0 s0Var = this.f186287a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90 c15178x4303ff90 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90) s0Var.p(com.p314xaae8f345.mm.R.id.ghd);
        int i17 = 4;
        if ((motionEvent == null || c15178x4303ff90 == null || !c15178x4303ff90.m(this.f186288b, motionEvent)) && (viewConfiguration = android.view.ViewConfiguration.get(s0Var.f374654e)) != null) {
            i17 = viewConfiguration.getScaledTouchSlop();
        }
        return java.lang.Integer.valueOf(i17);
    }
}
