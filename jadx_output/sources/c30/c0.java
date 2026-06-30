package c30;

/* loaded from: classes8.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protobuf.f f38100d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c30.f0 f38101e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c30.e f38102f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f38103g;

    public c0(com.tencent.mm.protobuf.f fVar, c30.f0 f0Var, c30.e eVar, int i17) {
        this.f38100d = fVar;
        this.f38101e = f0Var;
        this.f38102f = eVar;
        this.f38103g = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean b17;
        com.tencent.mm.protobuf.f fVar = this.f38100d;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.wechat.aff.proto.EcsGetUserShopLabelResp");
        bw5.z6 z6Var = (bw5.z6) fVar;
        int size = z6Var.f35833d.size();
        long j17 = (z6Var.f35837h[5] ? z6Var.f35836g : new bw5.t6()).f33271d;
        boolean z17 = z6Var.f35835f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("EcsGetUserShopLabelResp nextKey: ");
        sb6.append(z6Var.f35837h[3] ? z6Var.f35834e : "");
        sb6.append(", continueFlag: ");
        sb6.append(z17);
        sb6.append(", timeInterval: ");
        sb6.append(j17);
        sb6.append(", shopLabelInfos count: ");
        sb6.append(size);
        com.tencent.mars.xlog.Log.i("EcsWeShopMgr", sb6.toString());
        c30.f0 f0Var = this.f38101e;
        c30.e eVar = this.f38102f;
        f0Var.getClass();
        java.util.LinkedList linkedList = z6Var.f35833d;
        java.lang.String str = z6Var.f35837h[3] ? z6Var.f35834e : "";
        if (linkedList.isEmpty()) {
            b17 = true;
            if (str == null || str.length() == 0) {
                com.tencent.mars.xlog.Log.i("EcsWeShopMgr", "handleDBWithShopLabelResp, both shopLabelInfos and shopHistoryNextKey empty");
                ((ku5.t0) ku5.t0.f312615d).B(new c30.b0(this.f38101e, j17, b17, size, z17, this.f38103g));
            }
        }
        b17 = eVar.b(new c30.z(linkedList, str));
        com.tencent.mars.xlog.Log.i("EcsWeShopMgr", "handleShopLabelResp success: " + b17);
        ((ku5.t0) ku5.t0.f312615d).B(new c30.b0(this.f38101e, j17, b17, size, z17, this.f38103g));
    }
}
