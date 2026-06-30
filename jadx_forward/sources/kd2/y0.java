package kd2;

/* loaded from: classes2.dex */
public final class y0 extends do2.d {

    /* renamed from: d, reason: collision with root package name */
    public boolean f388397d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f388398e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kd2.p1 f388399f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f388400g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f388401h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd f388402i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(long j17, kd2.p1 p1Var, float f17, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.ui.C14446xd52a323f c14446xd52a323f) {
        super(c14446xd52a323f);
        this.f388398e = j17;
        this.f388399f = p1Var;
        this.f388400g = f17;
        this.f388401h = z17;
        this.f388402i = c15188xd8bd4bd;
        this.f388397d = true;
    }

    @Override // do2.f, cw2.fb
    public void D(r45.mb4 mb4Var, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = this.f388402i;
        if (c15188xd8bd4bd.getAlpha() == 1.0f) {
            return;
        }
        c15188xd8bd4bd.setAlpha(1.0f);
    }

    @Override // do2.f, cw2.fb
    public void h(r45.mb4 mb4Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoPassive", "initVideoView onPlay: isFirstTimePlay = " + this.f388397d + ", targetTimeMs = " + this.f388398e);
        if (this.f388397d) {
            pm0.v.X(new kd2.x0(this.f388399f, this.f388398e, this.f388400g, this.f388401h, this.f388402i));
            this.f388397d = false;
        }
    }
}
