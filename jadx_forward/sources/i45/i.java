package i45;

/* loaded from: classes4.dex */
public final class i implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f369945d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i45.d f369946e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f369947f;

    public i(long j17, i45.d dVar, java.lang.String str) {
        this.f369945d = j17;
        this.f369946e = dVar;
        this.f369947f = str;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public final int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        long j17;
        long a17 = c01.id.a() - this.f369945d;
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0());
        objArr[1] = java.lang.Integer.valueOf(i17);
        objArr[2] = java.lang.Integer.valueOf(i18);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        objArr[3] = str == null ? "" : str;
        objArr[4] = java.lang.Long.valueOf(a17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxImeHelper", "verifyIdentityToken type:%d errType:%d errCode:%d errMsg:%s, diffTime:%s", objArr);
        java.util.HashMap i19 = kz5.c1.i(new jz5.l("command_time_consume", java.lang.Long.valueOf(a17)));
        i45.d dVar = this.f369946e;
        if (i17 == 0 && i18 == 0) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
            jz5.f0 f0Var = null;
            r45.n44 n44Var = fVar instanceof r45.n44 ? (r45.n44) fVar : null;
            if (n44Var != null) {
                i45.d dVar2 = this.f369946e;
                r45.vy6 vy6Var = n44Var.f462608d;
                jz5.f0 f0Var2 = jz5.f0.f384359a;
                if (vy6Var != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxImeHelper", "verifyIdentityToken KeyBoardVerifyWxTokenResponse, err_code:" + vy6Var.f470210d + ", err_msg:" + vy6Var.f470211e + ", ts:" + vy6Var.f470212f + ", expire:" + vy6Var.f470213g);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv_wetype").putString("mmkv_key_verify_token_success_str", this.f369947f);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv_wetype").putLong("mmkv_key_verify_token_valid_time", c01.id.b() + (vy6Var.f470213g * 1000));
                    i45.d.b(dVar2, 0L, null, i19, 2, null);
                    f0Var = f0Var2;
                }
                if (f0Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxImeHelper", "verifyIdentityToken responseProtoBuf kb_resp null");
                    j17 = -1;
                    dVar2.a(-1L, "responseProtoBuf responseProtoBuf kb_resp null", i19);
                } else {
                    j17 = -1;
                }
                f0Var = f0Var2;
            } else {
                j17 = -1;
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxImeHelper", "verifyIdentityToken responseProtoBuf as KeyBoardVerifyWxTokenResponse null");
                dVar.a(j17, "responseProtoBuf as KeyBoardVerifyWxTokenResponse null", i19);
            }
        } else {
            dVar.a(-1L, "errType:" + i17 + ";errCode:" + i18 + ";errMsg:" + str, i19);
        }
        return 0;
    }
}
