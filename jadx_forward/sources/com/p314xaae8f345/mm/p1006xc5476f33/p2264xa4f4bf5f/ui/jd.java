package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class jd extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18652x18778004 f255547a;

    public jd(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18652x18778004 c18652x18778004) {
        this.f255547a = c18652x18778004;
    }

    @Override // ym5.q3
    public void b(int i17) {
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.id(this.f255547a));
    }

    @Override // ym5.q3
    public void c(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18652x18778004 c18652x18778004 = this.f255547a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.uc ucVar = c18652x18778004.f255180r;
        if (ucVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("dataLoader");
            throw null;
        }
        if (ucVar.a()) {
            return;
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = c18652x18778004.f255176n;
        if (c22801x87cbdc00 != null) {
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00.I(c22801x87cbdc00, null, 1, null);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRefreshLayout");
            throw null;
        }
    }
}
