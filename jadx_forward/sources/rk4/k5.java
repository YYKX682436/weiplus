package rk4;

/* loaded from: classes11.dex */
public abstract class k5 {
    public static final qk.ia a(jm4.g3 g3Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(g3Var, "<this>");
        return qk.ia.f445702e.a(((jm4.h3) g3Var).i());
    }

    public static final bw5.lp0 b(jm4.g3 g3Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(g3Var, "<this>");
        bw5.lp0 lp0Var = new bw5.lp0();
        byte[] m169374x21b81c55 = p3380x6a61f93.p3381xf512d0a5.C30495x21b91836.m169374x21b81c55(((jm4.h3) g3Var).m105978x2737f10());
        if (m169374x21b81c55.length == 0) {
            d("playingItem is empty", "TingKt");
            return null;
        }
        try {
            lp0Var.mo11468x92b714fd(m169374x21b81c55);
            return lp0Var;
        } catch (java.lang.Exception e17) {
            d(e17.toString(), null);
            return null;
        }
    }

    public static final void c(java.lang.String msg, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        if (str == null) {
            return;
        }
        ".".concat(str);
    }

    public static final void d(java.lang.String msg, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MicroMsg.Ting");
        sb6.append(str == null ? "" : ".".concat(str));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(sb6.toString(), msg);
    }

    public static final void e(java.lang.String msg, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MicroMsg.Ting");
        sb6.append(str == null ? "" : ".".concat(str));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(sb6.toString(), msg);
    }

    public static final int f(int i17) {
        switch (i17) {
            case 1:
            case 7:
                return 11;
            case 2:
                return 9;
            case 3:
            case 8:
                return 0;
            case 4:
                return 7;
            case 5:
                return 3;
            case 6:
                return 1;
            case 9:
                return 12;
            case 10:
                return 8;
            case 11:
                return 2;
            case 12:
                return 4;
            case 13:
                return 10;
            default:
                return -1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002e, code lost:
    
        if (r3 != 4) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final b21.r g(bw5.lp0 r7) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rk4.k5.g(bw5.lp0):b21.r");
    }
}
