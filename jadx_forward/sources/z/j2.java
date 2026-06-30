package z;

/* loaded from: classes14.dex */
public final class j2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z.l2 f550241d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(z.l2 l2Var) {
        super(0);
        this.f550241d = l2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        z.l2 l2Var = this.f550241d;
        java.util.ListIterator listIterator = l2Var.f550261h.listIterator();
        long j17 = 0;
        while (true) {
            x0.s0 s0Var = (x0.s0) listIterator;
            if (!s0Var.hasNext()) {
                break;
            }
            j17 = java.lang.Math.max(j17, ((z.f2) s0Var.next()).b().f550110h);
        }
        java.util.ListIterator listIterator2 = l2Var.f550262i.listIterator();
        while (true) {
            x0.s0 s0Var2 = (x0.s0) listIterator2;
            if (!s0Var2.hasNext()) {
                return java.lang.Long.valueOf(j17);
            }
            j17 = java.lang.Math.max(j17, ((java.lang.Number) ((n0.x1) ((z.l2) s0Var2.next()).f550265l).mo128745x754a37bb()).longValue());
        }
    }
}
