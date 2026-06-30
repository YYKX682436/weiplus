package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704;

/* loaded from: classes10.dex */
public final class y2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3 f211994a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fp0.r f211995b;

    public y2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3 q3Var, fp0.r rVar) {
        this.f211994a = q3Var;
        this.f211995b = rVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        java.util.List list = (java.util.List) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list);
        boolean z17 = !list.isEmpty();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3 q3Var = this.f211994a;
        if (z17) {
            int f17 = q3Var.f211902f.f();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.p4 p4Var = q3Var.f211902f;
            p4Var.b(list, false, true);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a5 a5Var = q3Var.f211906m;
            if (a5Var != null && (m82555x4905e9fa = a5Var.s().m82555x4905e9fa()) != null && (mo7946xf939df19 = m82555x4905e9fa.mo7946xf939df19()) != null) {
                mo7946xf939df19.m8153xd399a4d9(f17, p4Var.f() - f17);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MusicUni.DrawerPresenter", "[loadMoreData] empty!");
        }
        ym5.s3 s3Var = new ym5.s3(0);
        s3Var.f545054f = q3Var.f211910q;
        int size = list.size();
        s3Var.f545056h = size;
        if (size > 0) {
            s3Var.f545055g = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a5 a5Var2 = q3Var.f211906m;
        if (a5Var2 != null) {
            a5Var2.s().mo56054xc12c74c0(s3Var);
        }
        this.f211995b.b(fp0.u.f346823f);
        return jz5.f0.f384359a;
    }
}
