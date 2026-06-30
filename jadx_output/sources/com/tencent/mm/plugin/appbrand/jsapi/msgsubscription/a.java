package com.tencent.mm.plugin.appbrand.jsapi.msgsubscription;

/* loaded from: classes9.dex */
public final class a implements km5.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o31.d f82318a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o31.b f82319b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o31.e f82320c;

    public a(o31.d dVar, o31.b bVar, o31.e eVar) {
        this.f82318a = dVar;
        this.f82319b = bVar;
        this.f82320c = eVar;
    }

    @Override // km5.f
    public void a(java.lang.Object obj) {
        r45.js5 js5Var = (r45.js5) obj;
        o31.e eVar = this.f82320c;
        o31.b bVar = this.f82319b;
        o31.d dVar = this.f82318a;
        if (js5Var == null) {
            com.tencent.mars.xlog.Log.e("Luggage.WXA.FULL.CompatNetSceneDispatcherDefaultAdapter", "onTerminate null response, uri=" + ((o31.c) dVar).f342670e);
            if (bVar != null) {
                ((f31.f) bVar).b(4, -1, null, eVar);
                return;
            }
            return;
        }
        try {
            ((o31.c) dVar).f342668c.parseFrom(js5Var.toByteArray());
            if (bVar != null) {
                ((f31.f) bVar).b(0, 0, null, eVar);
            }
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("Luggage.WXA.FULL.CompatNetSceneDispatcherDefaultAdapter", "onTerminate uri=" + ((o31.c) dVar).f342670e + ", parse responseProtoBuf get e=" + e17);
            if (bVar != null) {
                ((f31.f) bVar).b(5, 0, null, eVar);
            }
        }
    }
}
