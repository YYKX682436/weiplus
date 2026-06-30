package com.tencent.mm.feature.finder.live;

/* loaded from: classes3.dex */
public final class x1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.finder.live.v4 f67027d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f67028e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f67029f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f67030g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f67031h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(com.tencent.mm.feature.finder.live.v4 v4Var, com.tencent.mm.protocal.protobuf.FinderObject finderObject, int i17, java.lang.String str, android.content.Context context) {
        super(0);
        this.f67027d = v4Var;
        this.f67028e = finderObject;
        this.f67029f = i17;
        this.f67030g = str;
        this.f67031h = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc;
        java.lang.String description;
        java.lang.String objectNonceId;
        java.lang.String username;
        r45.nw1 liveInfo;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f67028e;
        r45.nw1 liveInfo2 = finderObject != null ? finderObject.getLiveInfo() : null;
        com.tencent.mm.feature.finder.live.v4 v4Var = this.f67027d;
        v4Var.Fk(liveInfo2, false);
        java.lang.String str = this.f67030g;
        int i17 = hc2.l.h(str) ? 4 : 15;
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.o.f(uuid, "toString(...)");
        java.lang.String str2 = "";
        java.lang.String t17 = r26.i0.t(uuid, "-", "", false);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i18 = this.f67029f;
        sb6.append(i18);
        sb6.append('-');
        sb6.append(i17);
        sb6.append("-65-");
        sb6.append(t17);
        java.lang.String sb7 = sb6.toString();
        ((ml2.j0) i95.n0.c(ml2.j0.class)).Zj(str);
        long id6 = finderObject != null ? finderObject.getId() : 0L;
        java.lang.String pageType = java.lang.String.valueOf(i18);
        int i19 = v4Var.gk(finderObject != null ? finderObject.getLiveInfo() : null) ? 1 : 2;
        kotlin.jvm.internal.o.g(pageType, "pageType");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("object_id", pm0.v.u(id6));
        jSONObject.put("page_type", pageType);
        jSONObject.put("object_type", i19);
        jSONObject.put("page_sub_type", 0);
        zy2.zb zbVar = (zy2.zb) i95.n0.c(zy2.zb.class);
        ml2.o3[] o3VarArr = ml2.o3.f327773d;
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        ((ml2.j0) zbVar).Wj("watch_live_record", jSONObject2);
        ss5.i0 i0Var = (ss5.i0) i95.n0.c(ss5.i0.class);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        android.content.Intent b17 = vd2.t3.f435921a.b(null, java.lang.String.valueOf(i18), 0);
        android.content.Context context = this.f67031h;
        long id7 = finderObject != null ? finderObject.getId() : 0L;
        long j17 = (finderObject == null || (liveInfo = finderObject.getLiveInfo()) == null) ? 0L : liveInfo.getLong(0);
        java.lang.String str3 = (finderObject == null || (username = finderObject.getUsername()) == null) ? "" : username;
        java.lang.String str4 = (finderObject == null || (objectNonceId = finderObject.getObjectNonceId()) == null) ? "" : objectNonceId;
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        if (finderObject != null && (objectDesc = finderObject.getObjectDesc()) != null && (description = objectDesc.getDescription()) != null) {
            str2 = description;
        }
        ((vd2.d5) i0Var).wi(b17, context, id7, j17, str3, str4, ((c61.p2) ybVar).Gj(str2), sb7, ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Ck());
        return jz5.f0.f302826a;
    }
}
