package aw4;

/* loaded from: classes.dex */
public final class l0 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ db5.g3 f96430a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f96431b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tg0.h1 f96432c;

    public l0(db5.g3 g3Var, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, tg0.h1 h1Var) {
        this.f96430a = g3Var;
        this.f96431b = c0Var;
        this.f96432c = h1Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.q3
    /* renamed from: dismiss */
    public final void mo2069x63a3b28a() {
        db5.g3 g3Var = this.f96430a;
        if (g3Var.T || this.f96431b.f391645d) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).putBoolean("tophitory_show_init_dialog", false);
        tg0.h1 h1Var = this.f96432c;
        if (h1Var != null) {
            h1Var.a(g3Var.T);
        }
    }
}
