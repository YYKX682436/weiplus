package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class v9 extends xc2.e1 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f104774c;

    public v9(com.tencent.mm.plugin.finder.convert.qe qeVar) {
        this.f104774c = qeVar;
    }

    @Override // xc2.c1
    public void a(int i17, java.util.List list) {
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed;
        kotlin.jvm.internal.o.g(list, "list");
        in5.s0 s0Var = this.f453121a;
        if (s0Var != null) {
            boolean isEmpty = list.isEmpty();
            com.tencent.mm.plugin.finder.convert.qe qeVar = this.f104774c;
            if (isEmpty) {
                qeVar.L = true;
            } else {
                qeVar.t(s0Var);
                if (i17 == 5 && (!list.isEmpty())) {
                    qeVar.L = true;
                }
            }
            if (!qeVar.L || (baseFinderFeed = this.f453122b) == null) {
                return;
            }
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) s0Var.f293125i;
            com.tencent.mm.plugin.finder.storage.FinderItem feedObject = baseFinderFeed2 != null ? baseFinderFeed2.getFeedObject() : null;
            if (feedObject != null && feedObject.getId() == baseFinderFeed.getItemId()) {
                qeVar.N0(s0Var, baseFinderFeed);
                return;
            }
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Long.valueOf(feedObject != null ? feedObject.getId() : 0L);
            objArr[1] = java.lang.Long.valueOf(baseFinderFeed.getItemId());
            com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", "jumper add feed not match %d %d", objArr);
        }
    }

    @Override // xc2.c1
    public int b(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        return this.f104774c.R(holder);
    }

    @Override // xc2.c1
    public com.tencent.mm.plugin.finder.feed.k8 c() {
        return this.f104774c.f104358f;
    }
}
