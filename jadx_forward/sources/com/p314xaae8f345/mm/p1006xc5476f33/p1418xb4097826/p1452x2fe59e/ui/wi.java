package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes2.dex */
public final class wi implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14074xf8b1598 f192234d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 f192235e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f192236f;

    public wi(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14074xf8b1598 activityC14074xf8b1598, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 c15415x74224fd8, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        this.f192234d = activityC14074xf8b1598;
        this.f192235e = c15415x74224fd8;
        this.f192236f = c1163xf1deaba4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14074xf8b1598 activityC14074xf8b1598 = this.f192234d;
        long longExtra = activityC14074xf8b1598.getIntent().getLongExtra("KEY_VIDEO_START_PLAY_TIME_MS", 0L);
        float floatExtra = activityC14074xf8b1598.getIntent().getFloatExtra("KEY_VIDEO_PLAY_SPEED_RATIO", 1.0f);
        boolean z17 = !activityC14074xf8b1598.getIntent().getBooleanExtra("KEY_VIDEO_IS_PAUSE", false);
        boolean booleanExtra = activityC14074xf8b1598.getIntent().getBooleanExtra("KEY_VIDEO_CLEAR_VIDEO_CACHE", false);
        if (longExtra > 0 || booleanExtra) {
            pm0.v.V(0L, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.vi(this.f192235e, this.f192236f, this.f192234d, longExtra, floatExtra, z17));
        }
    }
}
