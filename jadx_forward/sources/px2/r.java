package px2;

/* loaded from: classes2.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1670x5545f2bb.AbstractGestureDetectorOnGestureListenerC15410x706991fd f440451d;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1670x5545f2bb.AbstractGestureDetectorOnGestureListenerC15410x706991fd abstractGestureDetectorOnGestureListenerC15410x706991fd) {
        this.f440451d = abstractGestureDetectorOnGestureListenerC15410x706991fd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int[] iArr = new int[2];
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1670x5545f2bb.AbstractGestureDetectorOnGestureListenerC15410x706991fd abstractGestureDetectorOnGestureListenerC15410x706991fd = this.f440451d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = abstractGestureDetectorOnGestureListenerC15410x706991fd.f214097t;
        if (c15188xd8bd4bd != null) {
            c15188xd8bd4bd.getLocationOnScreen(iArr);
        }
        android.widget.SeekBar seekBar = new android.widget.SeekBar(abstractGestureDetectorOnGestureListenerC15410x706991fd.getContext());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd2 = abstractGestureDetectorOnGestureListenerC15410x706991fd.f214097t;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(c15188xd8bd4bd2 != null ? c15188xd8bd4bd2.getWidth() : 0, (int) seekBar.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561177bj));
        layoutParams.setMargins(iArr[0], 0, 0, 0);
        seekBar.setPadding(0, 0, 0, 0);
        layoutParams.gravity = 80;
        seekBar.setLayoutParams(layoutParams);
        seekBar.setMax(2000);
        seekBar.setProgressDrawable(seekBar.getContext().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.d_j));
        seekBar.setThumbOffset(0);
        seekBar.setThumb(null);
        abstractGestureDetectorOnGestureListenerC15410x706991fd.addView(seekBar, seekBar.getLayoutParams());
        abstractGestureDetectorOnGestureListenerC15410x706991fd.N = seekBar;
        abstractGestureDetectorOnGestureListenerC15410x706991fd.g();
    }
}
