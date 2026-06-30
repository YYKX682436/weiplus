package com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df;

/* loaded from: classes8.dex */
public class g2 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.ActivityC18746x694b7935 f256510d;

    public g2(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.ActivityC18746x694b7935 activityC18746x694b7935) {
        this.f256510d = activityC18746x694b7935;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).getBoolean("tophitory_show_comment_dialog", false);
        if (!z17 || z18) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.ActivityC18746x694b7935 activityC18746x694b7935 = this.f256510d;
        activityC18746x694b7935.f256465x.clearFocus();
        aw4.n0.f96434a.d(activityC18746x694b7935.f256465x.getContext(), new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.f2(this), true);
    }
}
