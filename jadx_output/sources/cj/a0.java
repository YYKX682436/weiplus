package cj;

/* loaded from: classes12.dex */
public class a0 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cj.b0 f41819a;

    public a0(cj.b0 b0Var) {
        this.f41819a = b0Var;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        boolean equals = "android.intent.action.SCREEN_OFF".equals(intent.getAction());
        cj.b0 b0Var = this.f41819a;
        if (equals) {
            b0Var.f41822f = true;
            oj.j.c("Matrix.LeakProcessor.SilenceAnalyse", "[ACTION_SCREEN_OFF]", new java.lang.Object[0]);
        } else if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
            b0Var.f41822f = false;
            oj.j.c("Matrix.LeakProcessor.SilenceAnalyse", "[ACTION_SCREEN_ON]", new java.lang.Object[0]);
        }
    }
}
