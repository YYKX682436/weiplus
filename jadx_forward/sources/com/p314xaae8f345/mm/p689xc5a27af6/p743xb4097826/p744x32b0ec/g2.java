package com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec;

/* loaded from: classes3.dex */
public final class g2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.f f148247d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4 f148248e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f148249f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f148250g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s40.t0 f148251h;

    public g2(com.p314xaae8f345.mm.p944x882e457a.f fVar, com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4 v4Var, long j17, int i17, s40.t0 t0Var) {
        this.f148247d = fVar;
        this.f148248e = v4Var;
        this.f148249f = j17;
        this.f148250g = i17;
        this.f148251h = t0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r45.lw1 lw1Var;
        r45.nw1 nw1Var;
        r45.nw1 nw1Var2;
        java.util.LinkedList m75941xfb821914;
        java.util.LinkedList m75941xfb8219142;
        java.lang.Object obj;
        r45.d84 d84Var;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = this.f148247d;
        int i17 = fVar.f152148a;
        long j17 = this.f148249f;
        if (i17 != 0 || fVar.f152149b != 0) {
            pm0.v.X(new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.f2(this.f148251h, j17));
            return;
        }
        r45.nw1 nw1Var3 = (r45.nw1) ((r45.l71) fVar.f152151d).m75936x14adae67(1);
        int m75939xb282bd08 = nw1Var3 != null ? nw1Var3.m75939xb282bd08(2) : 1;
        r45.l71 l71Var = (r45.l71) fVar.f152151d;
        com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4 v4Var = this.f148248e;
        if (l71Var != null && (d84Var = (r45.d84) l71Var.m75936x14adae67(9)) != null) {
            java.lang.String m75945x2fec8307 = d84Var.m75945x2fec8307(0);
            if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(d84Var.m75945x2fec8307(0));
                java.lang.String m75945x2fec83072 = d84Var.m75945x2fec8307(1);
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (m75945x2fec83072 == null) {
                    m75945x2fec83072 = "";
                }
                sb6.append(m75945x2fec83072);
                v4Var.Ak(j17, sb6.toString());
            }
        }
        r45.l71 l71Var2 = (r45.l71) fVar.f152151d;
        if (l71Var2 == null || (m75941xfb8219142 = l71Var2.m75941xfb821914(15)) == null) {
            lw1Var = null;
        } else {
            java.util.Iterator it = m75941xfb8219142.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((r45.lw1) obj).m75939xb282bd08(5) == 2) {
                        break;
                    }
                }
            }
            lw1Var = (r45.lw1) obj;
        }
        java.lang.String m75945x2fec83073 = lw1Var != null ? lw1Var.m75945x2fec8307(0) : null;
        if (!(m75945x2fec83073 == null || m75945x2fec83073.length() == 0)) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(lw1Var != null ? lw1Var.m75945x2fec8307(0) : null);
            java.lang.String m75945x2fec83074 = lw1Var != null ? lw1Var.m75945x2fec8307(1) : null;
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            sb7.append(m75945x2fec83074 != null ? m75945x2fec83074 : "");
            v4Var.Ak(j17, sb7.toString());
        }
        pm0.v.X(new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.e2(this.f148251h, this.f148249f, m75939xb282bd08, this.f148247d));
        v4Var.f148519g.put(java.lang.Long.valueOf(j17), new jz5.o(java.lang.Integer.valueOf(m75939xb282bd08), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), fVar.f152151d));
        v4Var.f148522m.put(new jz5.l(java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(this.f148250g)), java.lang.Integer.valueOf(((r45.l71) fVar.f152151d).m75939xb282bd08(25)));
        r45.l71 l71Var3 = (r45.l71) fVar.f152151d;
        if (l71Var3 != null && (nw1Var2 = (r45.nw1) l71Var3.m75936x14adae67(1)) != null && (m75941xfb821914 = nw1Var2.m75941xfb821914(51)) != null) {
            v4Var.f148521i.put(java.lang.Long.valueOf(j17), m75941xfb821914);
        }
        zy2.v.f559124b = ((r45.l71) fVar.f152151d).m75939xb282bd08(3);
        ae2.in inVar = ae2.in.f85221a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85256d4).mo141623x754a37bb()).r()).intValue() != 1 || (nw1Var = (r45.nw1) ((r45.l71) fVar.f152151d).m75936x14adae67(1)) == null) {
            return;
        }
        r45.co1 co1Var = new r45.co1();
        co1Var.set(0, 1);
        co1Var.set(1, "屏蔽测试\nBAN_TEST");
        nw1Var.set(43, co1Var);
    }
}
