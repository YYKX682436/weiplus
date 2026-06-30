package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes8.dex */
public class l3 implements m93.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean[] f225183a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f225184b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean[] f225185c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f225186d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f225187e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.m3 f225188f;

    public l3(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.m3 m3Var, boolean[] zArr, java.lang.String str, boolean[] zArr2, boolean z17, java.lang.String[] strArr) {
        this.f225188f = m3Var;
        this.f225183a = zArr;
        this.f225184b = str;
        this.f225185c = zArr2;
        this.f225186d = z17;
        this.f225187e = strArr;
    }

    @Override // m93.h
    public void a() {
        synchronized (this.f225183a) {
            if (!this.f225183a[0]) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LiteAppJsApiLogin", "geta8key fail");
                this.f225183a[0] = true;
                this.f225188f.f224976f.a("getA8Key fail");
            }
        }
    }

    @Override // m93.h
    public void b(m93.g gVar) {
        android.os.Bundle mo28566xf04ce124;
        synchronized (this.f225183a) {
            if (!this.f225183a[0]) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiLogin", "geta8key:" + this.f225184b);
                this.f225183a[0] = true;
                java.lang.String str = this.f225184b;
                if (str != null && com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.f226044n.contains(str)) {
                    ((java.util.HashMap) gVar.f406567c).put("referer", "https://game.weixin.qq.com/");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback m65361xd4eb96cf = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65361xd4eb96cf(this.f225188f.f224975e.f380557a);
                if (m65361xd4eb96cf != null && (mo28566xf04ce124 = m65361xd4eb96cf.mo28566xf04ce124()) != null) {
                    mo28566xf04ce124.putInt(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, gVar.f406566b);
                }
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                java.util.Map map = gVar.f406568d;
                if (map != null) {
                    for (java.util.Map.Entry entry : ((java.util.HashMap) map).entrySet()) {
                        try {
                            jSONObject.put((java.lang.String) entry.getKey(), entry.getValue());
                        } catch (org.json.JSONException unused) {
                        }
                    }
                }
                this.f225188f.f224976f.c(jSONObject, false);
                if (!this.f225185c[0]) {
                    java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        java.lang.String next = keys.next();
                        if (next.equals("uin") || next.equals("exportKey") || next.equals("exportkey") || next.equals("wx_header")) {
                            keys.remove();
                            ((java.util.HashMap) gVar.f406568d).remove(next);
                        }
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65459xcbec40f8(this.f225184b, gVar.f406565a, gVar.f406567c, gVar.f406568d, this.f225186d);
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.f fVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.f();
                fVar.f37407x225c99cd = this.f225187e[0];
                fVar.f37408x29a0f908 = gVar.f406565a;
                fVar.f37409x63953734 = jSONObject.toString();
                fVar.f37410xa783a79b = java.lang.System.currentTimeMillis() / 1000;
                fVar.f37406x8de74e8a = new org.json.JSONObject(gVar.f406567c).toString();
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().T(fVar);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiLogin", "geta8key success");
            }
        }
    }
}
