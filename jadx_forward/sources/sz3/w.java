package sz3;

/* loaded from: classes15.dex */
public class w extends rz3.g {

    /* renamed from: g, reason: collision with root package name */
    public final sz3.q f495660g;

    /* renamed from: h, reason: collision with root package name */
    public final sz3.m f495661h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f495662i;

    public w(sz3.q handleCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handleCallback, "handleCallback");
        this.f495660g = handleCallback;
        this.f495662i = jz5.h.b(sz3.t.f495652d);
        this.f495661h = new sz3.m(new sz3.s(this));
    }

    public final void d(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewAiImageHandler", "addTrackId: %s", java.lang.Integer.valueOf(i17));
        sz3.o g17 = g();
        synchronized (g17.f495616c) {
            g17.f495616c.add(java.lang.Integer.valueOf(i17));
        }
    }

    @Override // rz3.a
    /* renamed from: destroy */
    public void mo9410x5cd39ffa() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewAiImageHandler", "destroy NewAiImageHandler");
        sz3.m mVar = this.f495661h;
        mVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AiScanImageGetProductManager", "getProduct cancel");
        mVar.f495604g = true;
        ((ku5.t0) ku5.t0.f394148d).h(new sz3.c(mVar), "AiScanImageGetProductManager");
        sz3.o g17 = g();
        synchronized (g17.f495616c) {
            g17.f495616c.clear();
        }
        synchronized (java.lang.Integer.valueOf(g17.f495614a)) {
            g17.f495614a = 0;
        }
    }

    public final boolean e(int i17) {
        boolean contains;
        sz3.o g17 = g();
        synchronized (g17.f495616c) {
            contains = g17.f495616c.contains(java.lang.Integer.valueOf(i17));
        }
        return contains;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0181  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final jz5.l f(byte[] r30, int r31, int r32, android.graphics.Point r33) {
        /*
            Method dump skipped, instructions count: 613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sz3.w.f(byte[], int, int, android.graphics.Point):jz5.l");
    }

    public final sz3.o g() {
        return (sz3.o) ((jz5.n) this.f495662i).mo141623x754a37bb();
    }

    @Override // rz3.a
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void b(long j17, sz3.c1 c1Var) {
        if (c1Var == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1259, 245);
        if (c1Var.f495516j) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            dz3.i.p(new sz3.u(c1Var, this));
            return;
        }
        sz3.a1 a17 = c1Var.a();
        if (a17 == null) {
            return;
        }
        c1Var.f495515i = a17;
        if (a17.f495497f == null) {
            a17.f495497f = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.c(0);
        }
        int i17 = c1Var.f495507a;
        int i18 = 3;
        if (i17 != 3) {
            if (i17 == 4) {
                o(c1Var, a17);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.C17282x335f2f60 c17282x335f2f60 = a17.f495492a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewAiImageHandler", "uploadNormalImage shouldShow: %s, source: %s, session: %s, tracId: %s", java.lang.Boolean.valueOf(c17282x335f2f60.getShouldShow()), java.lang.Integer.valueOf(c1Var.f495507a), java.lang.Long.valueOf(c1Var.f495508b), java.lang.Integer.valueOf(c17282x335f2f60.getId()));
        if (!c17282x335f2f60.getShouldShow() || e(c17282x335f2f60.getId())) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.C17279x15159658 e17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1.e(c17282x335f2f60.getId(), c17282x335f2f60.getX1(), c17282x335f2f60.getY1(), c17282x335f2f60.getX2(), c17282x335f2f60.getY2());
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        if ((e17 != null ? e17.f37918x2e555221 : null) != null) {
            long currentTimeMillis3 = java.lang.System.currentTimeMillis();
            byte[] bestImageData = e17.f37918x2e555221;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bestImageData, "bestImageData");
            jz5.l f17 = f(bestImageData, 4, 1, new android.graphics.Point(e17.f37929x6be2dc6, e17.f37923xb7389127));
            byte[] bArr = (byte[]) f17.f384366d;
            int intValue = ((java.lang.Number) f17.f384367e).intValue();
            long currentTimeMillis4 = java.lang.System.currentTimeMillis() - currentTimeMillis3;
            if (bArr == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewAiImageHandler", "handleResult get jpg failed");
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d.a(11, a17.f495497f);
                ((ku5.t0) ku5.t0.f394148d).B(new sz3.v(this, c1Var, c17282x335f2f60));
                return;
            }
            sz3.y0 y0Var = a17.f495496e;
            y0Var.f495700h = currentTimeMillis2;
            y0Var.f495701i = currentTimeMillis4;
            y0Var.f495702j = bArr.length;
            if (intValue == 1) {
                i18 = 2;
            } else if (intValue == 2) {
                i18 = 1;
            } else if (intValue != 3) {
                i18 = -1;
            }
            y0Var.f495707o = i18;
            java.util.Iterator it = c1Var.f495514h.iterator();
            while (it.hasNext()) {
                sz3.a1 a1Var = (sz3.a1) it.next();
                if (a1Var.f495492a.getId() == c17282x335f2f60.getId()) {
                    c17282x335f2f60.getShouldShow();
                    c17282x335f2f60.getId();
                    sz3.b1 b1Var = new sz3.b1(bArr);
                    b1Var.f495501c = intValue;
                    a1Var.f495494c = b1Var;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.c cVar = a17.f495497f;
            if (cVar != null) {
                cVar.f240362f = 1;
                sz3.y0 y0Var2 = a17.f495496e;
                cVar.f240357a = y0Var2.f495707o;
                cVar.f240358b = y0Var2.f495702j;
            }
            if (!i(c1Var)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NewAiImageHandler", "uploadNormalImage addScanProduct failed");
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d.a(10, a17.f495497f);
            d(c17282x335f2f60.getId());
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1259, 247);
            sz3.p pVar = new sz3.p(a17, 1, bArr, e17.f37929x6be2dc6, e17.f37923xb7389127);
            pVar.f495480d = c1Var.f495507a;
            pVar.f495479c = c1Var.f495508b;
            pVar.f495481e = 0;
            this.f495661h.n(pVar);
        }
    }

    public boolean i(sz3.c1 scanProductResult) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scanProductResult, "scanProductResult");
        boolean d17 = this.f495660g.d(scanProductResult);
        if (d17) {
            sz3.a1 a1Var = scanProductResult.f495515i;
            if (a1Var != null) {
                a1Var.f495496e.f495706n = java.lang.System.currentTimeMillis() - a1Var.f495496e.f495693a;
            }
            sz3.a1 a17 = scanProductResult.a();
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d.a(2, a17 != null ? a17.f495497f : null);
        }
        return d17;
    }

    public boolean j(sz3.c1 scanProductResult, sz3.x0 x0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scanProductResult, "scanProductResult");
        boolean d17 = this.f495660g.d(scanProductResult);
        if (d17) {
            sz3.a1 a17 = scanProductResult.a();
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d.a(2, a17 != null ? a17.f495497f : null);
        }
        return d17;
    }

    public void k(sz3.x0 result, int i17, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        this.f495660g.b(result, i17, str);
    }

    public void l(sz3.x0 result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        this.f495660g.c(result);
    }

    public void m(sz3.x0 result, int i17, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        this.f495660g.a(result, i17, str);
    }

    public void n(sz3.x0 result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        this.f495660g.f(result);
    }

    public final void o(sz3.c1 scanProductResult, sz3.a1 scanProductInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scanProductResult, "scanProductResult");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scanProductInfo, "scanProductInfo");
        sz3.b1 b1Var = scanProductInfo.f495495d;
        byte[] a17 = b1Var != null ? b1Var.a() : null;
        if (a17 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1259, 248);
            sz3.b1 b1Var2 = scanProductInfo.f495495d;
            sz3.p pVar = new sz3.p(scanProductInfo, 2, a17, b1Var2 != null ? b1Var2.f495502d : 0, b1Var2 != null ? b1Var2.f495503e : 0);
            pVar.f495480d = scanProductResult.f495507a;
            pVar.f495479c = scanProductResult.f495508b;
            pVar.f495481e = scanProductResult.f495509c;
            pVar.f495622k = false;
            pVar.f495623l = false;
            this.f495661h.n(pVar);
        }
    }
}
