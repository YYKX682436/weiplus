package u84;

/* loaded from: classes4.dex */
public class r1 extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2147x5f7cac22.C17799xcad64a02 f507195a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2147x5f7cac22.C17799xcad64a02 c17799xcad64a02, android.os.Looper looper) {
        super(looper);
        this.f507195a = c17799xcad64a02;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleMessage", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2147x5f7cac22.C17799xcad64a02 c17799xcad64a02 = this.f507195a;
        c17799xcad64a02.f245127m++;
        if (c17799xcad64a02.f245124g.getVisibility() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2147x5f7cac22.C17799xcad64a02.a(c17799xcad64a02, c17799xcad64a02.f245124g);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2147x5f7cac22.C17799xcad64a02.b(c17799xcad64a02, c17799xcad64a02.f245125h);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2147x5f7cac22.C17799xcad64a02.b(c17799xcad64a02, c17799xcad64a02.f245124g);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2147x5f7cac22.C17799xcad64a02.a(c17799xcad64a02, c17799xcad64a02.f245125h);
        }
        if (!c17799xcad64a02.f245128n) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
            android.os.Handler handler = c17799xcad64a02.f245133s;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView");
            handler.sendEmptyMessageDelayed(1, 2300L);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleMessage", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView$1");
    }
}
