package com.google.android.material.appbar;

/* loaded from: classes15.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f44347a;

    /* renamed from: b, reason: collision with root package name */
    public int f44348b;

    /* renamed from: c, reason: collision with root package name */
    public int f44349c;

    /* renamed from: d, reason: collision with root package name */
    public int f44350d;

    public l(android.view.View view) {
        this.f44347a = view;
    }

    public boolean a(int i17) {
        if (this.f44350d == i17) {
            return false;
        }
        this.f44350d = i17;
        b();
        return true;
    }

    public final void b() {
        int i17 = this.f44350d;
        android.view.View view = this.f44347a;
        int top = i17 - (view.getTop() - this.f44348b);
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.f44349c));
    }
}
