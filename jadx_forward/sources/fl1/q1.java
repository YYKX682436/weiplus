package fl1;

/* loaded from: classes3.dex */
public final class q1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fl1.r1 f345381d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(fl1.r1 r1Var) {
        super(1);
        this.f345381d = r1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.ArrayList changed = (java.util.ArrayList) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(changed, "changed");
        java.util.Iterator it = changed.iterator();
        while (it.hasNext()) {
            this.f345381d.m8147xed6e4d18(((java.lang.Number) it.next()).intValue());
        }
        return jz5.f0.f384359a;
    }
}
