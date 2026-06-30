package md3;

/* loaded from: classes.dex */
public final class l extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ecs.p1085x60b7c31.m.f34130x24728b;
    }

    @Override // lc3.c0
    public boolean n() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_ecs_handle_action_main_thread_android, true);
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        org.json.JSONObject jSONObject;
        android.content.Context context;
        android.content.Context context2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBJsApiHandleEcsAction", "MBJsApiHandleEcsAction: " + data);
        oc3.c e17 = e();
        c00.r3 r3Var = (c00.r3) i95.n0.c(c00.r3.class);
        if (r3Var != null) {
            lc3.e eVar = this.f399423a;
            if (eVar == null || (context2 = eVar.B0()) == null) {
                context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            }
            jSONObject = ((b00.m2) r3Var).Di(3, context2, data, new md3.j(e17.f425864a));
        } else {
            jSONObject = null;
        }
        org.json.JSONObject jSONObject2 = jSONObject;
        c00.r3 r3Var2 = (c00.r3) i95.n0.c(c00.r3.class);
        lc3.e eVar2 = this.f399423a;
        if (eVar2 == null || (context = eVar2.B0()) == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        ((b00.m2) r3Var2).Bi(3, context, data, new md3.k(this), jSONObject2);
    }
}
