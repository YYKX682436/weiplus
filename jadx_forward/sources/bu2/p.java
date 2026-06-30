package bu2;

/* loaded from: classes.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f106087d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(long j17) {
        super(1);
        this.f106087d = j17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        so2.j0 it = (so2.j0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        boolean z17 = false;
        r45.vx0 vx0Var = (r45.vx0) it.f491971d.m75936x14adae67(0);
        if (vx0Var != null && vx0Var.m75942xfb822ef2(0) == this.f106087d) {
            z17 = true;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
