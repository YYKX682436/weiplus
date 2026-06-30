package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class m6 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f267891d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f267892e;

    public m6(nw4.k kVar, nw4.y2 y2Var) {
        this.f267891d = kVar;
        this.f267892e = y2Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        java.util.Map map;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.C19442x1b70c93e c19442x1b70c93e = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.C19442x1b70c93e) obj;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(c19442x1b70c93e.f267427f.f149939d);
            map = new java.util.LinkedHashMap();
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                java.lang.Object obj2 = jSONObject.get(next);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(next);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj2);
                map.put(next, obj2);
            }
        } catch (java.lang.Exception unused) {
            map = kz5.q0.f395534d;
        }
        boolean z17 = c19442x1b70c93e.f267425d;
        nw4.k kVar = this.f267891d;
        nw4.y2 y2Var = this.f267892e;
        if (z17) {
            kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":ok", map);
            return;
        }
        kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":fail " + c19442x1b70c93e.f267426e, map);
    }
}
