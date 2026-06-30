package a85;

/* loaded from: classes15.dex */
public final class f implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a85.g f83932d;

    public f(a85.g gVar) {
        this.f83932d = gVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public final void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        a85.g gVar = this.f83932d;
        ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).getClass();
        if ((m1Var instanceof su4.q1) && i17 == 0 && i18 == 0) {
            ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).getClass();
            java.lang.String str2 = ((su4.q1) m1Var).f494582o.f456462d;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str2 == null) {
                str2 = "";
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            boolean z18 = false;
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
                org.json.JSONArray optJSONArray = jSONObject.optJSONArray("items");
                if (optJSONArray == null) {
                    optJSONArray = new org.json.JSONArray();
                }
                z18 = jSONObject.optBoolean("continueFlag", false);
                arrayList.addAll(a85.g.b(gVar, optJSONArray));
            } catch (java.lang.Exception unused) {
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SimilarEmoji", "get response success: " + arrayList.size());
            a85.a aVar = gVar.f83935f;
            aVar.getClass();
            java.util.ArrayList arrayList2 = aVar.f402152f;
            if (arrayList2.size() > 0 && ((ir.u0) kz5.n0.i0(arrayList2)).f375440a == 104) {
                arrayList2.remove(kz5.n0.i0(arrayList2));
            }
            arrayList2.addAll(arrayList);
            a85.a aVar2 = gVar.f83935f;
            if (!z18) {
                new com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4();
                aVar2.getClass();
                aVar2.x(aVar2.mo1894x7e414b06(), new ir.z0(101));
            }
            aVar2.m8146xced61ae5();
        }
    }
}
