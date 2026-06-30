package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes2.dex */
public final class ui implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6 f211457d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 f211458e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f211459f;

    public ui(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6 activityC15076x7a6c76b6, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 c15415x74224fd8, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        this.f211457d = activityC15076x7a6c76b6;
        this.f211458e = c15415x74224fd8;
        this.f211459f = c1163xf1deaba4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6 activityC15076x7a6c76b6 = this.f211457d;
        long longExtra = activityC15076x7a6c76b6.getIntent().getLongExtra("KEY_VIDEO_START_PLAY_TIME_MS", 0L);
        float floatExtra = activityC15076x7a6c76b6.getIntent().getFloatExtra("KEY_VIDEO_PLAY_SPEED_RATIO", 1.0f);
        boolean z17 = !activityC15076x7a6c76b6.getIntent().getBooleanExtra("KEY_VIDEO_IS_PAUSE", false);
        boolean booleanExtra = activityC15076x7a6c76b6.getIntent().getBooleanExtra("KEY_VIDEO_CLEAR_VIDEO_CACHE", false);
        if (longExtra > 0 || booleanExtra) {
            pm0.v.V(0L, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ti(this.f211458e, this.f211459f, this.f211457d, longExtra, floatExtra, z17));
        }
    }
}
