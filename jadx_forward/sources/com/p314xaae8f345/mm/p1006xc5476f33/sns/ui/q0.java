package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class q0 implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC17940xbaa2983b f251824d;

    public q0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC17940xbaa2983b activityC17940xbaa2983b) {
        this.f251824d = activityC17940xbaa2983b;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScroll", "com.tencent.mm.plugin.sns.ui.ArtistUI$6");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/ArtistUI$6", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/ArtistUI$6", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScroll", "com.tencent.mm.plugin.sns.ui.ArtistUI$6");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0064, code lost:
    
        if (r1 != false) goto L8;
     */
    @Override // android.widget.AbsListView.OnScrollListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onScrollStateChanged(android.widget.AbsListView r16, int r17) {
        /*
            r15 = this;
            r6 = r15
            java.lang.String r7 = "onScrollStateChanged"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.ui.ArtistUI$6"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r7, r8)
            java.lang.String r0 = "com/tencent/mm/plugin/sns/ui/ArtistUI$6"
            java.lang.String r1 = "android/widget/AbsListView$OnScrollListener"
            java.lang.String r2 = "onScrollStateChanged"
            java.lang.String r3 = "(Landroid/widget/AbsListView;I)V"
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r5 = r16
            r4.add(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r17)
            r4.add(r5)
            java.lang.Object[] r5 = r4.toArray()
            r4.clear()
            r4 = r15
            yj0.a.b(r0, r1, r2, r3, r4, r5)
            java.lang.String r0 = "com.tencent.mm.plugin.sns.model.DownloadManager"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model.LazyerImageLoader2"
            java.lang.String r2 = "access$700"
            java.lang.String r3 = "access$600"
            java.lang.String r4 = "isRun"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ui.ArtistUI"
            r9 = 2
            java.lang.String r10 = "(Landroid/widget/AbsListView;I)V"
            java.lang.String r11 = "android/widget/AbsListView$OnScrollListener"
            java.lang.String r12 = "com/tencent/mm/plugin/sns/ui/ArtistUI$6"
            com.tencent.mm.plugin.sns.ui.ArtistUI r14 = r6.f251824d
            r13 = r17
            if (r13 != r9) goto L8a
            com.tencent.mm.plugin.sns.model.i1 r9 = r14.f247742n
            r9.getClass()
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r4, r1)
            boolean r9 = r9.f245796l
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r4, r1)
            if (r9 != 0) goto L66
            com.tencent.mm.plugin.sns.model.m0 r1 = r14.f247743o
            r1.getClass()
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r4, r0)
            boolean r1 = r1.f245979i
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r4, r0)
            if (r1 == 0) goto Ld2
        L66:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r3, r5)
            java.lang.Runnable r0 = r14.f247744p
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r3, r5)
            com.tencent.mm.sdk.platformtools.n3 r1 = r14.f247741m
            r1.mo50300x3fa464aa(r0)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r2, r5)
            java.lang.Runnable r4 = r14.f247745q
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r5)
            r1.mo50300x3fa464aa(r4)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r3, r5)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r3, r5)
            r2 = 0
            r1.mo50297x7c4d7ca2(r0, r2)
            goto Ld2
        L8a:
            com.tencent.mm.plugin.sns.model.i1 r9 = r14.f247742n
            r9.getClass()
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r4, r1)
            boolean r9 = r9.f245796l
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r4, r1)
            if (r9 == 0) goto Laf
            com.tencent.mm.plugin.sns.model.m0 r1 = r14.f247743o
            r1.getClass()
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r4, r0)
            boolean r1 = r1.f245979i
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r4, r0)
            if (r1 == 0) goto Laf
            yj0.a.h(r15, r12, r11, r7, r10)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r7, r8)
            return
        Laf:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r3, r5)
            java.lang.Runnable r0 = r14.f247744p
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r3, r5)
            com.tencent.mm.sdk.platformtools.n3 r1 = r14.f247741m
            r1.mo50300x3fa464aa(r0)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r2, r5)
            java.lang.Runnable r0 = r14.f247745q
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r5)
            r1.mo50300x3fa464aa(r0)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r2, r5)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r5)
            r2 = 0
            r1.mo50297x7c4d7ca2(r0, r2)
        Ld2:
            yj0.a.h(r15, r12, r11, r7, r10)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.q0.onScrollStateChanged(android.widget.AbsListView, int):void");
    }
}
