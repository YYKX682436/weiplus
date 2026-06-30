package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class p4 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15260x406bbe1b f214348d;

    public p4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15260x406bbe1b c15260x406bbe1b) {
        this.f214348d = c15260x406bbe1b;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        jz5.l lVar = (jz5.l) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa c13920xa5f564aa = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa) lVar.f384366d;
        ey2.m mVar = (ey2.m) lVar.f384367e;
        ey2.n nVar = mVar.f338962b;
        ey2.n nVar2 = ey2.n.f338965d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15260x406bbe1b c15260x406bbe1b = this.f214348d;
        if (nVar == nVar2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderColumnFrameLayout", "notifyDataSetChanged change.type is None, dataList.size:" + c13920xa5f564aa.size() + ", change:" + mVar);
        } else {
            e06.k kVar = mVar.f338961a;
            if (kVar.mo126615x7aab3243()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderColumnFrameLayout", "notifyDataSetChanged change.range.isEmpty(), dataList.size:" + c13920xa5f564aa.size() + ", change:" + mVar);
                p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c15260x406bbe1b.m61759x4905e9fa().mo7946xf939df19();
                if (mo7946xf939df19 != null) {
                    mo7946xf939df19.m8146xced61ae5();
                }
            } else {
                int ordinal = mVar.f338962b.ordinal();
                int i17 = kVar.f327742d;
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            if (hc2.q0.a(kz5.c0.g(c13920xa5f564aa), kVar)) {
                                p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df192 = c15260x406bbe1b.m61759x4905e9fa().mo7946xf939df19();
                                if (mo7946xf939df192 != null) {
                                    mo7946xf939df192.m8151xc67946d3(i17, hc2.q0.b(kVar));
                                }
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderColumnFrameLayout", "载入数据 change.range !in dataList.indices, dataList.size:" + c13920xa5f564aa.size() + ", change:" + mVar);
                                p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df193 = c15260x406bbe1b.m61759x4905e9fa().mo7946xf939df19();
                                if (mo7946xf939df193 != null) {
                                    mo7946xf939df193.m8146xced61ae5();
                                }
                            }
                        }
                    } else if (!kz5.n0.d0(kVar, kz5.c0.g(c13920xa5f564aa)).isEmpty()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderColumnFrameLayout", "载入数据 change.range.intersect(dataList.indices).isNotEmpty(), dataList.size:" + c13920xa5f564aa.size() + ", change:" + mVar);
                        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df194 = c15260x406bbe1b.m61759x4905e9fa().mo7946xf939df19();
                        if (mo7946xf939df194 != null) {
                            mo7946xf939df194.m8146xced61ae5();
                        }
                    } else {
                        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df195 = c15260x406bbe1b.m61759x4905e9fa().mo7946xf939df19();
                        if (mo7946xf939df195 != null) {
                            mo7946xf939df195.m8154xdb81fc7f(i17, hc2.q0.b(kVar));
                        }
                    }
                } else if (hc2.q0.a(kz5.c0.g(c13920xa5f564aa), kVar)) {
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df196 = c15260x406bbe1b.m61759x4905e9fa().mo7946xf939df19();
                    if (mo7946xf939df196 != null) {
                        mo7946xf939df196.m8153xd399a4d9(i17, hc2.q0.b(kVar));
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderColumnFrameLayout", "载入数据 change.range !in dataList.indices, dataList.size:" + c13920xa5f564aa.size() + ", change:" + mVar);
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df197 = c15260x406bbe1b.m61759x4905e9fa().mo7946xf939df19();
                    if (mo7946xf939df197 != null) {
                        mo7946xf939df197.m8146xced61ae5();
                    }
                }
            }
        }
        ey2.u uVar = c15260x406bbe1b.f212447r;
        if (!(uVar != null && uVar.f339069r == c15260x406bbe1b.getLastSnappedPosition())) {
            c15260x406bbe1b.d(c15260x406bbe1b.getLastSnappedPosition());
        }
        c15260x406bbe1b.m61759x4905e9fa().post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.o4(c15260x406bbe1b, c13920xa5f564aa));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15374xd3ebae5 c15374xd3ebae5 = c15260x406bbe1b.f212444o;
        if (c15374xd3ebae5 != null) {
            c15374xd3ebae5.m62464x8ee3717e(c13920xa5f564aa.size());
        }
    }
}
