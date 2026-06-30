package c30;

/* loaded from: classes12.dex */
public final class p implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c30.s f38153a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.List f38154b;

    public p(c30.s sVar, java.util.List list) {
        this.f38153a = sVar;
        this.f38154b = list;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public final void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        com.tencent.mars.xlog.Log.i("EcsWeShopInfoUpdater", "EcsGetUserShopInfoResp errType:" + i17 + " errCode:" + i18 + ", errorMsg: " + str);
        com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.wechat.aff.proto.EcsGetUserShopInfoResp");
        bw5.x6 x6Var = (bw5.x6) fVar;
        if (i18 == 0 && i17 == 0) {
            ((ku5.t0) ku5.t0.f312615d).h(new c30.n(x6Var, this.f38153a, this.f38154b), "EcsWeShopInfoUpdater");
        } else {
            ((ku5.t0) ku5.t0.f312615d).h(new c30.o(this.f38153a, this.f38154b), "EcsWeShopInfoUpdater");
        }
    }
}
