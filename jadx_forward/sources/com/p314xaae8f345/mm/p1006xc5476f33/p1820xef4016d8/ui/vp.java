package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class vp implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f229156a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16408x90cd2820 f229157b;

    public vp(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16408x90cd2820 activityC16408x90cd2820, android.content.Intent intent) {
        this.f229157b = activityC16408x90cd2820;
        this.f229156a = intent;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j
    public void a(boolean z17, java.lang.String str, int i17) {
        if (z17) {
            android.content.Intent intent = this.f229156a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16408x90cd2820 activityC16408x90cd2820 = this.f229157b;
            activityC16408x90cd2820.setResult(-1, intent);
            activityC16408x90cd2820.finish();
        }
    }
}
