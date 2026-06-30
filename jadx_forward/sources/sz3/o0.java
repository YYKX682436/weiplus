package sz3;

/* loaded from: classes15.dex */
public final class o0 implements com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.e1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sz3.c1 f495617d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sz3.v0 f495618e;

    public o0(sz3.c1 c1Var, sz3.v0 v0Var) {
        this.f495617d = c1Var;
        this.f495618e = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.c cVar;
        jz5.l lVar;
        boolean z17;
        boolean z18;
        int i18;
        sz3.c1 c1Var = this.f495617d;
        c1Var.f495509c = 1002;
        int i19 = bz3.h.f118316j;
        vz3.t tVar = vz3.t.f523243a;
        tVar.a();
        sz3.d1 d1Var = c1Var.f495517k;
        sz3.d1 d1Var2 = sz3.d1.f495540e;
        if (d1Var == d1Var2) {
            i17 = 10;
            i19 = 2;
        } else {
            i17 = 3;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MixScanGoodsImageHandler", "handleFullImage fullImageData: %s, source: %s, session: %s, originImageType: %d, targetImageType: %d", c1Var.f495511e, java.lang.Integer.valueOf(c1Var.f495507a), java.lang.Long.valueOf(c1Var.f495508b), 4, java.lang.Integer.valueOf(i19));
        boolean z19 = c1Var.f495511e == null;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.c cVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.c(0);
        cVar2.f240363g = bz3.h.f118325s ? 1 : 0;
        cVar2.f240362f = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d.a(50, cVar2);
        byte[] bArr = c1Var.f495511e;
        if (bArr != null) {
            sz3.v0 v0Var = this.f495618e;
            int a17 = v0Var.g().a();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1.f240386k == com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.y0.f240636e || com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1.f240386k == com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.y0.f240637f) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.C17279x15159658 c17279x15159658 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1.f240385j;
                c17279x15159658.f37922xaeef55d6 = null;
                android.graphics.Point g17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1.g(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1.f240390o, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1.f240391p, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1.f240392q);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanFastFocusEngineManager", "getUploadFullYUVImageAndResize localTrackId: " + a17 + ", resizeImageSize: " + g17);
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.C17279x15159658 m68576x74bc644 = c17279x15159658.m68576x74bc644(bArr, a17, false, 30.0f, g17.x, g17.y);
                lVar = new jz5.l(m68576x74bc644 != null ? m68576x74bc644.f37922xaeef55d6 : null, g17);
            } else {
                lVar = null;
            }
            byte[] bArr2 = lVar != null ? (byte[]) lVar.f384366d : null;
            android.graphics.Point point = lVar != null ? (android.graphics.Point) lVar.f384367e : null;
            long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
            if (bArr2 != null) {
                if (c1Var.f495517k == d1Var2) {
                    a17 = v0Var.g().b();
                }
                long currentTimeMillis3 = java.lang.System.currentTimeMillis();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(point);
                jz5.l f17 = v0Var.f(bArr2, 4, i19, point);
                long currentTimeMillis4 = java.lang.System.currentTimeMillis() - currentTimeMillis3;
                byte[] bArr3 = (byte[]) f17.f384366d;
                int intValue = ((java.lang.Number) f17.f384367e).intValue();
                if (bArr3 != null) {
                    c1Var.f495511e = null;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.C17282x335f2f60 c17282x335f2f60 = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.C17282x335f2f60();
                    c17282x335f2f60.m68622x684351d(a17);
                    c17282x335f2f60.getId();
                    sz3.a1 a1Var = new sz3.a1(c17282x335f2f60);
                    sz3.y0 y0Var = a1Var.f495496e;
                    y0Var.f495700h = currentTimeMillis2;
                    y0Var.f495701i = currentTimeMillis4;
                    int length = bArr3.length;
                    y0Var.f495702j = length;
                    if (intValue == 1) {
                        i18 = 2;
                    } else if (intValue != 2) {
                        i18 = 3;
                        if (intValue != 3) {
                            i18 = -1;
                        }
                    } else {
                        i18 = 1;
                    }
                    y0Var.f495707o = i18;
                    cVar2.f240357a = i18;
                    cVar2.f240358b = length;
                    a1Var.f495497f = cVar2;
                    sz3.b1 b1Var = new sz3.b1(bArr3);
                    b1Var.f495502d = point.x;
                    b1Var.f495503e = point.y;
                    b1Var.f495501c = intValue;
                    a1Var.f495495d = b1Var;
                    c1Var.f495515i = a1Var;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d.a(20, a1Var.f495497f);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                    g0Var.A(1259, 246);
                    g0Var.A(1259, c1Var.f495517k == d1Var2 ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.cd.f33971x366c91de : 250);
                    cVar = cVar2;
                    sz3.p pVar = new sz3.p(a1Var, i17, bArr3, point.x, point.y);
                    pVar.f495624m = a17;
                    pVar.f495480d = c1Var.f495507a;
                    pVar.f495479c = c1Var.f495508b;
                    pVar.f495481e = c1Var.f495509c;
                    pVar.f495625n = bArr2;
                    pVar.f495626o = point;
                    pVar.f495622k = false;
                    pVar.f495623l = true;
                    v0Var.f495661h.n(pVar);
                    z18 = z19;
                    z19 = z18;
                } else {
                    cVar = cVar2;
                    z17 = true;
                    tVar.j();
                }
            } else {
                cVar = cVar2;
                z17 = true;
                tVar.j();
            }
            z18 = z17;
            z19 = z18;
        } else {
            cVar = cVar2;
        }
        if (z19) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d.a(21, cVar);
        }
    }
}
