package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes13.dex */
public final class j9 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements yn.e, p012xc85e97e9.p093xedfae76a.y {

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.List f280792g = kz5.c0.i(new xn5.c0("com.tencent.mm.ui.base.EllipsizeTextView", null, 5, null, 10, null), new xn5.c0("com.tencent.mm.ui.widget.MMPinProgressBtn", null, 20, null, 10, null), new xn5.c0("com.tencent.mm.ui.widget.MMTextView", null, 20, null, 10, null), new xn5.c0("com.tencent.mm.ui.MMImageView", null, 20, null, 10, null), new xn5.c0("com.tencent.mm.ui.chatting.view.ChattingAvatarImageView", null, 20, null, 10, null), new xn5.c0("com.tencent.mm.ui.base.MaskLayout", null, 20, null, 10, null), new xn5.c0("com.tencent.mm.ui.base.AnimImageView", null, 20, null, 10, null));

    /* renamed from: e, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.b0 f280793e = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.i9(this);

    /* renamed from: f, reason: collision with root package name */
    public boolean f280794f = true;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hg
    public void I() {
        super.I();
        this.f280793e.i(p012xc85e97e9.p093xedfae76a.n.DESTROYED);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hg
    public void L(yb5.d context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p012xc85e97e9.p093xedfae76a.b0 b0Var = this.f280793e;
        b0Var.i(p012xc85e97e9.p093xedfae76a.n.INITIALIZED);
        b0Var.i(p012xc85e97e9.p093xedfae76a.n.CREATED);
        for (xn5.c0 cache : f280792g) {
            if (xn5.q0.f537235a.b().a() != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cache, "cache");
                pm0.v.N("X2C_VIEW_THREAD", false, new xn5.p1(cache, this));
            }
        }
        if (xn5.q0.f537235a.b().a() != null) {
            pm0.v.N("X2C_VIEW_THREAD", false, xn5.m1.f537229d);
        }
        super.L(context);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void a() {
        if (this.f280794f) {
            xn5.z b17 = xn5.q0.f537235a.b().b();
            android.app.Activity g17 = this.f280113d.g();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getContext(...)");
            b17.d(g17, this, "ChattingFragment");
            this.f280794f = false;
        }
    }

    @Override // p012xc85e97e9.p093xedfae76a.y
    /* renamed from: getLifecycle */
    public p012xc85e97e9.p093xedfae76a.o mo273xed6858b4() {
        return this.f280793e;
    }
}
