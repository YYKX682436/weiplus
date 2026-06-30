package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes14.dex */
public final class hf implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17429xf3011891 f242644d;

    public hf(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17429xf3011891 activityC17429xf3011891) {
        this.f242644d = activityC17429xf3011891;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.TextView textView = this.f242644d.f241992e;
        if (textView != null) {
            textView.setVisibility(4);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tipsInfo");
            throw null;
        }
    }
}
