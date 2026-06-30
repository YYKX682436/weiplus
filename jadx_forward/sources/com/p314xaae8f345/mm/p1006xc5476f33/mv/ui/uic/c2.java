package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class c2 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.d3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68 f232606d;

    public c2(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68 c16668xffb9dd68) {
        this.f232606d = c16668xffb9dd68;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.v2
    public boolean b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 rv6, android.view.MotionEvent e17) {
        android.view.View view;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rv6, "rv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68 c16668xffb9dd68 = this.f232606d;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = c16668xffb9dd68.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f435481a;
        ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16677x5944b67e) zVar.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16677x5944b67e.class)).getClass();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = c16668xffb9dd68.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
        boolean b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.e1) zVar.a(activity2).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.e1.class)).f232641f.f233376f.b();
        java.lang.String str = c16668xffb9dd68.f232507d;
        com.p314xaae8f345.mm.p2776x373aa5.p2781xdc9f1143.C22827x44b5d205 c22827x44b5d205 = c16668xffb9dd68.f232519s;
        if (b17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "mv list dialog showing now enable scroll");
            c22827x44b5d205.f295138w = true;
            c16668xffb9dd68.f232525y = -1L;
        } else {
            if (e17.getAction() == 3 || e17.getAction() == 1) {
                if (c16668xffb9dd68.f232524x == 0 && c16668xffb9dd68.f232526z >= 0.0f) {
                    long j17 = c16668xffb9dd68.f232525y;
                    if (j17 > 0) {
                        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        if (android.os.SystemClock.elapsedRealtime() - j17 <= android.view.ViewConfiguration.getTapTimeout()) {
                            c22827x44b5d205.f295138w = false;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "tap disable scroll");
                            c16668xffb9dd68.f232526z = -1.0f;
                        }
                    }
                }
                c22827x44b5d205.f295138w = true;
                c16668xffb9dd68.f232526z = -1.0f;
            } else {
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = c16668xffb9dd68.f232509f;
                android.view.View view2 = null;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07 = c22849x81a93d25 != null ? c22849x81a93d25.p0(c16668xffb9dd68.f232514n.f233397m) : null;
                if (e17.getAction() == 0) {
                    if (p07 != null && (view = p07.f3639x46306858) != null) {
                        view2 = view.findViewById(com.p314xaae8f345.mm.R.id.gcd);
                    }
                    int[] iArr = new int[2];
                    if (view2 != null) {
                        view2.getLocationInWindow(iArr);
                    }
                    if (iArr[1] <= 0 || e17.getY() < iArr[1]) {
                        c16668xffb9dd68.f232526z = e17.getY();
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "touch bottom area ignore");
                        c16668xffb9dd68.f232526z = -1.0f;
                        c22827x44b5d205.f295138w = true;
                        c16668xffb9dd68.f232525y = -1L;
                    }
                }
                if (p07 != null) {
                    p07.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.gyy).getLocationInWindow(new int[2]);
                    if (c16668xffb9dd68.A <= 0) {
                        c16668xffb9dd68.A = i65.a.h(c16668xffb9dd68.m80379x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561253dd);
                    }
                    float f17 = c16668xffb9dd68.f232526z;
                    if (f17 < 0.0f || f17 > r0.getHeight() + r2[1] + c16668xffb9dd68.A) {
                        c22827x44b5d205.f295138w = true;
                    } else {
                        c22827x44b5d205.f295138w = false;
                    }
                } else {
                    c22827x44b5d205.f295138w = true;
                }
            }
            c16668xffb9dd68.f232524x = e17.getAction();
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            c16668xffb9dd68.f232525y = android.os.SystemClock.elapsedRealtime();
        }
        return false;
    }
}
