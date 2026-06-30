package un0;

/* loaded from: classes13.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p823x2eaf9f.p826x36756d.p827xe72625ab.ServiceC10832x7101a4bb f510879d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p823x2eaf9f.p826x36756d.p827xe72625ab.ServiceC10832x7101a4bb serviceC10832x7101a4bb) {
        super(0);
        this.f510879d = serviceC10832x7101a4bb;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenCastForegroundService", "#onRecorderDisconnectedCallback");
        this.f510879d.stopSelf();
        return jz5.f0.f384359a;
    }
}
