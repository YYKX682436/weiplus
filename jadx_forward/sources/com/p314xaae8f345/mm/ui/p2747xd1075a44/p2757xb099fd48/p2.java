package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48;

/* loaded from: classes12.dex */
public abstract class p2 {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w2 f293478a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.CharSequence f293479b;

    /* renamed from: c, reason: collision with root package name */
    public int f293480c;

    public p2(java.lang.CharSequence charSequence, int i17) {
        this.f293479b = charSequence == null ? c(i17) : charSequence;
        this.f293480c = i17;
    }

    public abstract int a();

    public java.lang.CharSequence b(int i17) {
        return null;
    }

    public abstract java.lang.CharSequence c(int i17);

    public boolean d(int i17) {
        this.f293480c = i17;
        this.f293479b = c(i17);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w2 w2Var = this.f293478a;
        if (w2Var == null) {
            return true;
        }
        w2Var.a(this);
        return true;
    }
}
