package com.tencent.mm.feature.finder.live;

/* loaded from: classes3.dex */
public final class s1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.finder.live.v4 f66899a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f66900b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f66901c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f66902d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f66903e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f66904f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f66905g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f66906h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ zy2.i5 f66907i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ zy2.i5 f66908j;

    public s1(com.tencent.mm.feature.finder.live.v4 v4Var, java.lang.String str, java.lang.String str2, android.content.Context context, org.json.JSONObject jSONObject, java.lang.String str3, java.lang.String str4, int i17, zy2.i5 i5Var, zy2.i5 i5Var2) {
        this.f66899a = v4Var;
        this.f66900b = str;
        this.f66901c = str2;
        this.f66902d = context;
        this.f66903e = jSONObject;
        this.f66904f = str3;
        this.f66905g = str4;
        this.f66906h = i17;
        this.f66907i = i5Var;
        this.f66908j = i5Var2;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.nw1 liveInfo;
        r45.i72 i72Var;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) fVar.f70618d).getCustom(2);
        r45.nw1 liveInfo2 = finderObject != null ? finderObject.getLiveInfo() : null;
        com.tencent.mm.feature.finder.live.v4 v4Var = this.f66899a;
        boolean vk6 = v4Var.vk(liveInfo2, "auto");
        ss5.i0 i0Var = (ss5.i0) i95.n0.c(ss5.i0.class);
        com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) fVar.f70618d).getCustom(2);
        java.lang.String username = finderObject2 != null ? finderObject2.getUsername() : null;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject3 = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) fVar.f70618d).getCustom(2);
        boolean bj6 = ((vd2.d5) i0Var).bj(username, finderObject3 != null ? finderObject3.getLiveInfo() : null);
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (!vk6 && bj6) {
            com.tencent.mm.feature.finder.live.v4 v4Var2 = this.f66899a;
            com.tencent.mm.protocal.protobuf.FinderObject finderObject4 = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) fVar.f70618d).getCustom(2);
            android.content.Context context = this.f66902d;
            java.lang.String extraInfo = this.f66905g;
            kotlin.jvm.internal.o.f(extraInfo, "$extraInfo");
            com.tencent.mm.feature.finder.live.v4.Ai(v4Var2, finderObject4, context, extraInfo, this.f66906h, fVar.f70615a, fVar.f70616b, fVar.f70617c, this.f66907i, this.f66908j);
            return f0Var;
        }
        com.tencent.mm.protocal.protobuf.FinderObject finderObject5 = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) fVar.f70618d).getCustom(2);
        long j17 = (finderObject5 == null || (liveInfo = finderObject5.getLiveInfo()) == null || (i72Var = (r45.i72) liveInfo.getCustom(44)) == null) ? 0L : i72Var.getLong(12);
        android.content.Context context2 = this.f66902d;
        if (j17 != 0) {
            i95.m c17 = i95.n0.c(c61.yb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            pq5.g l17 = c61.yb.nc((c61.yb) c17, j17, null, 2, null).l();
            l17.K(new com.tencent.mm.feature.finder.live.r1(v4Var, context2));
            return l17;
        }
        java.lang.String str = this.f66900b;
        boolean z17 = str == null || str.length() == 0;
        java.lang.String str2 = this.f66904f;
        org.json.JSONObject jSONObject = this.f66903e;
        if (!z17) {
            java.lang.String str3 = this.f66901c;
            if (!(str3 == null || str3.length() == 0)) {
                v4Var.Ni((com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) fVar.f70618d).getCustom(2), context2, jSONObject, str2 != null ? str2 : "");
                return f0Var;
            }
        }
        v4Var.Ri((com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) fVar.f70618d).getCustom(2), context2, jSONObject, str2 != null ? str2 : "");
        return f0Var;
    }
}
