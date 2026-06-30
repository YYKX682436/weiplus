package com.tencent.mm.feature.finder.live;

/* loaded from: classes3.dex */
public final class w1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f67011a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f67012b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.finder.live.v4 f67013c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f67014d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f67015e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f67016f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zy2.i5 f67017g;

    public w1(java.lang.String str, java.lang.String str2, com.tencent.mm.feature.finder.live.v4 v4Var, android.content.Context context, org.json.JSONObject jSONObject, java.lang.String str3, zy2.i5 i5Var) {
        this.f67011a = str;
        this.f67012b = str2;
        this.f67013c = v4Var;
        this.f67014d = context;
        this.f67015e = jSONObject;
        this.f67016f = str3;
        this.f67017g = i5Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.z61) ((com.tencent.mm.modelbase.f) obj).f70618d).getCustom(1);
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.b2.f3471f).getValue()).r()).intValue();
        if (intValue == 1) {
            h0Var.f310123d = null;
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveFeatureService", "autoOpenFinderLive mock 1");
        } else if (intValue == 2) {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) h0Var.f310123d;
            r45.nw1 liveInfo = finderObject != null ? finderObject.getLiveInfo() : null;
            if (liveInfo != null) {
                liveInfo.set(2, 2);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveFeatureService", "autoOpenFinderLive mock 2");
        }
        pm0.v.X(new com.tencent.mm.feature.finder.live.v1(this.f67011a, this.f67012b, this.f67013c, h0Var, this.f67014d, this.f67015e, this.f67016f, this.f67017g));
        return jz5.f0.f302826a;
    }
}
