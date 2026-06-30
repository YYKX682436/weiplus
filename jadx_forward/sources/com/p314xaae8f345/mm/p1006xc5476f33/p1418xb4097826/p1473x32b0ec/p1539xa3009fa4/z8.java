package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes.dex */
public final class z8 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements zy2.s8 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.RelativeLayout f199111d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    public final void O6() {
        java.lang.String string;
        android.widget.TextView textView = (android.widget.TextView) m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.f567158qg0);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_USER_INFO_FINDER_SETTING_LONG_SYNC;
        boolean z17 = (c17.t(u3Var, 0L) & 16) != 0;
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        if ((z17 || (((gm0.j1.u().c().t(u3Var, 0L) & 32) > 0L ? 1 : ((gm0.j1.u().c().t(u3Var, 0L) & 32) == 0L ? 0 : -1)) != 0)) ? false : true) {
            string = m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nqg);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        } else if (z17) {
            string = m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nqc);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        } else {
            string = m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nqe);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        }
        textView.setText(string);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003e  */
    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo450x3e5a77bb(android.os.Bundle r27) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.z8.mo450x3e5a77bb(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        O6();
    }
}
