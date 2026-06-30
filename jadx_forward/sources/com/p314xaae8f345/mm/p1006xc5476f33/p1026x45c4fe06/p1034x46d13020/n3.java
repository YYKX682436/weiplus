package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020;

/* loaded from: classes7.dex */
public class n3 extends com.p314xaae8f345.mm.p944x882e457a.i {

    /* renamed from: m, reason: collision with root package name */
    public final r45.it6 f158054m;

    public n3(int i17, boolean z17, int i18, int i19, int i27, java.lang.String str, int i28, java.lang.String str2) {
        this(i17, z17, i18, i19, i27, str, i28, str2, 0);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.jt6 jt6Var = (r45.jt6) fVar;
        r45.it6 it6Var = this.f158054m;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.CgiUpdateWxaUsageRecord", "onCgiBack, req [scene %d, background %b, versionType %d, recordType %d, op %d, username %s]resp [errType %d, errCode %d, errMsg %s, resp %s]", java.lang.Integer.valueOf(it6Var.f458852d), java.lang.Integer.valueOf(it6Var.f458853e), java.lang.Integer.valueOf(it6Var.f458854f), java.lang.Integer.valueOf(it6Var.f458855g), java.lang.Integer.valueOf(it6Var.f458856h), it6Var.f458857i, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, jt6Var);
    }

    public n3(int i17, boolean z17, int i18, int i19, int i27, java.lang.String str, int i28, java.lang.String str2, int i29) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.it6 it6Var = new r45.it6();
        it6Var.f458852d = i17 == 0 ? 1000 : i17;
        it6Var.f458853e = z17 ? 1 : 0;
        it6Var.f458854f = i18;
        it6Var.f458855g = i19;
        it6Var.f458856h = i27;
        it6Var.f458857i = str;
        it6Var.f458858m = i28;
        it6Var.f458859n = str2;
        it6Var.f458860o = i29;
        this.f158054m = it6Var;
        lVar.f152197a = it6Var;
        lVar.f152198b = new r45.jt6();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/wxaapp/updatewxausagerecord";
        lVar.f152200d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.f0.f34288x366c91de;
        p(lVar.a());
    }
}
