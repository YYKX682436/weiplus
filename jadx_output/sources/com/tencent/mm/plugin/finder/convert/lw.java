package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class lw extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103951a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.nw f103952b;

    public lw(in5.s0 s0Var, com.tencent.mm.plugin.finder.convert.nw nwVar) {
        this.f103951a = s0Var;
        this.f103952b = nwVar;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            try {
                com.tencent.mm.plugin.finder.feed.ys ysVar = (com.tencent.mm.plugin.finder.feed.ys) this.f103951a.f293125i;
                if (ysVar != null) {
                    com.tencent.mm.plugin.finder.convert.nw nwVar = this.f103952b;
                    java.util.List subList = ysVar.f111192d.getList(4).subList(0, java.lang.Math.min(3, ysVar.f111192d.getList(4).size()));
                    kotlin.jvm.internal.o.f(subList, "subList(...)");
                    java.util.Iterator it = subList.iterator();
                    java.lang.String str = "";
                    while (it.hasNext()) {
                        str = str + pm0.v.u(((com.tencent.mm.protocal.protobuf.FinderObject) it.next()).getId()) + '|';
                    }
                    r45.qt2 qt2Var = nwVar.f104133e;
                    if (qt2Var != null) {
                        ey2.e2 e2Var = (ey2.e2) pf5.u.f353936a.e(c61.l7.class).a(ey2.e2.class);
                        e2Var.getClass();
                        java.lang.Integer num = (java.lang.Integer) e2Var.f257358f.get(ey2.e2.f257356i.a(ysVar));
                        ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Mk(str, num == null ? -1 : num.intValue(), qt2Var);
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("Finder.StreamCardFeedConvert", e17, "", new java.lang.Object[0]);
            }
        }
    }
}
