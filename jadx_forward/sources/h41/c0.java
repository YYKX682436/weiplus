package h41;

/* loaded from: classes15.dex */
public final class c0 implements ey.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h41.i0 f360306a;

    public c0(h41.i0 i0Var) {
        this.f360306a = i0Var;
    }

    @Override // ey.k
    public java.lang.String a() {
        return "contact";
    }

    @Override // ey.k
    public java.lang.String b() {
        return "contact::display_contact_list";
    }

    @Override // ey.k
    public void c(com.p314xaae8f345.p3133xd0ce8b26.aff.p3149x7a606665.e notification) {
        java.lang.String str;
        java.lang.String str2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(notification, "notification");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(notification.c());
            org.json.JSONArray jSONArray = jSONObject.getJSONArray("displayed_contacts");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONArray, "getJSONArray(...)");
            c75.c.d(jSONArray, new h41.b0(arrayList));
            java.lang.String optString = jSONObject.optString("error_description", "");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
            str = optString;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OVCFunctionCallEventStubImpl", "parse display_contact_list return error: " + e17);
            str = "";
        }
        try {
            str2 = new org.json.JSONObject(notification.b()).optString("display_scene", "send_message");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "optString(...)");
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OVCFunctionCallEventStubImpl", "parse display_contact_list param error: " + e18);
            str2 = "send_message";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OVCFunctionCallEventStubImpl", "onDisplayContactListEnd: contacts=" + kz5.n0.g0(arrayList, null, null, null, 0, null, null, 63, null) + ", scene=" + str2 + ", error=" + str);
        com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.d dVar = this.f360306a.f360327a;
        if (dVar != null) {
            dVar.c1(arrayList, str2);
        }
    }
}
