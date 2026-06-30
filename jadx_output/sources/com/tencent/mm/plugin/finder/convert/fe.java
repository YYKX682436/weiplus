package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class fe implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.tips.TrackTipsFrameLayout f103368d;

    public fe(com.tencent.mm.plugin.finder.feed.tips.TrackTipsFrameLayout trackTipsFrameLayout) {
        this.f103368d = trackTipsFrameLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.feed.tips.TrackTipsFrameLayout trackTipsFrameLayout = this.f103368d;
        if (trackTipsFrameLayout.visibilityManager.O6(trackTipsFrameLayout.f109065e)) {
            trackTipsFrameLayout.setVisibility(0);
            trackTipsFrameLayout.setAlpha(0.0f);
            android.widget.TextView textView = (android.widget.TextView) trackTipsFrameLayout.findViewById(com.tencent.mm.R.id.f484957g21);
            if (textView != null) {
                textView.setText(com.tencent.mm.R.string.cwt);
            }
            trackTipsFrameLayout.animate().setDuration(300L).alpha(1.0f).start();
            trackTipsFrameLayout.postDelayed(new com.tencent.mm.plugin.finder.convert.ee(trackTipsFrameLayout), 5000L);
        }
    }
}
