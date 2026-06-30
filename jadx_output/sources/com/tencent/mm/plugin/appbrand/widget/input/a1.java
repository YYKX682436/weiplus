package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public class a1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.d1 f91278d;

    public a1(com.tencent.mm.plugin.appbrand.widget.input.d1 d1Var) {
        this.f91278d = d1Var;
    }

    public final int a() {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f91278d.f91389e;
        android.widget.FrameLayout pageArea = !v5Var.isRunning() ? null : v5Var.getPageArea();
        if (pageArea != null) {
            return pageArea.getScrollY();
        }
        return 0;
    }

    public final void b(com.tencent.mm.plugin.appbrand.widget.input.p4 p4Var, int i17) {
        com.tencent.mm.plugin.appbrand.widget.input.d1 d1Var = this.f91278d;
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandInputPageOffsetHelper", "sendKeyboardEvent: %b", java.lang.Boolean.valueOf(d1Var.f91393i));
        if (d1Var.f91393i) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.widget.input.z0(this, p4Var, i17));
        }
    }

    public final void c(int i17) {
        com.tencent.mm.plugin.appbrand.widget.input.d1 d1Var = this.f91278d;
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = d1Var.f91389e;
        android.widget.FrameLayout pageArea = !v5Var.isRunning() ? null : v5Var.getPageArea();
        if (pageArea != null) {
            pageArea.scrollTo(0, i17);
            java.lang.Object obj = d1Var.f91388d;
            if (((x.n) obj).f450846f <= 0) {
                return;
            }
            for (com.tencent.mm.plugin.appbrand.widget.input.b1 b1Var : (com.tencent.mm.plugin.appbrand.widget.input.b1[]) ((x.b) obj).keySet().toArray(new com.tencent.mm.plugin.appbrand.widget.input.b1[((x.n) obj).f450846f])) {
                com.tencent.mm.plugin.appbrand.widget.input.autofill.o oVar = ((com.tencent.mm.plugin.appbrand.widget.input.autofill.l) b1Var).f91344a;
                oVar.f91352e = Integer.MIN_VALUE;
                oVar.b(3);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public void run() {
        android.view.View contentView;
        android.view.View contentView2;
        com.tencent.mm.plugin.appbrand.widget.input.d1 d1Var = this.f91278d;
        com.tencent.mm.plugin.appbrand.widget.input.p4 b17 = com.tencent.mm.plugin.appbrand.widget.input.r1.b(d1Var.f91389e);
        if (b17 == null) {
            d1Var.g();
            return;
        }
        if (!d1Var.f91389e.isRunning()) {
            d1Var.g();
            return;
        }
        d1Var.f91396o = 0;
        if (b17.getInputPanel() == null || b17.h() == null) {
            d1Var.g();
            return;
        }
        android.widget.EditText h17 = b17.h();
        android.view.View inputPanel = b17.getInputPanel();
        if (com.tencent.mm.plugin.appbrand.utils.f5.c(inputPanel)) {
            b(b17, 0);
            d1Var.g();
            return;
        }
        if (((com.tencent.mm.plugin.appbrand.widget.input.u4) inputPanel).q()) {
            d1Var.f91391g = 0;
            inputPanel.getHeight();
        } else {
            inputPanel.getHeight();
            int i17 = d1Var.f91391g + 1;
            d1Var.f91391g = i17;
            if (i17 < 5) {
                d1Var.f(false);
                return;
            }
        }
        b(b17, inputPanel.getHeight());
        if (!b17.i()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandInputPageOffsetHelper", "[scrollUp] beginOffset, no need adjust position, notify height %d", java.lang.Integer.valueOf(inputPanel.getHeight()));
            d1Var.g();
            return;
        }
        boolean z17 = d1Var.f91389e.getWindowAndroid() instanceof com.tencent.mm.plugin.appbrand.platform.window.activity.r0;
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = d1Var.f91389e;
        if (z17 && v5Var.S()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandInputPageOffsetHelper", "[scrollUp] beginOffset, in landscape skip adjust position, notify height %d", java.lang.Integer.valueOf(inputPanel.getHeight()));
            d1Var.g();
            return;
        }
        int[] iArr = new int[2];
        h17.getLocationOnScreen(iArr);
        int i18 = iArr[1];
        h17.getHeight();
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.x0.b(h17);
        ((android.view.WindowManager) v5Var.getContentView().getContext().getSystemService("window")).getDefaultDisplay().getSize(new android.graphics.Point());
        int height = h17.getHeight() + i18;
        inputPanel.getLocationOnScreen(iArr);
        int i19 = iArr[1];
        java.lang.String adjustKeyboardTo = h17 instanceof com.tencent.mm.plugin.appbrand.widget.input.a2 ? ((com.tencent.mm.plugin.appbrand.widget.input.a2) h17).getAdjustKeyboardTo() : null;
        com.tencent.mm.plugin.appbrand.widget.input.t4 t4Var = (com.tencent.mm.plugin.appbrand.widget.input.t4) h17;
        if (t4Var.e() && h17.getLayout() != null && !"bottom".equals(adjustKeyboardTo)) {
            int scrollY = h17.getScrollY();
            com.tencent.mm.plugin.appbrand.widget.input.e4 e4Var = (com.tencent.mm.plugin.appbrand.widget.input.e4) t4Var;
            int l17 = (e4Var.l(h17.getLayout().getLineForOffset(h17.getSelectionStart())) + i18) - scrollY;
            int l18 = (e4Var.l(h17.getLayout().getLineForOffset(h17.getSelectionStart()) + 1) + i18) - scrollY;
            if (l17 - i18 >= h17.getHeight()) {
                l17 = height - h17.getLineHeight();
            }
            if (l18 - i18 < h17.getHeight()) {
                height = l18;
            }
            i18 = l17;
        }
        if (!v5Var.S()) {
            height += b17.b();
        }
        if (i19 == height) {
            d1Var.g();
            return;
        }
        int i27 = d1Var.f91390f;
        if (i18 < i27) {
            com.tencent.mm.plugin.appbrand.page.fb a27 = v5Var.a2();
            if (a27 != null && (contentView2 = a27.getContentView()) != null) {
                contentView2.scrollBy(contentView2.getScrollX(), -(a27.getWebScrollY() - h17.getTop()));
            }
            d1Var.g();
            return;
        }
        int max = java.lang.Math.max(-a(), java.lang.Math.min(height - i19, i18 - i27));
        com.tencent.mm.plugin.appbrand.page.fb a28 = v5Var.a2();
        if (a28 != null && (contentView = a28.getContentView()) != null) {
            if (t4Var.d()) {
                c(max + a());
            } else {
                int height2 = a28.getHeight();
                int webScrollY = a28.getWebScrollY();
                int c17 = ik1.w.c(a28.getContentHeight());
                int height3 = h17.getHeight();
                h17.getTop();
                if (t4Var.e() || (h17.getTop() + height3) - webScrollY > height2) {
                    int max2 = java.lang.Math.max(0, java.lang.Math.min((c17 - webScrollY) - height2, max));
                    contentView.scrollBy(contentView.getScrollX(), max2);
                    d1Var.f91396o = max2;
                    c((max - max2) + a());
                } else {
                    c(max + a());
                }
            }
        }
        d1Var.g();
    }
}
