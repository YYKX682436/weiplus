package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes8.dex */
public final class x3 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f268184d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.k f268185e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f268186f;

    public x3(int i17, nw4.k kVar, nw4.y2 y2Var) {
        this.f268184d = i17;
        this.f268185e = kVar;
        this.f268186f = y2Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p646xf2865d2e.C10318x1cf69000 c10318x1cf69000 = (com.p314xaae8f345.mm.p646xf2865d2e.C10318x1cf69000) obj;
        nw4.k kVar = this.f268185e;
        int i17 = this.f268184d;
        nw4.y2 y2Var = this.f268186f;
        if (c10318x1cf69000 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandleMPPageAction", "checkCanCreatePhotoAccount IPC resp null, scene=" + i17);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("err_desc", "ipc resp null");
            kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":fail", hashMap);
            return;
        }
        if (!c10318x1cf69000.f145144d) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkCanCreatePhotoAccount IPC fail, scene=");
            sb6.append(i17);
            sb6.append(", errorMsg=");
            java.lang.String str = c10318x1cf69000.f145150m;
            sb6.append(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandleMPPageAction", sb6.toString());
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("err_desc", str);
            kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":fail", hashMap2);
            return;
        }
        java.util.HashMap hashMap3 = new java.util.HashMap();
        hashMap3.put("can_create_photo_acct", java.lang.Integer.valueOf(c10318x1cf69000.f145145e ? 1 : 0));
        hashMap3.put("can_create_biz_acct", java.lang.Integer.valueOf(c10318x1cf69000.f145146f ? 1 : 0));
        if (i17 != 0) {
            hashMap3.put("sceneEnabled", java.lang.Integer.valueOf(c10318x1cf69000.f145147g ? 1 : 0));
            java.util.HashMap hashMap4 = new java.util.HashMap();
            hashMap4.put("register", c10318x1cf69000.f145148h);
            hashMap4.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54512xc618a7cf, c10318x1cf69000.f145149i);
            hashMap3.put("wording", hashMap4);
        }
        kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":ok", hashMap3);
    }
}
