package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class yi implements ym5.q1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.dk f205933d;

    public yi(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.dk dkVar) {
        this.f205933d = dkVar;
    }

    @Override // ym5.m1
    /* renamed from: onChanged */
    public void mo56048x7bb163d5() {
        mo56051xb0566d03(0, this.f205933d.m58700xf0438b47().m56387xe6796cde().size());
    }

    @Override // ym5.m1
    /* renamed from: onItemRangeChanged */
    public void mo56050xa44dd169(int i17, int i18, java.lang.Object obj) {
    }

    @Override // ym5.m1
    /* renamed from: onItemRangeInserted */
    public void mo56051xb0566d03(int i17, int i18) {
        int i19;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.dk dkVar = this.f205933d;
        if (!dkVar.f205176t || ((i19 = dkVar.f205177u) != 98 && i19 != 2)) {
            dkVar.Q6(true);
            return;
        }
        dkVar.O6().clear();
        dkVar.O6().addAll(dkVar.m58700xf0438b47().m56387xe6796cde());
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m62367x4905e9fa = dkVar.P6().m62367x4905e9fa();
        if (m62367x4905e9fa == null || (mo7946xf939df19 = m62367x4905e9fa.mo7946xf939df19()) == null) {
            return;
        }
        mo7946xf939df19.m8146xced61ae5();
    }

    @Override // ym5.m1
    /* renamed from: onItemRangeMoved */
    public void mo56052x5e3cd6a8(int i17, int i18, int i19) {
    }

    @Override // ym5.m1
    /* renamed from: onItemRangeRemoved */
    public void mo56053xb9568715(int i17, int i18) {
    }

    @Override // ym5.p1
    /* renamed from: onPreFinishLoadMore */
    public void mo15403x2053b072(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        this.f205933d.P6().e(true);
    }

    @Override // ym5.p1
    /* renamed from: onPreFinishLoadMoreSmooth */
    public void mo56054xc12c74c0(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        this.f205933d.P6().e(true);
    }

    @Override // ym5.p1
    /* renamed from: onPreFinishRefresh */
    public void mo15404x8041b4e4(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        this.f205933d.P6().i(true);
    }

    @Override // ym5.m1
    /* renamed from: onItemRangeChanged */
    public void mo56049xa44dd169(int i17, int i18) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df192;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.dk dkVar = this.f205933d;
        if (dkVar.f205176t) {
            int size = dkVar.O6().size();
            dkVar.O6().clear();
            dkVar.O6().addAll(dkVar.m58700xf0438b47().m56387xe6796cde());
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m62367x4905e9fa = dkVar.P6().m62367x4905e9fa();
            if (m62367x4905e9fa != null && (mo7946xf939df192 = m62367x4905e9fa.mo7946xf939df19()) != null) {
                mo7946xf939df192.m8151xc67946d3(i17, i18);
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m62367x4905e9fa2 = dkVar.P6().m62367x4905e9fa();
            if (m62367x4905e9fa2 != null) {
                m62367x4905e9fa2.getViewTreeObserver().addOnPreDrawListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.wi(m62367x4905e9fa2, m62367x4905e9fa2, dkVar, size));
                return;
            }
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m62367x4905e9fa3 = dkVar.P6().m62367x4905e9fa();
        if (m62367x4905e9fa3 != null) {
            java.util.ArrayList O6 = dkVar.O6();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = m62367x4905e9fa3.getLayoutManager();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d c1161x57298f5d = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d) layoutManager : null;
            so2.j5 j5Var = (so2.j5) kz5.n0.a0(O6, c1161x57298f5d != null ? c1161x57298f5d.x() : -1);
            dkVar.f205178v = j5Var != null ? j5Var.mo2128x1ed62e84() : -1L;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = dkVar.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14881xed239a47 c14881xed239a47 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14881xed239a47) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14881xed239a47.class);
        r45.nb1 nb1Var = c14881xed239a47.f204959s;
        if (nb1Var != null) {
            c14881xed239a47.T6().clear();
            c14881xed239a47.Z6(nb1Var);
        }
        dkVar.Q6(false);
        if (m62367x4905e9fa3 != null && (mo7946xf939df19 = m62367x4905e9fa3.mo7946xf939df19()) != null) {
            mo7946xf939df19.m8146xced61ae5();
        }
        if (m62367x4905e9fa3 != null) {
            m62367x4905e9fa3.getViewTreeObserver().addOnPreDrawListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.xi(m62367x4905e9fa3, m62367x4905e9fa3, dkVar));
        }
    }
}
