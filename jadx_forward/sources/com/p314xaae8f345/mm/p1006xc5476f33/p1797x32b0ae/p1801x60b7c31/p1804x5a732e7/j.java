package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes.dex */
public class j implements com.p314xaae8f345.mm.p939x633fb29.p940x30579f.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f225151a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f225152b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f225153c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.k f225154d;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.k kVar, java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        this.f225154d = kVar;
        this.f225151a = str;
        this.f225152b = jSONObject;
        this.f225153c = z17;
    }

    @Override // com.p314xaae8f345.mm.p939x633fb29.p940x30579f.b
    public void a(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.k kVar = this.f225154d;
        if (i17 == 0) {
            kVar.A(this.f225151a, this.f225152b, this.f225153c);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiAddContact", "EU user failed");
            kVar.f224976f.a("addContact:fail  EU user failed");
        }
    }
}
