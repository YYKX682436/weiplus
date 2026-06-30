package com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252;

/* loaded from: classes15.dex */
public class j implements com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2679x5e425d5b f125876a;

    public j(com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2679x5e425d5b c2679x5e425d5b) {
        this.f125876a = c2679x5e425d5b;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.e
    public void a(com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c c2678xa407981c, int i17) {
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2679x5e425d5b c2679x5e425d5b = this.f125876a;
        c2679x5e425d5b.B = i17;
        n3.g3 g3Var = c2679x5e425d5b.C;
        int e17 = g3Var != null ? g3Var.e() : 0;
        int childCount = c2679x5e425d5b.getChildCount();
        for (int i18 = 0; i18 < childCount; i18++) {
            android.view.View childAt = c2679x5e425d5b.getChildAt(i18);
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2679x5e425d5b.LayoutParams layoutParams = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2679x5e425d5b.LayoutParams) childAt.getLayoutParams();
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.l b17 = com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2679x5e425d5b.b(childAt);
            int i19 = layoutParams.f125855a;
            if (i19 == 1) {
                b17.a(h3.a.b(-i17, 0, ((c2679x5e425d5b.getHeight() - com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2679x5e425d5b.b(childAt).f125881b) - childAt.getHeight()) - ((android.widget.FrameLayout.LayoutParams) ((com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2679x5e425d5b.LayoutParams) childAt.getLayoutParams())).bottomMargin));
            } else if (i19 == 2) {
                b17.a(java.lang.Math.round((-i17) * layoutParams.f125856b));
            }
        }
        c2679x5e425d5b.d();
        if (c2679x5e425d5b.f125849u != null && e17 > 0) {
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.u0.k(c2679x5e425d5b);
        }
        int height = c2679x5e425d5b.getHeight();
        java.util.WeakHashMap weakHashMap2 = n3.l1.f415895a;
        c2679x5e425d5b.f125845q.m(java.lang.Math.abs(i17) / ((height - n3.u0.d(c2679x5e425d5b)) - e17));
    }
}
