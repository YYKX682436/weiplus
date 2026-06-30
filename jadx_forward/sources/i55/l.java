package i55;

/* loaded from: classes8.dex */
public final class l extends i55.d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l() {
        super(3);
        f55.e eVar = f55.e.f341304e;
    }

    @Override // i55.d
    public boolean b(java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        return true;
    }

    @Override // i55.d
    public java.lang.String c(java.lang.String eventId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventId, "eventId");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String lowerCase = "MoreTabUI".toLowerCase(java.util.Locale.ROOT);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
        sb6.append(lowerCase);
        sb6.append('_');
        sb6.append(eventId);
        return sb6.toString();
    }

    @Override // i55.d
    public void f(long j17, java.lang.String prefKey) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prefKey, "prefKey");
        super.f(j17, prefKey);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MoreTabRedDotLogic", j17 + "  " + prefKey + " on click");
    }

    @Override // i55.d
    public void h(java.lang.String event, g55.e eVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        java.util.Objects.toString(eVar);
        java.util.Map a17 = eVar != null ? eVar.a() : new java.util.LinkedHashMap();
        e55.e eVar2 = e55.e.f331200a;
        a17.putAll(eVar2.j());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = this.f370373a;
        sb6.append(i17);
        sb6.append(" callRedDotEvent ");
        sb6.append(event);
        sb6.append(' ');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MoreTabRedDotLogic", sb6.toString());
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5893x481fedbf c5893x481fedbf = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5893x481fedbf();
        am.jq jqVar = c5893x481fedbf.f136201g;
        jqVar.f88595a = i17;
        jqVar.f88596b = event;
        if (eVar != null) {
            java.lang.String str = eVar.f350495a;
            jqVar.f88598d = str;
            jqVar.f88597c = eVar2.a(str);
            jqVar.f88599e = a17;
        }
        c5893x481fedbf.e();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej(event, a17, 37181);
    }
}
