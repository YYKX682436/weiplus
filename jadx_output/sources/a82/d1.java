package a82;

/* loaded from: classes12.dex */
public final class d1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f1984d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(long j17) {
        super(0);
        this.f1984d = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object obj;
        java.util.LinkedList list = a82.j1.f2046b.f374169d;
        kotlin.jvm.internal.o.f(list, "list");
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((r45.eb4) obj).f373216d == this.f1984d) {
                break;
            }
        }
        r45.eb4 eb4Var = (r45.eb4) obj;
        if (eb4Var != null) {
            eb4Var.C++;
            eb4Var.f373221i = 3;
            a82.j1.f2045a.j();
        }
        return jz5.f0.f302826a;
    }
}
