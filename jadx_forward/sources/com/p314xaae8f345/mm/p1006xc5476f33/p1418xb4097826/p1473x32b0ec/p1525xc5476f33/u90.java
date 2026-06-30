package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class u90 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ea0 f196072d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f196073e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f196074f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f196075g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u90(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ea0 ea0Var, so2.j5 j5Var, boolean z17, boolean z18) {
        super(0);
        this.f196072d = ea0Var;
        this.f196073e = j5Var;
        this.f196074f = z17;
        this.f196075g = z18;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ea0 ea0Var = this.f196072d;
        java.lang.String str = ea0Var.f193923t;
        cm2.m0 m0Var = (cm2.m0) this.f196073e;
        java.lang.String m75945x2fec8307 = m0Var.f124901v.m75945x2fec8307(17);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "shop report requestId bubbleClick, ".concat(m75945x2fec8307));
        mm2.c1 c1Var = (mm2.c1) ea0Var.P0(mm2.c1.class);
        java.lang.String m75945x2fec83072 = m0Var.f124901v.m75945x2fec8307(17);
        c1Var.y9(m75945x2fec83072 != null ? m75945x2fec83072 : "");
        ea0Var.A1(m0Var, this.f196074f, this.f196075g);
        return jz5.f0.f384359a;
    }
}
