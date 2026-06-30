package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class xc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.id f111055d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f111056e;

    public xc(com.tencent.mm.plugin.finder.feed.id idVar, com.tencent.mm.plugin.finder.storage.FinderItem finderItem) {
        this.f111055d = idVar;
        this.f111056e = finderItem;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.feed.id idVar = this.f111055d;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f111056e;
        if (finderItem == null) {
            idVar.getClass();
            return;
        }
        fp0.t tVar = idVar.f107006i;
        if (tVar != null) {
            tVar.b(new fp0.r(new com.tencent.mm.plugin.finder.feed.vc(idVar, finderItem), null, 2, null));
        }
    }
}
