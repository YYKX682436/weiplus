package dd4;

/* loaded from: classes4.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f310548d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.C18280x2556ea40 f310549e;

    public k(android.graphics.Bitmap bitmap, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.C18280x2556ea40 c18280x2556ea40) {
        this.f310548d = bitmap;
        this.f310549e = c18280x2556ea40;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView$checkShowTranslateResImg$1$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.C18280x2556ea40 c18280x2556ea40 = this.f310549e;
        android.graphics.Bitmap bitmap = this.f310548d;
        if (bitmap != null) {
            c18280x2556ea40.m("set trans img success");
            dd4.v0 d17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.C18280x2556ea40.d(c18280x2556ea40);
            if (d17 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("snsInfoFlipCallback");
                throw null;
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.fk) d17).b(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.C18280x2556ea40.e(c18280x2556ea40), com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.C18280x2556ea40.c(c18280x2556ea40));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.C18280x2556ea40.e(c18280x2556ea40).m79195x464b3146(true);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a e17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.C18280x2556ea40.e(c18280x2556ea40);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            e17.f279184o = width;
            e17.f279185p = height;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.C18280x2556ea40.e(c18280x2556ea40).setImageBitmap(bitmap);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.C18280x2556ea40.e(c18280x2556ea40).setVisibility(0);
            int width2 = bitmap.getWidth();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setBmWidth$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
            c18280x2556ea40.f250741z = width2;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setBmWidth$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
            int height2 = bitmap.getHeight();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setBmHeight$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
            c18280x2556ea40.A = height2;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setBmHeight$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getBmWidth$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
            int i17 = c18280x2556ea40.f250741z;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getBmWidth$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getBmHeight$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
            int i18 = c18280x2556ea40.A;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getBmHeight$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.C18280x2556ea40.q(c18280x2556ea40, i17, i18, false, null, 12, null);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.C18280x2556ea40.e(c18280x2556ea40).post(new dd4.j(c18280x2556ea40));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.C18280x2556ea40.h(c18280x2556ea40);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlexibleLivePhotoView", "set trans img error");
            dd4.f fVar = dd4.f.f310530f;
            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.C18280x2556ea40.G;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setBigImageDownLoadState$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
            c18280x2556ea40.f250738w = fVar;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setBigImageDownLoadState$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView$checkShowTranslateResImg$1$1");
    }
}
