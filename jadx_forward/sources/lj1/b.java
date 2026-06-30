package lj1;

/* loaded from: classes8.dex */
public final class b implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.p f400345a;

    public b(yz5.p pVar) {
        this.f400345a = pVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.i20 i20Var = (r45.i20) obj;
        int i17 = i20Var.f76492x92037252.f458492d;
        yz5.p pVar = this.f400345a;
        if (i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CgiCheckWxaShortLink", "checkAsync cig fail. Ret[" + i20Var.f76492x92037252.f458492d + "]  ErrMsg[" + i20Var.f76492x92037252.f458493e + ']');
            pVar.mo149xb9724478(java.lang.Boolean.FALSE, null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiCheckWxaShortLink", "checkAsync cig success.");
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = i20Var.f458207d;
            java.lang.String h17 = gVar != null ? gVar.h(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c) : null;
            java.lang.String str = h17 == null ? "" : h17;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = i20Var.f458209f;
            java.lang.String h18 = gVar2 != null ? gVar2.h(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c) : null;
            java.lang.String str2 = h18 == null ? "" : h18;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = i20Var.f458208e;
            java.lang.String h19 = gVar3 != null ? gVar3.h(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c) : null;
            java.lang.String str3 = h19 == null ? "" : h19;
            int i18 = i20Var.f458210g;
            int i19 = i20Var.f458211h;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = i20Var.f458212i;
            java.lang.String i27 = gVar4 != null ? gVar4.i() : null;
            if (i27 == null) {
                i27 = "";
            }
            pVar.mo149xb9724478(bool, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1190x87299676.cgi.C12593xa2ff72c4(str, str2, str3, i18, i19, i27, ""));
        }
        return jz5.f0.f384359a;
    }
}
