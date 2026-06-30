package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

@db5.a(m123858x6ac9171 = 19)
/* renamed from: com.tencent.mm.plugin.game.ui.GameDetailUI */
/* loaded from: classes8.dex */
public class ActivityC15953x515144d7 extends com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0 {
    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra("game_app_id");
        m53.v0 f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.f();
        int i17 = f17 != null ? f17.f405649d : 0;
        if (i17 == 2) {
            r53.f.p(this, stringExtra, 0);
        } else if (i17 == 1) {
            r53.f.q(this, getIntent().getExtras());
        } else {
            java.lang.String d07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.d0(this);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d07) || d07.toLowerCase().equals("cn")) {
                r53.f.p(this, stringExtra, 0);
            } else {
                r53.f.q(this, getIntent().getExtras());
            }
        }
        finish();
    }
}
