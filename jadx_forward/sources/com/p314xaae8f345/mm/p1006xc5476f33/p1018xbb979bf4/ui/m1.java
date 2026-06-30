package com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui;

/* loaded from: classes5.dex */
public final class m1 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11495xd59e7ca0 f156121a;

    public m1(com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11495xd59e7ca0 activityC11495xd59e7ca0) {
        this.f156121a = activityC11495xd59e7ca0;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public final void a(boolean z17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11495xd59e7ca0 activityC11495xd59e7ca0 = this.f156121a;
        if (!z17) {
            activityC11495xd59e7ca0.setResult(0);
            activityC11495xd59e7ca0.finish();
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c0 = activityC11495xd59e7ca0.D;
        if (c22661xa3a2b3c0 != null) {
            c22661xa3a2b3c0.performClick();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("addrFinish");
            throw null;
        }
    }
}
