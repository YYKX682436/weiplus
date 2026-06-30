package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48;

/* loaded from: classes9.dex */
public class i0 {

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f293353a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a f293354b = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f293355c;

    public i0(android.content.Context context) {
        this.f293353a = context;
    }

    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 a() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(this.f293353a, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = this.f293354b;
        j0Var.e(aVar);
        this.f293355c = j0Var;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
        if (d0Var != null) {
            d0Var.a(j0Var.f293370r);
        }
        return j0Var;
    }

    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 b(boolean z17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(this.f293353a, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = this.f293354b;
        j0Var.e(aVar);
        this.f293355c = j0Var;
        if (((java.lang.String) aVar.f293262s).length() > 0) {
            this.f293355c.f293366n.getPaint().setFakeBoldText(z17);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
        if (d0Var != null) {
            d0Var.a(j0Var.f293370r);
        }
        return j0Var;
    }

    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 c(java.lang.String str, java.lang.CharSequence charSequence, java.lang.Boolean bool, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f0 f0Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e0 e0Var) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = this.f293354b;
        aVar.f293250g = str;
        aVar.f293251h = charSequence;
        aVar.f293252i = bool.booleanValue();
        aVar.f293253j = f0Var;
        aVar.f293254k = e0Var;
        return this;
    }

    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 d(int i17) {
        this.f293354b.f293262s = of5.b.a(this.f293353a).getString(i17);
        return this;
    }

    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 e(int i17) {
        this.f293354b.f293266w = of5.b.a(this.f293353a).getString(i17);
        return this;
    }

    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 f(int i17) {
        this.f293354b.f293265v = of5.b.a(this.f293353a).getString(i17);
        return this;
    }

    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 g(int i17) {
        this.f293354b.f293242a = of5.b.a(this.f293353a).getString(i17);
        return this;
    }

    public void h() {
        a();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = this.f293355c;
        if (j0Var != null) {
            j0Var.show();
        }
    }
}
