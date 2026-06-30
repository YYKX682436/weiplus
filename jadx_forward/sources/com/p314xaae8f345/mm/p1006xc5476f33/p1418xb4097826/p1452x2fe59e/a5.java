package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes10.dex */
public final class a5 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 f187736a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fp0.r f187737b;

    public a5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var, fp0.r rVar) {
        this.f187736a = a7Var;
        this.f187737b = rVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var = this.f187736a;
        boolean z17 = true;
        a7Var.H = true;
        java.util.List list = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.m2) obj).f188877b;
        if (list == null || list.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.DrawerPresenter", "[preloadNextPage] empty!");
            a7Var.H = false;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.y yVar = a7Var.f187743g;
            int h17 = yVar.h();
            yVar.b(list, false, true);
            yw2.a0 a0Var = a7Var.f187749o;
            if (a0Var != null && (m82555x4905e9fa = a0Var.s().m82555x4905e9fa()) != null && (mo7946xf939df19 = m82555x4905e9fa.mo7946xf939df19()) != null) {
                mo7946xf939df19.m8153xd399a4d9(h17, yVar.h() - h17);
            }
        }
        ym5.s3 s3Var = new ym5.s3(0);
        s3Var.f545054f = a7Var.f187757u;
        s3Var.f545056h = list != null ? list.size() : 0;
        s3Var.f545055g = false;
        yw2.a0 a0Var2 = a7Var.f187749o;
        if (a0Var2 != null) {
            a0Var2.s().mo56054xc12c74c0(s3Var);
        }
        this.f187737b.b(fp0.u.f346823f);
        if (list != null && !list.isEmpty()) {
            z17 = false;
        }
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7.B(a7Var, list);
        }
        return jz5.f0.f384359a;
    }
}
