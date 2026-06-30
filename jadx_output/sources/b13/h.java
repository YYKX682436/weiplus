package b13;

/* loaded from: classes14.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b13.m f17105d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dr4.p1 f17106e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(b13.m mVar, dr4.p1 p1Var) {
        super(0);
        this.f17105d = mVar;
        this.f17106e = p1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipMgr", "gl init done");
        boolean z17 = this.f17106e.f242711j;
        b13.m mVar = this.f17105d;
        mVar.C1 = z17;
        mVar.G0();
        return jz5.f0.f302826a;
    }
}
