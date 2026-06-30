package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz;

/* loaded from: classes11.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f280324d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s01.h f280325e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.z3 f280326f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f280327g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f280328h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a f280329i;

    public l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a aVar, boolean z17, s01.h hVar, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, java.lang.String str, boolean z18) {
        this.f280329i = aVar;
        this.f280324d = z17;
        this.f280325e = hVar;
        this.f280326f = z3Var;
        this.f280327g = str;
        this.f280328h = z18;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.System.currentTimeMillis();
        boolean z17 = this.f280324d;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f280326f;
        s01.h hVar = this.f280325e;
        if (!z17 || hVar == null || z3Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.BizComponent", "bizChatInfo:%s  talker:%s", hVar, z3Var);
        } else {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a aVar = this.f280329i;
            java.lang.String str = this.f280327g;
            aVar.n0(true, str);
            r01.q3.Ri().getClass();
            java.lang.String format = java.lang.String.format("%s;%s;%d", hVar.f69170x75756b18, hVar.f69169xf75e5c37, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000));
            de0.j jVar = (de0.j) i95.n0.c(de0.j.class);
            java.lang.String str2 = hVar.f69170x75756b18;
            ((ce0.e) jVar).getClass();
            com.p314xaae8f345.mm.p957x53236a1b.g1.K(str2, 7, "EnterpriseChatStatus", format);
            if (this.f280328h) {
                if (hVar.z0()) {
                    s01.y Ni = r01.q3.Ni();
                    java.lang.String str3 = hVar.f69169xf75e5c37;
                    Ni.getClass();
                    gm0.j1.n().f354821b.g(new s01.h0(str3, str, true));
                } else {
                    java.lang.String str4 = s01.r.f483457a;
                    java.util.List<java.lang.String> w07 = hVar.w0();
                    if (w07 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizChatInfoStorageLogic", "updateBizChatMember: list == null");
                    } else {
                        java.util.LinkedList linkedList = new java.util.LinkedList();
                        for (java.lang.String str5 : w07) {
                            s01.a0 y07 = r01.q3.Vi().y0(str5);
                            if (y07 != null && y07.u0()) {
                                linkedList.add(str5);
                            }
                        }
                        if (linkedList.size() > 0) {
                            r01.q3.Ni().b(linkedList, hVar.f69170x75756b18);
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizChatInfoStorageLogic", "updateBizChatMember: no need to update");
                        }
                    }
                }
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(hVar.f69170x75756b18)) {
                java.lang.String z07 = r01.q3.Vi().z0(hVar.f69170x75756b18);
                s01.a0 y08 = r01.q3.Vi().y0(z07);
                java.lang.Object[] objArr = new java.lang.Object[3];
                objArr[0] = hVar.f69170x75756b18;
                objArr[1] = z07;
                objArr[2] = java.lang.Boolean.valueOf(y08 == null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.BizComponent", "updateBizChatMyUserInfo: %s:%s,myBizChatUserInfo is null:%s", objArr);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z07) || y08 == null || y08.u0() || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(y08.f65834x53f3fff9)) {
                    r01.q3.Ni().h(hVar.f69170x75756b18, aVar);
                }
            }
        }
        java.lang.System.currentTimeMillis();
    }
}
