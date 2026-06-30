package cw2;

/* loaded from: classes2.dex */
public final class l2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90 f305360d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90 c15178x4303ff90) {
        super(1);
        this.f305360d = c15178x4303ff90;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        ((java.lang.Number) obj).floatValue();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" onSeekActio ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f305360d.H;
        sb6.append((abstractC14490x69736cb5 == null || (feedObject = abstractC14490x69736cb5.getFeedObject()) == null) ? null : feedObject.m59224xc645db1f());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FullSeekBarLayout", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90 c15178x4303ff90 = this.f305360d;
        c15178x4303ff90.R = -1;
        wu5.c hideSeekbarTask = c15178x4303ff90.getHideSeekbarTask();
        if (hideSeekbarTask != null) {
            hideSeekbarTask.cancel(false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90 c15178x4303ff902 = this.f305360d;
        ku5.u0 u0Var = ku5.t0.f394148d;
        cw2.k2 k2Var = new cw2.k2(this.f305360d);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        c15178x4303ff902.m61280xf1ec175c(t0Var.z(k2Var, 5000L, false));
        return jz5.f0.f384359a;
    }
}
