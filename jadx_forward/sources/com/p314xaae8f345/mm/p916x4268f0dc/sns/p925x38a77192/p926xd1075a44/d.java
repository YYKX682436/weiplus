package com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44;

/* loaded from: classes14.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.q f151445d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f151446e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.q qVar, n0.v2 v2Var) {
        super(1);
        this.f151445d = qVar;
        this.f151446e = v2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        s1.z it = (s1.z) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        int b17 = p2.q.b(((u1.c1) it).f483585f);
        n0.v2 v2Var = this.f151446e;
        if (b17 != ((java.lang.Number) v2Var.mo128745x754a37bb()).intValue()) {
            v2Var.mo148714x53d8522f(java.lang.Integer.valueOf(b17));
            yz5.l lVar = this.f151445d.f151715i;
            if (lVar != null) {
                if (b17 < 0) {
                    b17 = 0;
                }
                lVar.mo146xb9724478(java.lang.Integer.valueOf(b17));
            }
        }
        return jz5.f0.f384359a;
    }
}
