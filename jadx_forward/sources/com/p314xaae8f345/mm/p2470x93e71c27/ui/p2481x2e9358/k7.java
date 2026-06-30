package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public final class k7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.c8 f271982d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.c8 c8Var) {
        super(0);
        this.f271982d = c8Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.c8 c8Var = this.f271982d;
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(c8Var.f()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569918rv, (android.view.ViewGroup) null);
        android.view.View decorView = c8Var.e().f542250l.m78395x3622fee6().getDecorView();
        android.view.ViewGroup viewGroup = decorView instanceof android.view.ViewGroup ? (android.view.ViewGroup) decorView : null;
        if (viewGroup != null) {
            viewGroup.addView(inflate);
        }
        return inflate;
    }
}
