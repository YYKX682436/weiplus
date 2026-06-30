package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab;

/* loaded from: classes11.dex */
public class p0 implements com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.m0 f236039a;

    public p0(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.m0 m0Var) {
        this.f236039a = m0Var;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.e
    public void a(com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c c2678xa407981c, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.d1 d1Var;
        int m19973xa8f0dc02 = c2678xa407981c.m19973xa8f0dc02();
        int abs = java.lang.Math.abs(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.m0 m0Var = this.f236039a;
        if (m0Var.f235992n == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.m0.a(m0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.s4 s4Var = m0Var.f235997s;
        s4Var.getClass();
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.View view = s4Var.f236078a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type android.view.ViewGroup");
        s4Var.p().getDrawingRect(rect);
        ((android.view.ViewGroup) view).offsetDescendantRectToMyCoords(s4Var.p(), rect);
        if (rect.bottom < com.p314xaae8f345.mm.ui.bl.a(s4Var.f236086e)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.m0.b(m0Var, false);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.m0.b(m0Var, true);
        }
        int i18 = m0Var.T;
        if (i18 >= m19973xa8f0dc02 && abs < i18 && (d1Var = m0Var.H) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.C16892x4a36dc90 c16892x4a36dc90 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.d5) d1Var).f235807a;
            p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe = c16892x4a36dc90.A;
            if (c1190x18d3c3fe == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewPager");
                throw null;
            }
            int m8300xfda78ef6 = c1190x18d3c3fe.m8300xfda78ef6();
            p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe2 = c16892x4a36dc90.A;
            if (c1190x18d3c3fe2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewPager");
                throw null;
            }
            int m8300xfda78ef62 = c1190x18d3c3fe2.m8300xfda78ef6();
            java.util.List list = c16892x4a36dc90.f235755z;
            if (m8300xfda78ef62 <= ((java.util.ArrayList) list).size() - 1) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = ((java.util.ArrayList) list).iterator();
                while (it.hasNext()) {
                    java.lang.Object next = it.next();
                    if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b((p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) next, ((java.util.ArrayList) list).get(m8300xfda78ef6))) {
                        arrayList.add(next);
                    }
                }
                java.util.Iterator it6 = arrayList.iterator();
                while (it6.hasNext()) {
                    p012xc85e97e9.p093xedfae76a.m1 m1Var = (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) it6.next();
                    zy2.h5 h5Var = m1Var instanceof zy2.h5 ? (zy2.h5) m1Var : null;
                    if (h5Var != null) {
                        h5Var.P();
                    }
                }
            }
        }
        m0Var.T = abs;
    }
}
