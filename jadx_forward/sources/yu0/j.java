package yu0;

/* loaded from: classes5.dex */
public final class j extends oz5.a implements p3325xe03a0797.p3326xc267989b.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yu0.m f547333d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p3325xe03a0797.p3326xc267989b.q0 q0Var, yu0.m mVar) {
        super(q0Var);
        this.f547333d = mVar;
    }

    @Override // p3325xe03a0797.p3326xc267989b.r0
    /* renamed from: handleException */
    public void mo565x9514ef07(oz5.l lVar, java.lang.Throwable th6) {
        this.f547333d.b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MJAudioTaskManager", "Error occurred: " + th6.getMessage(), th6);
    }
}
