package gd;

/* loaded from: classes9.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public gd.b f352006a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.p362xadfe2b3.p363x208df1fe.p364x10b44e6c.p368xccc6d529.C3693x51e018ce f352007b;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.liteapp.framework.dynamic_module.realname.WXPLiteAppRealnameService$resultEvent$1] */
    public e() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f352007b = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5873x7f10cbaa>(a0Var) { // from class: com.tencent.liteapp.framework.dynamic_module.realname.WXPLiteAppRealnameService$resultEvent$1
            {
                this.f39173x3fe91575 = 1142547354;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5873x7f10cbaa c5873x7f10cbaa) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5873x7f10cbaa event = c5873x7f10cbaa;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.pp ppVar = event.f136181g;
                int i17 = ppVar.f89177a;
                gd.e eVar = gd.e.this;
                if (i17 == 1) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.putOpt("UnderAgeResult", "1");
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ppVar.f89178b)) {
                        jSONObject.putOpt("appid", ppVar.f89178b);
                    }
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ppVar.f89179c)) {
                        jSONObject.putOpt(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, ppVar.f89179c);
                    }
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ppVar.f89180d)) {
                        jSONObject.putOpt("query", ppVar.f89180d);
                    }
                    gd.b bVar = eVar.f352006a;
                    if (bVar == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("verifyParentCallback");
                        throw null;
                    }
                    bVar.mo28763xc397f4dd(jSONObject);
                } else {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.putOpt("UnderAgeResult", "0");
                    gd.b bVar2 = eVar.f352006a;
                    if (bVar2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("verifyParentCallback");
                        throw null;
                    }
                    bVar2.mo28763xc397f4dd(jSONObject2);
                }
                mo48814x2efc64();
                return false;
            }
        };
    }
}
