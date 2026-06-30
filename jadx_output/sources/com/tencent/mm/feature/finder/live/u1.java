package com.tencent.mm.feature.finder.live;

/* loaded from: classes3.dex */
public final class u1 implements zy2.k5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.finder.live.v4 f66945a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f66946b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f66947c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f66948d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f66949e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f66950f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f66951g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f66952h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ zy2.i5 f66953i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ zy2.i5 f66954j;

    public u1(com.tencent.mm.feature.finder.live.v4 v4Var, java.lang.String str, java.lang.String str2, android.content.Context context, org.json.JSONObject jSONObject, java.lang.String str3, java.lang.String str4, int i17, zy2.i5 i5Var, zy2.i5 i5Var2) {
        this.f66945a = v4Var;
        this.f66946b = str;
        this.f66947c = str2;
        this.f66948d = context;
        this.f66949e = jSONObject;
        this.f66950f = str3;
        this.f66951g = str4;
        this.f66952h = i17;
        this.f66953i = i5Var;
        this.f66954j = i5Var2;
    }

    @Override // zy2.k5
    public void a(int i17, int i18, java.lang.String str, r45.z61 resp) {
        r45.nw1 liveInfo;
        r45.i72 i72Var;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) resp.getCustom(1);
        r45.nw1 liveInfo2 = finderObject != null ? finderObject.getLiveInfo() : null;
        com.tencent.mm.feature.finder.live.v4 v4Var = this.f66945a;
        if (!v4Var.vk(liveInfo2, "auto")) {
            com.tencent.mm.feature.finder.live.v4 v4Var2 = this.f66945a;
            com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = (com.tencent.mm.protocal.protobuf.FinderObject) resp.getCustom(1);
            android.content.Context context = this.f66948d;
            java.lang.String extraInfo = this.f66951g;
            kotlin.jvm.internal.o.f(extraInfo, "$extraInfo");
            com.tencent.mm.feature.finder.live.v4.Ai(v4Var2, finderObject2, context, extraInfo, this.f66952h, i17, i18, str, this.f66953i, this.f66954j);
            return;
        }
        com.tencent.mm.protocal.protobuf.FinderObject finderObject3 = (com.tencent.mm.protocal.protobuf.FinderObject) resp.getCustom(1);
        long j17 = (finderObject3 == null || (liveInfo = finderObject3.getLiveInfo()) == null || (i72Var = (r45.i72) liveInfo.getCustom(44)) == null) ? 0L : i72Var.getLong(12);
        android.content.Context context2 = this.f66948d;
        if (j17 != 0) {
            i95.m c17 = i95.n0.c(c61.yb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            c61.yb.nc((c61.yb) c17, j17, null, 2, null).l().K(new com.tencent.mm.feature.finder.live.t1(v4Var, context2));
            return;
        }
        java.lang.String str2 = this.f66946b;
        boolean z17 = str2 == null || str2.length() == 0;
        java.lang.String str3 = this.f66950f;
        org.json.JSONObject jSONObject = this.f66949e;
        if (!z17) {
            java.lang.String str4 = this.f66947c;
            if (!(str4 == null || str4.length() == 0)) {
                v4Var.Ni((com.tencent.mm.protocal.protobuf.FinderObject) resp.getCustom(1), context2, jSONObject, str3 != null ? str3 : "");
                return;
            }
        }
        v4Var.Ri((com.tencent.mm.protocal.protobuf.FinderObject) resp.getCustom(1), context2, jSONObject, str3 != null ? str3 : "");
    }
}
