package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public final class r5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.s5 f272132d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.s5 s5Var) {
        super(0);
        this.f272132d = s5Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.s5 s5Var = this.f272132d;
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(s5Var.f()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569918rv, (android.view.ViewGroup) null);
        android.view.View decorView = s5Var.f().getWindow().getDecorView();
        android.view.ViewGroup viewGroup = decorView instanceof android.view.ViewGroup ? (android.view.ViewGroup) decorView : null;
        if (viewGroup != null) {
            viewGroup.addView(inflate);
        }
        return inflate;
    }
}
