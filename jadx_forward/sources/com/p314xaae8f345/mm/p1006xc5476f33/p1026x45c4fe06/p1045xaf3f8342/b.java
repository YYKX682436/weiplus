package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342;

/* loaded from: classes7.dex */
public class b implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11807xf443363a f159052d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11807xf443363a c11807xf443363a) {
        this.f159052d = c11807xf443363a;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
        try {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            cf.f.b(jSONObject.getJSONArray("list"), new k91.x(this, linkedList));
            this.f159052d.M.f158809h.put(jSONObject.getLong("UsedTime"), linkedList);
        } catch (org.json.JSONException unused) {
        }
        return jz5.f0.f384359a;
    }
}
