package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public class r2 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.b3 f294689a;

    public r2(com.p314xaae8f345.mm.vfs.b3 b3Var) {
        this.f294689a = b3Var;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        android.os.Handler handler = this.f294689a.f294359t;
        handler.sendMessageAtFrontOfQueue(android.os.Message.obtain(handler, 1, intent));
    }
}
