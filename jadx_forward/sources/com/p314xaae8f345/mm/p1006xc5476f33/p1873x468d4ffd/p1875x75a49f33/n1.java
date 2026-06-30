package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33;

/* loaded from: classes10.dex */
public class n1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.ActivityC16544xf7e83031 f230594d;

    public n1(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.ActivityC16544xf7e83031 activityC16544xf7e83031) {
        this.f230594d = activityC16544xf7e83031;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d m66818xc616d71a = com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1874x633fb29.BinderC16530x6b2d3ec8.m66802x9cf0d20b().m66818xc616d71a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.ActivityC16544xf7e83031 activityC16544xf7e83031 = this.f230594d;
        activityC16544xf7e83031.f230497i = m66818xc616d71a;
        if (activityC16544xf7e83031.f230497i != null) {
            wo.v1.a(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1874x633fb29.BinderC16530x6b2d3ec8.m66802x9cf0d20b().m66811xad307fc());
            s75.d.b(activityC16544xf7e83031.f230501p, "video_remuxing_if_needed");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoCompressUI", "VideoSendPreprocessTask para is null");
            activityC16544xf7e83031.setResult(0);
            activityC16544xf7e83031.finish();
        }
    }
}
