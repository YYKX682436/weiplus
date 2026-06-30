package qv2;

/* loaded from: classes10.dex */
public abstract class b extends ov2.e {

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f448468h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f448469i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 finderObj, java.lang.String taskId) {
        super(taskId);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObj, "finderObj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskId, "taskId");
        this.f448468h = finderObj;
    }

    @Override // pv2.g
    public int a() {
        return 2;
    }

    @Override // pv2.m
    public void d(pv2.g nextStage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nextStage, "nextStage");
        m().a().d(this.f448468h.m59314x4d5c4d55());
    }

    @Override // pv2.m
    public void e(pv2.g nextStage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nextStage, "nextStage");
    }

    @Override // pv2.m
    public void f(pv2.g nextStage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nextStage, "nextStage");
        m().a().d(this.f448468h.m59314x4d5c4d55());
    }

    /* JADX WARN: Code restructure failed: missing block: B:207:0x03a3, code lost:
    
        if (r2.f457437n.f456473f == false) goto L98;
     */
    @Override // ov2.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public pv2.g j() {
        /*
            Method dump skipped, instructions count: 1819
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qv2.b.j():pv2.g");
    }

    public void k(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.z result, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 finderObj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObj, "finderObj");
    }

    public abstract com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d l();

    public abstract com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.k5 m();

    public long n() {
        return this.f448468h.m59260x51f8f5b0();
    }

    public abstract pv2.g o(boolean z17, boolean z18);

    public abstract java.lang.String p();

    public final java.lang.String q() {
        java.lang.String a17;
        r45.mb4 mb4Var = (r45.mb4) kz5.n0.Z(this.f448468h.m59264x7efe73ec());
        return (mb4Var == null || (a17 = hc2.l0.a(mb4Var)) == null) ? "" : a17;
    }

    public void r() {
        ov2.e.i(this, "andr_Video_Compress_Begin", this.f448468h, 0, null, 12, null);
    }

    public void s() {
        ov2.e.i(this, "andr_Video_Compress_Suc", this.f448468h, 0, null, 12, null);
    }

    public abstract void t();

    public abstract void u();

    public void v(float f17) {
        if (f17 > 1.0f) {
            f17 = 1.0f;
        }
        int i17 = (int) (45 * f17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(p(), "feed " + n() + " updateProgress  " + f17 + ", " + i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f448468h;
        if (c14994x9b99c079.m59277xa8f45ee4().m75939xb282bd08(4) < i17) {
            c14994x9b99c079.m59277xa8f45ee4().set(4, java.lang.Integer.valueOf(i17));
            t();
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5442xd807898f c5442xd807898f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5442xd807898f();
        long n17 = n();
        am.ga gaVar = c5442xd807898f.f135783g;
        gaVar.f88282a = n17;
        gaVar.f88283b = c14994x9b99c079.m59277xa8f45ee4().m75939xb282bd08(4);
        c5442xd807898f.e();
    }
}
