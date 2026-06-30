package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public final class g4 implements r.a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f162771a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f162772b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f162773c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.i4 f162774d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f162775e;

    public g4(java.lang.ref.WeakReference weakReference, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.i4 i4Var, java.lang.String str) {
        this.f162772b = weakReference;
        this.f162773c = i17;
        this.f162774d = i4Var;
        this.f162775e = str;
    }

    @Override // r.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public java.lang.Boolean mo1850x58b836e(java.util.List input) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.i4 i4Var = this.f162774d;
        int i17 = this.f162773c;
        java.lang.ref.WeakReference weakReference = this.f162772b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(input, "input");
        if (this.f162771a) {
            z17 = false;
        } else {
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) weakReference.get();
                if (yVar != null) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    java.lang.String str = this.f162775e;
                    org.json.JSONArray jSONArray = new org.json.JSONArray();
                    java.util.Iterator it = input.iterator();
                    while (it.hasNext()) {
                        k91.v5 v5Var = (k91.v5) it.next();
                        org.json.JSONObject optJSONObject = new org.json.JSONObject(v5Var.f68905x453b082a).optJSONObject("PluginInfo");
                        if (optJSONObject == null) {
                            optJSONObject = new org.json.JSONObject();
                        }
                        jSONArray.put(optJSONObject.put("appId", v5Var.f68904x28d45f97));
                    }
                    jSONObject.put("contactList", jSONArray);
                    jSONObject.put("callbackId", str);
                    yVar.a(i17, i4Var.s("ok", jSONObject));
                }
            } catch (org.json.JSONException unused) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) weakReference.get();
                if (yVar2 != null) {
                    yVar2.a(i17, i4Var.o("fail: toJson fail"));
                }
            }
            z17 = true;
            this.f162771a = true;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
