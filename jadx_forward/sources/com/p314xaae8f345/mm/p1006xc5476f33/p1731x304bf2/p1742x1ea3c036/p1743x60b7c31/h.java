package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes5.dex */
public final class h extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "chatRoomAtMember";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        org.json.JSONObject e17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2411x36f002.g.e(str);
        if (e17 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(q5Var);
            q5Var.a("invalid_params", null);
            return;
        }
        java.lang.String optString = e17.optString("chatRoomName");
        java.lang.String optString2 = e17.optString("userName");
        java.lang.String optString3 = e17.optString("nickName");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString3)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(q5Var);
            q5Var.a("invalid_params", null);
            return;
        }
        s33.j0 j0Var = (s33.j0) ((t33.f) i95.n0.c(t33.f.class));
        j0Var.getClass();
        ((s33.d) ((u33.g) i95.n0.c(u33.g.class))).wi(optString2, new s33.i0(j0Var, optString2, optString));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(q5Var);
        q5Var.a(null, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
    }
}
