package ox;

@j95.b
/* loaded from: classes7.dex */
public final class o extends i95.w implements tk.q {
    public void Ai(android.content.Context context, org.json.JSONObject jsonObject, tk.p publishCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsonObject, "jsonObject");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(publishCallback, "publishCallback");
        Bi(context, jsonObject, null, publishCallback);
    }

    public final void Bi(android.content.Context context, org.json.JSONObject jSONObject, java.util.List list, tk.p pVar) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggd), false, 3, null);
        pm0.v.X(new ox.j(f17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MircoMsg.BizPublishImageExternalService", "parseData, publishScene: " + jSONObject.optString("publishScene"));
        ((ox.g) ((tk.o) i95.n0.c(tk.o.class))).Zi(context, new ox.n(pVar, jSONObject, this, list, context, f17));
    }

    public void Di(android.content.Context context, org.json.JSONObject jsonObject, java.util.List list, tk.p publishCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsonObject, "jsonObject");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(publishCallback, "publishCallback");
        Bi(context, jsonObject, list, publishCallback);
    }

    public final int wi(org.json.JSONObject jSONObject) {
        tk.s[] sVarArr = tk.s.f501403d;
        int optInt = jSONObject.optInt("bizType", 0);
        if (jSONObject.optJSONObject("weAppParam").optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811) != 1384) {
            return optInt;
        }
        if (((ox.g) ((tk.o) i95.n0.c(tk.o.class))).Di()) {
            tk.s[] sVarArr2 = tk.s.f501403d;
            return 2;
        }
        tk.s[] sVarArr3 = tk.s.f501403d;
        return 1;
    }
}
