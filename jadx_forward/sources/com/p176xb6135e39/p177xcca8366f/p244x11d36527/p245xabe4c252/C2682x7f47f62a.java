package com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.appbar.ViewOffsetBehavior */
/* loaded from: classes15.dex */
public class C2682x7f47f62a<V extends android.view.View> extends p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior<V> {

    /* renamed from: d, reason: collision with root package name */
    public com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.l f125868d;

    /* renamed from: e, reason: collision with root package name */
    public int f125869e;

    public C2682x7f47f62a() {
        this.f125869e = 0;
    }

    public void A(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, int i17) {
        c1081xa22a3e5a.s(view, i17);
    }

    public boolean B(int i17) {
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.l lVar = this.f125868d;
        if (lVar != null) {
            return lVar.a(i17);
        }
        this.f125869e = i17;
        return false;
    }

    @Override // p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
    public boolean g(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, int i17) {
        A(c1081xa22a3e5a, view, i17);
        if (this.f125868d == null) {
            this.f125868d = new com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.l(view);
        }
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.l lVar = this.f125868d;
        android.view.View view2 = lVar.f125880a;
        lVar.f125881b = view2.getTop();
        lVar.f125882c = view2.getLeft();
        lVar.b();
        int i18 = this.f125869e;
        if (i18 == 0) {
            return true;
        }
        this.f125868d.a(i18);
        this.f125869e = 0;
        return true;
    }

    public int y() {
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.l lVar = this.f125868d;
        if (lVar != null) {
            return lVar.f125883d;
        }
        return 0;
    }

    public int z() {
        return y();
    }

    public C2682x7f47f62a(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f125869e = 0;
    }
}
