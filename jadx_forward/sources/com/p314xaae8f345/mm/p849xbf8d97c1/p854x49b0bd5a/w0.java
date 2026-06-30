package com.p314xaae8f345.mm.p849xbf8d97c1.p854x49b0bd5a;

/* loaded from: classes5.dex */
public final class w0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f150345d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(org.json.JSONObject jSONObject) {
        super(1);
        this.f150345d = jSONObject;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        try {
            this.f150345d.put("hprof", (java.lang.String) it);
        } catch (java.lang.Throwable th6) {
            oj.j.d("MicroMsg.monitor.ProcBackgroundMemory", th6, "", new java.lang.Object[0]);
        }
        return jz5.f0.f384359a;
    }
}
