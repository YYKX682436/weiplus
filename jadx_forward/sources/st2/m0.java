package st2;

/* loaded from: classes3.dex */
public final class m0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.y23 f493928d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(r45.y23 y23Var) {
        super(1);
        this.f493928d = y23Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        so2.j5 it = (so2.j5) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        boolean z17 = false;
        if ((it instanceof cm2.m0) && ((cm2.m0) it).f124902w == this.f493928d.m75942xfb822ef2(0)) {
            z17 = true;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
