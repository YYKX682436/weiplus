package com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui;

/* loaded from: classes9.dex */
public class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ActivityC16959x6229db69 f236691d;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ActivityC16959x6229db69 activityC16959x6229db69) {
        this.f236691d = activityC16959x6229db69;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.p1980x300cc4.ViewOnFocusChangeListenerC16962x770823dd viewOnFocusChangeListenerC16962x770823dd = this.f236691d.f236637g;
        if (viewOnFocusChangeListenerC16962x770823dd.L) {
            viewOnFocusChangeListenerC16962x770823dd.m67842xd454f3ba().clearFocus();
        } else {
            viewOnFocusChangeListenerC16962x770823dd.L = true;
        }
    }
}
