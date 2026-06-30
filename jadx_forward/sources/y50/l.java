package y50;

/* loaded from: classes3.dex */
public final /* synthetic */ class l extends p3321xbce91901.jvm.p3324x21ffc6bd.m implements yz5.p {
    public l(java.lang.Object obj) {
        super(2, obj, y50.m.class, "setStatusBarColorCompat", "setStatusBarColorCompat(Lcom/tencent/mm/ui/MMActivity;I)V", 0);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf p07 = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        ((y50.m) this.f72685xcfcbe9ef).getClass();
        if (p07 instanceof com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37) {
            android.app.Activity m81186xd24c19fa = ((com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37) p07).m81186xd24c19fa();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m81186xd24c19fa, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m81186xd24c19fa).m78565x45496f5a(intValue);
        } else {
            p07.m78565x45496f5a(intValue);
        }
        return jz5.f0.f384359a;
    }
}
