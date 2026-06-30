package t00;

/* loaded from: classes9.dex */
public final class k0 implements t00.r0 {

    /* renamed from: a, reason: collision with root package name */
    public j20.e f495838a;

    @Override // t00.r0
    public t00.m a() {
        t00.m mVar = t00.n.f495853a;
        return t00.n.B;
    }

    @Override // t00.r0
    public void c(int i17, android.content.Context context, org.json.JSONObject data, c00.n3 callback, org.json.JSONObject jSONObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        int optInt = data.optInt("type");
        int optInt2 = data.optInt("poiValidTime");
        boolean z17 = data.optInt("waitingPoiUpdateResult") == 1;
        int optInt3 = data.optInt("waitingPoiUpdateTimeout");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetEcsWeShopPoiDataActionHandler", "context:" + context + ",type:" + optInt + ",poiValidTime:" + optInt2 + ",waitingPoiUpdateResult:" + z17 + ",waitingPoiUpdateTimeout:" + optInt3);
        if (optInt == 1) {
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p725x60b7c31.C10528xc51e3780(optInt2, false, 0), t00.f0.class, new t00.g0(callback));
            return;
        }
        if (optInt == 2) {
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p725x60b7c31.C10528xc51e3780(optInt2, z17, optInt3), t00.c0.class, new t00.h0(callback));
            return;
        }
        if (optInt != 3) {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54560xfb23a562, "invalid type");
            callback.d(jSONObject2);
            return;
        }
        if (this.f495838a != null) {
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54560xfb23a562, "requesting");
            callback.d(jSONObject3);
            return;
        }
        if (!(context instanceof android.app.Activity)) {
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            jSONObject4.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54560xfb23a562, "context err");
            callback.d(jSONObject4);
            return;
        }
        j20.e eVar = new j20.e();
        android.app.Activity activity = (android.app.Activity) context;
        t00.j0 j0Var = new t00.j0(optInt2, z17, optInt3, callback, this);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        j20.b bVar = new j20.b(j0Var, eVar);
        boolean Ni = ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ni(activity, new java.lang.String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, 157, "", "", null, new j20.c(bVar));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsPoiPermission", "hasPermission " + Ni);
        if (Ni) {
            bVar.mo146xb9724478(java.lang.Boolean.TRUE);
        }
        this.f495838a = eVar;
    }
}
