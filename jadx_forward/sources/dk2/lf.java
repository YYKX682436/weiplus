package dk2;

/* loaded from: classes3.dex */
public final class lf {
    public lf(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final dk2.mf a(r45.nj1 notificationInfo, java.lang.Long l17) {
        java.util.LinkedList m75941xfb821914;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(notificationInfo, "notificationInfo");
        r45.t12 t12Var = new r45.t12();
        boolean z17 = true;
        t12Var.set(3, java.lang.Integer.valueOf(notificationInfo.m75939xb282bd08(3) == 106 ? 1 : 10001));
        java.lang.String m75945x2fec8307 = notificationInfo.m75945x2fec8307(1);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        t12Var.set(2, m75945x2fec8307);
        t12Var.set(5, java.lang.Long.valueOf(l17 != null ? l17.longValue() : 0L));
        java.lang.String m75945x2fec83072 = notificationInfo.m75945x2fec8307(5);
        if (m75945x2fec83072 != null && m75945x2fec83072.length() != 0) {
            z17 = false;
        }
        if (!z17) {
            r45.xn1 xn1Var = new r45.xn1();
            xn1Var.set(11, new java.util.LinkedList());
            t12Var.set(8, xn1Var);
            r45.xn1 xn1Var2 = (r45.xn1) t12Var.m75936x14adae67(8);
            if (xn1Var2 != null && (m75941xfb821914 = xn1Var2.m75941xfb821914(11)) != null) {
                r45.yl1 yl1Var = new r45.yl1();
                yl1Var.set(0, -10002);
                yl1Var.set(4, notificationInfo.m75945x2fec8307(5));
                m75941xfb821914.add(yl1Var);
            }
        }
        dk2.mf mfVar = new dk2.mf(t12Var);
        mfVar.f315313h = notificationInfo.m75945x2fec8307(2);
        r45.oj1 oj1Var = (r45.oj1) notificationInfo.m75936x14adae67(6);
        mfVar.f315314i = oj1Var;
        if (oj1Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notification msg_jump_info:");
            r45.oj1 oj1Var2 = mfVar.f315314i;
            sb6.append(oj1Var2 != null ? oj1Var2.mo12245xcc313de3() : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveTextMsg", sb6.toString());
        }
        mfVar.f315308c = notificationInfo.m75939xb282bd08(3);
        return mfVar;
    }
}
