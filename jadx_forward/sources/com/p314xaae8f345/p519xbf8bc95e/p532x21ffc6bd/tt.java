package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class tt extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lu {

    /* renamed from: a, reason: collision with root package name */
    private android.content.Context f133774a;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f133776c;

    /* renamed from: e, reason: collision with root package name */
    private java.lang.String f133778e;

    /* renamed from: f, reason: collision with root package name */
    private java.lang.String f133779f;

    /* renamed from: g, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9 f133780g;

    /* renamed from: h, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hg f133781h;

    /* renamed from: b, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lz f133775b = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lz();

    /* renamed from: d, reason: collision with root package name */
    private java.lang.String f133777d = "";

    public tt(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tz tzVar) {
        this.f133776c = "UNKNOW";
        android.content.Context I = tzVar.I();
        this.f133774a = I;
        this.f133776c = I.getClass().getSimpleName();
        this.f133774a = this.f133774a.getApplicationContext();
        this.f133780g = (com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) tzVar.e_;
        this.f133781h = tzVar.f133806as.f130533c;
    }

    private java.lang.String a(java.lang.String str) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dp dpVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dp) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cp.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dp.class);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dm dmVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dm) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cp.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dm.class);
        java.lang.String m36688x5b89a51c = ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.da) dpVar.i()).m36688x5b89a51c();
        java.lang.String m36686x5b89a51c = ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cy) dmVar.i()).m36686x5b89a51c();
        android.net.Uri parse = android.net.Uri.parse(str);
        android.net.Uri parse2 = android.net.Uri.parse(m36688x5b89a51c);
        android.net.Uri parse3 = android.net.Uri.parse(m36686x5b89a51c);
        java.lang.String c17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.c(parse.getAuthority());
        java.lang.String c18 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.c(parse.getPath());
        java.lang.String c19 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.c(parse2.getPath());
        java.lang.String c27 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.c(parse3.getPath());
        if (c17.equals(parse2.getAuthority()) && (c18.startsWith(c19) || c18.startsWith(c27))) {
            str = parse3.buildUpon().scheme(dmVar.f130735b ? "https" : parse.getScheme()).encodedPath(c18.replace(c19, c27)).encodedQuery(parse.getQuery()).appendQueryParameter("type", "1").toString();
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dw dwVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dw) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cp.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dw.class);
        if (dwVar == null || str.endsWith(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG) || str.startsWith(dwVar.j())) {
            return str;
        }
        com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9 c4430xc2040f9 = this.f133780g;
        if (c4430xc2040f9 != null && (neVar = c4430xc2040f9.f134045o) != null) {
            neVar.F();
            this.f133778e = this.f133780g.f134045o.F().f130544c;
            this.f133779f = this.f133780g.f134045o.F().f130545d;
        }
        return str + this.f133777d + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.a(this.f133776c, this.f133778e, this.f133779f);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lu
    public final byte[] f(java.lang.String str) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar;
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.B, "download url : ".concat(java.lang.String.valueOf(str)));
        if (this.f133774a == null || com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.a(str) || !this.f133775b.a(str)) {
            return null;
        }
        if (this.f133780g != null && com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.a(this.f133777d) && !com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.a(this.f133780g.z())) {
            this.f133777d = "&eng_ver=" + this.f133780g.z();
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dp dpVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dp) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cp.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dp.class);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dm dmVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dm) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cp.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dm.class);
        java.lang.String m36688x5b89a51c = ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.da) dpVar.i()).m36688x5b89a51c();
        java.lang.String m36686x5b89a51c = ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cy) dmVar.i()).m36686x5b89a51c();
        android.net.Uri parse = android.net.Uri.parse(str);
        android.net.Uri parse2 = android.net.Uri.parse(m36688x5b89a51c);
        android.net.Uri parse3 = android.net.Uri.parse(m36686x5b89a51c);
        java.lang.String c17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.c(parse.getAuthority());
        java.lang.String c18 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.c(parse.getPath());
        java.lang.String c19 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.c(parse2.getPath());
        java.lang.String c27 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.c(parse3.getPath());
        if (c17.equals(parse2.getAuthority()) && (c18.startsWith(c19) || c18.startsWith(c27))) {
            str = parse3.buildUpon().scheme(dmVar.f130735b ? "https" : parse.getScheme()).encodedPath(c18.replace(c19, c27)).encodedQuery(parse.getQuery()).appendQueryParameter("type", "1").toString();
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dw dwVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dw) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cp.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dw.class);
        if (dwVar != null && !str.endsWith(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG) && !str.startsWith(dwVar.j())) {
            com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9 c4430xc2040f9 = this.f133780g;
            if (c4430xc2040f9 != null && (neVar = c4430xc2040f9.f134045o) != null) {
                neVar.F();
                this.f133778e = this.f133780g.f134045o.F().f130544c;
                this.f133779f = this.f133780g.f134045o.F().f130545d;
            }
            str = str + this.f133777d + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.a(this.f133776c, this.f133778e, this.f133779f);
        }
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.B, "rectify url : ".concat(java.lang.String.valueOf(str)));
        try {
            com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde m35995x5b4bacb = com.p314xaae8f345.map.p511x696c9db.net.C4327x946a3f70.m35928x9cf0d20b().m35934xdc3ef9b().url(str).m36016x12900dfa(com.p314xaae8f345.map.p511x696c9db.net.C4332xd10a8f1f.f16993xbd49c92c).m35995x5b4bacb();
            if (m35995x5b4bacb == null) {
                return null;
            }
            if (!str.contains("qt=rtt")) {
                this.f133775b.b(str);
            }
            return m35995x5b4bacb.f16977x2eefaa;
        } catch (java.lang.Exception e17) {
            if (str.contains("/mvd_map")) {
                int i17 = e17 instanceof com.p314xaae8f345.map.p511x696c9db.net.p515x584fd04f.C4341x446636fc ? ((com.p314xaae8f345.map.p511x696c9db.net.p515x584fd04f.C4341x446636fc) e17).f17011x139cb015 : e17 instanceof com.p314xaae8f345.map.p511x696c9db.net.p515x584fd04f.C4338xf5960604 ? ((com.p314xaae8f345.map.p511x696c9db.net.p515x584fd04f.C4338xf5960604) e17).f17012xec0a8ff : -1;
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hg hgVar = this.f133781h;
                if (hgVar != null) {
                    hgVar.a().a(java.lang.System.currentTimeMillis(), str.substring(str.indexOf(63) + 1), i17);
                }
            }
            return null;
        }
    }
}
