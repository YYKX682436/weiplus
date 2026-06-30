package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class y30 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.rb {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f50 f218057d;

    public y30(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f50 f50Var) {
        this.f218057d = f50Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.rb
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z9 z9Var) {
        r45.f03 f03Var;
        r45.f03 f03Var2;
        java.lang.String str = (z9Var == null || (f03Var2 = z9Var.f186861b) == null) ? null : f03Var2.f455439z;
        boolean z17 = str == null || str.length() == 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f50 f50Var = this.f218057d;
        if (!z17) {
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b((z9Var == null || (f03Var = z9Var.f186861b) == null) ? null : f03Var.f455439z, f50Var.f215871d)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("return show this reddot ");
                sb6.append(z9Var != null ? z9Var.f186862c : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.SelfUIC", sb6.toString());
                return;
            }
        }
        f50Var.z7();
    }
}
