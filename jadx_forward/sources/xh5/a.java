package xh5;

/* loaded from: classes3.dex */
public final class a extends lf3.n implements dg3.m {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // dg3.m
    public void Z0(mf3.k info, mf3.p apiCenter, dg3.q type) {
        android.view.View findViewById;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiCenter, "apiCenter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        int ordinal = type.ordinal();
        int i17 = ordinal != 0 ? ordinal != 1 ? ordinal != 9 ? -1 : com.p314xaae8f345.mm.R.id.dgu : com.p314xaae8f345.mm.R.id.d2y : com.p314xaae8f345.mm.R.id.ozx;
        if (m158354x19263085().isDestroyed() || m158354x19263085().isFinishing()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ChatMenuComponent", "performMenuClick " + type.f313885d + " error, activity is not valid");
            return;
        }
        if (i17 == -1 || (findViewById = m158354x19263085().findViewById(i17)) == null) {
            return;
        }
        findViewById.performClick();
    }

    @Override // dg3.m
    public void y6(mf3.k info, mf3.p apiCenter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiCenter, "apiCenter");
        if (m158354x19263085().isDestroyed() || m158354x19263085().isFinishing()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ChatMenuComponent", "showMenu error, activity is not valid");
            return;
        }
        android.view.View findViewById = m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.t1l);
        if (findViewById != null) {
            findViewById.performClick();
        }
    }
}
