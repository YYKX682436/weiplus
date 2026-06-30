package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class kn implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.rn f107224d;

    public kn(com.tencent.mm.plugin.finder.feed.rn rnVar) {
        this.f107224d = rnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.feed.hn hnVar = this.f107224d.f108929e;
        if (hnVar.f106940o) {
            hnVar.f106935g = null;
            hnVar.g(false, 1);
        } else {
            hnVar.f106935g = null;
            hnVar.g(false, 2);
        }
    }
}
