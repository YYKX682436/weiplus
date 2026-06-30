package l83;

/* loaded from: classes12.dex */
public class j implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f398644d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l83.l f398645e;

    public j(l83.l lVar, boolean z17) {
        this.f398645e = lVar;
        this.f398644d = z17;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        boolean z17 = this.f398644d;
        l83.l lVar = this.f398645e;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallSensorManager", "light screen");
            l83.k kVar = lVar.f398650h;
            if (kVar != null) {
                ((l83.d) kVar).a(false);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallSensorManager", "off screen");
            l83.k kVar2 = lVar.f398650h;
            if (kVar2 != null) {
                ((l83.d) kVar2).a(true);
            }
        }
        return false;
    }
}
