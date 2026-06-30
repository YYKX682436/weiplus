package yn1;

/* loaded from: classes11.dex */
public final class y3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yn1.a4 f545463d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f545464e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(yn1.a4 a4Var, long j17) {
        super(1);
        this.f545463d = a4Var;
        this.f545464e = j17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        yn1.a4 a4Var = this.f545463d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(a4Var.f545139a, "[startBLEScanningAsync] coroutine cancelled");
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.a aVar = a4Var.f545142d;
        if (aVar != null) {
            aVar.x(this.f545464e, false);
        }
        return jz5.f0.f384359a;
    }
}
