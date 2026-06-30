package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes5.dex */
public final class i5 implements m33.w0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.j5 f221210a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sd.b f221211b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f221212c;

    public i5(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.j5 j5Var, sd.b bVar, java.lang.String str) {
        this.f221210a = j5Var;
        this.f221211b = bVar;
        this.f221212c = str;
    }

    @Override // m33.w0
    public void a(org.json.JSONObject jSONObject) {
        sd.l0 mo64556x9a3f0ba2;
        m33.x0.f404877a.f404878a.remove(this.f221212c);
        if (jSONObject != null) {
            this.f221210a.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("showInputToolView", "onFinish result = " + jSONObject);
            sd.a aVar = (sd.a) this.f221211b.f488129a;
            if (aVar == null || (mo64556x9a3f0ba2 = aVar.mo64556x9a3f0ba2()) == null) {
                return;
            }
            mo64556x9a3f0ba2.b("GCInputDidCommit", jSONObject);
        }
    }

    @Override // m33.w0
    public void b(m33.u0 u0Var) {
        sd.l0 mo64556x9a3f0ba2;
        if (u0Var == null) {
            return;
        }
        this.f221210a.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("showInputToolView", "GameInputStateChange onChanged state = " + u0Var);
        sd.a aVar = (sd.a) this.f221211b.f488129a;
        if (aVar == null || (mo64556x9a3f0ba2 = aVar.mo64556x9a3f0ba2()) == null) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("gamecenter_identifier", this.f221212c);
        jSONObject.put("isShow", u0Var.f404873d);
        jSONObject.put("inputHeight", u0Var.f404872c);
        jSONObject.put("inputTop", u0Var.f404871b);
        jSONObject.put("contentText", u0Var.f404870a);
        mo64556x9a3f0ba2.b("GCInputStateChange", jSONObject);
    }
}
