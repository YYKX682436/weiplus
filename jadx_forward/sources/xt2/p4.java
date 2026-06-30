package xt2;

/* loaded from: classes3.dex */
public final class p4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xt2.b5 f538485d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xt2.r4 f538486e;

    public p4(xt2.b5 b5Var, xt2.r4 r4Var) {
        this.f538485d = b5Var;
        this.f538486e = r4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = this.f538485d.f538171m;
        if (viewOnClickListenerC22631x1cc07cc8 != null) {
            viewOnClickListenerC22631x1cc07cc8.m81396xb3e0a10a(this.f538486e);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("productReplaySwitchBtn");
            throw null;
        }
    }
}
