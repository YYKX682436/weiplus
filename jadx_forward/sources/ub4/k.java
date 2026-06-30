package ub4;

/* loaded from: classes4.dex */
public class k extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f507715c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f507716d;

    /* renamed from: g, reason: collision with root package name */
    public final ub4.j f507719g;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f507717e = "";

    /* renamed from: f, reason: collision with root package name */
    public boolean f507718f = false;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f507720h = new java.util.LinkedHashMap();

    public k(ub4.j jVar, java.lang.String str, boolean z17) {
        this.f507715c = "";
        this.f507716d = false;
        this.f507719g = null;
        this.f507719g = jVar;
        this.f507715c = str;
        this.f507716d = z17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b4, code lost:
    
        if (r5.moveToFirst() != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b6, code lost:
    
        r10 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226();
        r10.mo9015xbf5d97fd(r5);
        r6.add(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c5, code lost:
    
        if (r5.moveToNext() != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c7, code lost:
    
        r5.close();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsMediaListByUserName", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0199  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List b() {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ub4.k.b():java.util.List");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o
    public void c(java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("publicNotify", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapterHelper");
        ub4.j jVar = this.f507719g;
        if (jVar != null) {
            ub4.a aVar = (ub4.a) jVar;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onLoadingFinish", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter$1");
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Integer.valueOf(list == null ? 0 : list.size());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAlbumAdapter", "onLoadingFinish list.size=%s", objArr);
            ub4.i iVar = aVar.f507684a;
            ((java.util.ArrayList) ub4.i.x(iVar)).clear();
            ub4.c cVar = new ub4.c();
            cVar.f507686b = "my_timeline";
            ((java.util.ArrayList) ub4.i.x(iVar)).add(cVar);
            ((java.util.ArrayList) ub4.i.x(iVar)).addAll(list);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("calculateSnsCount", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
            java.util.Iterator it = ((java.util.ArrayList) iVar.f507700d).iterator();
            while (it.hasNext()) {
                ((ub4.c) it.next()).f507685a.size();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calculateSnsCount", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$102", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$102", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
            if (!list.isEmpty()) {
                ub4.c cVar2 = new ub4.c();
                cVar2.f507686b = "loading";
                ((java.util.ArrayList) ub4.i.x(iVar)).add(cVar2);
            }
            iVar.m8146xced61ae5();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
            ub4.b bVar = iVar.f507714u;
            if (bVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2182x5897e6f.C18155xbfbac8cb c18155xbfbac8cb = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2182x5897e6f.C18155xbfbac8cb) bVar;
                c18155xbfbac8cb.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onLoadFinish", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
                if (list.isEmpty()) {
                    c18155xbfbac8cb.f249294d.setVisibility(8);
                    c18155xbfbac8cb.f249295e.setVisibility(0);
                } else {
                    c18155xbfbac8cb.f249294d.setVisibility(0);
                    c18155xbfbac8cb.f249295e.setVisibility(8);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLoadFinish", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLoadingFinish", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter$1");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("publicNotify", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapterHelper");
    }
}
