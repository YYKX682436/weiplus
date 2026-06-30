package com.tencent.mm.matrix.trigger;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/matrix/trigger/RemoteTrigger;", "Landroid/content/BroadcastReceiver;", "Llr0/c;", "<init>", "()V", "plugin-performance_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class RemoteTrigger extends android.content.BroadcastReceiver implements lr0.c {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.matrix.trigger.RemoteTrigger f68847d = new com.tencent.mm.matrix.trigger.RemoteTrigger();

    private RemoteTrigger() {
    }

    @Override // lr0.c
    public boolean a(boolean z17, int i17, yz5.l lVar) {
        android.content.Intent intent = new android.content.Intent("com.tencent.mm.RemoteTrigger");
        intent.putExtra("KEY_FORCE_PULL", z17);
        intent.putExtra("KEY_PULL_TYPE", i17);
        com.tencent.mm.sdk.platformtools.x2.f193071a.sendBroadcast(intent);
        return true;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent == null || !kotlin.jvm.internal.o.b("com.tencent.mm.RemoteTrigger", intent.getAction())) {
            return;
        }
        boolean booleanExtra = intent.getBooleanExtra("KEY_FORCE_PULL", false);
        int intExtra = intent.getIntExtra("KEY_PULL_TYPE", -2);
        ((ku5.t0) ku5.t0.f312615d).q(new lr0.d(booleanExtra, intExtra));
    }
}
