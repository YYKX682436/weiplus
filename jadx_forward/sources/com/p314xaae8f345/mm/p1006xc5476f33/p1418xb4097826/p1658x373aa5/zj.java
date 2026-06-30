package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes.dex */
public final class zj implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ck f215002d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f215003e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f215004f;

    public zj(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ck ckVar, yz5.l lVar, android.content.Context context) {
        this.f215002d = ckVar;
        this.f215003e = lVar;
        this.f215004f = context;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) obj;
        yz5.l lVar = this.f215003e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ck ckVar = this.f215002d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderShareProductWxaCoverWidget", "fetch data onCallback " + c10756x2a5d7b2d.f149939d);
        try {
            java.lang.String value = c10756x2a5d7b2d.f149939d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(value, "value");
            ckVar.f213316b = value;
            org.json.JSONObject jSONObject = new org.json.JSONObject(c10756x2a5d7b2d.f149939d);
            java.lang.String optString = jSONObject.optString("feedId");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
            ckVar.f213317c = optString;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject.optString("nonceId"), "optString(...)");
            if (ckVar.f213317c.length() > 0) {
                lVar.mo146xb9724478(ckVar.e(this.f215004f));
            } else {
                lVar.mo146xb9724478(null);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.FinderShareProductWxaCoverWidget", th6, "createWidgetAsync parse result failed", new java.lang.Object[0]);
            lVar.mo146xb9724478(null);
        }
    }
}
