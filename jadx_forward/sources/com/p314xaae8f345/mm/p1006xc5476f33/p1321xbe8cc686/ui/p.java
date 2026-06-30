package com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui;

/* loaded from: classes12.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.ActivityC13098x53df0b7a f177163d;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.ActivityC13098x53df0b7a activityC13098x53df0b7a) {
        this.f177163d = activityC13098x53df0b7a;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.ActivityC13098x53df0b7a activityC13098x53df0b7a = this.f177163d;
        android.widget.Button button = activityC13098x53df0b7a.f177140u;
        java.util.Map map = activityC13098x53df0b7a.f177132m.f538921b;
        button.setEnabled((map == null ? 0 : ((java.util.concurrent.ConcurrentHashMap) map).size()) > 0);
    }
}
