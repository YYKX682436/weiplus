package sz3;

/* loaded from: classes15.dex */
public final class v0 extends sz3.w {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(android.content.Context context, sz3.q handleCallback) {
        super(handleCallback);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handleCallback, "handleCallback");
        this.f483344f = context;
        ((jd0.u1) ((kd0.h2) i95.n0.c(kd0.h2.class))).getClass();
        new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2048x37c70a.C17351x2827be15((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0172 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0173  */
    @Override // sz3.w, rz3.a
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(long r25, sz3.c1 r27) {
        /*
            Method dump skipped, instructions count: 1149
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sz3.v0.b(long, sz3.c1):void");
    }

    @Override // sz3.w
    public boolean i(sz3.c1 scanProductResult) {
        sz3.a1 a1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.C17282x335f2f60 c17282x335f2f60;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scanProductResult, "scanProductResult");
        boolean i17 = super.i(scanProductResult);
        if (i17) {
            if (scanProductResult.f495520n && (a1Var = scanProductResult.f495515i) != null && (c17282x335f2f60 = a1Var.f495492a) != null) {
                vz3.t.f523243a.c(java.lang.Integer.valueOf(c17282x335f2f60.getId()).intValue());
            }
            r(scanProductResult);
        }
        return i17;
    }

    @Override // sz3.w
    public boolean j(sz3.c1 scanProductResult, sz3.x0 x0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scanProductResult, "scanProductResult");
        scanProductResult.f495509c = 1002;
        boolean e17 = this.f495660g.e(scanProductResult, x0Var);
        if (e17) {
            sz3.a1 a1Var = scanProductResult.f495515i;
            if (a1Var != null) {
                a1Var.f495496e.f495706n = java.lang.System.currentTimeMillis() - a1Var.f495496e.f495693a;
            }
            sz3.a1 a17 = scanProductResult.a();
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d.a(2, a17 != null ? a17.f495497f : null);
            r(scanProductResult);
        }
        return e17;
    }

    @Override // sz3.w
    public void k(sz3.x0 result, int i17, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        super.k(result, i17, str);
    }

    @Override // sz3.w
    public void l(sz3.x0 result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        super.l(result);
    }

    @Override // sz3.w
    public void m(sz3.x0 result, int i17, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        super.m(result, i17, str);
        ((ku5.t0) ku5.t0.f394148d).B(new sz3.t0(this));
    }

    @Override // sz3.w
    public void n(sz3.x0 result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        super.n(result);
        if (result.f495683d == 1002) {
            return;
        }
        q((sz3.w0) kz5.n0.Z(result.f495684e));
    }

    public final void p(sz3.c1 c1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.C17282x335f2f60 c17282x335f2f60;
        sz3.a1 a1Var = c1Var.f495515i;
        if (a1Var == null || (c17282x335f2f60 = a1Var.f495492a) == null) {
            return;
        }
        int intValue = java.lang.Integer.valueOf(c17282x335f2f60.getId()).intValue();
        d(intValue);
        if (c1Var.f495520n) {
            vz3.t.f523243a.c(intValue);
        }
    }

    public final void q(sz3.w0 w0Var) {
        if (w0Var == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MixScanGoodsImageHandler", "doRetrievalClick trackId: " + w0Var.f495671i + ", reqKey: " + w0Var.f495672j);
        gm0.j1.d().g(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.z(kz5.c0.d(w0Var.f495672j), true, null, 4, null));
    }

    public final void r(sz3.c1 c1Var) {
        sz3.a1 a1Var = c1Var.f495515i;
        if (a1Var != null) {
            sz3.y0 y0Var = a1Var.f495496e;
            java.lang.String valueOf = java.lang.String.valueOf(c1Var.f495508b);
            y0Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(valueOf, "<set-?>");
            y0Var.f495697e = valueOf;
            int i17 = c1Var.f495510d;
            if (i17 == 1) {
                a1Var.f495496e.f495698f = 1;
            } else if (i17 == 2) {
                a1Var.f495496e.f495698f = 2;
            } else if (i17 == 3) {
                a1Var.f495496e.f495698f = 3;
            }
            a1Var.f495496e.f495709q = e04.j2.a();
            sz3.y0 y0Var2 = a1Var.f495496e;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = et5.c.f338205a;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var2 = et5.c.f338205a;
            y0Var2.f495708p = o4Var2 != null ? o4Var2.getInt("scan_code_last_frame_cost", 0) : 0;
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.e.f240407a.a(a1Var.f495496e);
        }
    }
}
