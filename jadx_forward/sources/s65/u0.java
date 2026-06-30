package s65;

/* loaded from: classes11.dex */
public class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f485054d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s65.x0 f485055e;

    public u0(s65.x0 x0Var, int i17) {
        this.f485055e = x0Var;
        this.f485054d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        s65.x0 x0Var = this.f485055e;
        ((android.app.NotificationManager) x0Var.A.getSystemService("notification")).cancel(99);
        if (this.f485054d == 2 && x0Var.f485063d == 1) {
            android.content.Intent intent = new android.content.Intent();
            intent.setAction("com.tencent.mm.sandbox.updater.intent.ACTION_EXIT_APP");
            intent.setPackage(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
            x0Var.A.sendBroadcast(intent, com.p314xaae8f345.mm.sdk.p2603x2137b148.v9.a());
        }
    }
}
