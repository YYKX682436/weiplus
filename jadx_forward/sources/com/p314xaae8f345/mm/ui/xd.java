package com.p314xaae8f345.mm.ui;

/* loaded from: classes10.dex */
public class xd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f294083d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.zd f294084e;

    public xd(com.p314xaae8f345.mm.ui.zd zdVar, int i17) {
        this.f294084e = zdVar;
        this.f294083d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.ActivityC21406xeafe92f0 activityC21406xeafe92f0 = this.f294084e.f294151d;
        int i17 = com.p314xaae8f345.mm.ui.ActivityC21406xeafe92f0.f278432t;
        activityC21406xeafe92f0.W6(true);
        activityC21406xeafe92f0.f278433d.g(new com.p314xaae8f345.mm.ui.ae(activityC21406xeafe92f0, this.f294083d), true);
    }
}
