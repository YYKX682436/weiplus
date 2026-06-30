package fk2;

/* loaded from: classes3.dex */
public final class w2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fk2.x2 f345042d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f345043e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(fk2.x2 x2Var, dk2.zf zfVar) {
        super(1);
        this.f345042d = x2Var;
        this.f345043e = zfVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        fe2.q qVar;
        android.view.View view = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
        if (k0Var != null && (qVar = (fe2.q) k0Var.mo57682x2a5e9229(fe2.q.class)) != null) {
            qVar.D1();
        }
        this.f345042d.getClass();
        df2.nw nwVar = df2.xw.f313341w;
        jz5.l[] lVarArr = new jz5.l[2];
        java.lang.String f17 = this.f345043e.f();
        if (f17 == null) {
            f17 = "";
        }
        lVarArr[0] = new jz5.l("msg_id", f17);
        lVarArr[1] = new jz5.l("reply_type", "3");
        nwVar.a(5, kz5.c1.k(lVarArr));
        return java.lang.Boolean.TRUE;
    }
}
