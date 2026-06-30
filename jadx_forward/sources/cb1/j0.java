package cb1;

/* loaded from: classes7.dex */
public class j0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f4271x366c91de = 209;

    /* renamed from: NAME */
    private static final java.lang.String f4272x24728b = "getPhoneNumber";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject data, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 env = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) lVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (env.mo50352x76847179() == null || !(env.mo50352x76847179() instanceof android.app.Activity)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetPhoneNumberNew", "env is null, return");
            env.a(i17, o("fail"));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetPhoneNumberNew", "getPhoneNumber data:%s", data.toString());
        env.mo50352x76847179();
        vi1.l2 l2Var = vi1.l2.f518934a;
        java.lang.String mo48798x74292566 = env.mo48798x74292566();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo48798x74292566, "getAppId(...)");
        synchronized (l2Var) {
            vi1.l2.f518935b.put(mo48798x74292566, new vi1.j2(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, null, 268435455, null));
        }
        java.lang.String optString = data.optString("api_name", "webapi_getuserwxphone");
        boolean optBoolean = data.optBoolean("with_credentials", true);
        fl1.g1 g1Var = new fl1.g1(env.mo50352x76847179());
        km5.q qVar = (km5.q) ((km5.q) km5.u.d()).n(new cb1.k(this, g1Var, env)).q(new cb1.l(this)).q(new cb1.m(this, env, optString, optBoolean)).q(new cb1.n(this, env, optString, optBoolean)).q(cb1.o.f121812a).h(new cb1.q(env, this, g1Var)).b(lm5.d.f401134b, new cb1.r(env, i17, this));
        qVar.s(new cb1.s(env, i17, this));
        qVar.t(lm5.d.f401133a, new cb1.t(env, g1Var));
    }

    public boolean C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 env, cb1.i iVar) {
        r45.i7 i7Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        return (iVar == null || (i7Var = iVar.f121786b) == null || !i7Var.f458306d) ? false : true;
    }
}
