package cl1;

/* loaded from: classes8.dex */
public class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f124400d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.AbstractGestureDetectorOnGestureListenerC12768x381d68c7 f124401e;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.AbstractGestureDetectorOnGestureListenerC12768x381d68c7 abstractGestureDetectorOnGestureListenerC12768x381d68c7, boolean z17) {
        this.f124401e = abstractGestureDetectorOnGestureListenerC12768x381d68c7;
        this.f124400d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f124400d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DragFeatureView", "handleAttachEdge isTop: %b", java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.AbstractGestureDetectorOnGestureListenerC12768x381d68c7 abstractGestureDetectorOnGestureListenerC12768x381d68c7 = this.f124401e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DragFeatureView", "handleAttachEdge canScroll: %b", java.lang.Boolean.valueOf(abstractGestureDetectorOnGestureListenerC12768x381d68c7.m53368x4905e9fa().canScrollVertically(z17 ? -10 : 10)));
        abstractGestureDetectorOnGestureListenerC12768x381d68c7.m53368x4905e9fa().scrollBy(0, z17 ? -20 : 20);
        abstractGestureDetectorOnGestureListenerC12768x381d68c7.post(this);
    }
}
