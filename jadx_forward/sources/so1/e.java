package so1;

/* loaded from: classes5.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ po1.d f491766d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f491767e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ro1.h f491768f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(po1.d dVar, boolean z17, ro1.h hVar) {
        super(0);
        this.f491766d = dVar;
        this.f491767e = z17;
        this.f491768f = hVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[addUDiskDevice] device=");
        po1.d dVar = this.f491766d;
        sb6.append(dVar);
        sb6.append(", isSuccess=");
        boolean z17 = this.f491767e;
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DirectDiskDeviceDelegate", sb6.toString());
        ro1.h hVar = this.f491768f;
        if (z17) {
            hVar.a(dVar.f438828a);
        } else {
            hVar.mo162785x428b6afc(-1);
        }
        return jz5.f0.f384359a;
    }
}
