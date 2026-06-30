package com.tencent.mm.feature.finder.live;

/* loaded from: classes.dex */
public final class n4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f66839d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f66840e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(1);
        this.f66839d = str;
        this.f66840e = continuation;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.LinkedList list;
        r45.dl2 dl2Var;
        r45.nw1 nw1Var;
        java.util.LinkedList list2;
        java.lang.Integer num;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#requestAndRefreshActivityIcon errType:");
        sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f70615a) : null);
        sb6.append(" errCode:");
        sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f70616b) : null);
        sb6.append(" feedId:");
        sb6.append(this.f66839d);
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveFeatureService", sb6.toString());
        kotlin.coroutines.Continuation continuation = this.f66840e;
        if (fVar != null && fVar.f70615a == 0 && fVar.f70616b == 0) {
            r45.ov0 ov0Var = (r45.ov0) fVar.f70618d;
            int intValue = (ov0Var == null || (list = ov0Var.getList(1)) == null || (dl2Var = (r45.dl2) kz5.n0.a0(list, 0)) == null || (nw1Var = (r45.nw1) dl2Var.getCustom(1)) == null || (list2 = nw1Var.getList(33)) == null || (num = (java.lang.Integer) kz5.n0.a0(list2, 0)) == null) ? 0 : num.intValue();
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveFeatureService", "#requestAndRefreshActivityIcon actType=" + intValue);
            r45.ov0 ov0Var2 = (r45.ov0) fVar.f70618d;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(new com.tencent.mm.feature.finder.live.p1(ov0Var2 != null ? ov0Var2.getInteger(3) : 0, intValue)));
        } else {
            continuation.resumeWith(kotlin.Result.m521constructorimpl(new com.tencent.mm.feature.finder.live.p1(0, 0)));
        }
        return jz5.f0.f302826a;
    }
}
