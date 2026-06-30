package com.tencent.mm.plugin.emoji.sync;

/* loaded from: classes12.dex */
public final class j extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.sync.k f97629a;

    public j(com.tencent.mm.plugin.emoji.sync.k kVar) {
        this.f97629a = kVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.emoji.sync.i(this, context));
    }
}
