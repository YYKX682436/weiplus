package bq;

/* loaded from: classes.dex */
public final class p extends bq.e {

    /* renamed from: o, reason: collision with root package name */
    public final yz5.a f105045o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(java.lang.String userName, long j17, r45.qt2 qt2Var, long j18, long j19, com.p314xaae8f345.mm.p2495xc50a8b8b.g lastBuffer, int i17, long j27, yz5.a aVar) {
        super(qt2Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lastBuffer, "lastBuffer");
        this.f105045o = aVar;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 6690;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderdelmention";
        r45.d11 d11Var = new r45.d11();
        d11Var.set(2, userName);
        d11Var.set(3, java.lang.Long.valueOf(j17));
        d11Var.set(4, lastBuffer);
        d11Var.set(5, java.lang.Long.valueOf(j18));
        d11Var.set(6, java.lang.Long.valueOf(j19));
        d11Var.set(7, java.lang.Integer.valueOf(i17));
        d11Var.set(8, java.lang.Long.valueOf(j27));
        d11Var.set(1, db2.t4.f309704a.b(6690, qt2Var));
        lVar.f152197a = d11Var;
        lVar.f152198b = new r45.e11();
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderDelMessage", "init userName: " + userName + " mentionId:" + j17 + " svrMentionId:" + j27);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.i
    public void j() {
        super.j();
        yz5.a aVar = this.f105045o;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }
}
