package j00;

/* loaded from: classes9.dex */
public final class k implements com.p314xaae8f345.p3133xd0ce8b26.aff.ecs.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f378339a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f378340b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f378341c;

    public k(int i17, java.lang.String str, yz5.l lVar) {
        this.f378339a = i17;
        this.f378340b = str;
        this.f378341c = lVar;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.ecs.b
    /* renamed from: complete */
    public final void mo112314xdc453139() {
        java.lang.String a17 = b00.d.f98181a.a().a(this.f378339a, this.f378340b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftEntrancePreloadLogicNew", "fetchChatTicketAsync: ticket=".concat(a17));
        this.f378341c.mo146xb9724478(a17);
    }
}
