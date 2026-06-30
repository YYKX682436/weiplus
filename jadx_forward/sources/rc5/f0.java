package rc5;

/* loaded from: classes11.dex */
public class f0 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.db {
    public final jz5.g A;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f475690z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f475690z = jz5.h.b(new rc5.e0(this));
        this.A = jz5.h.b(new rc5.d0(activity, this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.db
    public int X6() {
        return (int) (((java.lang.Number) ((jz5.n) this.f475690z).mo141623x754a37bb()).intValue() * 0.8f);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.db
    public int e7(int i17) {
        return i17;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.db
    public boolean h7(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe headerComponent, com.p314xaae8f345.mm.ui.bc optionListener, yb5.d chattingContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(headerComponent, "headerComponent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(optionListener, "optionListener");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chattingContext, "chattingContext");
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.db, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        super.mo2284x57429eec();
    }
}
