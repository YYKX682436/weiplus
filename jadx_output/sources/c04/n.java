package c04;

/* loaded from: classes13.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.scangoods.widget.ScanGoodsMaskView f37684d;

    public n(com.tencent.mm.plugin.scanner.ui.scangoods.widget.ScanGoodsMaskView scanGoodsMaskView) {
        this.f37684d = scanGoodsMaskView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.scanner.ui.scangoods.widget.ScanGoodsMaskView scanGoodsMaskView = this.f37684d;
        if (scanGoodsMaskView.E) {
            android.widget.LinearLayout linearLayout = scanGoodsMaskView.I;
            if (linearLayout == null) {
                kotlin.jvm.internal.o.o("customTipsImageContainer");
                throw null;
            }
            if (linearLayout.getVisibility() == 0) {
                android.widget.LinearLayout linearLayout2 = scanGoodsMaskView.I;
                if (linearLayout2 == null) {
                    kotlin.jvm.internal.o.o("customTipsImageContainer");
                    throw null;
                }
                u3.u uVar = new u3.u(linearLayout2, u3.s.f424217l);
                uVar.f424225a = 4000.0f;
                u3.v vVar = new u3.v(0.0f);
                vVar.b(3000.0f);
                vVar.a(0.05f);
                uVar.f424236t = vVar;
                uVar.f424226b = -10.0f;
                uVar.f424227c = true;
                uVar.e();
                scanGoodsMaskView.f159646z1 = uVar;
            }
        }
    }
}
