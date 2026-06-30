package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class v80 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f217756a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.u80 f217757b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f217758c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f217759d;

    public v80(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 item, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.u80 showState, boolean z17, boolean z18, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        showState = (i17 & 2) != 0 ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.u80.f217641d : showState;
        z17 = (i17 & 4) != 0 ? false : z17;
        z18 = (i17 & 8) != 0 ? false : z18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(showState, "showState");
        this.f217756a = item;
        this.f217757b = showState;
        this.f217758c = z17;
        this.f217759d = z18;
    }

    /* renamed from: equals */
    public boolean m63273xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.v80)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.v80 v80Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.v80) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f217756a, v80Var.f217756a) && this.f217757b == v80Var.f217757b && this.f217758c == v80Var.f217758c && this.f217759d == v80Var.f217759d;
    }

    /* renamed from: hashCode */
    public int m63274x8cdac1b() {
        return (((((this.f217756a.m58305x8cdac1b() * 31) + this.f217757b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f217758c)) * 31) + java.lang.Boolean.hashCode(this.f217759d);
    }

    /* renamed from: toString */
    public java.lang.String m63275x9616526c() {
        return "TingEntryShowInfo(item=" + this.f217756a + ", showState=" + this.f217757b + ", isOpeningTing=" + this.f217758c + ", hasReportedRestSlideUp=" + this.f217759d + ')';
    }
}
