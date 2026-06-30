package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class s6 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186059d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f186060e;

    public s6(java.lang.String str, in5.s0 s0Var) {
        this.f186059d = str;
        this.f186060e = s0Var;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.ri2 req = (r45.ri2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedCommentHintConvert", "modInteractCallback, ret " + ret.m75939xb282bd08(1));
        if (ret.m75939xb282bd08(1) != 0) {
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.r6(this.f186060e));
            return;
        }
        g92.b bVar = g92.b.f351302e;
        m92.c cVar = new m92.c(this.f186059d);
        if (req.m75939xb282bd08(27) != 0) {
            cVar.u0().set(48, java.lang.Integer.valueOf(req.m75939xb282bd08(27)));
        } else if (req.m75939xb282bd08(28) != 0) {
            cVar.u0().set(49, java.lang.Integer.valueOf(req.m75939xb282bd08(28)));
        } else {
            cVar.u0().set(40, java.lang.Integer.valueOf(req.m75939xb282bd08(23)));
        }
        bVar.C(cVar, m92.j.f406530o);
    }
}
