package db5;

/* loaded from: classes8.dex */
public abstract class m9 {

    /* renamed from: a, reason: collision with root package name */
    public static int f309975a = -1;

    public static void a(boolean z17, android.content.Intent intent) {
        boolean z18 = f309975a != z17;
        f309975a = z17 ? 1 : 0;
        if (!z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.UIStatusUtil", "isRealSend = false,just return!");
            return;
        }
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.setAction(z17 ? "com.tencent.mm.ui.ACTION_ACTIVE" : "com.tencent.mm.ui.ACTION_DEACTIVE");
        intent.putExtra("_application_context_process_", bm5.f1.a());
        intent.putExtra("process_id", android.os.Process.myPid());
        intent.putExtra("process_is_mm", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n());
        intent.setPackage(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.sendBroadcast(intent, com.p314xaae8f345.mm.sdk.p2603x2137b148.v9.a());
    }
}
