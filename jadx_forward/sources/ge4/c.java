package ge4;

/* loaded from: classes4.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.y0 f352513d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fe4.d f352514e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ge4.e f352515f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ge4.a f352516g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p3325xe03a0797.p3326xc267989b.y0 y0Var, fe4.d dVar, ge4.e eVar, ge4.a aVar) {
        super(0);
        this.f352513d = y0Var;
        this.f352514e = dVar;
        this.f352515f = eVar;
        this.f352516g = aVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr$launchJob$1$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr$launchJob$1$1");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f352513d.hashCode());
        sb6.append(" deal result in main: ");
        fe4.d dVar = this.f352514e;
        dVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMediaKey", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoDealResult");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaKey", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoDealResult");
        sb6.append(dVar.f343101a);
        sb6.append(" res: ");
        sb6.append(dVar.a());
        sb6.append(" isRelease: ");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$isRelease$p", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr");
        ge4.e eVar = this.f352515f;
        boolean z17 = eVar.f352529i;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$isRelease$p", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr");
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsPublish.SnsPublishLivePhotoWorkMgr", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.p2225x45d52d5.p2226x2eefaa.C18437xfbc5d82 b17 = this.f352516g.b();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$dealResult", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dealResult", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr");
        java.util.HashMap hashMap = eVar.f352527g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMediaKey", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoDealResult");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaKey", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoDealResult");
        ge4.a aVar = (ge4.a) hashMap.get(dVar.f343101a);
        java.util.LinkedList linkedList = eVar.f352525e;
        java.util.LinkedList linkedList2 = eVar.f352526f;
        java.util.LinkedList linkedList3 = eVar.f352522b;
        if (aVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsPublish.SnsPublishLivePhotoWorkMgr", "dealResult >> get job error");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dealResult", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr");
            str = "invoke";
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isOk", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoDealResult");
            int i17 = dVar.f343102b;
            boolean z18 = i17 == 0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isOk", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoDealResult");
            if (z18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsPublish.SnsPublishLivePhotoWorkMgr", "result is ok removeFromRunningQueueRes >> " + linkedList3.remove(aVar));
                eVar.f352523c.addLast(aVar);
                str = "invoke";
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isOriginDataErr", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoDealResult");
                str = "invoke";
                boolean z19 = i17 == 2 || i17 == 1;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isOriginDataErr", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoDealResult");
                if (z19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsPublish.SnsPublishLivePhotoWorkMgr", "result is originDataErr removeFromRunningQueueRes >> " + linkedList3.remove(aVar));
                    linkedList2.addLast(aVar);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isCancel", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoDealResult");
                    boolean z27 = i17 == 4;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isCancel", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoDealResult");
                    if (z27) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsPublish.SnsPublishLivePhotoWorkMgr", "result is isCancel removeFromRunningQueueRes >> " + linkedList3.remove(aVar));
                        eVar.f352524d.addLast(aVar);
                        yz5.l lVar = eVar.f352530j;
                        if (lVar != null) {
                            lVar.mo146xb9724478(b17);
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsPublish.SnsPublishLivePhotoWorkMgr", "result is deal error removeFromRunningQueueRes >> " + linkedList3.remove(aVar));
                        linkedList.addLast(aVar);
                    }
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dealResult", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$dealResult", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$isRelease$p", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr");
        boolean z28 = eVar.f352529i;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$isRelease$p", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr");
        if (!z28) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$findWaitJob", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("findWaitJob", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr");
            java.util.LinkedList linkedList4 = eVar.f352521a;
            int size = linkedList4.size();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsPublish.SnsPublishLivePhotoWorkMgr", eVar.hashCode() + " findWaitJob >> waitJobSize: " + size);
            if (size > 0) {
                ge4.a aVar2 = (ge4.a) linkedList4.removeFirst();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsPublish.SnsPublishLivePhotoWorkMgr", eVar.hashCode() + " find first wait job mediaId: " + aVar2.b().g());
                linkedList3.addLast(aVar2);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("launchJob", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr");
                p3325xe03a0797.p3326xc267989b.l.d(eVar.f352528h, null, null, new ge4.d(aVar2, eVar, null), 3, null);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("launchJob", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsPublish.SnsPublishLivePhotoWorkMgr", "is no had wait job");
                int size2 = linkedList3.size();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsPublish.SnsPublishLivePhotoWorkMgr", "findWaitJob >> running job size: " + size2);
                if (size2 == 0) {
                    int size3 = linkedList2.size();
                    int size4 = linkedList.size();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsPublish.SnsPublishLivePhotoWorkMgr", "all job is finish originErrJobSize: " + size3 + " dealErrJobSize: " + size4);
                    if (size4 > 0) {
                        java.util.ArrayList<java.lang.String> b18 = eVar.b();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsPublish.SnsPublishLivePhotoWorkMgr", "WORK_ERR_DEAL >> errorIdList " + b18.size());
                        android.os.Bundle bundle = new android.os.Bundle();
                        bundle.putInt("key_err_code", 2);
                        bundle.putStringArrayList("key_work_err_media_ids", b18);
                        eVar.a(new jz5.l(2, bundle));
                    } else if (size3 > 0) {
                        java.util.ArrayList<java.lang.String> b19 = eVar.b();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsPublish.SnsPublishLivePhotoWorkMgr", "WORK_ERR_ORIGIN_DADA_ERROR >> errorIdList " + b19.size());
                        android.os.Bundle bundle2 = new android.os.Bundle();
                        bundle2.putInt("key_err_code", 1);
                        bundle2.putStringArrayList("key_work_err_media_ids", b19);
                        eVar.a(new jz5.l(2, bundle2));
                    } else {
                        eVar.a(new jz5.l(1, new android.os.Bundle()));
                    }
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findWaitJob", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$findWaitJob", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr");
        }
        java.lang.String str2 = str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr$launchJob$1$1");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr$launchJob$1$1");
        return f0Var;
    }
}
