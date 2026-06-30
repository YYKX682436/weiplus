package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public final class xc implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.yc f165450a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 f165451b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f165452c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f165453d;

    public xc(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.yc ycVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f165450a = ycVar;
        this.f165451b = d0Var;
        this.f165452c = i17;
        this.f165453d = h0Var;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.yc ycVar = this.f165450a;
        if (i17 != ycVar.f165478h) {
            return false;
        }
        int i19 = this.f165452c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var = this.f165451b;
        if (i18 != -1) {
            d0Var.a(i19, ycVar.o("fail:cancel"));
            return true;
        }
        if (intent == null) {
            return true;
        }
        r45.oz5 oz5Var = new r45.oz5();
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f165453d;
        oz5Var.f464163d = (java.lang.String) h0Var.f391656d;
        oz5Var.f464164e = intent.getStringExtra("Select_Conv_User");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ycVar.f165477g, "do send redcover appmsg: " + ((java.lang.String) h0Var.f391656d) + ", " + oz5Var.f464164e);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 6446;
        lVar.f152199c = "/cgi-bin/micromsg-bin/sendsharecovermsg";
        lVar.f152197a = oz5Var;
        lVar.f152198b = new r45.pz5();
        ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(lVar.a(), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.wc(ycVar, d0Var, i19));
        return true;
    }
}
