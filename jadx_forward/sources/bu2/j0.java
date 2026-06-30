package bu2;

/* loaded from: classes2.dex */
public final class j0 extends bu2.l0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(r45.p21 source) {
        super(source);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
    }

    @Override // bu2.l0
    public so2.j5 a() {
        r45.cc1 cc1Var;
        r45.p21 data = this.f106081a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (!(data.m75939xb282bd08(5) == 6) || (cc1Var = (r45.cc1) data.m75936x14adae67(10)) == null) {
            return null;
        }
        return new so2.a0(cc1Var);
    }

    public j0(int i17, so2.a0 collectInfoFeed) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(collectInfoFeed, "collectInfoFeed");
        r45.p21 p21Var = this.f106081a;
        p21Var.set(0, java.lang.Integer.valueOf(i17));
        p21Var.set(5, 6);
        p21Var.set(10, collectInfoFeed.f491777d);
    }
}
