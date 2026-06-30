package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class d30 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.IResponse f106543d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.NativeDramaGridLoader f106544e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d30(com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse, com.tencent.mm.plugin.finder.feed.NativeDramaGridLoader nativeDramaGridLoader) {
        super(0);
        this.f106543d = iResponse;
        this.f106544e = nativeDramaGridLoader;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse = this.f106543d;
        if (iResponse.getPullType() == 0) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.List<so2.j5> incrementList = iResponse.getIncrementList();
            if (incrementList != null) {
                for (so2.j5 j5Var : incrementList) {
                    if (j5Var instanceof com.tencent.mm.plugin.finder.feed.model.d5) {
                        linkedList.add(new bu2.o0(73729, ((com.tencent.mm.plugin.finder.feed.model.d5) j5Var).f107792d));
                    }
                }
                boolean z17 = true;
                if (!linkedList.isEmpty()) {
                    com.tencent.mm.plugin.finder.feed.NativeDramaGridLoader nativeDramaGridLoader = this.f106544e;
                    java.lang.String f123427d = nativeDramaGridLoader.getF123427d();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[saveData] infoList.size=");
                    sb6.append(incrementList.size());
                    sb6.append(", firstPage.size=");
                    sb6.append(linkedList.size());
                    sb6.append(" nextPageBuffer ");
                    eb2.e0 e0Var = nativeDramaGridLoader.f106165d;
                    sb6.append(e0Var.f250736e);
                    com.tencent.mars.xlog.Log.i(f123427d, sb6.toString());
                    bu2.e0.f24498a.a(37, xy2.c.f(nativeDramaGridLoader.getContextObj()), linkedList);
                    com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
                    com.tencent.mm.storage.u3 c18 = hc2.d0.c(nativeDramaGridLoader.f106166e);
                    java.lang.String str = e0Var.f250736e;
                    if (str != null && str.length() != 0) {
                        z17 = false;
                    }
                    c17.x(c18, z17 ? null : e0Var.f250736e);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
