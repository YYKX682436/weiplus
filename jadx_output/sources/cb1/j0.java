package cb1;

/* loaded from: classes7.dex */
public class j0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 209;
    private static final java.lang.String NAME = "getPhoneNumber";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject data, int i17) {
        com.tencent.mm.plugin.appbrand.page.v5 env = (com.tencent.mm.plugin.appbrand.page.v5) lVar;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        if (env.getContext() == null || !(env.getContext() instanceof android.app.Activity)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetPhoneNumberNew", "env is null, return");
            env.a(i17, o("fail"));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetPhoneNumberNew", "getPhoneNumber data:%s", data.toString());
        env.getContext();
        vi1.l2 l2Var = vi1.l2.f437401a;
        java.lang.String appId = env.getAppId();
        kotlin.jvm.internal.o.f(appId, "getAppId(...)");
        synchronized (l2Var) {
            vi1.l2.f437402b.put(appId, new vi1.j2(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, null, 268435455, null));
        }
        java.lang.String optString = data.optString("api_name", "webapi_getuserwxphone");
        boolean optBoolean = data.optBoolean("with_credentials", true);
        fl1.g1 g1Var = new fl1.g1(env.getContext());
        km5.q qVar = (km5.q) ((km5.q) km5.u.d()).n(new cb1.k(this, g1Var, env)).q(new cb1.l(this)).q(new cb1.m(this, env, optString, optBoolean)).q(new cb1.n(this, env, optString, optBoolean)).q(cb1.o.f40279a).h(new cb1.q(env, this, g1Var)).b(lm5.d.f319601b, new cb1.r(env, i17, this));
        qVar.s(new cb1.s(env, i17, this));
        qVar.t(lm5.d.f319600a, new cb1.t(env, g1Var));
    }

    public boolean C(com.tencent.mm.plugin.appbrand.page.v5 env, cb1.i iVar) {
        r45.i7 i7Var;
        kotlin.jvm.internal.o.g(env, "env");
        return (iVar == null || (i7Var = iVar.f40253b) == null || !i7Var.f376773d) ? false : true;
    }
}
