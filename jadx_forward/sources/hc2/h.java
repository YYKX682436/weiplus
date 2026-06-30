package hc2;

/* loaded from: classes8.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f361860d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.k41 f361861e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.app.Activity activity, r45.k41 k41Var) {
        super(1);
        this.f361860d = activity;
        this.f361861e = k41Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderExt", "jumpLiteApp result:" + booleanValue);
        android.app.Activity activity = this.f361860d;
        if (booleanValue) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new nf.d(new hc2.f(activity)), 800L);
        } else {
            hc2.i.f(activity, this.f361861e.m75945x2fec8307(3));
        }
        return jz5.f0.f384359a;
    }
}
