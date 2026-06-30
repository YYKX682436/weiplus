package c61;

/* loaded from: classes11.dex */
public final class z9 implements kv.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f120984a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f120985b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f120986c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f120987d;

    public z9(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, java.lang.String str, boolean z17, p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f120984a = c0Var;
        this.f120985b = str;
        this.f120986c = z17;
        this.f120987d = qVar;
    }

    @Override // kv.g0
    public final int a(int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f120984a;
        if (!c0Var.f391645d) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.p314xaae8f345.mm.p943x351df9c2.z Ai = com.p314xaae8f345.mm.p943x351df9c2.d1.Ai();
            java.lang.String str = this.f120985b;
            java.lang.String j17 = Ai.j(str, this.f120986c);
            p3325xe03a0797.p3326xc267989b.q qVar = this.f120987d;
            if (i17 != 0 || i18 != 0) {
                c0Var.f391645d = true;
                c61.a aVar = new c61.a(i17, i18, "Unable to get avatar type:" + i17 + ", code:" + i18 + " for " + str);
                p3325xe03a0797.p3326xc267989b.r rVar = (p3325xe03a0797.p3326xc267989b.r) qVar;
                rVar.getClass();
                p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.l0 w17 = rVar.w(new p3325xe03a0797.p3326xc267989b.e0(aVar, false, 2, null), null, null);
                if (w17 != null) {
                    rVar.e(w17);
                }
            }
            if (com.p314xaae8f345.mm.vfs.w6.j(j17)) {
                c0Var.f391645d = true;
                p3325xe03a0797.p3326xc267989b.r rVar2 = (p3325xe03a0797.p3326xc267989b.r) qVar;
                p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.l0 w18 = rVar2.w(j17, null, null);
                if (w18 != null) {
                    rVar2.e(w18);
                }
            }
        }
        return 0;
    }
}
