package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class z10 extends com.tencent.mm.plugin.finder.feed.model.internal.y {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$Loader f111223e;

    public z10(com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$Loader finderTopicTimelineUIContract$Loader) {
        this.f111223e = finderTopicTimelineUIContract$Loader;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        if (((r45.oa1) r5).getInteger(11) != 0) goto L21;
     */
    @Override // com.tencent.mm.plugin.finder.feed.model.internal.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse b(int r15, int r16, java.lang.String r17, com.tencent.mm.modelbase.m1 r18) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.z10.b(int, int, java.lang.String, com.tencent.mm.modelbase.m1):com.tencent.mm.plugin.finder.feed.model.internal.IResponse");
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.y
    public com.tencent.mm.modelbase.m1 c() {
        com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$Loader finderTopicTimelineUIContract$Loader = this.f111223e;
        int i17 = finderTopicTimelineUIContract$Loader.f106133o;
        java.lang.String str = finderTopicTimelineUIContract$Loader.f106134p;
        java.lang.String str2 = finderTopicTimelineUIContract$Loader.f106164n;
        if (str2 == null) {
            str2 = pm0.v.u(finderTopicTimelineUIContract$Loader.f106162i);
        }
        java.lang.String str3 = str2;
        long j17 = finderTopicTimelineUIContract$Loader.f106142x;
        java.lang.String str4 = finderTopicTimelineUIContract$Loader.f106143y;
        int i18 = finderTopicTimelineUIContract$Loader.f106144z;
        r45.ze2 ze2Var = finderTopicTimelineUIContract$Loader.f106136r;
        long j18 = finderTopicTimelineUIContract$Loader.f106162i;
        com.tencent.mm.protobuf.g lastBuffer = finderTopicTimelineUIContract$Loader.getLastBuffer();
        r45.xu2 xu2Var = finderTopicTimelineUIContract$Loader.f106137s;
        r45.xn5 xn5Var = finderTopicTimelineUIContract$Loader.f106163m;
        r45.qt2 contextObj = finderTopicTimelineUIContract$Loader.getContextObj();
        long j19 = finderTopicTimelineUIContract$Loader.f106135q;
        com.tencent.mm.protobuf.g gVar = finderTopicTimelineUIContract$Loader.A;
        return new com.tencent.mm.plugin.finder.feed.model.m9(i17, str, str3, j17, str4, i18, ze2Var, java.lang.Long.valueOf(j18), lastBuffer, xu2Var, xy2.c.f(finderTopicTimelineUIContract$Loader.getContextObj()), 0, xn5Var, 2, contextObj, null, j19, gVar, 0, null, 821248, null).a();
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.y
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse callInit() {
        com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$Loader finderTopicTimelineUIContract$Loader = this.f111223e;
        com.tencent.mm.plugin.finder.feed.model.r9 cache = finderTopicTimelineUIContract$Loader.getCache();
        if (cache == null) {
            return new com.tencent.mm.plugin.finder.feed.y10(0L, null, 0, 0, "");
        }
        java.lang.String tag = getTAG();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fetchInit size:");
        java.util.ArrayList arrayList = cache.f108300a;
        sb6.append(arrayList != null ? java.lang.Integer.valueOf(arrayList.size()) : null);
        com.tencent.mars.xlog.Log.i(tag, sb6.toString());
        com.tencent.mm.plugin.finder.feed.y10 y10Var = new com.tencent.mm.plugin.finder.feed.y10(arrayList != null ? arrayList.size() : 0L, null, 0, 0, "");
        y10Var.setIncrementList(arrayList);
        java.util.List<so2.j5> incrementList = y10Var.getIncrementList();
        if (incrementList != null) {
            for (so2.j5 j5Var : incrementList) {
                if (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                    ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).k1(finderTopicTimelineUIContract$Loader.f106140v);
                }
            }
        }
        com.tencent.mm.plugin.finder.feed.model.c cVar = cache.f108303d;
        if (!(cVar instanceof com.tencent.mm.plugin.finder.feed.g30)) {
            return y10Var;
        }
        kotlin.jvm.internal.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.TopicCustomData");
        y10Var.setLastBuffer(((com.tencent.mm.plugin.finder.feed.g30) cVar).f106821b);
        return y10Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.y
    public com.tencent.mm.modelbase.m1 d() {
        com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$Loader finderTopicTimelineUIContract$Loader = this.f111223e;
        int i17 = finderTopicTimelineUIContract$Loader.f106133o;
        if (i17 == 5) {
            return new db2.t5(finderTopicTimelineUIContract$Loader.f106134p, finderTopicTimelineUIContract$Loader.f106135q, finderTopicTimelineUIContract$Loader.A, java.lang.Long.valueOf(finderTopicTimelineUIContract$Loader.f106162i), finderTopicTimelineUIContract$Loader.f106133o, (com.tencent.mm.protobuf.g) null, finderTopicTimelineUIContract$Loader.getContextObj(), (java.lang.String) null, (r45.a34) null, 384, (kotlin.jvm.internal.i) null);
        }
        if ((i17 == 16 || i17 == 23 || i17 == 24) && finderTopicTimelineUIContract$Loader.getCache() == null) {
            return new db2.t5(finderTopicTimelineUIContract$Loader.f106134p, finderTopicTimelineUIContract$Loader.f106135q, java.lang.Long.valueOf(finderTopicTimelineUIContract$Loader.f106162i), finderTopicTimelineUIContract$Loader.f106133o, finderTopicTimelineUIContract$Loader.getLastBuffer(), finderTopicTimelineUIContract$Loader.getContextObj(), null, null, finderTopicTimelineUIContract$Loader.f106141w, finderTopicTimelineUIContract$Loader.A, null, com.tencent.mm.plugin.appbrand.jsapi.pay.p0.CTRL_INDEX, null);
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.y
    public java.util.List e() {
        return kz5.b0.c(817);
    }
}
