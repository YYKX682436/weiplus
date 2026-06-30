package t00;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lt00/c0;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/feature/ecs/jsapi/GetEcsWeShopPoiDataActionHandler$IPCPoiRequest;", "Lcom/tencent/mm/feature/ecs/jsapi/GetEcsWeShopPoiDataActionHandler$IPCEcsPoiInfo;", "<init>", "()V", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes9.dex */
public final class c0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p725x60b7c31.C10528xc51e3780 c10528xc51e3780 = (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p725x60b7c31.C10528xc51e3780) obj;
        if (c10528xc51e3780 == null) {
            if (rVar != null) {
                rVar.a(new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p725x60b7c31.C10527x84c4b5e(102, 0.0f, 0.0f, 0L));
                return;
            }
            return;
        }
        c00.y3 y3Var = (c00.y3) i95.n0.c(c00.y3.class);
        if (y3Var == null) {
            if (rVar != null) {
                rVar.a(new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p725x60b7c31.C10527x84c4b5e(107, 0.0f, 0.0f, 0L));
                return;
            }
            return;
        }
        t00.b0 b0Var = new t00.b0(rVar);
        j20.o oVar = (j20.o) y3Var;
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("EcsPoiService", "2 asyncGetAndUpdatePoiInfo account not ready");
            b0Var.mo146xb9724478(oVar.Ai(107, 0.0f, 0.0f, 0L));
            return;
        }
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        ((sb0.f) jVar).getClass();
        boolean z17 = false;
        boolean d17 = j35.u.d(context, "android.permission.ACCESS_FINE_LOCATION", false);
        boolean Ri = ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ri(d85.g0.LOCAION, d85.f0.G);
        if (!d17 || !Ri) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("EcsPoiService", "source:2 asyncGetAndUpdatePoiInfo hasSystemPermission:" + d17 + " hasBusinessPermission:" + Ri);
            if (d17) {
                b0Var.mo146xb9724478(oVar.Ai(103, 0.0f, 0.0f, 0L));
                return;
            } else {
                b0Var.mo146xb9724478(oVar.Ai(104, 0.0f, 0.0f, 0L));
                return;
            }
        }
        bw5.r6 Bi = oVar.Bi();
        long c17 = c01.id.c();
        long j17 = Bi.f113949g;
        if (c10528xc51e3780.f147158d > 0 && r3 * 1000 < c17 - j17) {
            z17 = true;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("source:2 asyncGetAndUpdatePoiInfo needUpdatePoi:");
        sb6.append(z17);
        sb6.append(",waitingPoiUpdateResult:");
        boolean z18 = c10528xc51e3780.f147159e;
        sb6.append(z18);
        sb6.append(",waitingPoiUpdateTimeoutSec:");
        int i17 = c10528xc51e3780.f147160f;
        sb6.append(i17);
        sb6.append(",curTime:");
        sb6.append(c17);
        sb6.append(", cache time:");
        sb6.append(Bi.f113949g);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsPoiService", sb6.toString());
        if (!z17) {
            b0Var.mo146xb9724478(Bi);
            return;
        }
        jz5.g gVar = oVar.f378771e;
        if (z18) {
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) ((jz5.n) gVar).mo141623x754a37bb()).mo50293x3498a0(new j20.n(b0Var, oVar, i17));
        } else {
            b0Var.mo146xb9724478(Bi);
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) ((jz5.n) gVar).mo141623x754a37bb()).mo50293x3498a0(new j20.n(null, oVar, i17));
        }
    }
}
