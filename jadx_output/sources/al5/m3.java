package al5;

/* loaded from: classes15.dex */
public class m3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f5954d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ al5.n3 f5955e;

    public m3(al5.n3 n3Var, boolean z17) {
        this.f5955e = n3Var;
        this.f5954d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f5954d;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        al5.n3 n3Var = this.f5955e;
        com.tencent.mars.xlog.Log.i("MicroMsg.SwipeBackLayout", "on Complete, result %B, releaseLeft %d", valueOf, java.lang.Integer.valueOf(n3Var.f5966b));
        com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout = n3Var.f5968d;
        swipeBackLayout.f211438s = z17;
        if (!z17) {
            swipeBackLayout.f211441v = false;
        } else if (n3Var.f5966b > 0) {
            swipeBackLayout.e(0.0f);
        } else {
            swipeBackLayout.e(1.0f);
        }
        swipeBackLayout.d(z17);
        if (z17 && swipeBackLayout.f211442w) {
            int i17 = n3Var.f5966b;
            if (i17 == 0) {
                com.tencent.mm.ui.tools.l5.a(swipeBackLayout.f211431i, 200L, 0.0f, 0.0f, new al5.j3(this));
            } else {
                com.tencent.mm.ui.tools.l5.a(swipeBackLayout.f211431i, 200L, i17, 0.0f, new al5.l3(this));
                int i18 = n3Var.f5966b;
                if (!swipeBackLayout.f211432m.f291654y) {
                    al5.a3.a(true, i18, true);
                }
            }
        }
        swipeBackLayout.f211442w = false;
    }
}
