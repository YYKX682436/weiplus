package dn2;

/* loaded from: classes3.dex */
public final class m0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dn2.s0 f323476a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f323477b;

    public m0(dn2.s0 s0Var, boolean z17) {
        this.f323476a = s0Var;
        this.f323477b = z17;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        boolean z17 = fVar != null && fVar.f152148a == 0;
        boolean z18 = this.f323477b;
        dn2.s0 s0Var = this.f323476a;
        if (z17 && fVar.f152149b == 0) {
            s0Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShoppingHotSaleNotificationItem", "cgi report click = " + z18 + ", success");
        } else {
            s0Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShoppingHotSaleNotificationItem", "cgi report click = " + z18 + ", failed, errType = " + fVar.f152148a + ", errCode = " + fVar.f152149b + ", errMsg = " + fVar.f152150c);
        }
        return jz5.f0.f384359a;
    }
}
