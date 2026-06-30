package es2;

/* loaded from: classes2.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f337932d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ es2.h0 f337933e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(long j17, es2.h0 h0Var) {
        super(1);
        this.f337932d = j17;
        this.f337933e = h0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        cs2.p it = (cs2.p) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        long j17 = it.f303622f2;
        long j18 = this.f337932d;
        boolean z17 = j17 == j18;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f337933e.f337908h, "cancel remove waiting feed:".concat(pm0.v.u(j18)));
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
