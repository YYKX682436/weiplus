package n0;

/* loaded from: classes14.dex */
public final class m2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.n2 f415151d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f415152e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(n0.n2 n2Var, p3325xe03a0797.p3326xc267989b.q qVar) {
        super(1);
        this.f415151d = n2Var;
        this.f415152e = qVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        n0.n2 n2Var = this.f415151d;
        java.lang.Object obj2 = n2Var.f415155a;
        p3325xe03a0797.p3326xc267989b.q qVar = this.f415152e;
        synchronized (obj2) {
            n2Var.f415156b.remove(qVar);
        }
        return jz5.f0.f384359a;
    }
}
