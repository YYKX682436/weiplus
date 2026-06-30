package yn1;

/* loaded from: classes11.dex */
public final class f3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yn1.a4 f545200d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f545201e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f545202f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(yn1.a4 a4Var, long j17, long j18) {
        super(1);
        this.f545200d = a4Var;
        this.f545201e = j17;
        this.f545202f = j18;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        yn1.a4 a4Var = this.f545200d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a4Var.f545139a, "[getChatPackageAsync] Task is cancelled, taskId=" + this.f545201e);
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.a aVar = a4Var.f545142d;
        if (aVar != null) {
            aVar.a(this.f545201e, true, this.f545202f, new bw5.w0());
        }
        return jz5.f0.f384359a;
    }
}
