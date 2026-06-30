package jn2;

/* loaded from: classes5.dex */
public final class t0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jn2.c1 f382236d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(jn2.c1 c1Var) {
        super(1);
        this.f382236d = c1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.Set positions = (java.util.Set) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(positions, "positions");
        java.util.Iterator it = positions.iterator();
        while (it.hasNext()) {
            this.f382236d.m8148xed6e4d18(((java.lang.Number) it.next()).intValue(), "payload_audition_state");
        }
        return jz5.f0.f384359a;
    }
}
