package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class lr implements ym5.q1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f188855d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xr f188856e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.kr f188857f;

    public lr(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xr xrVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.kr krVar) {
        this.f188856e = xrVar;
        this.f188857f = krVar;
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = xrVar.f192631g;
        if (c22801x87cbdc00 != null) {
            this.f188855d = c22801x87cbdc00;
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
            throw null;
        }
    }

    @Override // ym5.m1
    /* renamed from: onChanged */
    public void mo56048x7bb163d5() {
        this.f188855d.mo56048x7bb163d5();
    }

    @Override // ym5.m1
    /* renamed from: onItemRangeChanged */
    public void mo56049xa44dd169(int i17, int i18) {
        this.f188855d.mo56049xa44dd169(i17, i18);
    }

    @Override // ym5.m1
    /* renamed from: onItemRangeInserted */
    public void mo56051xb0566d03(int i17, int i18) {
        this.f188855d.mo56051xb0566d03(i17, i18);
    }

    @Override // ym5.m1
    /* renamed from: onItemRangeMoved */
    public void mo56052x5e3cd6a8(int i17, int i18, int i19) {
        this.f188855d.mo56052x5e3cd6a8(i17, i18, i19);
    }

    @Override // ym5.m1
    /* renamed from: onItemRangeRemoved */
    public void mo56053xb9568715(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xr xrVar = this.f188856e;
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = xrVar.f192631g;
        if (c22801x87cbdc00 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
            throw null;
        }
        c22801x87cbdc00.mo56053xb9568715(i17, i18);
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc002 = xrVar.f192631g;
        if (c22801x87cbdc002 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
            throw null;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c22801x87cbdc002.m82555x4905e9fa().mo7946xf939df19();
        if (mo7946xf939df19 == null || mo7946xf939df19.mo1894x7e414b06() >= 10) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122.m56346x54c164a7(this.f188857f.m(), false, 1, null);
    }

    @Override // ym5.p1
    /* renamed from: onPreFinishLoadMore */
    public void mo15403x2053b072(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = this.f188855d;
        c22801x87cbdc00.getClass();
        c22801x87cbdc00.O(reason);
    }

    @Override // ym5.p1
    /* renamed from: onPreFinishLoadMoreSmooth */
    public void mo56054xc12c74c0(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        this.f188855d.mo56054xc12c74c0(reason);
    }

    @Override // ym5.p1
    /* renamed from: onPreFinishRefresh */
    public void mo15404x8041b4e4(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = this.f188855d;
        c22801x87cbdc00.getClass();
        c22801x87cbdc00.Q(reason);
    }

    @Override // ym5.m1
    /* renamed from: onItemRangeChanged */
    public void mo56050xa44dd169(int i17, int i18, java.lang.Object obj) {
        this.f188855d.mo56050xa44dd169(i17, i18, obj);
    }
}
