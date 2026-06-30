package e04;

/* loaded from: classes5.dex */
public final class z0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f327700d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f327701e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(yz5.a aVar, long j17) {
        super(0);
        this.f327700d = aVar;
        this.f327701e = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        yz5.a aVar = this.f327700d;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanCameraErrorHelper", "checkShowCameraOpenFailView doShow: " + this.f327701e);
        e04.a1.a(e04.y0.f327691g, java.lang.System.currentTimeMillis());
        return jz5.f0.f384359a;
    }
}
