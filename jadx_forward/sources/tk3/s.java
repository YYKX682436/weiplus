package tk3;

/* loaded from: classes8.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tk3.t f501478d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f501479e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(tk3.t tVar, long j17) {
        super(0);
        this.f501478d = tVar;
        this.f501479e = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        tk3.t tVar = this.f501478d;
        if (!tVar.p()) {
            long j17 = this.f501479e;
            if (1 <= j17 && j17 <= tVar.o()) {
                tVar.l();
                tk3.t.t(this.f501478d, new com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c(), null, false, 4, null);
                tVar.r(j17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskNewUIManager", "tryAttachFloatBallContainer timeLeft: " + j17);
            }
        }
        return jz5.f0.f384359a;
    }
}
