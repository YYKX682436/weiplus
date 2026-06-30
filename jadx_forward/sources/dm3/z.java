package dm3;

/* loaded from: classes2.dex */
public final class z implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dm3.e0 f323284d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f323285e;

    public z(dm3.e0 e0Var, yz5.l lVar) {
        this.f323284d = e0Var;
        this.f323285e = lVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public final int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o rr6, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rr6, "rr");
        com.p314xaae8f345.mm.p944x882e457a.n nVar = rr6.f152244b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(m1Var, "<anonymous parameter 4>");
        dm3.e0 e0Var = this.f323284d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e0Var.o(), "getMMListenItem callback " + i17 + ", " + i18);
        e0Var.f323215n = false;
        if (i17 == 0 && i18 == 0) {
            try {
                if (!(nVar.f152233a instanceof qk.t9)) {
                    return 0;
                }
                bw5.o70 o70Var = new bw5.o70();
                com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = nVar.f152233a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.api.ResponseProtoBufDelegate");
                bw5.o70 mo11468x92b714fd = o70Var.mo11468x92b714fd(((qk.t9) fVar).f445871d);
                if (mo11468x92b714fd.f112540d.isEmpty()) {
                    return 0;
                }
                java.util.LinkedList linkedList = mo11468x92b714fd.f112540d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linkedList, "getItems(...)");
                bw5.n70 n70Var = (bw5.n70) kz5.n0.X(linkedList);
                if (e0Var.f323225x && n70Var != null) {
                    this.f323285e.mo146xb9724478(n70Var.f112069i[3] ? n70Var.f112065e : "");
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(e0Var.o(), "callback ex " + e17.getMessage());
            }
        }
        return 0;
    }
}
