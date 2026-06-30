package c30;

/* loaded from: classes8.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2495xc50a8b8b.f f119633d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c30.f0 f119634e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c30.e f119635f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f119636g;

    public c0(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, c30.f0 f0Var, c30.e eVar, int i17) {
        this.f119633d = fVar;
        this.f119634e = f0Var;
        this.f119635f = eVar;
        this.f119636g = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean b17;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f119633d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.wechat.aff.proto.EcsGetUserShopLabelResp");
        bw5.z6 z6Var = (bw5.z6) fVar;
        int size = z6Var.f117366d.size();
        long j17 = (z6Var.f117370h[5] ? z6Var.f117369g : new bw5.t6()).f114804d;
        boolean z17 = z6Var.f117368f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("EcsGetUserShopLabelResp nextKey: ");
        sb6.append(z6Var.f117370h[3] ? z6Var.f117367e : "");
        sb6.append(", continueFlag: ");
        sb6.append(z17);
        sb6.append(", timeInterval: ");
        sb6.append(j17);
        sb6.append(", shopLabelInfos count: ");
        sb6.append(size);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsWeShopMgr", sb6.toString());
        c30.f0 f0Var = this.f119634e;
        c30.e eVar = this.f119635f;
        f0Var.getClass();
        java.util.LinkedList linkedList = z6Var.f117366d;
        java.lang.String str = z6Var.f117370h[3] ? z6Var.f117367e : "";
        if (linkedList.isEmpty()) {
            b17 = true;
            if (str == null || str.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsWeShopMgr", "handleDBWithShopLabelResp, both shopLabelInfos and shopHistoryNextKey empty");
                ((ku5.t0) ku5.t0.f394148d).B(new c30.b0(this.f119634e, j17, b17, size, z17, this.f119636g));
            }
        }
        b17 = eVar.b(new c30.z(linkedList, str));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsWeShopMgr", "handleShopLabelResp success: " + b17);
        ((ku5.t0) ku5.t0.f394148d).B(new c30.b0(this.f119634e, j17, b17, size, z17, this.f119636g));
    }
}
