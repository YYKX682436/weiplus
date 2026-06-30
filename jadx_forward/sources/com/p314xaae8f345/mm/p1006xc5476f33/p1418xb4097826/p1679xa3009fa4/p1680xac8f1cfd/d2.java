package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class d2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f2 f215604d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f2 f2Var) {
        super(0);
        this.f215604d = f2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f2 f2Var = this.f215604d;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = f2Var.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.po poVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.po) pf5.z.f435481a.a(activity).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.po.class);
        boolean z17 = true;
        if (poVar != null) {
            f2Var.Q6(poVar.f217105d.f(), true);
        } else {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 R6 = f2Var.R6();
            if (R6 != null) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = R6.getLayoutManager();
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
                if (c1162x665295de != null) {
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07 = R6.p0(c1162x665295de.w());
                    in5.s0 s0Var = p07 instanceof in5.s0 ? (in5.s0) p07 : null;
                    if (s0Var != null) {
                        java.lang.Object obj = s0Var.f374658i;
                        so2.j5 j5Var = obj instanceof so2.j5 ? (so2.j5) obj : null;
                        if (j5Var != null && j5Var.h() == 9) {
                            db5.t7.m123882x26a183b(R6.getContext(), f2Var.S6() ? com.p314xaae8f345.mm.R.C30867xcad56011.nlr : com.p314xaae8f345.mm.R.C30867xcad56011.cvu, 0).show();
                        } else {
                            java.lang.Object obj2 = s0Var.f374658i;
                            so2.j5 j5Var2 = obj2 instanceof so2.j5 ? (so2.j5) obj2 : null;
                            if (j5Var2 != null && j5Var2.h() == 15) {
                                db5.t7.m123882x26a183b(R6.getContext(), f2Var.S6() ? com.p314xaae8f345.mm.R.C30867xcad56011.nm6 : com.p314xaae8f345.mm.R.C30867xcad56011.cwj, 0).show();
                            } else {
                                f2Var.Q6(s0Var, true);
                            }
                        }
                        z17 = false;
                    }
                }
            }
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
