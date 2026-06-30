package com.tencent.mm.matrix.monitor;

/* loaded from: classes5.dex */
public final class w0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f68812d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(org.json.JSONObject jSONObject) {
        super(1);
        this.f68812d = jSONObject;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object it) {
        kotlin.jvm.internal.o.g(it, "it");
        try {
            this.f68812d.put("hprof", (java.lang.String) it);
        } catch (java.lang.Throwable th6) {
            oj.j.d("MicroMsg.monitor.ProcBackgroundMemory", th6, "", new java.lang.Object[0]);
        }
        return jz5.f0.f302826a;
    }
}
