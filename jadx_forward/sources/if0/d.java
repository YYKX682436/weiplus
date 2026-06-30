package if0;

/* loaded from: classes16.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ if0.k f372552d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(if0.k kVar) {
        super(0);
        this.f372552d = kVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        if0.k kVar = this.f372552d;
        long j17 = kVar.f372561a.f445850c;
        if (j17 > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(kVar.d(), "startDelayRelease:" + j17 + ", deepBackground");
            pm0.v.X(new if0.j(kVar, 100, j17));
        }
        return jz5.f0.f384359a;
    }
}
