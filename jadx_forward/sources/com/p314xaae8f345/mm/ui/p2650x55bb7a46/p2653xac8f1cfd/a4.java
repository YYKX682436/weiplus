package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes12.dex */
public class a4 implements j41.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.c4 f280138a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f280139b;

    public a4(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.x3 x3Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.c4 c4Var, java.lang.String str) {
        this.f280138a = c4Var;
        this.f280139b = str;
    }

    @Override // j41.w
    public void a(j41.i0 i0Var) {
        j41.u uVar;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.c4 c4Var = this.f280138a;
        if (i0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingFooterToolbarComponent", "fetchToolbarDslForOpenIMKeFu, fetchContact error, result is null.");
            if (c4Var != null) {
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.z3) c4Var).a(null);
                return;
            }
            return;
        }
        if (i0Var.f379174b == 0 && i0Var.f379175c == null && (uVar = i0Var.f379176d) != null) {
            java.lang.String str = ((k41.g0) uVar).f68599x8b8174fb;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingFooterToolbarComponent", "fetchToolbarDslForOpenIMKeFu, fetchContact finished, username: " + this.f280139b + ", DSL: " + str);
            if (c4Var != null) {
                j41.u uVar2 = i0Var.f379176d;
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.z3) c4Var).a(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.d4(uVar2 instanceof k41.g0 ? (k41.g0) uVar2 : null, str));
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingFooterToolbarComponent", "fetchToolbarDslForOpenIMKeFu, fetchContact error, errorCode: " + i0Var.f379174b + ", errorType: " + i0Var.f379173a + ", errorMsg: " + i0Var.f379175c + ", contact: " + i0Var.f379176d);
        if (c4Var != null) {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.z3) c4Var).a(null);
        }
    }

    @Override // j41.w
    public void b(java.lang.String str) {
    }
}
