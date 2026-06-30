package s74;

/* loaded from: classes4.dex */
public final class y1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f486137d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f486138e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s74.o2 f486139f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f486140g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s74.f3 f486141h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, s74.o2 o2Var, java.lang.String str, s74.f3 f3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f486138e = c17933xe8d1b226;
        this.f486139f = o2Var;
        this.f486140g = str;
        this.f486141h = f3Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("create", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$5");
        s74.y1 y1Var = new s74.y1(this.f486138e, this.f486139f, this.f486140g, this.f486141h, interfaceC29045xdcb5ca57);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("create", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$5");
        return y1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$5");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$5");
        java.lang.Object mo150x989b7ca4 = ((s74.y1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$5");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$5");
        return mo150x989b7ca4;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        org.json.JSONArray optJSONArray;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$5");
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f486137d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            if (this.f486138e.m70435x4b407f77()) {
                s74.f3 D = this.f486139f.D();
                i64.u uVar = i64.u.f370855d;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateByLocalCache", "com.tencent.mm.plugin.sns.ad.model.AdDynamicUpdateModelManager");
                java.lang.String str = this.f486140g;
                if (D == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateByLocalCache", "com.tencent.mm.plugin.sns.ad.model.AdDynamicUpdateModelManager");
                } else if (str == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateByLocalCache", "com.tencent.mm.plugin.sns.ad.model.AdDynamicUpdateModelManager");
                } else {
                    java.lang.String str2 = (java.lang.String) i64.u.f370857f.get(str);
                    if (str2 == null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateByLocalCache", "com.tencent.mm.plugin.sns.ad.model.AdDynamicUpdateModelManager");
                    } else {
                        i64.u uVar2 = i64.u.f370855d;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(uVar2.d(), "updateByLocalCache, snsId=".concat(str));
                        java.lang.String d17 = uVar2.d();
                        try {
                            org.json.JSONObject optJSONObject = new org.json.JSONObject(str2).optJSONObject("influentData");
                            optJSONArray = optJSONObject != null ? optJSONObject.optJSONArray("layout") : null;
                        } catch (java.lang.Throwable th6) {
                            ca4.q.c(d17, th6);
                        }
                        if (optJSONArray == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(uVar2.d(), "updateByLocalCache, influentData-layout is null, snsId=".concat(str));
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateByLocalCache", "com.tencent.mm.plugin.sns.ad.model.AdDynamicUpdateModelManager");
                        } else {
                            uVar2.h(D, optJSONArray);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateByLocalCache", "com.tencent.mm.plugin.sns.ad.model.AdDynamicUpdateModelManager");
                        }
                    }
                }
                p3325xe03a0797.p3326xc267989b.p3328x30012e.j e17 = i64.u.f370855d.e(str);
                s74.x1 x1Var = new s74.x1(this.f486141h, str);
                this.f486137d = 1;
                if (((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) e17).a(x1Var, this) == aVar) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$5");
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$5");
                throw illegalStateException;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$5");
        return f0Var;
    }
}
