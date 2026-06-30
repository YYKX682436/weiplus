package ug5;

/* loaded from: classes3.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2705xb436f21c.AbstractActivityC22405xf322b380 f509199d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.p314xaae8f345.mm.ui.p2705xb436f21c.AbstractActivityC22405xf322b380 abstractActivityC22405xf322b380) {
        super(1);
        this.f509199d = abstractActivityC22405xf322b380;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean z17;
        android.app.Activity activity = (android.app.Activity) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.ui.p2705xb436f21c.AbstractActivityC22405xf322b380 abstractActivityC22405xf322b380 = this.f509199d;
        if (abstractActivityC22405xf322b380.K6(activity)) {
            z17 = true;
            abstractActivityC22405xf322b380.f290142d = true;
        } else {
            z17 = false;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
