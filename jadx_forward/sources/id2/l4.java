package id2;

/* loaded from: classes8.dex */
public final class l4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ id2.s4 f372193d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(id2.s4 s4Var) {
        super(1);
        this.f372193d = s4Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        id2.s4 s4Var = this.f372193d;
        if (booleanValue) {
            dk2.ef.C = false;
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LIVE_RECENT_WATCH_SETTING_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = s4Var.f372329d;
            if (viewOnClickListenerC22631x1cc07cc8 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("switchBtn");
                throw null;
            }
            viewOnClickListenerC22631x1cc07cc8.m81392x52cfa5c6(false);
        } else {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc82 = s4Var.f372329d;
            if (viewOnClickListenerC22631x1cc07cc82 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("switchBtn");
                throw null;
            }
            viewOnClickListenerC22631x1cc07cc82.m81392x52cfa5c6(true);
        }
        return jz5.f0.f384359a;
    }
}
