package kk2;

/* loaded from: classes3.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk2.p f390032d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.fa2 f390033e;

    public m(kk2.p pVar, r45.fa2 fa2Var) {
        this.f390032d = pVar;
        this.f390033e = fa2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kk2.p pVar = this.f390032d;
        fg2.s1 s1Var = pVar.f390043o;
        if (s1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        s1Var.f343834g.setVisibility(0);
        fg2.s1 s1Var2 = pVar.f390043o;
        if (s1Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14366x19fff717 liveOne = s1Var2.f343834g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(liveOne, "liveOne");
        r45.ea2 ea2Var = (r45.ea2) this.f390033e.f455662h.get(0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14292x9b32d532.e(liveOne, ea2Var != null ? (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ea2Var.m75936x14adae67(2) : null, 0, 1.3333f, 0, 8, null);
    }
}
