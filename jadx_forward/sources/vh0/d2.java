package vh0;

/* loaded from: classes8.dex */
public final class d2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vh0.f2 f518382d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f518383e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(vh0.f2 f2Var, java.util.Map map) {
        super(2);
        this.f518382d = f2Var;
        this.f518383e = map;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        if (obj2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatBotAgreementService", "[-] the element " + intValue + " is null in agreement info list.");
            return null;
        }
        try {
            org.json.JSONObject jSONObject = (org.json.JSONObject) obj2;
            int optInt = jSONObject.optInt(dm.i4.f66865x76d1ec5a, intValue);
            java.lang.String string = jSONObject.getString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
            java.lang.String string2 = ((org.json.JSONObject) obj2).getString("url");
            this.f518382d.getClass();
            int optInt2 = ((org.json.JSONObject) obj2).optInt("version", 0);
            java.lang.Integer num = (java.lang.Integer) this.f518383e.get(java.lang.Integer.valueOf(optInt));
            int intValue2 = num != null ? num.intValue() : 0;
            return new com.p314xaae8f345.mm.p689xc5a27af6.p772xce036727.C10697x80773040(optInt, string, string2, optInt2, optInt2 <= intValue2, intValue2 == 0);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChatBotAgreementService", th6, "[-] malformed agreement info " + intValue + " in list.", new java.lang.Object[0]);
            return null;
        }
    }
}
