package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.voip.ui.MMSuperAlert */
/* loaded from: classes11.dex */
public class ActivityC18913x27f6fc61 extends com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c {
    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        return (getAssets() == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e == null) ? super.getResources() : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e;
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.p314xaae8f345.mm.R.C30864xbddafb2a.c1k);
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.j(this, getIntent().getIntExtra("MMSuperAlert_msg", 0), getIntent().getIntExtra("MMSuperAlert_title", 0), getIntent().getBooleanExtra("MMSuperAlert_cancelable", true)), 50L);
    }
}
