package im2;

/* loaded from: classes3.dex */
public abstract class w4 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
    }

    public final void O6() {
        if (m158354x19263085() instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085).m78583x85ccfe01(8);
        }
        m80379x76847179().getWindow().addFlags(2097280);
        m80379x76847179().getWindow().addFlags(67108864);
        m80379x76847179().getWindow().clearFlags(67108864);
        m80379x76847179().getWindow().getDecorView().setSystemUiVisibility(1280);
        m80379x76847179().getWindow().addFlags(Integer.MIN_VALUE);
        m80379x76847179().getWindow().setStatusBarColor(0);
        m80379x76847179().getWindow().setNavigationBarColor(0);
        m80379x76847179().getWindow().setFormat(-3);
        m80379x76847179().getWindow().setSoftInputMode(51);
    }
}
