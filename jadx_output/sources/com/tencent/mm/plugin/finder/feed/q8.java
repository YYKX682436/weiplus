package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class q8 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.t8 f108801a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f108802b;

    public q8(com.tencent.mm.plugin.finder.feed.t8 t8Var, yz5.a aVar) {
        this.f108801a = t8Var;
        this.f108802b = aVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.wj4 wj4Var;
        r45.wj4 wj4Var2;
        r45.wj4 wj4Var3;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        java.lang.String str = null;
        com.tencent.mm.plugin.finder.feed.t8 t8Var = this.f108801a;
        if (i17 == 0 && fVar.f70616b == 0) {
            r45.oj4 oj4Var = (r45.oj4) ((r45.tj4) fVar.f70618d).getCustom(1);
            long j17 = 0;
            if (((oj4Var == null || (wj4Var3 = (r45.wj4) oj4Var.getCustom(18)) == null) ? 0L : wj4Var3.getLong(0)) != 0) {
                r45.oj4 oj4Var2 = (r45.oj4) ((r45.tj4) fVar.f70618d).getCustom(1);
                if (oj4Var2 != null && (wj4Var2 = (r45.wj4) oj4Var2.getCustom(18)) != null) {
                    j17 = wj4Var2.getLong(0);
                }
                t8Var.C = j17;
                t8Var.D = null;
                r45.oj4 oj4Var3 = (r45.oj4) ((r45.tj4) fVar.f70618d).getCustom(1);
                if (oj4Var3 != null && (wj4Var = (r45.wj4) oj4Var3.getCustom(18)) != null) {
                    str = wj4Var.getString(1);
                }
                if (str == null) {
                    str = "";
                }
                t8Var.E = str;
                t8Var.Z(this.f108802b);
                return jz5.f0.f302826a;
            }
        }
        yz5.p pVar = t8Var.I;
        if (pVar != null) {
            pVar.invoke(java.lang.Integer.valueOf(fVar.f70616b), fVar.f70617c);
        }
        com.tencent.mm.plugin.finder.report.v1.f125393a.w(t8Var.f106427m, null);
        return jz5.f0.f302826a;
    }
}
