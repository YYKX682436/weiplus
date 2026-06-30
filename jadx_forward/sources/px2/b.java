package px2;

/* loaded from: classes2.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1670x5545f2bb.AbstractGestureDetectorOnGestureListenerC15410x706991fd f440401d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1670x5545f2bb.AbstractGestureDetectorOnGestureListenerC15410x706991fd abstractGestureDetectorOnGestureListenerC15410x706991fd) {
        this.f440401d = abstractGestureDetectorOnGestureListenerC15410x706991fd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int[] iArr = new int[2];
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1670x5545f2bb.AbstractGestureDetectorOnGestureListenerC15410x706991fd abstractGestureDetectorOnGestureListenerC15410x706991fd = this.f440401d;
        abstractGestureDetectorOnGestureListenerC15410x706991fd.getIconLayout().getLocationOnScreen(iArr);
        abstractGestureDetectorOnGestureListenerC15410x706991fd.m62805xf9d8c5ab().getLayoutParams().height = abstractGestureDetectorOnGestureListenerC15410x706991fd.getIconLayout().getHeight() + iArr[1] + ((int) abstractGestureDetectorOnGestureListenerC15410x706991fd.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df));
    }
}
