package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f;

/* loaded from: classes7.dex */
public final class h0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 f263371d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 r0Var) {
        super(0);
        this.f263371d = r0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        long j17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 r0Var = this.f263371d;
        try {
            j17 = r0Var.e0().lb() ? r0Var.e0().J3() : 0L;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0Var.T(), "Get Uin Error:" + th6.getLocalizedMessage());
            j17 = -1;
        }
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.h1(j17);
    }
}
