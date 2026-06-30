package fv;

/* loaded from: classes16.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fv.k f348449d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(fv.k kVar) {
        super(0);
        this.f348449d = kVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        fv.k kVar = this.f348449d;
        if (!kVar.f348464d) {
            long j17 = kVar.f348461a.f445849b;
            if (j17 > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(kVar.d(), "startDelayRelease:" + j17 + ", background");
                pm0.v.X(new fv.j(kVar, 50, j17));
            }
        }
        return jz5.f0.f384359a;
    }
}
