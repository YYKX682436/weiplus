package cl1;

/* loaded from: classes8.dex */
public class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f42867d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.desktop.DragFeatureView f42868e;

    public f0(com.tencent.mm.plugin.appbrand.widget.desktop.DragFeatureView dragFeatureView, boolean z17) {
        this.f42868e = dragFeatureView;
        this.f42867d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f42867d;
        com.tencent.mars.xlog.Log.i("MicroMsg.DragFeatureView", "handleAttachEdge isTop: %b", java.lang.Boolean.valueOf(z17));
        com.tencent.mm.plugin.appbrand.widget.desktop.DragFeatureView dragFeatureView = this.f42868e;
        com.tencent.mars.xlog.Log.i("MicroMsg.DragFeatureView", "handleAttachEdge canScroll: %b", java.lang.Boolean.valueOf(dragFeatureView.getRecyclerView().canScrollVertically(z17 ? -10 : 10)));
        dragFeatureView.getRecyclerView().scrollBy(0, z17 ? -20 : 20);
        dragFeatureView.post(this);
    }
}
