package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc;

/* loaded from: classes15.dex */
public class v0 extends android.widget.HorizontalScrollView {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12075x8f3ab8b2 f162251d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12075x8f3ab8b2 c12075x8f3ab8b2, android.content.Context context) {
        super(context);
        this.f162251d = c12075x8f3ab8b2;
    }

    @Override // android.view.View
    public void onScrollChanged(int i17, int i18, int i19, int i27) {
        super.onScrollChanged(i17, i18, i19, i27);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12075x8f3ab8b2 c12075x8f3ab8b2 = this.f162251d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.r0 r0Var = c12075x8f3ab8b2.f162184g;
        if (r0Var != null) {
            r0Var.a(c12075x8f3ab8b2, i17, i18, i19, i27);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() != 2 || this.f162251d.f162186i) {
            return super.onTouchEvent(motionEvent);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaScrollView", "can not move");
        return false;
    }
}
