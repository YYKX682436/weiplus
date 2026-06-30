package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui;

/* loaded from: classes9.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f238202d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.ActivityC17117x395bed72 f238203e;

    public g0(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.ActivityC17117x395bed72 activityC17117x395bed72, java.lang.ref.WeakReference weakReference) {
        this.f238203e = activityC17117x395bed72;
        this.f238202d = weakReference;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c2 = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) this.f238202d.get();
        if (viewOnFocusChangeListenerC22907xe18534c2 != null) {
            viewOnFocusChangeListenerC22907xe18534c2.m83169xe7297452().requestFocus();
            this.f238203e.mo26063x7b383410();
        }
    }
}
