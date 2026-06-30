package pr;

/* loaded from: classes11.dex */
public final class b extends com.p314xaae8f345.mm.p944x882e457a.i {

    /* renamed from: m, reason: collision with root package name */
    public final int f439226m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f439227n;

    public b(int i17, int i18, java.util.List md5List) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(md5List, "md5List");
        this.f439226m = i17;
        java.lang.String str = java.util.UUID.randomUUID().toString() + '_' + java.lang.System.currentTimeMillis();
        this.f439227n = str;
        r45.ad adVar = new r45.ad();
        r45.bd bdVar = new r45.bd();
        adVar.f451466e = i18;
        adVar.f451465d.addAll(md5List);
        adVar.f451467f = i17;
        adVar.f451469h = gm0.j1.u().c().v(z12.g.H(i17), null);
        adVar.f451470i = str;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = adVar;
        lVar.f152198b = bdVar;
        lVar.f152199c = "/cgi-bin/micromsg-bin/mmbackupemojioperate";
        lVar.f152200d = 698;
        p(lVar.a());
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        int i19 = this.f439226m;
        if (i17 == 0 && i18 == 0) {
            gm0.j1.u().c().x(z12.g.H(i19), this.f439227n);
        } else if (i18 == -2048) {
            new pr.t(i19, null, false).a();
        }
    }
}
