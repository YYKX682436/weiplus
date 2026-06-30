package fe1;

/* loaded from: classes15.dex */
public abstract class a extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (lVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.TransitCard.AbsJsApi", "invoke, env is null");
            return;
        }
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.TransitCard.AbsJsApi", "invoke, data is null");
            lVar.a(i17, de1.b.a(this, 10011, "fail:missing parameters", null));
            return;
        }
        java.util.Map map = fe1.v.f343034b;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) fe1.v.f343034b;
        fe1.v vVar = (fe1.v) concurrentHashMap.get(lVar.mo48798x74292566());
        if (vVar == null) {
            java.lang.String mo48798x74292566 = lVar.mo48798x74292566();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo48798x74292566, "getAppId(...)");
            vVar = new fe1.v(mo48798x74292566);
            java.lang.String mo48798x742925662 = lVar.mo48798x74292566();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo48798x742925662, "getAppId(...)");
            concurrentHashMap.put(mo48798x742925662, vVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.TransitCard.Manager", "get, created new manager for appId=" + lVar.mo48798x74292566());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.TransitCard.AbsJsApi", "invoke, appId=" + lVar.mo48798x74292566() + ", api=" + p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(getClass()).g());
        C(lVar, jSONObject, i17, vVar);
    }

    public abstract void C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17, fe1.v vVar);

    public final void D(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l env, int i17, he1.k result, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        if (result instanceof he1.j) {
            env.a(i17, de1.b.a(this, 0, "ok", lVar != null ? (java.util.Map) lVar.mo146xb9724478(((he1.j) result).f362417a) : null));
            return;
        }
        if (result instanceof he1.i) {
            he1.i iVar = (he1.i) result;
            java.lang.String str = "fail:" + iVar.f362416b;
            int i18 = iVar.f362415a;
            env.a(i17, de1.b.a(this, i18, str, kz5.c1.i(new jz5.l(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56295xe7a05993, java.lang.Integer.valueOf(i18)))));
        }
    }
}
