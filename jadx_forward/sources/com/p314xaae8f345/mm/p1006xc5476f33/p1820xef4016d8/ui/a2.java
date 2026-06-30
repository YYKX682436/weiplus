package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class a2 implements android.media.SoundPool.OnLoadCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e1 f228222a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d f228223b;

    public a2(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d activityC16363x8a0a619d, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e1 e1Var) {
        this.f228223b = activityC16363x8a0a619d;
        this.f228222a = e1Var;
    }

    @Override // android.media.SoundPool.OnLoadCompleteListener
    public void onLoadComplete(android.media.SoundPool soundPool, int i17, int i18) {
        if (i18 == 0) {
            int[] iArr = this.f228223b.L;
            if (i17 == iArr[0]) {
                soundPool.play(i17, 1.0f, 1.0f, 0, 0, 1.0f);
            } else {
                if (i17 != iArr[1] || this.f228222a.f226778q < 19000) {
                    return;
                }
                soundPool.play(i17, 1.0f, 1.0f, 0, 0, 1.0f);
            }
        }
    }
}
