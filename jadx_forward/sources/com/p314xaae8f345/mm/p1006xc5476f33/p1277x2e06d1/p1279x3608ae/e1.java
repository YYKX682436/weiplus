package com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae;

/* loaded from: classes8.dex */
public class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f175275d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f175276e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12946xbb486840.EntryReceiver f175277f;

    public e1(com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12946xbb486840.EntryReceiver entryReceiver, android.content.Context context, android.content.Intent intent) {
        this.f175277f = entryReceiver;
        this.f175275d = context;
        this.f175276e = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12946xbb486840.EntryReceiver.a(this.f175277f, this.f175275d, this.f175276e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXEntryActivity", "cost:%s", (java.lang.System.currentTimeMillis() - currentTimeMillis) + "");
    }
}
