package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1551x373aa5;

/* loaded from: classes3.dex */
public final class a implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final r45.ot3 f202153d;

    public a(r45.ot3 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        this.f202153d = info;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        java.lang.String m75945x2fec8307;
        r45.ot3 ot3Var = this.f202153d;
        if (ot3Var == null || (m75945x2fec8307 = ot3Var.m75945x2fec8307(0)) == null) {
            return 0L;
        }
        return m75945x2fec8307.hashCode();
    }

    @Override // in5.c
    public int h() {
        return 1;
    }
}
