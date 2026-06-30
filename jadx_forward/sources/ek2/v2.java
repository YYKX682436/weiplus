package ek2;

/* loaded from: classes.dex */
public final class v2 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f335085u;

    public v2(long j17, long j18, java.lang.String str, byte[] bArr, java.lang.String str2) {
        super(null, 1, null);
        this.f335085u = "Finder.CgiFinderLuckyMoneyRewardNotify";
        r45.w62 w62Var = new r45.w62();
        w62Var.set(1, db2.t4.f309704a.a(6671));
        w62Var.set(5, java.lang.Long.valueOf(j17));
        w62Var.set(4, java.lang.Long.valueOf(j18));
        w62Var.set(6, str);
        w62Var.set(2, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bArr));
        w62Var.set(3, str2);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = w62Var;
        r45.x62 x62Var = new r45.x62();
        x62Var.set(0, new r45.ie());
        lVar.f152198b = x62Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderliveredpacketrewardnotify";
        lVar.f152200d = 6671;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderLuckyMoneyRewardNotify", "CgiFinderLuckyMoneyRewardNotify init liveId:" + w62Var.m75942xfb822ef2(5) + " sendId:" + w62Var.m75945x2fec8307(3));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.x62 resp = (r45.x62) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f335085u, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
    }

    @Override // az2.j, cz2.j
    public cz2.f v() {
        return cz2.f.f306536e;
    }
}
