package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class d40 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.s30 f199586a;

    /* renamed from: b, reason: collision with root package name */
    public final dk2.qf f199587b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.a f199588c;

    public d40(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.s30 visitorMicReplayScene, dk2.qf visitorMicReplayData, yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(visitorMicReplayScene, "visitorMicReplayScene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(visitorMicReplayData, "visitorMicReplayData");
        this.f199586a = visitorMicReplayScene;
        this.f199587b = visitorMicReplayData;
        this.f199588c = aVar;
    }

    /* renamed from: equals */
    public boolean m57991xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d40)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d40 d40Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d40) obj;
        return this.f199586a == d40Var.f199586a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f199587b, d40Var.f199587b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f199588c, d40Var.f199588c);
    }

    /* renamed from: hashCode */
    public int m57992x8cdac1b() {
        int hashCode = ((this.f199586a.hashCode() * 31) + this.f199587b.m124642x8cdac1b()) * 31;
        yz5.a aVar = this.f199588c;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m57993x9616526c() {
        return "FinderLiveVisitorMicReplayWidgetParams(visitorMicReplayScene=" + this.f199586a + ", visitorMicReplayData=" + this.f199587b + ", onCloseCallback=" + this.f199588c + ')';
    }
}
