package com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252;

/* loaded from: classes15.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f125880a;

    /* renamed from: b, reason: collision with root package name */
    public int f125881b;

    /* renamed from: c, reason: collision with root package name */
    public int f125882c;

    /* renamed from: d, reason: collision with root package name */
    public int f125883d;

    public l(android.view.View view) {
        this.f125880a = view;
    }

    public boolean a(int i17) {
        if (this.f125883d == i17) {
            return false;
        }
        this.f125883d = i17;
        b();
        return true;
    }

    public final void b() {
        int i17 = this.f125883d;
        android.view.View view = this.f125880a;
        int top = i17 - (view.getTop() - this.f125881b);
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.f125882c));
    }
}
