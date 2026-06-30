package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* loaded from: classes10.dex */
public final class w1 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13304x9b00dd62 f180064d;

    public w1(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13304x9b00dd62 activityC13304x9b00dd62) {
        this.f180064d = activityC13304x9b00dd62;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        android.util.Size size = (android.util.Size) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiEditorActivity", "size changed: " + size);
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13304x9b00dd62 activityC13304x9b00dd62 = this.f180064d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.ScaleGestureDetectorOnScaleGestureListenerC13256x346a1468 a76 = activityC13304x9b00dd62.a7();
        int width = size.getWidth();
        int height = size.getHeight();
        a76.f178987f = width;
        a76.f178988g = height;
        a76.invalidate();
        activityC13304x9b00dd62.b7().a(size.getWidth(), size.getHeight());
        return jz5.f0.f384359a;
    }
}
