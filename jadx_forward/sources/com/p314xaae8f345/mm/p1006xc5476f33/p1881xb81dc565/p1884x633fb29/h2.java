package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29;

/* loaded from: classes14.dex */
public final class h2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.k2 f231525d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.k2 k2Var) {
        super(1);
        this.f231525d = k2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        jz5.f0 f0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.c0 c0Var;
        java.lang.String wxUserName = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wxUserName, "wxUserName");
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.k2 k2Var = this.f231525d;
        java.lang.Integer num = (java.lang.Integer) k2Var.f231562b.get(wxUserName);
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        android.util.ArrayMap arrayMap = k2Var.f231562b;
        boolean z17 = true;
        if (num != null) {
            java.lang.Integer num2 = (java.lang.Integer) arrayMap.get(wxUserName);
            if (num2 != null && num2.intValue() == 104) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiTalkScreenCastManager", "error state change from stop to pause");
                z17 = false;
            } else if (num2 != null && num2.intValue() == 102) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalkScreenCastManager", "state change from pause to pause");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.c0 c0Var2 = k2Var.f231561a;
                if (c0Var2 != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.a) c0Var2).a(wxUserName);
                }
            }
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null && (c0Var = k2Var.f231561a) != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.a) c0Var).a(wxUserName);
        }
        if (z17) {
            arrayMap.put(wxUserName, 102);
        }
        return f0Var2;
    }
}
