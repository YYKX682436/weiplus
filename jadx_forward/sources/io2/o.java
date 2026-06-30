package io2;

/* loaded from: classes2.dex */
public final class o implements ym5.q1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ io2.p f375023d;

    public o(io2.p pVar) {
        this.f375023d = pVar;
    }

    @Override // ym5.m1
    /* renamed from: onChanged */
    public void mo56048x7bb163d5() {
        this.f375023d.f375026c.mo56048x7bb163d5();
    }

    @Override // ym5.m1
    /* renamed from: onItemRangeChanged */
    public void mo56049xa44dd169(int i17, int i18) {
        io2.p pVar = this.f375023d;
        pVar.f375026c.mo56049xa44dd169(i17 + pVar.f375024a.c().a0(), i18);
    }

    @Override // ym5.m1
    /* renamed from: onItemRangeInserted */
    public void mo56051xb0566d03(int i17, int i18) {
        io2.p pVar = this.f375023d;
        pVar.f375026c.mo56051xb0566d03(i17 + pVar.f375024a.c().a0(), i18);
    }

    @Override // ym5.m1
    /* renamed from: onItemRangeMoved */
    public void mo56052x5e3cd6a8(int i17, int i18, int i19) {
        io2.p pVar = this.f375023d;
        pVar.f375026c.mo56052x5e3cd6a8(i17 + pVar.f375024a.c().a0(), i18 + pVar.f375024a.c().a0(), i19);
    }

    @Override // ym5.m1
    /* renamed from: onItemRangeRemoved */
    public void mo56053xb9568715(int i17, int i18) {
        io2.p pVar = this.f375023d;
        pVar.f375026c.mo56053xb9568715(i17 + pVar.f375024a.c().a0(), i18);
    }

    @Override // ym5.p1
    /* renamed from: onPreFinishLoadMore */
    public void mo15403x2053b072(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = this.f375023d.f375026c;
        c22801x87cbdc00.getClass();
        c22801x87cbdc00.O(reason);
    }

    @Override // ym5.p1
    /* renamed from: onPreFinishLoadMoreSmooth */
    public void mo56054xc12c74c0(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        this.f375023d.f375026c.mo56054xc12c74c0(reason);
    }

    @Override // ym5.p1
    /* renamed from: onPreFinishRefresh */
    public void mo15404x8041b4e4(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = this.f375023d.f375026c;
        c22801x87cbdc00.getClass();
        c22801x87cbdc00.Q(reason);
    }

    @Override // ym5.m1
    /* renamed from: onItemRangeChanged */
    public void mo56050xa44dd169(int i17, int i18, java.lang.Object obj) {
        io2.p pVar = this.f375023d;
        pVar.f375026c.mo56050xa44dd169(i17 + pVar.f375024a.c().a0(), i18, obj);
    }
}
