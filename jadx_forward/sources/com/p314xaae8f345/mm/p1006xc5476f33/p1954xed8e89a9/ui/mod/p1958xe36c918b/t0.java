package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b;

/* loaded from: classes11.dex */
public final class t0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.C19645x574159e9 f235665d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.w0 f235666e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(com.p314xaae8f345.mm.p2470x93e71c27.ui.C19645x574159e9 c19645x574159e9, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.w0 w0Var) {
        super(1);
        this.f235665d = c19645x574159e9;
        this.f235666e = w0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ModProfile.ModPhoneUIC", "onclick AddPhone");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19645x574159e9 c19645x574159e9 = this.f235665d;
        if (!c19645x574159e9.f()) {
            return java.lang.Boolean.FALSE;
        }
        c19645x574159e9.c(str, false, false);
        this.f235666e.d7();
        return java.lang.Boolean.TRUE;
    }
}
