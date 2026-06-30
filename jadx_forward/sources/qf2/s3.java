package qf2;

/* loaded from: classes3.dex */
public final class s3 {

    /* renamed from: a, reason: collision with root package name */
    public xh2.a f444108a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f444109b;

    /* renamed from: c, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f444110c;

    /* renamed from: d, reason: collision with root package name */
    public qf2.a4 f444111d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f444112e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qf2.t3 f444113f;

    public s3(qf2.t3 t3Var, xh2.a data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f444113f = t3Var;
        this.f444108a = data;
        this.f444109b = "MicUserCounter_" + this.f444108a.b() + '_' + hashCode();
    }

    public final void a() {
        kn0.p pVar;
        long e17 = this.f444108a.f536054b.f536092k - c01.id.e();
        java.lang.String str = this.f444109b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onBind time duration: " + e17);
        if (e17 > 0) {
            qf2.t3 t3Var = this.f444113f;
            tn0.w0 Q6 = t3Var.f444123a.Q6();
            long j17 = Q6 != null && (pVar = Q6.D) != null && pVar.h() ? 0L : ((mm2.o4) t3Var.f444123a.m56788xbba4bfc0(mm2.o4.class)).V / 1000;
            int i17 = (int) (e17 + j17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "startCountDown duration: " + e17 + " delayOffest: " + j17 + " timeLeft: " + i17);
            qf2.a4 a4Var = this.f444111d;
            if (a4Var != null) {
                ((wj2.j0) a4Var).a(i17);
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
            f0Var.f391649d = i17;
            p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f444110c;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            qf2.q3 q3Var = t3Var.f444123a;
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            this.f444110c = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(q3Var, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new qf2.r3(f0Var, this, null), 2, null);
        }
    }
}
