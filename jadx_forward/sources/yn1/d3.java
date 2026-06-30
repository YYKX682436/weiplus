package yn1;

/* loaded from: classes11.dex */
public final class d3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yn1.a4 f545173d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f545174e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(yn1.a4 a4Var, long j17) {
        super(1);
        this.f545173d = a4Var;
        this.f545174e = j17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        yn1.a4 a4Var = this.f545173d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a4Var.f545139a, "[filterRestoreMediaAsync] Task is cancelled, taskId=" + this.f545174e);
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.a aVar = a4Var.f545142d;
        if (aVar != null) {
            aVar.m(this.f545174e, 0L, new java.util.ArrayList());
        }
        return jz5.f0.f384359a;
    }
}
