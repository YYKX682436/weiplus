package bq;

/* loaded from: classes.dex */
public final class a0 extends bq.e {

    /* renamed from: o, reason: collision with root package name */
    public final yz5.a f105007o;

    public a0(java.lang.String str, int i17, int i18, yz5.a aVar) {
        super(null, 1, null);
        this.f105007o = aVar;
        r45.f41 f41Var = new r45.f41();
        r45.d41 d41Var = new r45.d41();
        d41Var.set(0, str);
        d41Var.set(2, java.lang.Integer.valueOf(i17));
        f41Var.set(0, d41Var);
        f41Var.set(1, java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 21095;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergamebindop";
        lVar.f152197a = f41Var;
        lVar.f152198b = new r45.g41();
        p(lVar.a());
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.i
    public void j() {
        super.j();
        yz5.a aVar = this.f105007o;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }
}
