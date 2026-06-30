package j00;

/* loaded from: classes9.dex */
public final class w1 implements com.p314xaae8f345.p3133xd0ce8b26.aff.ecs.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f378459a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f378460b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c00.j3 f378461c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f378462d;

    public w1(boolean z17, boolean z18, c00.j3 j3Var, yz5.l lVar) {
        this.f378459a = z17;
        this.f378460b = z18;
        this.f378461c = j3Var;
        this.f378462d = lVar;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.ecs.b
    /* renamed from: complete */
    public final void mo112314xdc453139() {
        if (this.f378459a) {
            java.lang.String a17 = b00.d.f98181a.a().a(this.f378460b ? 1 : 0, this.f378461c.f118525a);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftService", "onExposureEnterSendGift preload after getTicket: ".concat(a17));
            this.f378462d.mo146xb9724478(a17);
        }
    }
}
