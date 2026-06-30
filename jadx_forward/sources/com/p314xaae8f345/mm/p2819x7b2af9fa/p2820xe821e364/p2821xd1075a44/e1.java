package com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44;

/* loaded from: classes15.dex */
public class e1 implements com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.g1 f296039a;

    public e1(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.g1 g1Var) {
        this.f296039a = g1Var;
    }

    @Override // com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.h2
    public int a() {
        return this.f296039a.l();
    }

    @Override // com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.h2
    public int b() {
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.g1 g1Var = this.f296039a;
        return g1Var.f296065l - g1Var.m();
    }

    @Override // com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.h2
    public int c(android.view.View view) {
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.LayoutParams layoutParams = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.LayoutParams) view.getLayoutParams();
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.g1 g1Var = this.f296039a;
        g1Var.getClass();
        return (view.getLeft() - g1Var.j(view)) - ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
    }

    @Override // com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.h2
    public int d(android.view.View view) {
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.LayoutParams layoutParams = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.LayoutParams) view.getLayoutParams();
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.g1 g1Var = this.f296039a;
        g1Var.getClass();
        return view.getRight() + g1Var.p(view) + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
    }

    @Override // com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.h2
    /* renamed from: getChildAt */
    public android.view.View mo83633x6a486239(int i17) {
        return this.f296039a.g(i17);
    }
}
