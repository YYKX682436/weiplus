package vd2;

/* loaded from: classes3.dex */
public final class s5 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vd2.v5 f517448a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f517449b;

    public s5(vd2.v5 v5Var, java.lang.String str) {
        this.f517448a = v5Var;
        this.f517449b = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.m70 m70Var;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveNoticeClickLogicBlo", "CgiFinderLiveReceiveConcertTicket errCode: " + fVar.f152149b + ", errMsg: " + fVar.f152150c + ", errType: " + fVar.f152148a);
        if (fVar.f152149b == 0 && fVar.f152148a == 0 && (m70Var = (r45.m70) ((r45.o62) fVar.f152151d).m75936x14adae67(1)) != null) {
            pm0.v.X(new vd2.r5(this.f517448a, m70Var, this.f517449b));
        }
        return jz5.f0.f384359a;
    }
}
