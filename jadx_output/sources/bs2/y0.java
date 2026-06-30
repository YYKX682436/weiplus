package bs2;

/* loaded from: classes2.dex */
public final class y0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bs2.n1 f23979a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f23980b;

    public y0(bs2.n1 n1Var, java.lang.String str) {
        this.f23979a = n1Var;
        this.f23980b = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        bs2.n1 n1Var = this.f23979a;
        if (i17 == 0 && fVar.f70616b == 0 && fVar.f70618d != null) {
            java.lang.String str = n1Var.f23909c;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preloadRedDotFeed: preload successfully. source=");
            sb6.append(this.f23980b);
            sb6.append(", tabType=");
            int i18 = n1Var.f23907a;
            sb6.append(i18);
            sb6.append(", feedId=");
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) fVar.f70618d).getCustom(2);
            sb6.append(pm0.v.u(finderObject != null ? finderObject.getId() : 0L));
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
            com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) fVar.f70618d).getCustom(2);
            if (finderObject2 != null) {
                i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                ((com.tencent.mm.plugin.finder.report.o3) c17).rk(finderObject2, ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).bl(i18), null);
            }
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127983v7).getValue()).r()).intValue() == 1) {
                n1Var.d("GetRedDotFeed");
            }
        }
        n1Var.f23928v.f23842a = false;
        return jz5.f0.f302826a;
    }
}
