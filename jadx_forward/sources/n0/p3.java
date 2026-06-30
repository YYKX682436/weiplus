package n0;

/* loaded from: classes14.dex */
public final class p3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.b4 f415204d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(n0.b4 b4Var) {
        super(0);
        this.f415204d = b4Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        p3325xe03a0797.p3326xc267989b.q s17;
        n0.b4 b4Var = this.f415204d;
        synchronized (b4Var.f414980d) {
            s17 = b4Var.s();
            if (((n0.o3) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) b4Var.f414991o).mo144003x754a37bb()).compareTo(n0.o3.ShuttingDown) <= 0) {
                throw p3325xe03a0797.p3326xc267989b.e2.a("Recomposer shutdown; frame clock awaiter will never resume", b4Var.f414982f);
            }
        }
        if (s17 != null) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            ((p3325xe03a0797.p3326xc267989b.r) s17).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a));
        }
        return jz5.f0.f384359a;
    }
}
