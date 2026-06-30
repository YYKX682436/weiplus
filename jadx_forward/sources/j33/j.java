package j33;

/* loaded from: classes10.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j33.j f378974a = new j33.j();

    public final void a(android.content.Context context, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (i17 < 200) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
            u1Var.u(i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.f573720fj5));
            u1Var.n(i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.fil));
            u1Var.l(j33.f.f378970a);
            u1Var.q(false);
            return;
        }
        if (i17 == 201) {
            java.util.HashMap hashMap = j33.e.f378968b;
            org.json.JSONObject jSONObject = (org.json.JSONObject) hashMap.get(java.lang.Integer.valueOf(i18));
            org.json.JSONObject jSONObject2 = (org.json.JSONObject) hashMap.get(-1);
            int optInt = (jSONObject == null || !jSONObject.has("min-duration-ms")) ? (jSONObject2 == null || !jSONObject2.has("min-duration-ms")) ? 1000 : jSONObject2.optInt("min-duration-ms", 1000) : jSONObject.optInt("min-duration-ms", 1000);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
            java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fjd, java.lang.Integer.valueOf(optInt / 1000));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            u1Var2.u(string);
            u1Var2.n(i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.fil));
            u1Var2.l(j33.i.f378973a);
            u1Var2.q(false);
            return;
        }
        if (i17 >= 300) {
            if (i17 < 400) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var3 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
                u1Var3.u(i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.fj7));
                u1Var3.n(i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.fil));
                u1Var3.l(j33.g.f378971a);
                u1Var3.q(false);
                return;
            }
            return;
        }
        java.util.HashMap hashMap2 = j33.e.f378968b;
        org.json.JSONObject jSONObject3 = (org.json.JSONObject) hashMap2.get(java.lang.Integer.valueOf(i18));
        org.json.JSONObject jSONObject4 = (org.json.JSONObject) hashMap2.get(-1);
        int i19 = 300000;
        if (jSONObject3 != null && jSONObject3.has("max-duration-ms")) {
            i19 = jSONObject3.optInt("max-duration-ms", 300000);
        } else if (jSONObject4 != null && jSONObject4.has("max-duration-ms")) {
            i19 = jSONObject4.optInt("max-duration-ms", 300000);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var4 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
        java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fj_, java.lang.Integer.valueOf((i19 / 1000) / 60));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        u1Var4.u(string2);
        u1Var4.n(i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.fil));
        u1Var4.l(j33.h.f378972a);
        u1Var4.q(false);
    }
}
