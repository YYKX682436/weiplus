package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes4.dex */
public final class t3 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34881x366c91de = 876;

    /* renamed from: NAME */
    public static final java.lang.String f34882x24728b = "joinGroup";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l env, org.json.JSONObject data, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String mo48798x74292566 = env.mo48798x74292566();
        if (mo48798x74292566 == null || mo48798x74292566.length() == 0) {
            env.a(i17, o("fail:appId is null"));
            return;
        }
        java.lang.String optString = data.optString("signature");
        java.lang.String optString2 = data.optString("groupId");
        java.lang.String optString3 = data.optString("nonceStr");
        vg3.i3 i3Var = new vg3.i3();
        i3Var.f518245d = mo48798x74292566;
        i3Var.f518248g = optString;
        i3Var.f518246e = optString2;
        i3Var.f518247f = optString3;
        ((hn.s) ((vg3.k3) i95.n0.c(vg3.k3.class))).Bi(env.mo50352x76847179(), i3Var);
        env.a(i17, o("ok"));
    }
}
