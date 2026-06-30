package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class y extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gg implements com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ey {

    /* renamed from: a, reason: collision with root package name */
    public static final int f133995a = 268435456;

    /* renamed from: e, reason: collision with root package name */
    private static final int f133996e = 19;

    /* renamed from: f, reason: collision with root package name */
    private static final int f133997f = 14;

    /* renamed from: b, reason: collision with root package name */
    protected com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.v f133998b;

    /* renamed from: c, reason: collision with root package name */
    protected com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne f133999c;

    /* renamed from: g, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk f134000g;

    public y(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bd bdVar) {
        super(4.007501668E7d);
        this.f134000g = bdVar.i();
        this.f133998b = bdVar.h();
        this.f133999c = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne) bdVar;
    }

    private void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.v vVar) {
        this.f133998b = vVar;
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.v b() {
        return this.f133998b;
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu fuVar) {
        if (fuVar == null) {
            return null;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu fuVar2 = this.f133998b.f133957q;
        return new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu((r0.f133954n.width() / 2) + (fuVar.f131000a - fuVar2.f131000a), (this.f133998b.f133954n.height() / 2) - (fuVar.f131001b - fuVar2.f131001b));
    }

    private boolean d() {
        com.tencent.mapsdk.internal.v.d dVar = this.f133998b.f133958r;
        if (dVar == null) {
            return false;
        }
        return ((double) java.lang.Math.abs(dVar.f133981a)) > 0.25d || ((double) java.lang.Math.abs(dVar.f133982b)) > 0.25d;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25959x166a66f
    /* renamed from: fromScreenLocation */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 mo37072x7ce5ca8b(android.graphics.Point point) {
        return a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu(point.x, point.y)).m35336x89192361();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25959x166a66f
    /* renamed from: getVisibleRegion */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26100x627095e6 mo37073xf0312250() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f133999c;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr) neVar.f130532b;
        float t17 = neVar.f132039f.t();
        int height = this.f133998b.f133954n.height();
        android.graphics.Point point = new android.graphics.Point(0, trVar.f133713aa);
        android.graphics.Point point2 = new android.graphics.Point(trVar.Z, trVar.f133713aa);
        double d17 = height - t17;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu fuVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu(0.0d, d17);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu fuVar2 = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu(trVar.Z, d17);
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 mo37072x7ce5ca8b = mo37072x7ce5ca8b(point);
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 mo37072x7ce5ca8b2 = mo37072x7ce5ca8b(point2);
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 m35336x89192361 = a(fuVar).m35336x89192361();
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 m35336x891923612 = a(fuVar2).m35336x89192361();
        return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26100x627095e6(mo37072x7ce5ca8b, mo37072x7ce5ca8b2, m35336x89192361, m35336x891923612, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b.m99525xdc3ef9b().m99564x73c954a8(mo37072x7ce5ca8b).m99564x73c954a8(mo37072x7ce5ca8b2).m99564x73c954a8(m35336x89192361).m99564x73c954a8(m35336x891923612).m99563x59bc66e());
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25959x166a66f
    /* renamed from: glModelMatrix */
    public final float[] mo37074xaaf0c625(android.graphics.PointF pointF, float f17) {
        if (pointF == null) {
            return null;
        }
        float[] fArr = new float[16];
        android.opengl.Matrix.setIdentityM(fArr, 0);
        float[] m36188xfd9a7a5e = this.f134000g.f133193d.m36188xfd9a7a5e();
        float[] z17 = this.f134000g.z();
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df o17 = this.f134000g.o();
        android.opengl.Matrix.multiplyMM(fArr, 0, m36188xfd9a7a5e, 0, z17, 0);
        android.graphics.PointF a17 = a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kr.a(o17));
        android.opengl.Matrix.translateM(fArr, 0, pointF.x - a17.x, a17.y - pointF.y, 0.0f);
        android.opengl.Matrix.scaleM(fArr, 0, f17, f17, f17);
        return fArr;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25959x166a66f
    /* renamed from: glPixelRatio */
    public final float mo37075x5d58ffea() {
        return this.f134000g.f133193d.m36190x6ae683c2();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25959x166a66f
    /* renamed from: glProjectionMatrix */
    public final float[] mo37076xbe73fdf5() {
        return this.f134000g.f133193d.m36188xfd9a7a5e();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25959x166a66f
    /* renamed from: glVertexForCoordinate */
    public final android.graphics.PointF mo37077x42407eb8(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
        return a(c26041x873d1d26);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25959x166a66f
    /* renamed from: glViewMatrix */
    public final float[] mo37078xe5813d8b() {
        return this.f134000g.z();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ey, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25959x166a66f
    /* renamed from: metersPerPixel */
    public final double mo36717xffa0db93(double d17) {
        return mo36718xffa0db93(d17, this.f133998b.a());
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25959x166a66f
    /* renamed from: toScreenLocation */
    public final android.graphics.Point mo37079x5ab0ff9c(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
        android.graphics.Rect rect;
        android.graphics.PointF a17 = this.f134000g.a(c26041x873d1d26.f49501xaa2bac6c, c26041x873d1d26.f49502x83009af);
        float f17 = a17.x;
        float f18 = a17.y;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f133999c;
        if (neVar != null && (rect = neVar.C) != null) {
            f17 += rect.left;
            f18 += rect.top;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu fuVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu(f17, f18);
        android.graphics.Point point = new android.graphics.Point();
        point.x = (int) java.lang.Math.round(fuVar.f131000a);
        point.y = (int) java.lang.Math.round(fuVar.f131001b);
        return point;
    }

    public static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc b(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df) {
        if (c4247x704e24df == null) {
            return null;
        }
        return new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc(((c4247x704e24df.m35332x962aa94a() / 1000000.0d) * 2.003750834E7d) / 180.0d, ((java.lang.Math.log(java.lang.Math.tan((((c4247x704e24df.m35331xbc3301f3() / 1000000.0d) + 90.0d) * 3.141592653589793d) / 360.0d)) / 0.017453292519943295d) * 2.003750834E7d) / 180.0d);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ey
    public final com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu fuVar) {
        android.graphics.Rect rect;
        if (fuVar == null) {
            return null;
        }
        android.graphics.Rect rect2 = this.f133998b.f133954n;
        int height = rect2.height();
        float t17 = this.f134000g.t();
        if (java.lang.String.valueOf(t17).equals("960.0")) {
            t17 = height;
        }
        double d17 = fuVar.f131001b;
        if (d17 >= rect2.top && d17 < (r1 + height) - t17) {
            d17 = (r1 + height) - t17;
        }
        float f17 = (float) fuVar.f131000a;
        float f18 = (float) d17;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f133999c;
        if (neVar != null && (rect = neVar.C) != null) {
            f17 -= rect.left;
            f18 -= rect.top;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = this.f134000g;
        return (com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df) tkVar.b((com.p314xaae8f345.map.p511x696c9db.InterfaceC4309x11c86a2<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass114>) new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass114(null, f17, f18), (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass114) new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df());
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ey, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25959x166a66f
    /* renamed from: metersPerPixel */
    public final double mo36718xffa0db93(double d17, double d18) {
        if (d18 >= 0.0d) {
            return (4.0076E7d / ((java.lang.Math.pow(2.0d, d18) * 256.0d) * com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.o())) * java.lang.Math.cos((d17 * 3.141592653589793d) / 180.0d);
        }
        return 0.0d;
    }

    private static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc gcVar) {
        if (gcVar == null) {
            return null;
        }
        return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(((java.lang.Math.atan(java.lang.Math.exp((((gcVar.y() / 2.003750834E7d) * 180.0d) * 3.141592653589793d) / 180.0d)) * 2.0d) - 1.5707963267948966d) * 57.29577951308232d, (gcVar.x() / 2.003750834E7d) * 180.0d);
    }

    private void b(float f17) {
        this.f133998b.a(f17);
    }

    public static com.tencent.mapsdk.internal.v.c c(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc b17 = b(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(c26041x873d1d26));
        com.tencent.mapsdk.internal.v.c cVar = new com.tencent.mapsdk.internal.v.c();
        cVar.f133978a = java.lang.Math.round(java.lang.Math.floor(b17.x() / 9783.939619140625d));
        cVar.f133979b = java.lang.Math.round(java.lang.Math.floor(b17.y() / 9783.939619140625d));
        cVar.f133980c = 12L;
        return cVar;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ey
    public final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc b(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
        if (c26041x873d1d26 == null) {
            return null;
        }
        return b(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df.m35328x3017aa(c26041x873d1d26));
    }

    public static /* synthetic */ boolean b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.y yVar) {
        com.tencent.mapsdk.internal.v.d dVar = yVar.f133998b.f133958r;
        if (dVar != null) {
            return ((double) java.lang.Math.abs(dVar.f133981a)) > 0.25d || ((double) java.lang.Math.abs(dVar.f133982b)) > 0.25d;
        }
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ey
    public final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu a(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df) {
        android.graphics.Rect rect;
        if (c4247x704e24df == null) {
            return null;
        }
        android.graphics.PointF a17 = this.f134000g.a(c4247x704e24df.m35331xbc3301f3() / 1000000.0d, c4247x704e24df.m35332x962aa94a() / 1000000.0d);
        float f17 = a17.x;
        float f18 = a17.y;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f133999c;
        if (neVar != null && (rect = neVar.C) != null) {
            f17 += rect.left;
            f18 += rect.top;
        }
        return new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu(f17, f18);
    }

    public final void c(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df) {
        int i17;
        int i18;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.v vVar = this.f133998b;
        int m35331xbc3301f3 = c4247x704e24df.m35331xbc3301f3();
        int m35332x962aa94a = c4247x704e24df.m35332x962aa94a();
        int i19 = 1 << (20 - vVar.f133942b.f133977m);
        if (131072 > i19) {
            i17 = ((vVar.f133954n.width() * 131072) - (vVar.f133954n.width() * i19)) / 2;
            i18 = ((vVar.f133954n.height() * 131072) - (vVar.f133954n.height() * i19)) / 2;
        } else {
            i17 = 0;
            i18 = 0;
        }
        android.graphics.Rect rect = vVar.f133943c;
        int i27 = rect.left - i17;
        int i28 = rect.right + i17;
        int i29 = rect.top - i18;
        int i37 = rect.bottom + i18;
        if (m35331xbc3301f3 < i29) {
            m35331xbc3301f3 = i29;
        }
        if (m35331xbc3301f3 <= i37) {
            i37 = m35331xbc3301f3;
        }
        if (m35332x962aa94a < i27) {
            m35332x962aa94a = i27;
        }
        if (m35332x962aa94a <= i28) {
            i28 = m35332x962aa94a;
        }
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df2 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(i37, i28);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = vVar.f133956p;
        tkVar.f133199j.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass190(c4247x704e24df2));
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ey
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 a(android.graphics.PointF pointF) {
        android.graphics.PointF pointF2;
        float s17 = this.f133999c.f132053t.f133956p.s();
        android.graphics.Rect rect = this.f133998b.f133954n;
        float width = rect.width();
        float height = rect.height();
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df = this.f133998b.f133953m;
        if (c4247x704e24df == null) {
            return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(0.0d, 0.0d);
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu d17 = d(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kr.a(c4247x704e24df));
        com.tencent.mapsdk.internal.v.d dVar = this.f133998b.f133958r;
        if (dVar == null) {
            pointF2 = new android.graphics.PointF(width / 2.0f, height / 2.0f);
        } else {
            pointF2 = new android.graphics.PointF((dVar.f133981a + 0.5f) * width, (dVar.f133982b + 0.5f) * height);
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setRotate(-s17);
        if (dVar == null) {
            matrix.preTranslate(width * (-0.5f), (-0.5f) * height);
            matrix.postTranslate(width * 0.5f, height * 0.5f);
        } else {
            matrix.preTranslate(((-0.5f) - dVar.f133981a) * width, ((-0.5f) - dVar.f133982b) * height);
            matrix.postTranslate((dVar.f133981a + 0.5f) * width, (dVar.f133982b + 0.5f) * height);
        }
        matrix.mapPoints(new float[2], new float[]{pointF.x, pointF.y});
        double o17 = (2.003750834E7d / ((1 << this.f133998b.f133942b.f133977m) * 256)) * com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.o();
        return b(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu(d17.f131000a + ((r1[0] - pointF2.x) * o17), d17.f131001b + ((r1[1] - pointF2.y) * o17)));
    }

    private boolean c() {
        com.tencent.mapsdk.internal.v.d dVar = this.f133998b.f133958r;
        if (dVar == null) {
            return false;
        }
        return (dVar.f133981a == 0.0f && dVar.f133982b == 0.0f) ? false : true;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ey
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26[] a() {
        android.graphics.Rect rect = this.f133999c.f132048o;
        float width = rect.width();
        float height = rect.height();
        return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26[]{this.f133999c.f132046m.a(new android.graphics.PointF(0.0f, 0.0f)), this.f133999c.f132046m.a(new android.graphics.PointF(width, 0.0f)), this.f133999c.f132046m.a(new android.graphics.PointF(width, height)), this.f133999c.f132046m.a(new android.graphics.PointF(0.0f, height))};
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ey
    public final double a(android.graphics.Point point, android.graphics.Point point2) {
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df a17 = a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu(point.x, point.y));
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df a18 = a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu(point2.x, point2.y));
        android.location.Location.distanceBetween(a17.m35331xbc3301f3() / 1000000.0d, a17.m35332x962aa94a() / 1000000.0d, a18.m35331xbc3301f3() / 1000000.0d, a18.m35332x962aa94a() / 1000000.0d, new float[1]);
        return r2[0] / ((int) java.lang.Math.sqrt(java.lang.Math.pow(point.x - point2.x, 2.0d) + java.lang.Math.pow(point.y - point2.y, 2.0d)));
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ey
    public final android.graphics.PointF a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
        if (c26041x873d1d26 == null) {
            return null;
        }
        double d17 = (c26041x873d1d26.f49502x83009af / 360.0d) + 0.5d;
        double sin = java.lang.Math.sin(java.lang.Math.toRadians(c26041x873d1d26.f49501xaa2bac6c));
        return new android.graphics.PointF((float) (d17 * 2.68435456E8d), (float) ((((java.lang.Math.log((sin + 1.0d) / (1.0d - sin)) * 0.5d) / (-6.283185307179586d)) + 0.5d) * 2.68435456E8d));
    }

    public static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26[] a(com.tencent.mapsdk.internal.v.c cVar) {
        double d17 = 4.007501668E7d / (1 << ((int) cVar.f133980c));
        return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26[]{b(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc(cVar.f133978a * d17, cVar.f133979b * d17)), b(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc((cVar.f133978a + 1) * d17, cVar.f133979b * d17)), b(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc((cVar.f133978a + 1) * d17, (cVar.f133979b + 1) * d17)), b(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc(cVar.f133978a * d17, d17 * (cVar.f133979b + 1)))};
    }

    private void a(int i17) {
        this.f133998b.c(i17);
    }

    public final void a(float f17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.v vVar = this.f133998b;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = vVar.f133956p;
        if (tkVar != null) {
            tkVar.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass195(f17));
        }
        vVar.f133942b.f133976l = f17;
        int i17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gf.f131108a;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ey
    public final void a(final java.util.List<? extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25979x32e3ffb8> list, final java.util.List<com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df> list2, final android.graphics.Rect rect, final com.tencent.mapsdk.internal.ey.a aVar) {
        if (list.isEmpty() && (list2 == null || list2.isEmpty())) {
            return;
        }
        android.graphics.Rect rect2 = new android.graphics.Rect(this.f133999c.f132048o);
        rect2.left += rect.left;
        rect2.right -= rect.right;
        rect2.top += rect.top;
        rect2.bottom -= rect.bottom;
        final int width = rect2.width();
        final int height = rect2.height();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f133999c;
        final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.aa aaVar = neVar.f132041h.f130351o;
        final int i17 = aaVar.f130290e;
        neVar.a(new com.tencent.mapsdk.internal.ne.a() { // from class: com.tencent.mapsdk.internal.y.1
            @Override // com.tencent.mapsdk.internal.ne.a
            public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.v vVar = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.y.this.f133998b;
                com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df = vVar.f133953m;
                com.tencent.mapsdk.internal.v.b bVar = vVar.f133942b;
                float f17 = bVar.f133976l;
                float f18 = bVar.f133972h;
                com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df2 = null;
                float f19 = 4.0f;
                while (true) {
                    if (f19 < f18) {
                        break;
                    }
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.y.this.a(f19);
                    android.graphics.Rect a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.y.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.y.this, list, list2);
                    com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df3 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(a17.centerY(), a17.centerX());
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.y.this.c(c4247x704e24df3);
                    com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df4 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(a17.top, a17.left);
                    com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df5 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(a17.bottom, a17.right);
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu a18 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.y.this.a(c4247x704e24df4);
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu a19 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.y.this.a(c4247x704e24df5);
                    android.graphics.Rect rect3 = new android.graphics.Rect();
                    rect3.left = (int) java.lang.Math.min(a18.f131000a, a19.f131000a);
                    rect3.right = (int) java.lang.Math.max(a18.f131000a, a19.f131000a);
                    rect3.top = (int) java.lang.Math.min(a18.f131001b, a19.f131001b);
                    rect3.bottom = (int) java.lang.Math.max(a18.f131001b, a19.f131001b);
                    if (width < rect3.width() || height < rect3.height()) {
                        f19 /= 1.01f;
                        c4247x704e24df2 = c4247x704e24df3;
                    } else if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.y.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.y.this)) {
                        if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.y.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.y.this)) {
                            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.y yVar = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.y.this;
                            com.tencent.mapsdk.internal.v.d dVar = yVar.f133998b.f133958r;
                            if (dVar != null) {
                                c4247x704e24df2 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.y.a(yVar, c4247x704e24df3, dVar);
                            }
                        }
                        c4247x704e24df2 = c4247x704e24df3;
                    } else {
                        c4247x704e24df2 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.y.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.y.this, c4247x704e24df3, rect);
                    }
                }
                float max = java.lang.Math.max(f18, f19);
                int i18 = i17;
                if (i18 != 60) {
                    aaVar.a(i18);
                }
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.y.this.c(c4247x704e24df);
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.y.this.a(f17);
                com.tencent.mapsdk.internal.ey.a aVar2 = aVar;
                if (aVar2 != null) {
                    try {
                        aVar2.a(max, c4247x704e24df2);
                    } catch (java.lang.Exception unused) {
                    }
                }
            }
        });
        if (i17 != 60) {
            aaVar.f130290e = 60;
        }
    }

    private android.graphics.Rect a(java.util.List<? extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25979x32e3ffb8> list, java.util.List<com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df> list2) {
        int i17;
        int i18;
        int i19;
        android.graphics.Rect mo36416x7436dfc8;
        int i27 = 0;
        if (list != null) {
            i17 = 0;
            i18 = 0;
            i19 = 0;
            for (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25979x32e3ffb8 interfaceC25979x32e3ffb8 : list) {
                if (interfaceC25979x32e3ffb8 != null && (mo36416x7436dfc8 = interfaceC25979x32e3ffb8.mo36416x7436dfc8(this)) != null) {
                    if (i27 == 0) {
                        i27 = mo36416x7436dfc8.left;
                    }
                    if (i17 == 0) {
                        i17 = mo36416x7436dfc8.right;
                    }
                    if (i18 == 0) {
                        i18 = mo36416x7436dfc8.top;
                    }
                    if (i19 == 0) {
                        i19 = mo36416x7436dfc8.bottom;
                    }
                    int i28 = mo36416x7436dfc8.left;
                    if (i28 < i27) {
                        i27 = i28;
                    }
                    int i29 = mo36416x7436dfc8.right;
                    if (i29 > i17) {
                        i17 = i29;
                    }
                    int i37 = mo36416x7436dfc8.top;
                    if (i37 > i18) {
                        i18 = i37;
                    }
                    int i38 = mo36416x7436dfc8.bottom;
                    if (i38 < i19) {
                        i19 = i38;
                    }
                }
            }
        } else {
            i17 = 0;
            i18 = 0;
            i19 = 0;
        }
        if (list2 != null) {
            for (com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df : list2) {
                if (c4247x704e24df != null) {
                    if (i27 == 0) {
                        i27 = c4247x704e24df.m35332x962aa94a();
                    }
                    if (i17 == 0) {
                        i17 = c4247x704e24df.m35332x962aa94a();
                    }
                    if (i18 == 0) {
                        i18 = c4247x704e24df.m35331xbc3301f3();
                    }
                    if (i19 == 0) {
                        i19 = c4247x704e24df.m35331xbc3301f3();
                    }
                    if (c4247x704e24df.m35332x962aa94a() < i27) {
                        i27 = c4247x704e24df.m35332x962aa94a();
                    }
                    if (c4247x704e24df.m35332x962aa94a() > i17) {
                        i17 = c4247x704e24df.m35332x962aa94a();
                    }
                    if (c4247x704e24df.m35331xbc3301f3() > i18) {
                        i18 = c4247x704e24df.m35331xbc3301f3();
                    }
                    if (c4247x704e24df.m35331xbc3301f3() < i19) {
                        i19 = c4247x704e24df.m35331xbc3301f3();
                    }
                }
            }
        }
        return new android.graphics.Rect(i27, i18, i17, i19);
    }

    private com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df a(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df, android.graphics.Rect rect) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu a17;
        if (c4247x704e24df == null || (a17 = a(c4247x704e24df)) == null || rect == null) {
            return null;
        }
        return a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu(a17.f131000a - ((rect.left - rect.right) * 0.5d), a17.f131001b - ((rect.top - rect.bottom) * 0.5d)));
    }

    private com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df a(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df, com.tencent.mapsdk.internal.v.d dVar) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu a17;
        if (c4247x704e24df == null || (a17 = a(c4247x704e24df)) == null || dVar == null) {
            return null;
        }
        double d17 = a17.f131000a;
        double d18 = a17.f131001b;
        android.graphics.Rect rect = new android.graphics.Rect(this.f133999c.f132048o);
        int width = rect.width();
        int height = rect.height();
        float f17 = dVar.f133981a + 0.5f;
        float f18 = dVar.f133982b + 0.5f;
        double d19 = f17;
        if (d19 < 0.25d) {
            d17 += (0.25d - d19) * width;
        } else if (d19 > 0.75d) {
            d17 -= (d19 - 0.75d) * width;
        }
        double d27 = f18;
        if (d27 < 0.25d) {
            d18 += (0.25d - d27) * height;
        } else if (d27 > 0.75d) {
            d18 -= (d27 - 0.75d) * height;
        }
        return a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu(d17, d18));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014e  */
    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ey
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 r32, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 r33, int r34, int r35, int r36, int r37, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 r38) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.y.a(com.tencent.tencentmap.mapsdk.maps.model.LatLng, com.tencent.tencentmap.mapsdk.maps.model.LatLng, int, int, int, int, com.tencent.tencentmap.mapsdk.maps.model.LatLng):float");
    }

    private static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 a(android.content.Context context, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu fuVar) {
        double a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hs.a(context) * 2.6843546E8f;
        double d17 = a17 / 2.0d;
        return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26((java.lang.Math.asin(1.0d - (2.0d / (java.lang.Math.pow(2.718281828459045d, ((fuVar.f131001b - d17) / 0.5d) / (a17 / 6.283185307179586d)) + 1.0d))) * 180.0d) / 3.141592653589793d, (fuVar.f131000a - d17) / (a17 / 360.0d));
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ey
    public final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu a(android.content.Context context, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
        double a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hs.a(context) * 2.6843546E8f;
        double d17 = a17 / 2.0d;
        double min = java.lang.Math.min(java.lang.Math.max(java.lang.Math.sin(c26041x873d1d26.f49501xaa2bac6c * 0.017453292519943295d), -0.9999d), 0.9999d);
        return new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu((c26041x873d1d26.f49502x83009af * (a17 / 360.0d)) + d17, d17 + (java.lang.Math.log((min + 1.0d) / (1.0d - min)) * (a17 / 6.283185307179586d) * 0.5d));
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ey
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc gcVar) {
        return b(gcVar);
    }

    public static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.v vVar, com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df) {
        if (c4247x704e24df == null) {
            return null;
        }
        int i17 = vVar.f133944d >> 1;
        double d17 = vVar.f133945e;
        double d18 = vVar.f133946f;
        double min = java.lang.Math.min(java.lang.Math.max(java.lang.Math.sin((c4247x704e24df.m35331xbc3301f3() / 1000000.0d) * 0.017453292519943295d), -0.9999d), 0.9999d);
        double d19 = i17;
        return new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu(((c4247x704e24df.m35332x962aa94a() / 1000000.0d) * d17) + d19, d19 + (java.lang.Math.log((min + 1.0d) / (1.0d - min)) * d18 * 0.5d));
    }

    public static /* synthetic */ android.graphics.Rect a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.y yVar, java.util.List list, java.util.List list2) {
        int i17;
        int i18;
        int i19;
        android.graphics.Rect mo36416x7436dfc8;
        int i27 = 0;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            i17 = 0;
            i18 = 0;
            i19 = 0;
            while (it.hasNext()) {
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25979x32e3ffb8 interfaceC25979x32e3ffb8 = (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25979x32e3ffb8) it.next();
                if (interfaceC25979x32e3ffb8 != null && (mo36416x7436dfc8 = interfaceC25979x32e3ffb8.mo36416x7436dfc8(yVar)) != null) {
                    if (i27 == 0) {
                        i27 = mo36416x7436dfc8.left;
                    }
                    if (i17 == 0) {
                        i17 = mo36416x7436dfc8.right;
                    }
                    if (i18 == 0) {
                        i18 = mo36416x7436dfc8.top;
                    }
                    if (i19 == 0) {
                        i19 = mo36416x7436dfc8.bottom;
                    }
                    int i28 = mo36416x7436dfc8.left;
                    if (i28 < i27) {
                        i27 = i28;
                    }
                    int i29 = mo36416x7436dfc8.right;
                    if (i29 > i17) {
                        i17 = i29;
                    }
                    int i37 = mo36416x7436dfc8.top;
                    if (i37 > i18) {
                        i18 = i37;
                    }
                    int i38 = mo36416x7436dfc8.bottom;
                    if (i38 < i19) {
                        i19 = i38;
                    }
                }
            }
        } else {
            i17 = 0;
            i18 = 0;
            i19 = 0;
        }
        if (list2 != null) {
            java.util.Iterator it6 = list2.iterator();
            while (it6.hasNext()) {
                com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df = (com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df) it6.next();
                if (c4247x704e24df != null) {
                    if (i27 == 0) {
                        i27 = c4247x704e24df.m35332x962aa94a();
                    }
                    if (i17 == 0) {
                        i17 = c4247x704e24df.m35332x962aa94a();
                    }
                    if (i18 == 0) {
                        i18 = c4247x704e24df.m35331xbc3301f3();
                    }
                    if (i19 == 0) {
                        i19 = c4247x704e24df.m35331xbc3301f3();
                    }
                    if (c4247x704e24df.m35332x962aa94a() < i27) {
                        i27 = c4247x704e24df.m35332x962aa94a();
                    }
                    if (c4247x704e24df.m35332x962aa94a() > i17) {
                        i17 = c4247x704e24df.m35332x962aa94a();
                    }
                    if (c4247x704e24df.m35331xbc3301f3() > i18) {
                        i18 = c4247x704e24df.m35331xbc3301f3();
                    }
                    if (c4247x704e24df.m35331xbc3301f3() < i19) {
                        i19 = c4247x704e24df.m35331xbc3301f3();
                    }
                }
            }
        }
        return new android.graphics.Rect(i27, i18, i17, i19);
    }

    public static /* synthetic */ boolean a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.y yVar) {
        com.tencent.mapsdk.internal.v.d dVar = yVar.f133998b.f133958r;
        if (dVar != null) {
            return (dVar.f133981a == 0.0f && dVar.f133982b == 0.0f) ? false : true;
        }
        return false;
    }

    public static /* synthetic */ com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.y yVar, com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df, android.graphics.Rect rect) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu a17 = yVar.a(c4247x704e24df);
        if (a17 == null || rect == null) {
            return null;
        }
        return yVar.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu(a17.f131000a - ((rect.left - rect.right) * 0.5d), a17.f131001b - ((rect.top - rect.bottom) * 0.5d)));
    }

    public static /* synthetic */ com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.y yVar, com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df, com.tencent.mapsdk.internal.v.d dVar) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu a17 = yVar.a(c4247x704e24df);
        if (a17 == null || dVar == null) {
            return null;
        }
        double d17 = a17.f131000a;
        double d18 = a17.f131001b;
        android.graphics.Rect rect = new android.graphics.Rect(yVar.f133999c.f132048o);
        int width = rect.width();
        int height = rect.height();
        float f17 = dVar.f133981a + 0.5f;
        float f18 = dVar.f133982b + 0.5f;
        double d19 = f17;
        if (d19 < 0.25d) {
            d17 += (0.25d - d19) * width;
        } else if (d19 > 0.75d) {
            d17 -= (d19 - 0.75d) * width;
        }
        double d27 = f18;
        if (d27 < 0.25d) {
            d18 += (0.25d - d27) * height;
        } else if (d27 > 0.75d) {
            d18 -= (d27 - 0.75d) * height;
        }
        return yVar.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu(d17, d18));
    }
}
