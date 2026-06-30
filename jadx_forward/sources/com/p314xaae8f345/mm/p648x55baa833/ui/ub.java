package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes11.dex */
public class ub implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f146114d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10365x4886147c f146115e;

    public ub(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10365x4886147c activityC10365x4886147c, java.util.List list) {
        this.f146115e = activityC10365x4886147c;
        this.f146114d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p648x55baa833.ui.cc ccVar = this.f146115e.f145469e;
        if (ccVar != null) {
            ccVar.d(this.f146114d);
        }
    }
}
