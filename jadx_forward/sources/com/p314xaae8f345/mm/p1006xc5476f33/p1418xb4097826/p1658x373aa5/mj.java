package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public class mj implements ym5.q1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f f214199d;

    public mj(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f rlLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rlLayout, "rlLayout");
        this.f214199d = rlLayout;
    }

    public int a() {
        return 0;
    }

    public void b() {
    }

    /* renamed from: onChanged */
    public void mo56048x7bb163d5() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m62367x4905e9fa = this.f214199d.m62367x4905e9fa();
        if (m62367x4905e9fa != null && (mo7946xf939df19 = m62367x4905e9fa.mo7946xf939df19()) != null) {
            mo7946xf939df19.m8146xced61ae5();
        }
        b();
    }

    /* renamed from: onItemRangeChanged */
    public void mo56049xa44dd169(int i17, int i18) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m62367x4905e9fa = this.f214199d.m62367x4905e9fa();
        if (m62367x4905e9fa != null && (mo7946xf939df19 = m62367x4905e9fa.mo7946xf939df19()) != null) {
            mo7946xf939df19.m8151xc67946d3(i17 + a(), i18);
        }
        b();
    }

    /* renamed from: onItemRangeInserted */
    public void mo56051xb0566d03(int i17, int i18) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m62367x4905e9fa = this.f214199d.m62367x4905e9fa();
        if (m62367x4905e9fa != null && (mo7946xf939df19 = m62367x4905e9fa.mo7946xf939df19()) != null) {
            mo7946xf939df19.m8153xd399a4d9(i17 + a(), i18);
        }
        b();
    }

    @Override // ym5.m1
    /* renamed from: onItemRangeMoved */
    public void mo56052x5e3cd6a8(int i17, int i18, int i19) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m62367x4905e9fa = this.f214199d.m62367x4905e9fa();
        if (m62367x4905e9fa != null && (mo7946xf939df19 = m62367x4905e9fa.mo7946xf939df19()) != null) {
            mo7946xf939df19.m8150x87567217(i17 + a(), i18 + a());
        }
        b();
    }

    @Override // ym5.m1
    /* renamed from: onItemRangeRemoved */
    public void mo56053xb9568715(int i17, int i18) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m62367x4905e9fa = this.f214199d.m62367x4905e9fa();
        if (m62367x4905e9fa != null && (mo7946xf939df19 = m62367x4905e9fa.mo7946xf939df19()) != null) {
            mo7946xf939df19.m8154xdb81fc7f(i17 + a(), i18);
        }
        b();
    }

    @Override // ym5.p1
    /* renamed from: onPreFinishLoadMore */
    public void mo15403x2053b072(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        this.f214199d.e(true);
        b();
    }

    @Override // ym5.p1
    /* renamed from: onPreFinishLoadMoreSmooth */
    public void mo56054xc12c74c0(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        this.f214199d.e(true);
        b();
    }

    @Override // ym5.p1
    /* renamed from: onPreFinishRefresh */
    public void mo15404x8041b4e4(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        int i17 = reason.f545056h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f c15343x638a173f = this.f214199d;
        if (i17 <= 0) {
            c15343x638a173f.k();
        } else {
            c15343x638a173f.i(true);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m62367x4905e9fa = c15343x638a173f.m62367x4905e9fa();
        if (m62367x4905e9fa != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(m62367x4905e9fa, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/FinderRefreshLayout$BaseViewActionCallback", "onPreFinishRefresh", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "Undefined", "scrollToPosition", "(I)V");
            m62367x4905e9fa.a1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(m62367x4905e9fa, "com/tencent/mm/plugin/finder/view/FinderRefreshLayout$BaseViewActionCallback", "onPreFinishRefresh", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "Undefined", "scrollToPosition", "(I)V");
        }
        b();
    }

    @Override // ym5.m1
    /* renamed from: onItemRangeChanged */
    public void mo56050xa44dd169(int i17, int i18, java.lang.Object obj) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m62367x4905e9fa = this.f214199d.m62367x4905e9fa();
        if (m62367x4905e9fa != null && (mo7946xf939df19 = m62367x4905e9fa.mo7946xf939df19()) != null) {
            mo7946xf939df19.m8152xc67946d3(i17 + a(), i18, obj);
        }
        b();
    }
}
