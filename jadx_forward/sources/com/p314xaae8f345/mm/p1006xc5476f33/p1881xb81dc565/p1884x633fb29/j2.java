package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29;

/* loaded from: classes14.dex */
public final class j2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.k2 f231553d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.k2 k2Var) {
        super(1);
        this.f231553d = k2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        jz5.f0 f0Var;
        java.lang.String wxUserName = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wxUserName, "wxUserName");
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.k2 k2Var = this.f231553d;
        java.lang.Integer num = (java.lang.Integer) k2Var.f231562b.get(wxUserName);
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        if (num != null) {
            if (num.intValue() == 104) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalkScreenCastManager", "state change from stop to stop");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.k2.b(k2Var, wxUserName);
            }
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.k2.b(k2Var, wxUserName);
        }
        k2Var.f231562b.put(wxUserName, 104);
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231719y1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().m().l(wxUserName, 0);
        }
        return f0Var2;
    }
}
