package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8;

/* loaded from: classes7.dex */
public final class t2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f161270a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f161271b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.w2 f161272c;

    public t2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.w2 w2Var) {
        this.f161270a = yVar;
        this.f161271b = i17;
        this.f161272c = w2Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        jz5.o oVar = (jz5.o) obj;
        r45.j14 j14Var = (r45.j14) oVar.f384374d;
        java.lang.String str = (java.lang.String) oVar.f384375e;
        java.lang.String str2 = (java.lang.String) oVar.f384376f;
        java.lang.Integer valueOf = j14Var != null ? java.lang.Integer.valueOf(j14Var.f459024d) : null;
        int i17 = this.f161271b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = this.f161270a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.w2 w2Var = this.f161272c;
        if (valueOf != null && valueOf.intValue() == 0) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("code", str);
            yVar.a(i17, w2Var.p("ok", hashMap));
        } else if (valueOf == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fail invalid ");
            w2Var.getClass();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, "/cgi-bin/mmbiz-bin/js-login")) {
                str2 = "js-login";
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, "/cgi-bin/mmbiz-bin/js-login-confirm")) {
                str2 = "js-login-confirm";
            }
            sb6.append(str2);
            sb6.append(" response");
            yVar.a(i17, w2Var.o(sb6.toString()));
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("fail ");
            w2Var.getClass();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, "/cgi-bin/mmbiz-bin/js-login")) {
                str2 = "js-login";
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, "/cgi-bin/mmbiz-bin/js-login-confirm")) {
                str2 = "js-login-confirm";
            }
            sb7.append(str2);
            sb7.append(" response errcode=");
            sb7.append(valueOf);
            sb7.append(" errmsg=");
            sb7.append(j14Var.f459025e);
            yVar.a(i17, w2Var.o(sb7.toString()));
        }
        return jz5.f0.f384359a;
    }
}
