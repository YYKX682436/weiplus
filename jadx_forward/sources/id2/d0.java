package id2;

/* loaded from: classes3.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ id2.v1 f372058d;

    public d0(id2.v1 v1Var) {
        this.f372058d = v1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        id2.v1 v1Var = this.f372058d;
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) v1Var.f372371h).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(textView, "access$getGiftTotalPrice(...)");
        int i17 = pm0.v.t(textView)[1];
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22843x6b8c5570 T6 = v1Var.T6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(T6, "access$getGiftRv(...)");
        v1Var.T6().m82895x25bfb969((i17 - i65.a.h(v1Var.m80379x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs)) - pm0.v.t(T6)[1]);
        v1Var.T6().invalidate();
        pq5.g l17 = new ek2.z(id2.v1.R, id2.v1.Q, id2.v1.T, xy2.c.e(v1Var.m80379x76847179()), 0, id2.v1.P, id2.v1.S, 1, null, null, null, 1792, null).l();
        l17.K(new id2.g1(v1Var));
        if (v1Var.m158354x19263085() == null || !(v1Var.m158354x19263085() instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf)) {
            return;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = v1Var.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        l17.f((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085);
    }
}
