package com.tencent.mm.modelcdntran;

/* loaded from: classes13.dex */
public class f1 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelcdntran.h1 f70940a;

    public f1(com.tencent.mm.modelcdntran.h1 h1Var) {
        this.f70940a = h1Var;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (io.flutter.plugins.connectivity.patched.PatchedConnectivityBroadcastReceiver.CONNECTIVITY_ACTION.equals(intent.getAction())) {
            com.tencent.mm.modelcdntran.h1.wi(this.f70940a, "BroadcastReceiver");
        }
    }
}
