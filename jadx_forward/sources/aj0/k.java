package aj0;

/* loaded from: classes11.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aj0.l f86788d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f86789e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(aj0.l lVar, long j17) {
        super(0);
        this.f86788d = lVar;
        this.f86789e = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        aj0.l lVar = this.f86788d;
        boolean A = ((p3325xe03a0797.p3326xc267989b.c3) lVar.f86800k).A();
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (!A) {
            io.p3284xd2ae381c.Log.i(lVar.f86794e, "pre render next frame displayed, cost:" + (java.lang.System.currentTimeMillis() - this.f86789e));
            ((p3325xe03a0797.p3326xc267989b.u2) lVar.f86800k).U(f0Var);
            yz5.a aVar = lVar.f86801l;
            if (aVar != null) {
                aVar.mo152xb9724478();
            }
        }
        return f0Var;
    }
}
