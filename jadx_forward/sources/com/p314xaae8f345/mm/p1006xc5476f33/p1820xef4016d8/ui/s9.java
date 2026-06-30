package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class s9 implements android.media.SoundPool.OnLoadCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d f228946a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e1 f228947b;

    public s9(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d activityC16371xf216ae6d, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e1 e1Var) {
        this.f228946a = activityC16371xf216ae6d;
        this.f228947b = e1Var;
    }

    @Override // android.media.SoundPool.OnLoadCompleteListener
    public final void onLoadComplete(android.media.SoundPool soundPool, int i17, int i18) {
        if (i18 == 0) {
            int[] iArr = this.f228946a.L;
            if (iArr == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("soundId");
                throw null;
            }
            if (i17 == iArr[0]) {
                soundPool.play(i17, 1.0f, 1.0f, 0, 0, 1.0f);
                return;
            }
            if (iArr == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("soundId");
                throw null;
            }
            if (i17 != iArr[1] || this.f228947b.f226778q < 19000) {
                return;
            }
            soundPool.play(i17, 1.0f, 1.0f, 0, 0, 1.0f);
        }
    }
}
