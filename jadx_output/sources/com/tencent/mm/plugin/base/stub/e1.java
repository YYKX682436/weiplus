package com.tencent.mm.plugin.base.stub;

/* loaded from: classes8.dex */
public class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f93742d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f93743e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.base.stub.WXEntryActivity.EntryReceiver f93744f;

    public e1(com.tencent.mm.plugin.base.stub.WXEntryActivity.EntryReceiver entryReceiver, android.content.Context context, android.content.Intent intent) {
        this.f93744f = entryReceiver;
        this.f93742d = context;
        this.f93743e = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.base.stub.WXEntryActivity.EntryReceiver.a(this.f93744f, this.f93742d, this.f93743e);
        com.tencent.mars.xlog.Log.i("MicroMsg.WXEntryActivity", "cost:%s", (java.lang.System.currentTimeMillis() - currentTimeMillis) + "");
    }
}
