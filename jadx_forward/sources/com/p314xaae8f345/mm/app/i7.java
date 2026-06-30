package com.p314xaae8f345.mm.app;

/* loaded from: classes7.dex */
public class i7 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.d9 {

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f134993i;

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.d9
    public void a(android.content.Context context) {
        android.content.Context context2;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = this.f134993i;
        if (j0Var != null && j0Var.isShowing() && (context2 = this.f134993i.getContext()) != null) {
            if (context2 == context) {
                return;
            }
            if ((context2 instanceof android.content.ContextWrapper) && ((android.content.ContextWrapper) context2).getBaseContext() == context) {
                return;
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
        aVar.f293242a = this.f274070a;
        aVar.f293262s = this.f274071b;
        aVar.f293265v = this.f274072c;
        aVar.E = this.f274074e;
        aVar.f293266w = this.f274073d;
        aVar.A = true;
        aVar.B = false;
        aVar.F = this.f274075f;
        aVar.G = new com.p314xaae8f345.mm.app.h7(this);
        aVar.H = new com.p314xaae8f345.mm.app.g7(this);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        j0Var2.e(aVar);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
        if (d0Var != null) {
            d0Var.a(j0Var2.f293370r);
        }
        this.f134993i = j0Var2;
        j0Var2.show();
    }
}
