package ir1;

/* loaded from: classes3.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.p1290x2c1ddc83.ui.ActivityC12967xcacb933e f375543d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.m1 f375544e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.p1290x2c1ddc83.ui.ActivityC12967xcacb933e activityC12967xcacb933e, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        super(0);
        this.f375543d = activityC12967xcacb933e;
        this.f375544e = m1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = ((ar1.j) this.f375544e).f94911d.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetBlackListResp");
        java.util.LinkedList linkedList = ((r45.qb3) fVar).f465333d;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.p1290x2c1ddc83.ui.ActivityC12967xcacb933e.f175464u;
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.p1290x2c1ddc83.ui.ActivityC12967xcacb933e activityC12967xcacb933e = this.f375543d;
        activityC12967xcacb933e.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("black contact ");
        sb6.append(linkedList != null ? java.lang.Integer.valueOf(linkedList.size()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizFans.BizFansBlackListUI", sb6.toString());
        if (linkedList != null) {
            java.util.ArrayList arrayList = activityC12967xcacb933e.f175468g;
            arrayList.addAll(linkedList);
            activityC12967xcacb933e.W6();
            ir1.d dVar = activityC12967xcacb933e.f175467f;
            dVar.getClass();
            java.util.ArrayList arrayList2 = dVar.f375483e;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            dVar.notifyDataSetChanged();
        } else {
            activityC12967xcacb933e.W6();
        }
        return jz5.f0.f384359a;
    }
}
