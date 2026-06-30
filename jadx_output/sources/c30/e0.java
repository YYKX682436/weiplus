package c30;

/* loaded from: classes8.dex */
public final class e0 implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c30.f0 f38110a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38111b;

    public e0(c30.f0 f0Var, int i17) {
        this.f38110a = f0Var;
        this.f38111b = i17;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public final void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        com.tencent.mars.xlog.Log.i("EcsWeShopMgr", "EcsGetUserShopLabelResp errType:" + i17 + " errCode:" + i18 + ", errorMsg: " + str);
        c30.e eVar = this.f38110a.f38113d;
        if (eVar == null) {
            com.tencent.mars.xlog.Log.e("EcsWeShopMgr", "EcsGetUserShopLabelResp db is null");
            return;
        }
        com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
        if (fVar == null) {
            com.tencent.mars.xlog.Log.e("EcsWeShopMgr", "EcsGetUserShopLabelResp responseProtoBuf is null");
            return;
        }
        if (i18 == 0 && i17 == 0) {
            ((ku5.t0) ku5.t0.f312615d).h(new c30.c0(fVar, this.f38110a, eVar, this.f38111b), "EcsWeShopMgr");
        } else {
            ((ku5.t0) ku5.t0.f312615d).B(new c30.d0(this.f38110a, this.f38111b));
        }
    }
}
