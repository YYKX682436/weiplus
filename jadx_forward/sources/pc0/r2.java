package pc0;

/* loaded from: classes4.dex */
public final class r2 extends com.p314xaae8f345.mm.app.s2 {
    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppBackground */
    public void mo8889x3be51a90(java.lang.String str) {
        if (gm0.j1.a() && gm0.j1.b().f354787q) {
            gm0.m.r();
        }
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppForeground */
    public void mo8890x1952ea5(java.lang.String str) {
        if (gm0.j1.a() && gm0.j1.b().f354787q && !gm0.m.r()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_VIDEO_RECORD_CLEAN_BG_MIX_TASK_TIME_LONG;
            java.lang.Object m17 = c17.m(u3Var, 0L);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.Long");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.r1((java.lang.Long) m17)) > 86400) {
                gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()));
                lt3.n nVar = lt3.n.f402793a;
                lt3.h hVar = lt3.n.f402794b;
                hVar.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mix_background.VideoEditStorageUtil", "clean expired task, num:" + hVar.f402776d.mo70514xb06685ab(lt3.h.f402775f, "timeStamp< ?-expiredTime", new java.lang.String[]{"" + java.lang.System.currentTimeMillis()}));
            }
        }
    }
}
