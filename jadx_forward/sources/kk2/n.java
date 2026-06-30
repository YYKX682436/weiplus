package kk2;

/* loaded from: classes3.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk2.p f390034d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.fa2 f390035e;

    public n(kk2.p pVar, r45.fa2 fa2Var) {
        this.f390034d = pVar;
        this.f390035e = fa2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fg2.s1 s1Var = this.f390034d.f390043o;
        if (s1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14366x19fff717 liveTwo = s1Var.f343836i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(liveTwo, "liveTwo");
        r45.ea2 ea2Var = (r45.ea2) this.f390035e.f455662h.get(1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14292x9b32d532.e(liveTwo, ea2Var != null ? (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ea2Var.m75936x14adae67(2) : null, 1, 1.3333f, 0, 8, null);
    }
}
