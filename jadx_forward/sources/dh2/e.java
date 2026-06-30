package dh2;

/* loaded from: classes10.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dh2.x f313973d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(dh2.x xVar) {
        super(1);
        this.f313973d = xVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6517xa6e83e44 it = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6517xa6e83e44) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("revertInt", this.f313973d.f314008o);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        it.q(r26.i0.t(jSONObject2, ",", ";", false));
        return jz5.f0.f384359a;
    }
}
