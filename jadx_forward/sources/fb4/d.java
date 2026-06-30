package fb4;

/* loaded from: classes11.dex */
public final class d implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kb4.b f342410a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eb4.k f342411b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f342412c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f342413d;

    public d(kb4.b bVar, eb4.k kVar, java.lang.String str, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var) {
        this.f342410a = bVar;
        this.f342411b = kVar;
        this.f342412c = str;
        this.f342413d = z2Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3
    public final void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.wheelpicker.WheelPickerCaller$handleOpenWheelPicker$2");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("ret", 0);
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.Iterator it = ((java.util.ArrayList) ((lb4.c) this.f342410a).a()).iterator();
            while (it.hasNext()) {
                kb4.d dVar = (kb4.d) it.next();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                dVar.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getKey", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.PickItem");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getKey", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.PickItem");
                jSONObject.put("k", dVar.f387777a);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLabel", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.PickItem");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLabel", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.PickItem");
                jSONObject.put(org.p3343x72743996.p3344x2e06d1.C29284xa13724f3.V, dVar.f387778b);
                jSONArray.put(jSONObject);
            }
            hashMap.put("jsapi_callback_json_special_key", "result");
            java.lang.String jSONArray2 = jSONArray.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONArray2, "toString(...)");
            hashMap.put("result", jSONArray2);
        } catch (java.lang.Exception unused) {
        }
        this.f342411b.e(this.f342412c, "ok", hashMap);
        this.f342413d.B();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.wheelpicker.WheelPickerCaller$handleOpenWheelPicker$2");
    }
}
