package dk2;

/* loaded from: classes3.dex */
public final class ha extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.ia f315108d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha(dk2.ia iaVar) {
        super(0);
        this.f315108d = iaVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        we2.s sVar;
        dk2.ia iaVar = this.f315108d;
        java.lang.Object D = iaVar.D();
        r45.aj1 aj1Var = D instanceof r45.aj1 ? (r45.aj1) D : null;
        r45.t12 msg = (aj1Var != null && aj1Var.m75939xb282bd08(0) == 1) ? (r45.t12) aj1Var.m75936x14adae67(1) : null;
        java.lang.Object D2 = iaVar.D();
        r45.aj1 aj1Var2 = D2 instanceof r45.aj1 ? (r45.aj1) D2 : null;
        r45.ch1 msg2 = (aj1Var2 != null && aj1Var2.m75939xb282bd08(0) == 2) ? (r45.ch1) aj1Var2.m75936x14adae67(2) : null;
        if (msg != null) {
            we2.s sVar2 = (we2.s) dk2.ef.f314905a.i(we2.s.class);
            if (sVar2 == null) {
                return null;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
            return sVar2.f526788g.c(msg);
        }
        if (!(msg2 != null) || (sVar = (we2.s) dk2.ef.f314905a.i(we2.s.class)) == null) {
            return null;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg2, "msg");
        return sVar.f526788g.b(msg2);
    }
}
