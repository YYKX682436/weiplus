package dk2;

/* loaded from: classes.dex */
public final class y2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f315899a;

    public y2(dk2.r4 r4Var) {
        this.f315899a = r4Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        dk2.r4 r4Var = this.f315899a;
        if (i17 == 0 && fVar.f152149b == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4Var.f315542d, "post fastComment succ, errType = " + fVar.f152148a + ", errCode = " + fVar.f152149b + ", errMsg = " + fVar.f152150c);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4Var.f315542d, "post fastComment fail, errType = " + fVar.f152148a + ", errCode = " + fVar.f152149b + ", errMsg = " + fVar.f152150c);
        }
        return jz5.f0.f384359a;
    }
}
