package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.l0 f107874d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderCommentInfo f107875e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f107876f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f107877g;

    public g0(com.tencent.mm.plugin.finder.feed.model.l0 l0Var, com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo, long j17, java.lang.Long l17) {
        this.f107874d = l0Var;
        this.f107875e = finderCommentInfo;
        this.f107876f = j17;
        this.f107877g = l17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.feed.model.l0 l0Var = this.f107874d;
        java.lang.String str = l0Var.f108126h;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("show desc comment, content=");
        com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo = this.f107875e;
        sb6.append(finderCommentInfo.getContent());
        sb6.append(", feedId=");
        long j17 = this.f107876f;
        sb6.append(pm0.v.u(j17));
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        androidx.appcompat.app.AppCompatActivity activity = l0Var.f108125g;
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.viewmodel.component.xc xcVar = (com.tencent.mm.plugin.finder.viewmodel.component.xc) pf5.z.f353948a.a(activity).e(com.tencent.mm.plugin.finder.viewmodel.component.xc.class);
        if (xcVar != null) {
            androidx.lifecycle.j0 f76 = xcVar.f7(j17);
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add(finderCommentInfo);
            java.lang.Long l17 = this.f107877g;
            f76.postValue(new jz5.l(linkedList, java.lang.Long.valueOf(l17 != null ? l17.longValue() : 0L)));
        }
    }
}
