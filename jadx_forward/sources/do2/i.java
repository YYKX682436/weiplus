package do2;

/* loaded from: classes2.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.mb4 f323618d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd f323619e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.ui.C14446xd52a323f f323620f;

    public i(r45.mb4 mb4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.ui.C14446xd52a323f c14446xd52a323f) {
        this.f323618d = mb4Var;
        this.f323619e = c15188xd8bd4bd;
        this.f323620f = c14446xd52a323f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r45.mb4 mb4Var = this.f323618d;
        r45.gn2 gn2Var = (r45.gn2) mb4Var.m75936x14adae67(45);
        boolean z17 = gn2Var != null && gn2Var.m75933x41a8a7f2(1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = this.f323619e;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd.h0(c15188xd8bd4bd, new cw2.t4((r45.gn2) mb4Var.m75936x14adae67(45), com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.CROP), false, 2, null);
        }
        c15188xd8bd4bd.m61433x70cb65e3(this.f323620f.getVideoViewCallback());
        zy2.g5.u(c15188xd8bd4bd, null, 1, null);
    }
}
