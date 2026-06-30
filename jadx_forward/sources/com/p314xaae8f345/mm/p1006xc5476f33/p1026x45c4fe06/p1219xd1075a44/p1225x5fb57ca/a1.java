package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

/* loaded from: classes7.dex */
public class a1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.d1 f172811d;

    public a1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.d1 d1Var) {
        this.f172811d = d1Var;
    }

    public final int a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f172811d.f172922e;
        android.widget.FrameLayout mo51313xaf0c0532 = !v5Var.mo50262x39e05d35() ? null : v5Var.mo51313xaf0c0532();
        if (mo51313xaf0c0532 != null) {
            return mo51313xaf0c0532.getScrollY();
        }
        return 0;
    }

    public final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p4 p4Var, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.d1 d1Var = this.f172811d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandInputPageOffsetHelper", "sendKeyboardEvent: %b", java.lang.Boolean.valueOf(d1Var.f172926i));
        if (d1Var.f172926i) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.z0(this, p4Var, i17));
        }
    }

    public final void c(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.d1 d1Var = this.f172811d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = d1Var.f172922e;
        android.widget.FrameLayout mo51313xaf0c0532 = !v5Var.mo50262x39e05d35() ? null : v5Var.mo51313xaf0c0532();
        if (mo51313xaf0c0532 != null) {
            mo51313xaf0c0532.scrollTo(0, i17);
            java.lang.Object obj = d1Var.f172921d;
            if (((x.n) obj).f532379f <= 0) {
                return;
            }
            for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.b1 b1Var : (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.b1[]) ((x.b) obj).keySet().toArray(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.b1[((x.n) obj).f532379f])) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.o oVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.l) b1Var).f172877a;
                oVar.f172885e = Integer.MIN_VALUE;
                oVar.b(3);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public void run() {
        android.view.View mo14662xc2a54588;
        android.view.View mo14662xc2a545882;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.d1 d1Var = this.f172811d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p4 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.r1.b(d1Var.f172922e);
        if (b17 == null) {
            d1Var.g();
            return;
        }
        if (!d1Var.f172922e.mo50262x39e05d35()) {
            d1Var.g();
            return;
        }
        d1Var.f172929o = 0;
        if (b17.mo53483x400bc850() == null || b17.h() == null) {
            d1Var.g();
            return;
        }
        android.widget.EditText h17 = b17.h();
        android.view.View mo53483x400bc850 = b17.mo53483x400bc850();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f5.c(mo53483x400bc850)) {
            b(b17, 0);
            d1Var.g();
            return;
        }
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u4) mo53483x400bc850).q()) {
            d1Var.f172924g = 0;
            mo53483x400bc850.getHeight();
        } else {
            mo53483x400bc850.getHeight();
            int i17 = d1Var.f172924g + 1;
            d1Var.f172924g = i17;
            if (i17 < 5) {
                d1Var.f(false);
                return;
            }
        }
        b(b17, mo53483x400bc850.getHeight());
        if (!b17.i()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandInputPageOffsetHelper", "[scrollUp] beginOffset, no need adjust position, notify height %d", java.lang.Integer.valueOf(mo53483x400bc850.getHeight()));
            d1Var.g();
            return;
        }
        boolean z17 = d1Var.f172922e.mo50261xee5260a9() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.r0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = d1Var.f172922e;
        if (z17 && v5Var.S()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandInputPageOffsetHelper", "[scrollUp] beginOffset, in landscape skip adjust position, notify height %d", java.lang.Integer.valueOf(mo53483x400bc850.getHeight()));
            d1Var.g();
            return;
        }
        int[] iArr = new int[2];
        h17.getLocationOnScreen(iArr);
        int i18 = iArr[1];
        h17.getHeight();
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.x0.b(h17);
        ((android.view.WindowManager) v5Var.mo51310xc2a54588().getContext().getSystemService("window")).getDefaultDisplay().getSize(new android.graphics.Point());
        int height = h17.getHeight() + i18;
        mo53483x400bc850.getLocationOnScreen(iArr);
        int i19 = iArr[1];
        java.lang.String m53432xdb03b527 = h17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.a2 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.a2) h17).m53432xdb03b527() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.t4 t4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.t4) h17;
        if (t4Var.e() && h17.getLayout() != null && !"bottom".equals(m53432xdb03b527)) {
            int scrollY = h17.getScrollY();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4 e4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4) t4Var;
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
        int i27 = d1Var.f172923f;
        if (i18 < i27) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb a27 = v5Var.a2();
            if (a27 != null && (mo14662xc2a545882 = a27.mo14662xc2a54588()) != null) {
                mo14662xc2a545882.scrollBy(mo14662xc2a545882.getScrollX(), -(a27.mo14667x95a6d12e() - h17.getTop()));
            }
            d1Var.g();
            return;
        }
        int max = java.lang.Math.max(-a(), java.lang.Math.min(height - i19, i18 - i27));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb a28 = v5Var.a2();
        if (a28 != null && (mo14662xc2a54588 = a28.mo14662xc2a54588()) != null) {
            if (t4Var.d()) {
                c(max + a());
            } else {
                int mo14664x1c4fb41d = a28.mo14664x1c4fb41d();
                int mo14667x95a6d12e = a28.mo14667x95a6d12e();
                int c17 = ik1.w.c(a28.mo14661x964f6f4a());
                int height2 = h17.getHeight();
                h17.getTop();
                if (t4Var.e() || (h17.getTop() + height2) - mo14667x95a6d12e > mo14664x1c4fb41d) {
                    int max2 = java.lang.Math.max(0, java.lang.Math.min((c17 - mo14667x95a6d12e) - mo14664x1c4fb41d, max));
                    mo14662xc2a54588.scrollBy(mo14662xc2a54588.getScrollX(), max2);
                    d1Var.f172929o = max2;
                    c((max - max2) + a());
                } else {
                    c(max + a());
                }
            }
        }
        d1Var.g();
    }
}
