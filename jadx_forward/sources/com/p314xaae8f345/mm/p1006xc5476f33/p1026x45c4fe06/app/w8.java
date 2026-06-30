package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app;

/* loaded from: classes4.dex */
public final class w8 implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f156866a;

    public w8(com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        this.f156866a = rVar;
    }

    @Override // km5.e
    public final void a(java.lang.Object obj) {
        java.lang.String errMsg;
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = this.f156866a;
        if (rVar != null) {
            java.lang.Throwable th6 = obj instanceof java.lang.Throwable ? (java.lang.Throwable) obj : null;
            if (th6 == null || (errMsg = th6.getMessage()) == null) {
                errMsg = obj.toString();
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
            rVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11578xd857ab4f(0, false, errMsg));
        }
    }
}
