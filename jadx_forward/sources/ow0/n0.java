package ow0;

/* loaded from: classes5.dex */
public final class n0 implements gy0.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p901x8438d441.C10954x76f4876c f430870a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f430871b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gx0.u2 f430872c;

    public n0(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p901x8438d441.C10954x76f4876c c10954x76f4876c, ex0.a0 a0Var, gx0.u2 u2Var) {
        this.f430870a = c10954x76f4876c;
        this.f430871b = a0Var;
        this.f430872c = u2Var;
    }

    @Override // gy0.h
    public void a(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p901x8438d441.C10954x76f4876c c10954x76f4876c = this.f430870a;
        c10954x76f4876c.recyclerView.f1();
        ex0.b c17 = ex0.i0.c(this.f430871b, segmentID);
        if (c17 == null) {
            return;
        }
        gx0.u2 u2Var = this.f430872c;
        ow0.q0.g(u2Var, c17);
        ow0.q0.a(u2Var, c17.f338701b);
        ow0.q0.f(u2Var, c10954x76f4876c);
    }

    @Override // gy0.h
    public void b(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        ow0.a0.K7(this.f430872c, null, null, segmentID, 3, null);
    }
}
