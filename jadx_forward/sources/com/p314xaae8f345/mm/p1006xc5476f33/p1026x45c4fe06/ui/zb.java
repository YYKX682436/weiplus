package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes13.dex */
public class zb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12695x889c9c98 f171905d;

    public zb(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12695x889c9c98 activityC12695x889c9c98) {
        this.f171905d = activityC12695x889c9c98;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12695x889c9c98.f171024h = true;
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12695x889c9c98 activityC12695x889c9c98 = this.f171905d;
        activityC12695x889c9c98.setResult(0, intent);
        activityC12695x889c9c98.finish();
    }
}
