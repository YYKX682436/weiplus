package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes.dex */
public final class km implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.yw2 f188754d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f188755e;

    /* renamed from: f, reason: collision with root package name */
    public final android.text.SpannableString f188756f;

    public km(r45.yw2 divider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(divider, "divider");
        this.f188754d = divider;
        this.f188755e = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.jm(this));
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.lang.String m75945x2fec8307 = divider.m75945x2fec8307(1);
        ((ke0.e) xVar).getClass();
        this.f188756f = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, m75945x2fec8307);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.km)) {
            return -1;
        }
        r45.yw2 yw2Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.km) obj).f188754d;
        long m75942xfb822ef2 = yw2Var.m75942xfb822ef2(3);
        r45.yw2 yw2Var2 = this.f188754d;
        return (m75942xfb822ef2 == yw2Var2.m75942xfb822ef2(3) && yw2Var.m75939xb282bd08(2) == yw2Var2.m75939xb282bd08(2) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(yw2Var.m75945x2fec8307(1), yw2Var2.m75945x2fec8307(1))) ? 0 : -1;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return ((java.lang.Number) ((jz5.n) this.f188755e).mo141623x754a37bb()).longValue();
    }

    @Override // in5.c
    public int h() {
        return 2002;
    }

    /* renamed from: toString */
    public java.lang.String m56081x9616526c() {
        return "ItemId=" + mo2128x1ed62e84() + ",ItemType=2002 wordingSpan=" + ((java.lang.Object) this.f188756f);
    }
}
