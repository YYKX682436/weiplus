package a85;

/* loaded from: classes15.dex */
public final class d implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a85.g f83928d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2608xc9fa65a8.p2609x2eefaa.C21007x2f4a06dc f83929e;

    public d(a85.g gVar, com.p314xaae8f345.mm.p2608xc9fa65a8.p2609x2eefaa.C21007x2f4a06dc c21007x2f4a06dc) {
        this.f83928d = gVar;
        this.f83929e = c21007x2f4a06dc;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public final void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        boolean z17;
        ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).getClass();
        if (!(m1Var instanceof su4.q1) || i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SimilarEmoji", "get response fail. errType:%d, errCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            a85.a aVar = this.f83928d.f83935f;
            aVar.getClass();
            aVar.E(arrayList);
            if (this.f83929e.a()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 N = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).N(this.f83929e.f274683e);
                a85.a aVar2 = this.f83928d.f83935f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(N);
                aVar2.I(N);
            } else {
                a85.a aVar3 = this.f83928d.f83935f;
                aVar3.getClass();
                aVar3.J(new com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4());
            }
            a85.a aVar4 = this.f83928d.f83935f;
            aVar4.x(aVar4.mo1894x7e414b06(), new ir.z0(108));
            this.f83928d.f83935f.m8146xced61ae5();
            return;
        }
        ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).getClass();
        java.lang.String str2 = ((su4.q1) m1Var).f494582o.f456462d;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
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
                arrayList2.addAll(a85.g.b(this.f83928d, optJSONArray));
                arrayList3.addAll(a85.g.a(this.f83928d, optJSONArray));
            } catch (java.lang.Exception unused) {
            }
        } catch (java.lang.Exception unused2) {
            z17 = false;
        }
        a85.a aVar5 = this.f83928d.f83935f;
        aVar5.getClass();
        aVar5.E(arrayList2);
        if (this.f83929e.a()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 N2 = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).N(this.f83929e.f274683e);
            a85.a aVar6 = this.f83928d.f83935f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(N2);
            aVar6.I(N2);
        } else {
            a85.a aVar7 = this.f83928d.f83935f;
            aVar7.getClass();
            aVar7.J(new com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4());
        }
        this.f83928d.f83935f.f83917o = !arrayList2.isEmpty();
        if (arrayList2.isEmpty()) {
            a85.a aVar8 = this.f83928d.f83935f;
            aVar8.x(aVar8.mo1894x7e414b06(), new ir.z0(106));
        }
        if (!z17) {
            a85.a aVar9 = this.f83928d.f83935f;
            new com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4();
            aVar9.getClass();
            aVar9.x(aVar9.mo1894x7e414b06(), new ir.z0(101));
        }
        this.f83928d.f83935f.m8146xced61ae5();
        int size = arrayList3.size() < 8 ? arrayList3.size() : 8;
        java.util.List subList = arrayList3.subList(0, size);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(subList, "subList(...)");
        java.util.List S0 = kz5.n0.S0(subList);
        arrayList3.clear();
        arrayList3.addAll(S0);
        ((ku5.t0) ku5.t0.f394148d).g(new z75.b(size, arrayList3));
    }
}
