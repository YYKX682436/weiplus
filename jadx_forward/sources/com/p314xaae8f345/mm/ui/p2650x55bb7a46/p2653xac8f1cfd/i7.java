package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes10.dex */
public final class i7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.l7 f280745d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.k7 f280746e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.l7 l7Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.k7 k7Var) {
        super(0);
        this.f280745d = l7Var;
        this.f280746e = k7Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.ViewGroup f17;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3 p17 = this.f280745d.f280113d.p();
        if (p17 == null || (f17 = p17.f()) == null) {
            return null;
        }
        f17.addOnLayoutChangeListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.h7(this.f280746e));
        return jz5.f0.f384359a;
    }
}
