package com.p314xaae8f345.mm.ui;

/* loaded from: classes9.dex */
public class y1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f294103d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21351xb4ef97a5 f294104e;

    public y1(com.p314xaae8f345.mm.ui.ActivityC21351xb4ef97a5 activityC21351xb4ef97a5, java.lang.String str) {
        this.f294104e = activityC21351xb4ef97a5;
        this.f294103d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.ActivityC21351xb4ef97a5 activityC21351xb4ef97a5 = this.f294104e;
        if (activityC21351xb4ef97a5.f278146e.equals(this.f294103d)) {
            activityC21351xb4ef97a5.f278153o = true;
            if (activityC21351xb4ef97a5.f278154p) {
                return;
            }
            com.p314xaae8f345.mm.ui.ActivityC21351xb4ef97a5.T6(activityC21351xb4ef97a5);
        }
    }
}
