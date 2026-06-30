package n0;

/* loaded from: classes14.dex */
public final class w3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.b4 f415273d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(n0.b4 b4Var) {
        super(2);
        this.f415273d = b4Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        p3325xe03a0797.p3326xc267989b.q qVar;
        java.util.Set changed = (java.util.Set) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(changed, "changed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g((x0.m) obj2, "<anonymous parameter 1>");
        n0.b4 b4Var = this.f415273d;
        synchronized (b4Var.f414980d) {
            if (((n0.o3) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) b4Var.f414991o).mo144003x754a37bb()).compareTo(n0.o3.Idle) >= 0) {
                ((java.util.ArrayList) b4Var.f414984h).add(changed);
                qVar = b4Var.s();
            } else {
                qVar = null;
            }
        }
        if (qVar != null) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a));
        }
        return jz5.f0.f384359a;
    }
}
