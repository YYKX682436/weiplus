package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class eg extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.fg f106648d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f106649e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f106650f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eg(com.tencent.mm.plugin.finder.feed.fg fgVar, long j17, java.lang.String str) {
        super(1);
        this.f106648d = fgVar;
        this.f106649e = j17;
        this.f106650f = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.ov0 ov0Var;
        java.util.LinkedList<r45.dl2> list;
        r45.ov0 ov0Var2;
        java.util.LinkedList list2;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.plugin.finder.feed.fg fgVar = this.f106648d;
        java.lang.String str = fgVar.f106741d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tryFetchPreloadInfo errType:");
        java.lang.Integer num = null;
        sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f70615a) : null);
        sb6.append(" errCode:");
        sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f70616b) : null);
        sb6.append(" feedId:");
        sb6.append(pm0.v.u(this.f106649e));
        sb6.append(" nonceId:");
        sb6.append(this.f106650f);
        sb6.append(" result:");
        if (fVar != null && (ov0Var2 = (r45.ov0) fVar.f70618d) != null && (list2 = ov0Var2.getList(1)) != null) {
            num = java.lang.Integer.valueOf(list2.size());
        }
        sb6.append(num);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        if (fVar != null && fVar.f70615a == 0) {
            if ((fVar != null && fVar.f70616b == 0) && fVar != null && (ov0Var = (r45.ov0) fVar.f70618d) != null && (list = ov0Var.getList(1)) != null) {
                for (r45.dl2 dl2Var : list) {
                    long j17 = dl2Var != null ? dl2Var.getLong(0) : 0L;
                    kotlin.jvm.internal.o.d(dl2Var);
                    com.tencent.mm.plugin.finder.feed.fg.O6(fgVar, j17, dl2Var);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
