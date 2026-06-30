package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* loaded from: classes10.dex */
public final class z1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13304x9b00dd62 f180104d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13304x9b00dd62 activityC13304x9b00dd62) {
        super(0);
        this.f180104d = activityC13304x9b00dd62;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13304x9b00dd62 activityC13304x9b00dd62 = this.f180104d;
        float fitBoundsScaleX = activityC13304x9b00dd62.b7().getFitBoundsScaleX();
        float fitBoundsScaleY = activityC13304x9b00dd62.b7().getFitBoundsScaleY();
        android.graphics.Rect fitBoundsRect = activityC13304x9b00dd62.b7().getFitBoundsRect();
        boolean z17 = true;
        if (fitBoundsScaleX == 1.0f) {
            if (fitBoundsScaleY == 1.0f) {
                z17 = false;
            }
        }
        if (!z17 || fitBoundsRect == null) {
            activityC13304x9b00dd62.d7().setScaleX(1.0f);
            activityC13304x9b00dd62.d7().setScaleY(1.0f);
            activityC13304x9b00dd62.d7().setPivotX(activityC13304x9b00dd62.d7().getWidth() / 2.0f);
            activityC13304x9b00dd62.d7().setPivotY(activityC13304x9b00dd62.d7().getHeight() / 2.0f);
        } else {
            activityC13304x9b00dd62.d7().setScaleX(fitBoundsScaleX);
            activityC13304x9b00dd62.d7().setScaleY(fitBoundsScaleY);
            activityC13304x9b00dd62.d7().setPivotX(fitBoundsRect.centerX());
            activityC13304x9b00dd62.d7().setPivotY(fitBoundsRect.centerY());
        }
        return jz5.f0.f384359a;
    }
}
