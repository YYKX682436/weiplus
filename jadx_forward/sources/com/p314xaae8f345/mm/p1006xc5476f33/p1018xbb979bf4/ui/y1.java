package com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui;

/* loaded from: classes.dex */
public final class y1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11495xd59e7ca0 f156182d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11495xd59e7ca0 activityC11495xd59e7ca0) {
        super(1);
        this.f156182d = activityC11495xd59e7ca0;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11495xd59e7ca0 activityC11495xd59e7ca0 = this.f156182d;
        if (booleanValue) {
            android.widget.LinearLayout linearLayout = activityC11495xd59e7ca0.f156004p;
            if (linearLayout == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("addrCaptureMapLL");
                throw null;
            }
            linearLayout.performClick();
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("map_select_street", "view_clk", activityC11495xd59e7ca0.f156000i, 33328);
        } else {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("map_select_street", "view_exp", activityC11495xd59e7ca0.f156000i, 33328);
        }
        return jz5.f0.f384359a;
    }
}
