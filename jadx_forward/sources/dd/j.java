package dd;

/* loaded from: classes9.dex */
public final class j implements q80.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.p f310414a;

    public j(yz5.p pVar) {
        this.f310414a = pVar;
    }

    @Override // q80.x
    /* renamed from: onActivityResult */
    public final void mo55562x9d4787cb(int i17, int i18, android.content.Intent intent) {
        yz5.p pVar = this.f310414a;
        if (i17 == 1 && i18 == -1) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
                java.util.List f07 = stringExtra != null ? r26.n0.f0(stringExtra, new java.lang.String[]{","}, false, 0, 6, null) : null;
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                if (f07 != null) {
                    java.util.Iterator it = f07.iterator();
                    while (it.hasNext()) {
                        jSONArray.put((java.lang.String) it.next());
                    }
                }
                jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, jSONArray);
                pVar.mo149xb9724478(dd.d.f310404a.i(jSONObject, ""), java.lang.Boolean.FALSE);
            } catch (org.json.JSONException unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiSelectContactImpl", "select callback json error");
                pVar.mo149xb9724478(dd.c.g(dd.d.f310404a, null, null, 3, null), java.lang.Boolean.FALSE);
            }
        }
    }
}
