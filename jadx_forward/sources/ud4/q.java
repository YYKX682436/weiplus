package ud4;

/* loaded from: classes4.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f508261d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ud4.t f508262e;

    public q(ud4.t tVar, java.util.List list) {
        this.f508262e = tVar;
        this.f508261d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView$6");
        int size = this.f508261d.size();
        ud4.t tVar = this.f508262e;
        tVar.d(size);
        tVar.f508266b.notifyDataSetChanged();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView$6");
    }
}
