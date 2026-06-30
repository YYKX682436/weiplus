package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public class s2 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.b3 f294705a;

    public s2(com.p314xaae8f345.mm.vfs.b3 b3Var) {
        this.f294705a = b3Var;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        this.f294705a.f294359t.sendEmptyMessage(3);
    }
}
