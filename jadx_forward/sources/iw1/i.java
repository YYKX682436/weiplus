package iw1;

/* loaded from: classes14.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f376746d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.f1 f376747e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p3325xe03a0797.p3326xc267989b.f1 f1Var) {
        super(1);
        this.f376746d = c0Var;
        this.f376747e = f1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean z17 = false;
        if (((java.lang.Throwable) obj) == null) {
            hw1.b bVar = (hw1.b) this.f376747e.f();
            if (!((bVar == null || bVar.f367033a) ? false : true)) {
                z17 = true;
            }
        }
        this.f376746d.f391645d = z17;
        return jz5.f0.f384359a;
    }
}
