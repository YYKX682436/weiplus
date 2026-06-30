package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class cg extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f106472d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.fg f106473e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f106474f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f106475g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f106476h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f106477i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg(xg2.h hVar, kotlin.coroutines.Continuation continuation, com.tencent.mm.plugin.finder.feed.fg fgVar, long j17, java.lang.String str, kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.c0 c0Var) {
        super(2, continuation);
        this.f106472d = hVar;
        this.f106473e = fgVar;
        this.f106474f = j17;
        this.f106475g = str;
        this.f106476h = h0Var;
        this.f106477i = c0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.feed.cg(this.f106472d, continuation, this.f106473e, this.f106474f, this.f106475g, this.f106476h, this.f106477i);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.feed.cg cgVar = (com.tencent.mm.plugin.finder.feed.cg) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        cgVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.ov0 ov0Var = (r45.ov0) ((xg2.i) this.f106472d).f454393b;
        com.tencent.mm.plugin.finder.feed.fg fgVar = this.f106473e;
        java.lang.String str2 = fgVar.f106741d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tryFetchAutoSwipeInfo feedId:");
        sb6.append(pm0.v.u(this.f106474f));
        sb6.append(" nonceId:");
        sb6.append(this.f106475g);
        sb6.append(" result:");
        java.util.LinkedList list = ov0Var.getList(1);
        sb6.append(list != null ? new java.lang.Integer(list.size()) : null);
        com.tencent.mars.xlog.Log.i(str2, sb6.toString());
        java.util.LinkedList<r45.dl2> list2 = ov0Var.getList(1);
        if (list2 != null) {
            for (r45.dl2 dl2Var : list2) {
                boolean z17 = false;
                long j17 = dl2Var != null ? dl2Var.getLong(0) : 0L;
                kotlin.jvm.internal.o.d(dl2Var);
                com.tencent.mm.plugin.finder.feed.fg.O6(fgVar, j17, dl2Var);
                java.lang.String str3 = fgVar.f106741d;
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("tryFetchPreloadInfo, needSwipe: ");
                r45.tl1 tl1Var = (r45.tl1) dl2Var.getCustom(15);
                sb7.append(tl1Var != null ? java.lang.Boolean.valueOf(tl1Var.getBoolean(0)) : null);
                sb7.append(", wording: ");
                r45.tl1 tl1Var2 = (r45.tl1) dl2Var.getCustom(15);
                sb7.append(tl1Var2 != null ? tl1Var2.getString(1) : null);
                com.tencent.mars.xlog.Log.i(str3, sb7.toString());
                r45.tl1 tl1Var3 = (r45.tl1) dl2Var.getCustom(15);
                if (tl1Var3 != null && tl1Var3.getBoolean(0)) {
                    z17 = true;
                }
                if (z17) {
                    r45.tl1 tl1Var4 = (r45.tl1) dl2Var.getCustom(15);
                    if (tl1Var4 == null || (str = tl1Var4.getString(1)) == null) {
                        str = "";
                    }
                    this.f106476h.f310123d = str;
                    this.f106477i.f310112d = true;
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
