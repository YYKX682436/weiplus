package ie2;

/* loaded from: classes3.dex */
public abstract class b extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a f372515p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        android.view.ViewParent parent = root.getParent();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout");
        this.f372515p = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a) parent;
    }

    public final android.view.View t1() {
        return this.f372515p.getChildAt(0);
    }
}
