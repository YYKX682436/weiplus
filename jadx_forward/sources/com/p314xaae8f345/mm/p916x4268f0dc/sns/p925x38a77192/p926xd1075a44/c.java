package com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44;

/* loaded from: classes14.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.q f151400d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f151401e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.q qVar, n0.v2 v2Var) {
        super(1);
        this.f151400d = qVar;
        this.f151401e = v2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        yz5.l lVar = this.f151400d.f151714h;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.valueOf(booleanValue));
        }
        n0.v2 v2Var = this.f151401e;
        if (((java.lang.Boolean) v2Var.mo128745x754a37bb()).booleanValue() && !booleanValue) {
            v2Var.mo148714x53d8522f(java.lang.Boolean.FALSE);
        }
        return jz5.f0.f384359a;
    }
}
