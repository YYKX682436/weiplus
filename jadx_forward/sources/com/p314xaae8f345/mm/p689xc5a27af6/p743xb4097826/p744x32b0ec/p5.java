package com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec;

/* loaded from: classes3.dex */
public final class p5 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v65.n f148400a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.z5 f148401b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f148402c;

    public p5(v65.n nVar, com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.z5 z5Var, java.lang.String str) {
        this.f148400a = nVar;
        this.f148401b = z5Var;
        this.f148402c = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        v65.n nVar = this.f148400a;
        if (i17 == 0 && fVar.f152149b == 0) {
            nVar.a((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((r45.z61) fVar.f152151d).m75936x14adae67(1));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f148401b.f148590d, "get last object for " + this.f148402c + " failed");
            nVar.a(null);
        }
        return jz5.f0.f384359a;
    }
}
