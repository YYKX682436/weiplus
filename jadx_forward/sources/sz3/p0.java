package sz3;

/* loaded from: classes15.dex */
public final class p0 implements tz3.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f495627a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sz3.c1 f495628b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f495629c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sz3.v0 f495630d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f495631e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f495632f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f495633g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.c f495634h;

    public p0(long j17, sz3.c1 c1Var, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, sz3.v0 v0Var, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var3, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.c cVar) {
        this.f495627a = j17;
        this.f495628b = c1Var;
        this.f495629c = f0Var;
        this.f495630d = v0Var;
        this.f495631e = f0Var2;
        this.f495632f = f0Var3;
        this.f495633g = c0Var;
        this.f495634h = cVar;
    }

    public void a(boolean z17, java.nio.ByteBuffer byteBuffer, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var;
        byte[] f17 = (!z17 || byteBuffer == null) ? null : et5.h.f(byteBuffer);
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f495627a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MixScanGoodsImageHandler", "handleFullImageForAff rotateAndResizeImage onResult success: " + z17 + ", rgbaImage: " + byteBuffer + ", width: " + i17 + ", height: " + i18 + ", resizeRgbaImageData: " + f17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.c cVar = this.f495634h;
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var2 = this.f495633g;
        if (f17 != null) {
            sz3.c1 c1Var = this.f495628b;
            sz3.d1 d1Var = c1Var.f495517k;
            sz3.d1 d1Var2 = sz3.d1.f495540e;
            p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f495629c;
            sz3.v0 v0Var = this.f495630d;
            if (d1Var == d1Var2) {
                f0Var.f391649d = v0Var.g().b();
            }
            android.graphics.Point point = new android.graphics.Point(i17, i18);
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            jz5.l f18 = v0Var.f(f17, 5, this.f495631e.f391649d, point);
            long currentTimeMillis3 = java.lang.System.currentTimeMillis() - currentTimeMillis2;
            byte[] bArr = (byte[]) f18.f384366d;
            int intValue = ((java.lang.Number) f18.f384367e).intValue();
            if (bArr != null) {
                c1Var.f495511e = null;
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.C17282x335f2f60 c17282x335f2f60 = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.C17282x335f2f60();
                c17282x335f2f60.m68622x684351d(f0Var.f391649d);
                c17282x335f2f60.getId();
                sz3.a1 a1Var = new sz3.a1(c17282x335f2f60);
                sz3.y0 y0Var = a1Var.f495496e;
                y0Var.f495700h = currentTimeMillis;
                y0Var.f495701i = currentTimeMillis3;
                int length = bArr.length;
                y0Var.f495702j = length;
                int i19 = 2;
                if (intValue != 1) {
                    if (intValue != 2) {
                        i19 = 3;
                        if (intValue != 3) {
                            i19 = -1;
                        }
                    } else {
                        i19 = 1;
                    }
                }
                y0Var.f495707o = i19;
                cVar.f240357a = i19;
                cVar.f240358b = length;
                a1Var.f495497f = cVar;
                sz3.b1 b1Var = new sz3.b1(bArr);
                b1Var.f495502d = point.x;
                b1Var.f495503e = point.y;
                b1Var.f495501c = intValue;
                a1Var.f495495d = b1Var;
                c1Var.f495515i = a1Var;
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d.a(20, a1Var.f495497f);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var.A(1259, 246);
                g0Var.A(1259, c1Var.f495517k == d1Var2 ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.cd.f33971x366c91de : 250);
                sz3.p pVar = new sz3.p(a1Var, this.f495632f.f391649d, bArr, point.x, point.y);
                pVar.f495624m = f0Var.f391649d;
                pVar.f495480d = c1Var.f495507a;
                pVar.f495479c = c1Var.f495508b;
                pVar.f495481e = c1Var.f495509c;
                pVar.f495625n = f17;
                pVar.f495626o = point;
                pVar.f495622k = false;
                pVar.f495623l = true;
                v0Var.f495661h.n(pVar);
                c0Var = c0Var2;
            } else {
                c0Var = c0Var2;
                c0Var.f391645d = true;
                vz3.t.f523243a.j();
            }
        } else {
            c0Var = c0Var2;
        }
        if (c0Var.f391645d) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d.a(21, cVar);
        }
    }
}
