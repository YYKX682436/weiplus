package com.p176xb6135e39.p177xcca8366f.gms.iid;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.iid.zzah */
/* loaded from: classes13.dex */
public final class C2058x394b67 extends android.content.BroadcastReceiver {

    /* renamed from: zzcx */
    private final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.iid.C2056x394b65 f6122x394bb5;

    public C2058x394b67(com.p176xb6135e39.p177xcca8366f.gms.iid.C2056x394b65 c2056x394b65) {
        this.f6122x394bb5 = c2056x394b65;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        android.util.Log.isLoggable("InstanceID", 3);
        this.f6122x394bb5.zzh(intent);
    }
}
