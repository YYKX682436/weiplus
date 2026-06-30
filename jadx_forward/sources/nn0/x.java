package nn0;

/* loaded from: classes10.dex */
public final class x extends nn0.i {

    /* renamed from: e, reason: collision with root package name */
    public final ls5.f f420166e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(android.content.Context context, boolean z17, int i17, mn0.b0 player) {
        super(context, z17, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(player, "player");
        if (!z17) {
            throw new java.lang.RuntimeException("must be custom render");
        }
        if (i17 == 1) {
            throw new java.lang.RuntimeException("VR live can not use this render");
        }
        ls5.f fVar = new ls5.f(player);
        this.f420166e = fVar;
        ((com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p823x2eaf9f.p825xc53e9ae1.C10830xb2ffc6ed) ms5.f.f412691a.b(com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p823x2eaf9f.p825xc53e9ae1.C10830xb2ffc6ed.class)).e(fVar);
        ((nn0.p) this.f420117b).y4(new nn0.w(this));
    }

    @Override // nn0.i
    public nn0.o a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return ((pg2.j0) ((c50.s0) i95.n0.c(c50.s0.class))).wh() ? new nn0.z(context) : new nn0.u(context);
    }

    @Override // nn0.i, com.p314xaae8f345.p2926x359365.C25485x5a0a6891
    /* renamed from: startLivePlay */
    public int mo94535x5c1200c2(java.lang.String str, int i17) {
        nn0.o oVar;
        if (this.f420116a && (oVar = this.f420117b) != null) {
            ((nn0.p) oVar).mo149801x8113c2b6();
        }
        return super.mo94535x5c1200c2(str, i17);
    }
}
