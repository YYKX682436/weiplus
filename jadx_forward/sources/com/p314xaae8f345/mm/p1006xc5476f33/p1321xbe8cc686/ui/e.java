package com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui;

/* loaded from: classes12.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.ActivityC13096xe0b615b8 f177152d;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.ActivityC13096xe0b615b8 activityC13096xe0b615b8) {
        this.f177152d = activityC13096xe0b615b8;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.ActivityC13096xe0b615b8 activityC13096xe0b615b8 = this.f177152d;
        android.widget.Button button = activityC13096xe0b615b8.f177108o;
        java.util.Map map = activityC13096xe0b615b8.f177105i.f538921b;
        button.setEnabled((map == null ? 0 : ((java.util.concurrent.ConcurrentHashMap) map).size()) > 0);
    }
}
