package e00;

/* loaded from: classes9.dex */
public final class d0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e00.e0 f327285d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(e00.e0 e0Var) {
        super(0);
        this.f327285d = e0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reqType:");
        e00.e0 e0Var = this.f327285d;
        sb6.append(e0Var.f327289a);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder(sb6.toString());
        java.util.Iterator it = e0Var.f327290b.iterator();
        while (it.hasNext()) {
            sb7.append(((bw5.se0) it.next()).b() + '_');
        }
        return sb7.toString();
    }
}
