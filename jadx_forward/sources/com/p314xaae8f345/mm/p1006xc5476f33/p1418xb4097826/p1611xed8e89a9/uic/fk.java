package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public class fk extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.i6 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fk(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
    }

    public static /* synthetic */ void Q6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.fk fkVar, r45.sd1 sd1Var, java.lang.String str, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: gotoLiteApp");
        }
        if ((i17 & 2) != 0) {
            str = null;
        }
        fkVar.P6(sd1Var, str);
    }

    public final int O6(int i17) {
        return java.lang.Math.max((int) ((com.p314xaae8f345.mm.ui.bk.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).y - i17) * 0.3d), m80379x76847179().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db));
    }

    public final void P6(r45.sd1 liteApp, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liteApp, "liteApp");
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String m75945x2fec8307 = liteApp.m75945x2fec8307(0);
        java.lang.String m75945x2fec83072 = liteApp.m75945x2fec8307(1);
        if (m75945x2fec83072 == null) {
            m75945x2fec83072 = "";
        }
        java.lang.String m75945x2fec83073 = liteApp.m75945x2fec8307(2);
        if (m75945x2fec83073 == null) {
            m75945x2fec83073 = "";
        }
        if (!(str == null || r26.n0.N(str))) {
            if (r26.n0.N(m75945x2fec83073)) {
                m75945x2fec83073 = "repostId=" + str;
            } else {
                m75945x2fec83073 = m75945x2fec83073 + "&repostId=" + str;
            }
        }
        java.lang.String m75945x2fec83074 = liteApp.m75945x2fec8307(4);
        if (m75945x2fec83074 == null) {
            m75945x2fec83074 = "";
        }
        bundle.putString("appId", m75945x2fec8307);
        bundle.putString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, m75945x2fec83072);
        bundle.putString("query", m75945x2fec83073);
        bundle.putString("minVersion", m75945x2fec83074);
        if (liteApp.m75939xb282bd08(5) == 1) {
            bundle.putBoolean("forbidRightGesture", true);
            bundle.putBoolean(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13307xd51ecb63, true);
            bundle.putInt("nextAnimIn", com.p314xaae8f345.mm.R.C30854x2dc211.f559412e3);
            bundle.putInt("currentAnimOut", com.p314xaae8f345.mm.R.C30854x2dc211.f559410e1);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTingProfileFragmentUIC", "gotoLiteApp appId: " + m75945x2fec8307 + ", path: " + m75945x2fec83072 + " query: " + m75945x2fec83073);
        qk.i9 i9Var = (qk.i9) i95.n0.c(qk.i9.class);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        ((ef0.l4) i9Var).aj(m75945x2fec8307);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(m80379x76847179(), bundle, true, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ek(this));
    }
}
