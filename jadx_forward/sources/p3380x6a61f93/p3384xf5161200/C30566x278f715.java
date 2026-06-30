package p3380x6a61f93.p3384xf5161200;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\b"}, d2 = {"Lurgen/ur_7522/URS_5E95;", "", "()V", "UR_17B3", "", "UR_6D25", "", "appId", "plugin-ilink_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: urgen.ur_7522.URS_5E95 */
/* loaded from: classes9.dex */
public final class C30566x278f715 {

    /* renamed from: INSTANCE */
    public static final p3380x6a61f93.p3384xf5161200.C30566x278f715 f77163x4fbc8495 = new p3380x6a61f93.p3384xf5161200.C30566x278f715();

    private C30566x278f715() {
    }

    /* renamed from: UR_17B3 */
    public static final byte[] m169968x21b0e539() {
        bw5.r6 r6Var;
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_ecs_order_and_card_take_poi_for_preload_android, 1) == 1) {
            r6Var = ((j20.o) ((c00.y3) i95.n0.c(c00.y3.class))).Ri(1, 0);
        } else {
            r6Var = new bw5.r6();
            r6Var.f113946d = 106;
            r6Var.f113950h[1] = true;
        }
        return r6Var.mo14344x5f01b1f6();
    }

    /* renamed from: UR_6D25 */
    public static final java.lang.String m169969x21b359f3(java.lang.String appId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        g20.g gVar = (g20.g) ((c00.x3) i95.n0.c(c00.x3.class));
        gVar.getClass();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (appId.length() > 0) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsOrderService", "main thread conf:" + gVar.f349306d);
                return gVar.f349306d;
            }
            long c17 = c01.id.c();
            z20.e eVar = z20.e.f551075d;
            z20.b bVar = new z20.b();
            bVar.f551070a = eVar;
            bw5.q9 q9Var = new bw5.q9();
            q9Var.f113532d = "getFrontendConfigTimeCost";
            q9Var.f113546u[1] = true;
            q9Var.c(java.lang.System.currentTimeMillis());
            q9Var.b(2);
            bVar.f551071b = q9Var;
            bVar.f(java.lang.String.valueOf(c17));
            bVar.a();
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y8 y8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y8(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.o6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.o6.class)).Dh(appId, 0).f67183x55b471cc);
                y8Var.a();
                java.io.InputStream c18 = y8Var.c("/ecs_client_prefetch.json");
                try {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c18);
                    java.lang.String str2 = new java.lang.String(vz5.a.c(c18), r26.c.f450398a);
                    vz5.b.a(c18, null);
                    gVar.f349306d = str2;
                    z20.e eVar2 = z20.e.f551077f;
                    z20.b bVar2 = new z20.b();
                    bVar2.f551070a = eVar2;
                    bw5.q9 q9Var2 = new bw5.q9();
                    q9Var2.f113532d = "getFrontendConfigTimeCost";
                    q9Var2.f113546u[1] = true;
                    q9Var2.c(java.lang.System.currentTimeMillis());
                    q9Var2.b(2);
                    bVar2.f551071b = q9Var2;
                    bVar2.f(java.lang.String.valueOf(c17));
                    bVar2.a();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsOrderService", "getFrontendConfig (" + java.lang.Thread.currentThread().getName() + ") " + appId + " timeCost:" + (c01.id.c() - c17) + ",ecs_client_prefetch.json -> " + gVar.f349306d);
                    return gVar.f349306d;
                } finally {
                }
            } catch (java.lang.Exception unused) {
                z20.e eVar3 = z20.e.f551078g;
                z20.b bVar3 = new z20.b();
                bVar3.f551070a = eVar3;
                bw5.q9 q9Var3 = new bw5.q9();
                q9Var3.f113532d = "getFrontendConfigTimeCost";
                q9Var3.f113546u[1] = true;
                q9Var3.c(java.lang.System.currentTimeMillis());
                q9Var3.b(2);
                bVar3.f551071b = q9Var3;
                bVar3.f(java.lang.String.valueOf(c17));
                bVar3.a();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsOrderService", "getFrontendConfig " + appId + " timeCost:" + (c01.id.c() - c17) + ",no ecs_client_prefetch.json");
            }
        }
        return gVar.f349306d;
    }
}
