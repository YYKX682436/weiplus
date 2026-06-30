package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class zs implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.rx2 f192823d;

    public zs(r45.rx2 card) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(card, "card");
        this.f192823d = card;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        if (!(obj instanceof r45.ww2)) {
            return -1;
        }
        r45.ww2 ww2Var = (r45.ww2) obj;
        long m75942xfb822ef2 = ww2Var.m75942xfb822ef2(0);
        r45.rx2 rx2Var = this.f192823d;
        return (m75942xfb822ef2 == rx2Var.m75942xfb822ef2(0) && ww2Var.m75939xb282bd08(7) == rx2Var.m75939xb282bd08(1)) ? 0 : -1;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return ("FinderStreamCardTxtFeed#" + this.f192823d.m75942xfb822ef2(0)).hashCode();
    }

    @Override // in5.c
    public int h() {
        return com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46368x75a8a97d;
    }
}
