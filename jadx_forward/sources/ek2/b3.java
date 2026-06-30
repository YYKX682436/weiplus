package ek2;

/* loaded from: classes.dex */
public final class b3 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final org.json.JSONObject f334952u;

    /* renamed from: v, reason: collision with root package name */
    public final r45.f13 f334953v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(java.util.ArrayList arrayList, long j17, long j18, long j19, java.lang.String userName, ek2.a3 a3Var, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(null, 1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        this.f334952u = new org.json.JSONObject();
        r45.f13 f13Var = new r45.f13();
        this.f334953v = f13Var;
        f13Var.set(1, db2.t4.f309704a.b(5891, this.f97668n));
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                linkedList.add((java.lang.String) it.next());
            }
        }
        this.f334953v.set(2, linkedList);
        this.f334953v.set(4, java.lang.Long.valueOf(j18));
        this.f334953v.set(5, java.lang.Long.valueOf(j19));
        this.f334953v.set(6, userName);
        this.f334953v.set(3, java.lang.Long.valueOf(j17));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = this.f334953v;
        r45.g13 g13Var = new r45.g13();
        g13Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) g13Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = g13Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderupdatelivesonglist";
        lVar.f152200d = 5891;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.g13 resp = (r45.g13) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderUpdateLiveSongList", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject w() {
        return this.f334952u;
    }
}
