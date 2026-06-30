package ek2;

/* loaded from: classes2.dex */
public final class s extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final ek2.r f335061u;

    /* renamed from: v, reason: collision with root package name */
    public final r45.ox0 f335062v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(java.lang.String url, long j17, ek2.r rVar) {
        super(null, 1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        this.f335061u = rVar;
        r45.ox0 ox0Var = new r45.ox0();
        this.f335062v = ox0Var;
        ox0Var.f464124d = db2.t4.f309704a.a(19706);
        ox0Var.f464125e = url;
        ox0Var.f464126f = j17;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = ox0Var;
        r45.px0 px0Var = new r45.px0();
        r45.ie ieVar = new r45.ie();
        px0Var.f76492x92037252 = ieVar;
        ieVar.f458493e = new r45.du5();
        lVar.f152198b = px0Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findercolivemergeavatars";
        lVar.f152200d = 19706;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiCoLiveMergeAvatars", "init objectId=" + j17 + ", url=" + r26.p0.E0(url, 80));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.px0 resp = (r45.px0) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiCoLiveMergeAvatars", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + ", objectId=" + this.f335062v.f464126f);
        ek2.r rVar = this.f335061u;
        if (rVar != null) {
            re2.c1 c1Var = (re2.c1) rVar;
            long j17 = c1Var.f475906a;
            if (i17 == 0 && i18 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CoLiveRequestHelper", "mergeAvatars success: objectId=" + j17);
                yz5.l lVar = c1Var.f475907b;
                if (lVar != null) {
                    lVar.mo146xb9724478(resp);
                    return;
                }
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.CoLiveRequestHelper", "mergeAvatars failed: objectId=" + j17 + ", errType=" + i17 + ", errCode=" + i18 + ", errMsg=" + str);
            yz5.p pVar = c1Var.f475908c;
            if (pVar != null) {
                pVar.mo149xb9724478(java.lang.Integer.valueOf(i18), str);
            }
        }
    }

    @Override // az2.j, cz2.j
    public cz2.f v() {
        return cz2.f.f306536e;
    }
}
