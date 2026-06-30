package a85;

/* loaded from: classes15.dex */
public final class f implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a85.g f2399d;

    public f(a85.g gVar) {
        this.f2399d = gVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public final void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        a85.g gVar = this.f2399d;
        ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).getClass();
        if ((m1Var instanceof su4.q1) && i17 == 0 && i18 == 0) {
            ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).getClass();
            java.lang.String str2 = ((su4.q1) m1Var).f413049o.f374929d;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
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
            com.tencent.mars.xlog.Log.i("MicroMsg.SimilarEmoji", "get response success: " + arrayList.size());
            a85.a aVar = gVar.f2402f;
            aVar.getClass();
            java.util.ArrayList arrayList2 = aVar.f320619f;
            if (arrayList2.size() > 0 && ((ir.u0) kz5.n0.i0(arrayList2)).f293907a == 104) {
                arrayList2.remove(kz5.n0.i0(arrayList2));
            }
            arrayList2.addAll(arrayList);
            a85.a aVar2 = gVar.f2402f;
            if (!z18) {
                new com.tencent.mm.storage.emotion.EmojiInfo();
                aVar2.getClass();
                aVar2.x(aVar2.getItemCount(), new ir.z0(101));
            }
            aVar2.notifyDataSetChanged();
        }
    }
}
