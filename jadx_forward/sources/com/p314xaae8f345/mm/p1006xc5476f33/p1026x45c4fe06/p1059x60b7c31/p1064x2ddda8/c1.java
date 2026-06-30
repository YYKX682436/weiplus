package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8;

/* loaded from: classes7.dex */
public class c1 implements k80.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.d1 f160955a;

    public c1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.C11999x85898042 c11999x85898042, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.d1 d1Var) {
        this.f160955a = d1Var;
    }

    @Override // k80.f
    public void a(int i17, int i18, java.lang.String str, k80.g gVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.d1 d1Var = this.f160955a;
        if (i17 != 0 || i18 != 0) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.v0) d1Var).a(-1, java.lang.String.format(java.util.Locale.ENGLISH, "cgi fail(%d,%d)", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)));
            return;
        }
        if (gVar != null) {
            r45.h24 h24Var = (r45.h24) ((bl0.a) gVar).f103209d.f152244b.f152233a;
            r45.j14 j14Var = h24Var.f457306d;
            int i19 = j14Var.f459024d;
            java.lang.String str2 = j14Var.f459025e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiAuthorize", "stev NetSceneJSAuthorize jsErrcode %d", java.lang.Integer.valueOf(i19));
            if (i19 != -12000) {
                if (i19 != 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiAuthorize", "onSceneEnd NetSceneJSAuthorize ERROR %s", str2);
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.v0) d1Var).a(i19, str2);
                    return;
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.C11999x85898042 c11999x85898042 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.v0) d1Var).f161291a;
                    c11999x85898042.f160872r = "ok";
                    c11999x85898042.c();
                    return;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.v0 v0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.v0) d1Var;
            v0Var.getClass();
            java.util.LinkedList linkedList = h24Var.f457307e;
            int size = linkedList.size();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.C11999x85898042 c11999x858980422 = v0Var.f161291a;
            c11999x858980422.E = size;
            int i27 = 0;
            while (true) {
                if (i27 >= c11999x858980422.E) {
                    break;
                }
                r45.jv5 jv5Var = (r45.jv5) linkedList.get(i27);
                try {
                    c11999x858980422.F.putByteArray(i27 + "", jv5Var.mo14344x5f01b1f6());
                    i27++;
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiAuthorize", "IOException %s", e17.getMessage());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiAuthorize", e17, "", new java.lang.Object[0]);
                    c11999x858980422.f160872r = "fail";
                    c11999x858980422.c();
                    return;
                }
            }
            c11999x858980422.f160876v = h24Var.f457308f;
            c11999x858980422.f160877w = h24Var.f457309g;
            c11999x858980422.f160878x = h24Var.f457312m;
            c11999x858980422.f160880z = h24Var.f457311i;
            c11999x858980422.f160879y = h24Var.f457310h;
            r45.i7 i7Var = h24Var.f457313n;
            if (i7Var != null) {
                c11999x858980422.A = i7Var.f458306d;
                c11999x858980422.B = i7Var.f458307e;
            }
            r45.pw6 pw6Var = h24Var.f457316q;
            if (pw6Var != null) {
                c11999x858980422.P = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.C12008x61435860(pw6Var);
            }
            c11999x858980422.f160872r = "needConfirm";
            if (linkedList.size() <= 0) {
                c11999x858980422.c();
                return;
            }
            r45.jv5 jv5Var2 = (r45.jv5) linkedList.get(0);
            java.lang.String str3 = jv5Var2.f459669i;
            c11999x858980422.G = str3 != null ? str3 : "";
            if (!"scope.userInfo".equals(jv5Var2.f459664d)) {
                c11999x858980422.c();
                return;
            }
            java.lang.String l17 = c01.z1.l();
            c11999x858980422.D = l17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiAuthorize", "userNickName=".concat(l17));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.c0.f160953a.a(c01.z1.r(), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.u0(v0Var));
        }
    }
}
