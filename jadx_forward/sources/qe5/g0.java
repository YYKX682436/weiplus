package qe5;

/* loaded from: classes12.dex */
public final class g0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f443646d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f443647e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qe5.m0 f443648f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(long j17, long j18, qe5.m0 m0Var) {
        super(0);
        this.f443646d = j17;
        this.f443647e = j18;
        this.f443648f = m0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        j75.f Q6;
        long j17 = this.f443646d;
        long j18 = this.f443647e;
        float f17 = j17 == 0 ? 0.0f : (((float) j18) * 100) / ((float) j17);
        qe5.m0 m0Var = this.f443648f;
        if (j18 < j17 && m0Var.Z6().v().getVisibility() != 0 && (Q6 = m0Var.Q6()) != null) {
            Q6.B3(new kd5.v(true));
        }
        m0Var.Z6().v().m82113x3ae760af((int) f17);
        return jz5.f0.f384359a;
    }
}
