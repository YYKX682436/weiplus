package tt2;

/* loaded from: classes3.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tt2.e1 f503533d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.hx0 f503534e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(tt2.e1 e1Var, r45.hx0 hx0Var) {
        super(3);
        this.f503533d = e1Var;
        this.f503534e = hx0Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String string;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String errmsg = (java.lang.String) obj2;
        r45.o12 resp = (r45.o12) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errmsg, "errmsg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        tt2.e1 e1Var = this.f503533d;
        e1Var.getClass();
        r45.hx0 hx0Var = this.f503534e;
        if (hx0Var.m75934xbce7f2f(1) != null) {
            r45.ix0 ix0Var = (r45.ix0) resp.m75936x14adae67(1);
            if (booleanValue && ix0Var != null && ix0Var.m75939xb282bd08(1) == 0) {
                st2.h1 h1Var = e1Var.f503424v;
                if (h1Var != null && (lVar = h1Var.f493870h) != null) {
                    qo0.b bVar = qo0.b.f446892h2;
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putBoolean("PARAM_FINDER_LIVE_SHOPPING_SOURCE_CLICK", true);
                    lVar.M0(bVar, bundle);
                }
            } else {
                java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e7a);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                switch (hx0Var.m75939xb282bd08(0)) {
                    case 101:
                        string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eeh);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                        break;
                    case 102:
                        string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.edq);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                        break;
                    case 103:
                        string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ees);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                        break;
                    default:
                        string = "";
                        break;
                }
                db5.t7.m123883x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, string2.concat(string), 0).show();
            }
        }
        return jz5.f0.f384359a;
    }
}
