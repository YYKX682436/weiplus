package com.p314xaae8f345.mm.p849xbf8d97c1.p858xc0d355b8;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/matrix/trigger/RemoteTrigger;", "Landroid/content/BroadcastReceiver;", "Llr0/c;", "<init>", "()V", "plugin-performance_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.matrix.trigger.RemoteTrigger */
/* loaded from: classes11.dex */
public final class C10889xf2b6a72 extends android.content.BroadcastReceiver implements lr0.c {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p849xbf8d97c1.p858xc0d355b8.C10889xf2b6a72 f150380d = new com.p314xaae8f345.mm.p849xbf8d97c1.p858xc0d355b8.C10889xf2b6a72();

    private C10889xf2b6a72() {
    }

    @Override // lr0.c
    public boolean a(boolean z17, int i17, yz5.l lVar) {
        android.content.Intent intent = new android.content.Intent("com.tencent.mm.RemoteTrigger");
        intent.putExtra("KEY_FORCE_PULL", z17);
        intent.putExtra("KEY_PULL_TYPE", i17);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.sendBroadcast(intent);
        return true;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b("com.tencent.mm.RemoteTrigger", intent.getAction())) {
            return;
        }
        boolean booleanExtra = intent.getBooleanExtra("KEY_FORCE_PULL", false);
        int intExtra = intent.getIntExtra("KEY_PULL_TYPE", -2);
        ((ku5.t0) ku5.t0.f394148d).q(new lr0.d(booleanExtra, intExtra));
    }
}
