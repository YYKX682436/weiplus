package a85;

/* loaded from: classes15.dex */
public final class d implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a85.g f2395d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.search.data.SimilarEmojiQueryModel f2396e;

    public d(a85.g gVar, com.tencent.mm.search.data.SimilarEmojiQueryModel similarEmojiQueryModel) {
        this.f2395d = gVar;
        this.f2396e = similarEmojiQueryModel;
    }

    @Override // com.tencent.mm.modelbase.u0
    public final void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        boolean z17;
        ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).getClass();
        if (!(m1Var instanceof su4.q1) || i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SimilarEmoji", "get response fail. errType:%d, errCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            a85.a aVar = this.f2395d.f2402f;
            aVar.getClass();
            aVar.E(arrayList);
            if (this.f2396e.a()) {
                com.tencent.mm.storage.emotion.EmojiInfo N = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).N(this.f2396e.f193150e);
                a85.a aVar2 = this.f2395d.f2402f;
                kotlin.jvm.internal.o.d(N);
                aVar2.I(N);
            } else {
                a85.a aVar3 = this.f2395d.f2402f;
                aVar3.getClass();
                aVar3.J(new com.tencent.mm.storage.emotion.EmojiInfo());
            }
            a85.a aVar4 = this.f2395d.f2402f;
            aVar4.x(aVar4.getItemCount(), new ir.z0(108));
            this.f2395d.f2402f.notifyDataSetChanged();
            return;
        }
        ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).getClass();
        java.lang.String str2 = ((su4.q1) m1Var).f413049o.f374929d;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "";
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("items");
            if (optJSONArray == null) {
                optJSONArray = new org.json.JSONArray();
            }
            z17 = jSONObject.optBoolean("continueFlag", false);
            try {
                arrayList2.addAll(a85.g.b(this.f2395d, optJSONArray));
                arrayList3.addAll(a85.g.a(this.f2395d, optJSONArray));
            } catch (java.lang.Exception unused) {
            }
        } catch (java.lang.Exception unused2) {
            z17 = false;
        }
        a85.a aVar5 = this.f2395d.f2402f;
        aVar5.getClass();
        aVar5.E(arrayList2);
        if (this.f2396e.a()) {
            com.tencent.mm.storage.emotion.EmojiInfo N2 = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).N(this.f2396e.f193150e);
            a85.a aVar6 = this.f2395d.f2402f;
            kotlin.jvm.internal.o.d(N2);
            aVar6.I(N2);
        } else {
            a85.a aVar7 = this.f2395d.f2402f;
            aVar7.getClass();
            aVar7.J(new com.tencent.mm.storage.emotion.EmojiInfo());
        }
        this.f2395d.f2402f.f2384o = !arrayList2.isEmpty();
        if (arrayList2.isEmpty()) {
            a85.a aVar8 = this.f2395d.f2402f;
            aVar8.x(aVar8.getItemCount(), new ir.z0(106));
        }
        if (!z17) {
            a85.a aVar9 = this.f2395d.f2402f;
            new com.tencent.mm.storage.emotion.EmojiInfo();
            aVar9.getClass();
            aVar9.x(aVar9.getItemCount(), new ir.z0(101));
        }
        this.f2395d.f2402f.notifyDataSetChanged();
        int size = arrayList3.size() < 8 ? arrayList3.size() : 8;
        java.util.List subList = arrayList3.subList(0, size);
        kotlin.jvm.internal.o.f(subList, "subList(...)");
        java.util.List S0 = kz5.n0.S0(subList);
        arrayList3.clear();
        arrayList3.addAll(S0);
        ((ku5.t0) ku5.t0.f312615d).g(new z75.b(size, arrayList3));
    }
}
