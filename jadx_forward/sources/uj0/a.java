package uj0;

/* loaded from: classes13.dex */
public class a implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p786x600aa8b.ui.C10726x5870354e f509715d;

    public a(com.p314xaae8f345.mm.p786x600aa8b.ui.C10726x5870354e c10726x5870354e) {
        this.f509715d = c10726x5870354e;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
        sj0.g.INSTANCE.h();
        int i17 = com.p314xaae8f345.mm.p786x600aa8b.ui.C10726x5870354e.f149747z;
        com.p314xaae8f345.mm.p786x600aa8b.ui.C10726x5870354e c10726x5870354e = this.f509715d;
        c10726x5870354e.getClass();
        sj0.e eVar = sj0.e.INSTANCE;
        if (eVar.f489886g) {
            eVar.i();
        }
        if (!c10726x5870354e.f149755n) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxBaseImageView", "hasReportPerformance can't report");
        } else {
            if (c10726x5870354e.f149764w) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxBaseImageView", "hasReportPerformance and return");
                return;
            }
            if (c10726x5870354e.f149766y == null) {
                c10726x5870354e.f149766y = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("WxBaseImageViewReport");
            }
            c10726x5870354e.f149766y.m77784x795fa299(new uj0.b(c10726x5870354e));
        }
    }
}
