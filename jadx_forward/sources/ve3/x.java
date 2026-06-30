package ve3;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lve3/x;", "Lcom/tencent/mm/ipcinvoker/i;", "Lcom/tencent/mm/plugin/magicbrush/texture/IPCExternalTextureEventData;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "mb-impl_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class x implements com.p314xaae8f345.mm.p794xb0fa9b5e.i<com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1850xab7dd51b.C16465x448f9090, com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0> {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r callback) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1850xab7dd51b.C16465x448f9090 data = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1850xab7dd51b.C16465x448f9090) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        fq0.i iVar = (fq0.i) ((jz5.n) ((fq0.n) ((gq0.q) i95.n0.c(gq0.q.class))).f346990e).mo141623x754a37bb();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(dm.i4.f66865x76d1ec5a, data.f229689d);
        jSONObject.put("eventType", data.f229690e);
        java.lang.String str = data.f229691f;
        if (str != null) {
            jSONObject.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099, new org.json.JSONObject(str));
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        fq0.c0 c0Var = (fq0.c0) iVar;
        c0Var.getClass();
        jc3.b0 b0Var = c0Var.f346978e;
        if (b0Var != null) {
            sc3.q1 q1Var = ((rc3.f1) b0Var).f475523h;
            if (q1Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("server");
                throw null;
            }
            q1Var.s2("onExternalTexture", jSONObject2);
        }
        callback.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0());
    }
}
