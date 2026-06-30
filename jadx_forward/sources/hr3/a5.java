package hr3;

/* loaded from: classes8.dex */
public final class a5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16846x5788f028 f364909d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16846x5788f028 activityC16846x5788f028) {
        super(2);
        this.f364909d = activityC16846x5788f028;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str;
        pr3.c item = (pr3.c) obj;
        com.p314xaae8f345.mm.p670x38b72420.o contact = (com.p314xaae8f345.mm.p670x38b72420.o) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "$this$item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16846x5788f028.f235227y;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16846x5788f028 activityC16846x5788f028 = this.f364909d;
        activityC16846x5788f028.getClass();
        yq3.v vVar = (yq3.v) contact;
        java.lang.String str2 = null;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c01.z1.r(), vVar.h())) {
            java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_PROFILE_WEIDIANINFO_STRING, null);
            if (m17 instanceof java.lang.String) {
                str = (java.lang.String) m17;
            }
            str = null;
        } else {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = vVar.f546068f;
            if (z3Var != null) {
                str = z3Var.D1;
            }
            str = null;
        }
        if (str != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                activityC16846x5788f028.f235244w = jSONObject.optString("ShopUrl");
                str2 = jSONObject.optString("ShopName");
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ContactMoreInfoUI", e17, "", new java.lang.Object[0]);
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC16846x5788f028.f235244w)) {
            item.f439489g = str2;
            item.f439493n = java.lang.Integer.valueOf(activityC16846x5788f028.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a1u));
            item.f439499t = new hr3.n5(activityC16846x5788f028);
        }
        return jz5.f0.f384359a;
    }
}
