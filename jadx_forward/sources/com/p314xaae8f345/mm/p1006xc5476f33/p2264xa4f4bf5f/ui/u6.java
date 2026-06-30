package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class u6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f255877d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f255878e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18635xb8188ef9 f255879f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017, com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18635xb8188ef9 activityC18635xb8188ef9, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f255878e = c22621x7603e017;
        this.f255879f = activityC18635xb8188ef9;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.u6 u6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.u6(this.f255878e, this.f255879f, interfaceC29045xdcb5ca57);
        u6Var.f255877d = obj;
        return u6Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.u6 u6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.u6) mo148xaf65a0fc((bw5.yn0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        u6Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        bw5.yn0 yn0Var = (bw5.yn0) this.f255877d;
        android.content.Context context = this.f255878e.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        vj4.d dVar = (vj4.d) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(vj4.d.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18635xb8188ef9 activityC18635xb8188ef9 = this.f255879f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.l5 l5Var = activityC18635xb8188ef9.f255089x;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = activityC18635xb8188ef9.C;
        java.lang.String str = dVar.f519222d;
        if (yn0Var == null || l5Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onCollectRecommendIconResp: null");
        } else if (c22621x7603e017 == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c22621x7603e017.getText().toString(), yn0Var.m13425xfb85ada3())) {
            java.util.LinkedList linkedList = yn0Var.f117119d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linkedList, "getRecommendIconIds(...)");
            if (!linkedList.isEmpty()) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("recommend_icons", new org.json.JSONArray((java.util.Collection) linkedList));
                jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24, yn0Var.m13425xfb85ada3());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onCollectRecommendIconResp: icon size=" + linkedList.size() + ", wording=" + yn0Var.m13425xfb85ada3());
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.d9) l5Var).G("onRequestRecommendIconComplete", jSONObject);
                android.app.Activity context2 = dVar.m80379x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
                pf5.z zVar2 = pf5.z.f435481a;
                if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                zj4.e eVar = (zj4.e) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(zj4.e.class);
                eVar.getClass();
                eVar.f554880i = linkedList;
                if ((z65.c.a() || com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c) && 1 == bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2569xa4f4bf5f.C20704x5099315b())) {
                    android.widget.Toast.makeText(dVar.m80379x76847179(), "Debug:RecommendIconCount=" + linkedList.size(), 0).show();
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onCollectRecommendIconResp: skip");
        }
        return jz5.f0.f384359a;
    }
}
