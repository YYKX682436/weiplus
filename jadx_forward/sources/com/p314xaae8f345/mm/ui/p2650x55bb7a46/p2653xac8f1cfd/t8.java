package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public final class t8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y8 f281504d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t8(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y8 y8Var) {
        super(0);
        this.f281504d = y8Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y8 y8Var = this.f281504d;
        android.text.TextWatcher textWatcher = y8Var.A;
        if (textWatcher != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 E0 = y8Var.E0();
            if (E0 != null) {
                E0.removeTextChangedListener(textWatcher);
            }
            y8Var.A = null;
        }
        y8Var.f281838z = null;
        if (com.p314xaae8f345.mm.p2470x93e71c27.ui.C19651x7fe9d32.f271353y.a() != 2) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y8.n0(y8Var);
        }
        return jz5.f0.f384359a;
    }
}
