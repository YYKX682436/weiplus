package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff;

/* loaded from: classes7.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public android.os.Handler f169834a;

    /* renamed from: e, reason: collision with root package name */
    public volatile java.util.Map f169838e;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12567x34ba321 f169841h;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f169843j;

    /* renamed from: k, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.t f169844k;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.s f169835b = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.s(this, null);

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.r f169836c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.r(this, null);

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.q f169837d = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.q(this, null);

    /* renamed from: f, reason: collision with root package name */
    public volatile int f169839f = 0;

    /* renamed from: g, reason: collision with root package name */
    public volatile java.lang.String f169840g = "";

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f169842i = true;

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.t1 b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12567x34ba321 c12567x34ba321, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.p pVar) {
        int i17;
        com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad c4209xd2d3ddad;
        yg.a aVar;
        float m34765xb55c1160;
        if (c12567x34ba321 == null) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = c12567x34ba321.f169677p;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.s1 s1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.s1();
        if (pVar == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.p.Full) {
            yd.b0 h17 = yd.c0.INST.h();
            int i18 = h17.f542451a;
            s1Var.f169820i = i18;
            s1Var.f169821j = i18 - c12567x34ba321.f169685x;
            s1Var.f169818g = h17.f542452b;
            s1Var.f169819h = h17.f542453c;
            s1Var.f169824m = (int) java.lang.Math.round(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.z.INST.f169924d.b());
            s1Var.f169827p = h17.f542454d;
        } else {
            s1Var.f169820i = -1;
            s1Var.f169821j = -1;
            s1Var.f169818g = -1;
            s1Var.f169819h = -1;
            s1Var.f169824m = -1;
            s1Var.f169827p = -1;
        }
        try {
            i17 = o6Var.f156329e.mo48806x666b03f3();
        } catch (java.lang.Exception unused) {
            i17 = 0;
        }
        s1Var.f169823l = i17;
        s1Var.f169822k = (int) (java.lang.System.currentTimeMillis() - c12567x34ba321.f169679r);
        if (!c12567x34ba321.A) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.t tVar = c12567x34ba321.f169687z.f169844k;
            s1Var.f169812a = tVar != null ? (int) (tVar.f168918m + 0.5d) : 0;
        } else if (o6Var.f167715n2) {
            java.lang.Object obj = ix5.h.f377164b.d().get(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15517x245ebd1);
            java.lang.Float valueOf = obj instanceof java.lang.Number ? java.lang.Float.valueOf(((java.lang.Number) obj).floatValue()) : null;
            s1Var.f169812a = java.lang.Math.round(valueOf != null ? valueOf.floatValue() : 0.0f);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var2 = c12567x34ba321.f169677p;
            try {
                c4209xd2d3ddad = ((ae.a) ((ae.q) o6Var2.C0().z1(ae.q.class))).w();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandRuntimeEventReporter", e17, "get QualityEvent of WAGame but fail. [%s]", o6Var2);
                c4209xd2d3ddad = null;
            }
            if (c4209xd2d3ddad == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandRuntimeEventReporter", "buildWAGameQualityEvent find renderer.fps == null");
            } else {
                yg.h hVar = c4209xd2d3ddad.f130118i;
                synchronized (hVar.f543597a) {
                    aVar = hVar.f543599c;
                }
                s1Var.f169812a = java.lang.Math.round(aVar.f543551a);
                s1Var.f169826o = java.lang.Math.round(aVar.f543552b);
                yg.h hVar2 = c4209xd2d3ddad.f130118i;
                synchronized (hVar2.f543597a) {
                    if (hVar2.f543597a.f130110a == 0) {
                        m34765xb55c1160 = -1.0f;
                    } else {
                        com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 abstractC4208x204d5c83 = hVar2.f543597a;
                        m34765xb55c1160 = abstractC4208x204d5c83.m34765xb55c1160(abstractC4208x204d5c83.f130110a);
                    }
                }
                s1Var.f169813b = m34765xb55c1160;
                s1Var.f169816e = c4209xd2d3ddad.f130118i.b();
                s1Var.f169817f = c4209xd2d3ddad.f130118i.e();
                s1Var.f169815d = c4209xd2d3ddad.f130118i.d();
                s1Var.f169814c = c12567x34ba321.C.f169802a;
                s1Var.f169825n = 1;
                s1Var.f169828q = 1;
                yg.f a17 = c4209xd2d3ddad.f130118i.a();
                s1Var.f169829r = a17.f543581a;
                s1Var.f169830s = a17.f543582b;
                s1Var.f169831t = a17.f543583c;
                s1Var.f169832u = a17.f543584d;
                s1Var.f169833v = java.lang.Math.round(a17.f543585e * 10000.0f);
            }
        }
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.t1(s1Var, null);
    }

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12567x34ba321 c12567x34ba321, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.t1 t1Var) {
        if (c12567x34ba321 == null || t1Var == null) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Boolean.valueOf(c12567x34ba321 == null);
            objArr[1] = java.lang.Boolean.valueOf(t1Var == null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeEventReporter", "addNewReportData:session null [%b], event null [%b]", objArr);
            return;
        }
        t1Var.f169882x = c12567x34ba321.f169667d;
        if (c12567x34ba321.f169677p.f167715n2) {
            t1Var.f169881w = 3;
        } else {
            t1Var.f169881w = 0;
        }
        t1Var.B = this.f169839f;
        t1Var.E = 0;
        t1Var.G = 0;
        t1Var.F = 0;
        t1Var.f169884z = this.f169840g;
        t1Var.A = c12567x34ba321.f169677p.f167707j2;
    }

    public void c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12567x34ba321 c12567x34ba321, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.p pVar, boolean z17) {
        this.f169841h = c12567x34ba321;
        if (this.f169834a == null) {
            android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
            this.f169834a = handler;
            long j17 = i17 * 1000;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.s sVar = this.f169835b;
            sVar.f169806d = j17;
            sVar.f169807e = pVar;
            sVar.f169808f = z17;
            handler.post(sVar);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.t tVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.t();
        this.f169844k = tVar;
        tVar.f168915g = 200L;
        tVar.f168917i = null;
        tVar.a();
    }
}
