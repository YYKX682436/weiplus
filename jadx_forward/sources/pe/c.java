package pe;

/* loaded from: classes7.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pe.e f435123d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(pe.e eVar) {
        super(1);
        this.f435123d = eVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        org.json.JSONObject jSONObject;
        java.lang.String str = (java.lang.String) obj;
        if (!(str == null || str.length() == 0)) {
            java.util.HashMap hashMap = this.f435123d.f435124a;
            if (pe.a.f435121a != null) {
                com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
                com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f2 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
                java.lang.String aj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj(str, "");
                boolean b17 = j62.e.g().b(str, c19767x257d7f, c19767x257d7f2);
                jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, str);
                    jSONObject.put("value", aj6);
                    jSONObject.put("exptid", b17 ? c19767x257d7f.f38864x6ac9171 : -1);
                    jSONObject.put("groupid", b17 ? c19767x257d7f2.f38864x6ac9171 : -1);
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaCommLibRuntimeReader", e17.getMessage());
                }
            } else {
                jSONObject = new org.json.JSONObject();
            }
            hashMap.put(str, jSONObject);
        }
        return jz5.f0.f384359a;
    }
}
