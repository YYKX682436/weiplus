package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class hy implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.pz f106965d;

    public hy(com.tencent.mm.plugin.finder.feed.pz pzVar) {
        this.f106965d = pzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.feed.pz pzVar = this.f106965d;
        int i17 = pzVar.f108762p;
        if (i17 == 1 || i17 == 4) {
            com.tencent.mm.plugin.finder.extension.reddot.aa aaVar = com.tencent.mm.plugin.finder.extension.reddot.aa.f105353a;
            com.tencent.mm.plugin.finder.extension.reddot.aa.E.observe(pzVar.f108755g, new com.tencent.mm.plugin.finder.feed.dy(pzVar));
            com.tencent.mm.plugin.finder.extension.reddot.aa.f105399x.observe(pzVar.f108755g, new com.tencent.mm.plugin.finder.feed.ey(pzVar));
            com.tencent.mm.plugin.finder.extension.reddot.aa.B.observe(pzVar.f108755g, new com.tencent.mm.plugin.finder.feed.fy(pzVar));
            com.tencent.mm.plugin.finder.extension.reddot.aa.f105389s.observe(pzVar.f108755g, new com.tencent.mm.plugin.finder.feed.gy(pzVar));
        }
    }
}
