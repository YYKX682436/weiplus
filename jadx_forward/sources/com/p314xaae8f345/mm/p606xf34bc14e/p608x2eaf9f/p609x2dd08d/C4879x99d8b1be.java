package com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\u0002J\b\u0010\u0015\u001a\u00020\nH\u0016R\u0014\u0010\u0017\u001a\u00020\u00168\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/tencent/mm/accessibility/core/area/AreaProvider;", "Lcom/tencent/mm/accessibility/core/provider/Provider;", "Landroid/view/View;", "view", "", "isDisExpand", "Ljz5/f0;", "defaultDealExpand", "", "findConfigRect", "", "dp", "getPx", "px", "getDp", "dealOnViewInflateAsync", "expand", "getDefaultViewExpand", "host", "Landroid/view/accessibility/AccessibilityNodeProvider;", "buildAccessibilityProvider", "getAuthority", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "plugin-autoaccessibility_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.accessibility.core.area.AreaProvider */
/* loaded from: classes14.dex */
public final class C4879x99d8b1be extends com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.AbstractC4922xc8fe6a11 {

    /* renamed from: $stable */
    public static final int f21090x3b2de05f = 0;

    /* renamed from: INSTANCE */
    public static final com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.C4879x99d8b1be f21091x4fbc8495 = new com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.C4879x99d8b1be();
    public static final java.lang.String TAG = "MicroMsg.Acc.AreaProvider";

    private C4879x99d8b1be() {
    }

    /* renamed from: defaultDealExpand */
    private final void m42521x28545b47(android.view.View view) {
        int[] m42529xdf2dd20a = m42529xdf2dd20a(view);
        if (m42529xdf2dd20a == null) {
            return;
        }
        m42654xbe97959d(TAG, view, "expand " + java.util.Arrays.toString(m42529xdf2dd20a) + " defaultDealExpand");
        com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.C4886xb72fa50e.f21113x4fbc8495.m42562xb328de9a(view, m42529xdf2dd20a[0], m42529xdf2dd20a[1], m42529xdf2dd20a[2], m42529xdf2dd20a[3]);
    }

    /* renamed from: findConfigRect */
    private final int[] m42522xf2279edf(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        m42652x1456a638(view, new com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.C4880x7163e1d2(view, h0Var));
        return (int[]) h0Var.f391656d;
    }

    /* renamed from: getDp */
    private final int m42523x5db1a82(int px6) {
        return i65.a.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, px6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getPx */
    public final int m42524x5db1bfe(int dp6) {
        return i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, dp6);
    }

    /* renamed from: isDisExpand */
    private final boolean m42525xc4e6ebe(android.view.View view) {
        return m42652x1456a638(view, new com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.C4881xdac5e365(view));
    }

    /* renamed from: buildAccessibilityProvider */
    public final android.view.accessibility.AccessibilityNodeProvider m42526xc7c67791(android.view.View host) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
        if (m42525xc4e6ebe(host) || !com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4966x1d004c03.f21354x4fbc8495.m42837xea442e8a()) {
            return null;
        }
        int[] m42522xf2279edf = m42522xf2279edf(host);
        if (m42522xf2279edf == null && (m42522xf2279edf = m42529xdf2dd20a(host)) == null) {
            return null;
        }
        return new com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.C4887x4d08a6c0(host, m42522xf2279edf[0], m42522xf2279edf[1], m42522xf2279edf[2], m42522xf2279edf[3]);
    }

    @Override // com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.AbstractC4922xc8fe6a11
    /* renamed from: dealOnViewInflateAsync */
    public void mo42527xf0a5585(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4966x1d004c03.f21354x4fbc8495.m42837xea442e8a()) {
            if (view.isClickable() || view.isLongClickable()) {
                m42528xb328de9a(view);
            }
        }
    }

    /* renamed from: expand */
    public final void m42528xb328de9a(android.view.View view) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (view.getVisibility() == 0 && !m42525xc4e6ebe(view)) {
            int[] m42522xf2279edf = m42522xf2279edf(view);
            if (m42522xf2279edf != null) {
                com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.C4886xb72fa50e.f21113x4fbc8495.m42562xb328de9a(view, m42522xf2279edf[0], m42522xf2279edf[1], m42522xf2279edf[2], m42522xf2279edf[3]);
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                m42521x28545b47(view);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.AbstractC4922xc8fe6a11
    /* renamed from: getAuthority */
    public int mo9976x5761788d() {
        return com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4966x1d004c03.f21354x4fbc8495.m42837xea442e8a() ? 2 : 0;
    }

    /* renamed from: getDefaultViewExpand */
    public final int[] m42529xdf2dd20a(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        android.graphics.Rect rect = new android.graphics.Rect();
        view.getHitRect(rect);
        int[] iArr = new int[4];
        for (int i17 = 0; i17 < 4; i17++) {
            iArr[i17] = 0;
        }
        int m42523x5db1a82 = m42523x5db1a82(rect.width());
        int m42523x5db1a822 = m42523x5db1a82(rect.height());
        if (m42523x5db1a82 < 44) {
            int i18 = (44 - m42523x5db1a82) / 2;
            iArr[0] = m42524x5db1bfe(i18);
            iArr[2] = m42524x5db1bfe(i18);
        }
        if (m42523x5db1a822 < 44) {
            int i19 = (44 - m42523x5db1a822) / 2;
            iArr[1] = m42524x5db1bfe(i19);
            iArr[3] = m42524x5db1bfe(i19);
        }
        for (int i27 = 0; i27 < 4; i27++) {
            if (iArr[i27] != 0) {
                return iArr;
            }
        }
        return null;
    }
}
