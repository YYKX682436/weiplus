package com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui;

/* loaded from: classes10.dex */
public final class j2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11495xd59e7ca0 f156100d;

    public j2(com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11495xd59e7ca0 activityC11495xd59e7ca0) {
        this.f156100d = activityC11495xd59e7ca0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11495xd59e7ca0 activityC11495xd59e7ca0 = this.f156100d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ViewOnFocusChangeListenerC11491x93fec4d2 viewOnFocusChangeListenerC11491x93fec4d2 = activityC11495xd59e7ca0.f156002n;
        if (viewOnFocusChangeListenerC11491x93fec4d2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("addrContainerSV");
            throw null;
        }
        int height = viewOnFocusChangeListenerC11491x93fec4d2.getChildAt(0).getHeight();
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ViewOnFocusChangeListenerC11491x93fec4d2 viewOnFocusChangeListenerC11491x93fec4d22 = activityC11495xd59e7ca0.f156002n;
        if (viewOnFocusChangeListenerC11491x93fec4d22 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("addrContainerSV");
            throw null;
        }
        int max = java.lang.Math.max(0, height - viewOnFocusChangeListenerC11491x93fec4d22.getHeight());
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ViewOnFocusChangeListenerC11491x93fec4d2 viewOnFocusChangeListenerC11491x93fec4d23 = activityC11495xd59e7ca0.f156002n;
        if (viewOnFocusChangeListenerC11491x93fec4d23 != null) {
            viewOnFocusChangeListenerC11491x93fec4d23.smoothScrollTo(0, max);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("addrContainerSV");
            throw null;
        }
    }
}
