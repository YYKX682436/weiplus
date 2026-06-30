package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* loaded from: classes10.dex */
public final class a2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13304x9b00dd62 f179425d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13304x9b00dd62 activityC13304x9b00dd62) {
        super(0);
        this.f179425d = activityC13304x9b00dd62;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13304x9b00dd62 activityC13304x9b00dd62 = this.f179425d;
        if (activityC13304x9b00dd62.f179292g != l12.a.f396515g) {
            return activityC13304x9b00dd62.b7().getVisibleBounds();
        }
        android.graphics.Rect fitBoundsRect = activityC13304x9b00dd62.b7().getFitBoundsRect();
        return fitBoundsRect == null ? activityC13304x9b00dd62.b7().m54744xe4c43e8c() : fitBoundsRect;
    }
}
