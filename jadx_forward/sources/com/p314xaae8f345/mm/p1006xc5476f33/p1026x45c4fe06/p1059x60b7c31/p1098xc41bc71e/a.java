package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e;

/* loaded from: classes9.dex */
public final class a implements km5.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o31.d f163851a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o31.b f163852b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o31.e f163853c;

    public a(o31.d dVar, o31.b bVar, o31.e eVar) {
        this.f163851a = dVar;
        this.f163852b = bVar;
        this.f163853c = eVar;
    }

    @Override // km5.f
    public void a(java.lang.Object obj) {
        r45.js5 js5Var = (r45.js5) obj;
        o31.e eVar = this.f163853c;
        o31.b bVar = this.f163852b;
        o31.d dVar = this.f163851a;
        if (js5Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.WXA.FULL.CompatNetSceneDispatcherDefaultAdapter", "onTerminate null response, uri=" + ((o31.c) dVar).f424203e);
            if (bVar != null) {
                ((f31.f) bVar).b(4, -1, null, eVar);
                return;
            }
            return;
        }
        try {
            ((o31.c) dVar).f424201c.mo11468x92b714fd(js5Var.mo14344x5f01b1f6());
            if (bVar != null) {
                ((f31.f) bVar).b(0, 0, null, eVar);
            }
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.WXA.FULL.CompatNetSceneDispatcherDefaultAdapter", "onTerminate uri=" + ((o31.c) dVar).f424203e + ", parse responseProtoBuf get e=" + e17);
            if (bVar != null) {
                ((f31.f) bVar).b(5, 0, null, eVar);
            }
        }
    }
}
