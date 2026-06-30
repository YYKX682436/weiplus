package bm2;

/* loaded from: classes5.dex */
public final class e6 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.o6 f21865d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6(bm2.o6 o6Var) {
        super(1);
        this.f21865d = o6Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.Set positions = (java.util.Set) obj;
        kotlin.jvm.internal.o.g(positions, "positions");
        java.util.Iterator it = positions.iterator();
        while (it.hasNext()) {
            this.f21865d.notifyItemChanged(((java.lang.Number) it.next()).intValue(), "payload_audition_state");
        }
        return jz5.f0.f302826a;
    }
}
