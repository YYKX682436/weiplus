package ae;

/* loaded from: classes7.dex */
public class e implements com.tencent.mars.cdn.CronetLogic.CronetTaskNetworkStateCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ae.a f3351a;

    public e(ae.a aVar) {
        this.f3351a = aVar;
    }

    @Override // com.tencent.mars.cdn.CronetLogic.CronetTaskNetworkStateCallback
    public void onNetWeakChange(boolean z17) {
        be1.b.x(this.f3351a.F(), z17);
    }
}
