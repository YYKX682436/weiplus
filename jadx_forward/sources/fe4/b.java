package fe4;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public java.util.List f343095a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f343096b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f343097c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f343098d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f343099e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f343100f = new java.util.HashMap();

    public final void a(java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addMediaList", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublicMultiPicWrapperItem");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("addMediaList >> publish item size : ");
        sb6.append(list != null ? java.lang.Integer.valueOf(list.size()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsPublish.MultiPicItem", sb6.toString());
        this.f343095a = list != null ? kz5.n0.V0(list) : new java.util.ArrayList();
        java.util.List list2 = this.f343096b;
        ((java.util.ArrayList) list2).clear();
        java.util.HashMap hashMap = this.f343097c;
        hashMap.clear();
        for (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.p2225x45d52d5.p2226x2eefaa.AbstractC18435x78de886c abstractC18435x78de886c : this.f343095a) {
            java.lang.String b17 = abstractC18435x78de886c.b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b17);
            ((java.util.ArrayList) list2).add(b17);
            java.lang.String b18 = abstractC18435x78de886c.b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b18);
            hashMap.put(b18, java.lang.Boolean.FALSE);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addMediaList", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublicMultiPicWrapperItem");
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.p2225x45d52d5.p2226x2eefaa.AbstractC18435x78de886c b(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 mediaItem, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.p2225x45d52d5.p2226x2eefaa.AbstractC18435x78de886c c18436x91cb1037;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createPicItemFromGalleryMediaItem", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublicMultiPicWrapperItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaItem, "mediaItem");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsPublish.MultiPicItem", "createPicItemFromGalleryMediaItem >> " + mediaItem.f219967i + ' ' + mediaItem.mo63659xfb85f7b0());
        int mo63659xfb85f7b0 = mediaItem.mo63659xfb85f7b0();
        if (mo63659xfb85f7b0 == 1) {
            c18436x91cb1037 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.p2225x45d52d5.p2226x2eefaa.C18436x91cb1037(mediaItem.f219963e, 2, i17, ((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15631xba892b3b) mediaItem).f219957v == 1 ? 1 : 0);
        } else {
            if (mo63659xfb85f7b0 != 6) {
                java.lang.IllegalArgumentException illegalArgumentException = new java.lang.IllegalArgumentException("item type is invalid");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createPicItemFromGalleryMediaItem", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublicMultiPicWrapperItem");
                throw illegalArgumentException;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0 c15632xfc4fd0d0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0) mediaItem;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsPublish.MultiPicItem", "is live item >> isParsed: " + c15632xfc4fd0d0.G);
            java.lang.String o17 = c15632xfc4fd0d0.o();
            long j17 = mediaItem.f219967i;
            long j18 = c15632xfc4fd0d0.F;
            long j19 = c15632xfc4fd0d0.B;
            int i18 = c15632xfc4fd0d0.G;
            int i19 = i18 == 1 ? 1 : 0;
            java.lang.String str = i18 == 1 ? c15632xfc4fd0d0.f219963e : "";
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(j17);
            sb6.append('_');
            sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.p2225x45d52d5.p2226x2eefaa.C18437xfbc5d82.f38467x681a0c0c.hashCode());
            sb6.append('_');
            sb6.append(java.lang.System.currentTimeMillis());
            c18436x91cb1037 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.p2225x45d52d5.p2226x2eefaa.C18437xfbc5d82(o17, 2, i17, j17, j18, j19, str, "", "", i19, 0, 0, "", sb6.toString(), new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1999xc84c5534.C17030x7c2c6071(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1999xc84c5534.C17030x7c2c6071.f237399u));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createPicItemFromGalleryMediaItem", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublicMultiPicWrapperItem");
        return c18436x91cb1037;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.p2225x45d52d5.p2226x2eefaa.AbstractC18435x78de886c c(java.lang.String path, int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createPicItemFromPath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublicMultiPicWrapperItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.p2225x45d52d5.p2226x2eefaa.C18436x91cb1037 c18436x91cb1037 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.p2225x45d52d5.p2226x2eefaa.C18436x91cb1037(path, z17 ? 1 : 2, i17, 0, null, 24, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createPicItemFromPath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublicMultiPicWrapperItem");
        return c18436x91cb1037;
    }

    public final java.util.List d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getImagePathList", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublicMultiPicWrapperItem");
        java.util.List list = this.f343096b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getImagePathList", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublicMultiPicWrapperItem");
        return list;
    }

    public final java.util.List e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItemList", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublicMultiPicWrapperItem");
        java.util.List list = this.f343095a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemList", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublicMultiPicWrapperItem");
        return list;
    }

    public final int f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMediaSize", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublicMultiPicWrapperItem");
        int size = this.f343095a.size();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaSize", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublicMultiPicWrapperItem");
        return size;
    }
}
