package av2;

/* loaded from: classes2.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fc2.a f14200d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ av2.c f14201e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.slideprofile.FinderHomeSlideProfileUI f14202f;

    public b(fc2.a aVar, av2.c cVar, com.tencent.mm.plugin.finder.ui.slideprofile.FinderHomeSlideProfileUI finderHomeSlideProfileUI) {
        this.f14200d = aVar;
        this.f14201e = cVar;
        this.f14202f = finderHomeSlideProfileUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fc2.a aVar = this.f14200d;
        int i17 = ((fc2.t) aVar).f260985d;
        com.tencent.mm.plugin.finder.ui.slideprofile.FinderHomeSlideProfileUI finderHomeSlideProfileUI = this.f14202f;
        av2.c cVar = this.f14201e;
        if ((i17 == 6 && cVar.f14204h == 0) || ((fc2.t) aVar).f260985d == 0) {
            if (cVar.f14204h != ((fc2.t) aVar).f260992k && finderHomeSlideProfileUI.g7()) {
                com.tencent.mars.xlog.Log.i("FinderHomeSlideProfileUI", "selected change, feed: " + ((fc2.t) aVar).f260992k);
                cVar.f14204h = ((fc2.t) aVar).f260992k;
                com.tencent.mm.plugin.finder.storage.FinderItem h17 = bu2.j.f24534a.h(((fc2.t) aVar).f260992k);
                if (h17 != null) {
                    finderHomeSlideProfileUI.d7(h17);
                    return;
                }
                return;
            }
            return;
        }
        if (((fc2.t) aVar).f260985d == 5 && ((fc2.t) aVar).f260992k == cVar.f14204h && !finderHomeSlideProfileUI.f129825u) {
            com.tencent.mars.xlog.Log.i("FinderHomeSlideProfileUI", "try update Biz");
            com.tencent.mm.plugin.finder.storage.FinderItem h18 = bu2.j.f24534a.h(((fc2.t) aVar).f260992k);
            if (h18 != null) {
                r45.xk bizInfo = h18.getBizInfo();
                boolean z17 = false;
                if (bizInfo != null) {
                    com.tencent.mm.plugin.finder.storage.FinderItem finderItem = finderHomeSlideProfileUI.f129824t;
                    if (bizInfo.compareContent(finderItem != null ? finderItem.getBizInfo() : null)) {
                        z17 = true;
                    }
                }
                if (z17) {
                    return;
                }
                com.tencent.mars.xlog.Log.i("FinderHomeSlideProfileUI", "real update Biz");
                finderHomeSlideProfileUI.d7(h18);
            }
        }
    }
}
