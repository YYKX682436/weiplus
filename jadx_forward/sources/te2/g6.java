package te2;

/* loaded from: classes3.dex */
public final class g6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f499569d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f499570e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(java.lang.Integer num, te2.p8 p8Var) {
        super(1);
        this.f499569d = num;
        this.f499570e = p8Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.h32 it = (r45.h32) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("originSendType:");
        java.lang.Integer num = this.f499569d;
        sb6.append(num);
        sb6.append(" change send Type to: ");
        sb6.append(it.m75939xb282bd08(18));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNoticeQRCodeUIC", sb6.toString());
        int m75939xb282bd08 = it.m75939xb282bd08(18);
        if (num == null || num.intValue() != m75939xb282bd08) {
            te2.p8 p8Var = this.f499570e;
            te2.p8.n7(p8Var, 11, 0, 2, null);
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new te2.f6(p8Var, it, num, null), 3, null);
        }
        return jz5.f0.f384359a;
    }
}
