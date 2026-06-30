package dn2;

/* loaded from: classes3.dex */
public final class o0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v65.n f323485a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dn2.s0 f323486b;

    public o0(v65.n nVar, dn2.s0 s0Var) {
        this.f323485a = nVar;
        this.f323486b = s0Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        v65.n nVar = this.f323485a;
        if (i17 == 0 && fVar.f152149b == 0) {
            nVar.a(fVar.f152151d);
        } else {
            this.f323486b.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ShoppingHotSaleNotificationItem", "get product detail failed, errcode = " + fVar.f152149b + ", errType = " + fVar.f152148a);
            nVar.a(null);
        }
        return jz5.f0.f384359a;
    }
}
