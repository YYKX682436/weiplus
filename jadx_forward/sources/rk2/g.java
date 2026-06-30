package rk2;

/* loaded from: classes3.dex */
public final class g extends mn0.a0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1521x271b95f9.C14257x862705f6 f477987d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614 f477988e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf f477989f;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1521x271b95f9.C14257x862705f6 c14257x862705f6, com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614 c10850xc00cf614, com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf) {
        this.f477987d = c14257x862705f6;
        this.f477988e = c10850xc00cf614;
        this.f477989f = scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf;
    }

    @Override // mn0.a0
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1521x271b95f9.C14257x862705f6 c14257x862705f6 = this.f477987d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c14257x862705f6.f193278d, "receive frame change, remove origin view(" + this.f477988e.hashCode() + ')');
        com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf = this.f477989f;
        scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.postDelayed(new rk2.f(c14257x862705f6, scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf), 60L);
    }
}
