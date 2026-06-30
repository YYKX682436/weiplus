package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public final class v9 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.v9 f171813a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.v9();

    public static final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        if ((activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12650x33e7e92d) || com.p314xaae8f345.mm.ui.bk.w0()) {
            return;
        }
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(activity);
        java.lang.String a17 = f171813a.a(activity);
        uk0.a.b(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(a17), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.s9.f171741d, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.t9(a17, weakReference));
    }

    public static final void c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12650x33e7e92d) {
            return;
        }
        uk0.a.b(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(f171813a.a(activity)), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u9(), null);
    }

    public final java.lang.String a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a activityC12666xc288131a) {
        return activityC12666xc288131a.getComponentName().getShortClassName() + '@' + activityC12666xc288131a.hashCode();
    }
}
