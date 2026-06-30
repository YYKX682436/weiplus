package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class s6 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f104526d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104527e;

    public s6(java.lang.String str, in5.s0 s0Var) {
        this.f104526d = str;
        this.f104527e = s0Var;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.ri2 req = (r45.ri2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        com.tencent.mars.xlog.Log.i("FinderFeedCommentHintConvert", "modInteractCallback, ret " + ret.getInteger(1));
        if (ret.getInteger(1) != 0) {
            pm0.v.X(new com.tencent.mm.plugin.finder.convert.r6(this.f104527e));
            return;
        }
        g92.b bVar = g92.b.f269769e;
        m92.c cVar = new m92.c(this.f104526d);
        if (req.getInteger(27) != 0) {
            cVar.u0().set(48, java.lang.Integer.valueOf(req.getInteger(27)));
        } else if (req.getInteger(28) != 0) {
            cVar.u0().set(49, java.lang.Integer.valueOf(req.getInteger(28)));
        } else {
            cVar.u0().set(40, java.lang.Integer.valueOf(req.getInteger(23)));
        }
        bVar.C(cVar, m92.j.f324997o);
    }
}
