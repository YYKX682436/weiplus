package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* loaded from: classes10.dex */
public final class c1 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13304x9b00dd62 f179445a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f179446b;

    public c1(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13304x9b00dd62 activityC13304x9b00dd62, android.graphics.Rect rect) {
        this.f179445a = activityC13304x9b00dd62;
        this.f179446b = rect;
    }

    @Override // q80.f0
    /* renamed from: fail */
    public void mo555x2fd71e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EmojiEditorActivity", "openLiteApp fail");
        this.f179445a.setResult(0);
    }

    @Override // q80.f0
    /* renamed from: success */
    public void mo556x90b54003() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiEditorActivity", "openLiteApp success");
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13304x9b00dd62 activityC13304x9b00dd62 = this.f179445a;
        activityC13304x9b00dd62.b7().m54750xa0e1083e(this.f179446b);
        activityC13304x9b00dd62.setResult(-1, activityC13304x9b00dd62.getIntent());
    }
}
