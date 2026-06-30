package ws2;

/* loaded from: classes15.dex */
public final class y1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9 f530702d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f530703e;

    public y1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9 c14932xfc4acec9, java.lang.String str) {
        this.f530702d = c14932xfc4acec9;
        this.f530703e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9 c14932xfc4acec9 = this.f530702d;
        if (c14932xfc4acec9.isViewFocused) {
            c14932xfc4acec9.f206433s = true;
            com.p314xaae8f345.mm.p2470x93e71c27.ui.b1 videoViewCallback = c14932xfc4acec9.getVideoViewCallback();
            if (videoViewCallback != null) {
                videoViewCallback.N5("", this.f530703e, java.lang.Boolean.FALSE);
            }
        }
    }
}
