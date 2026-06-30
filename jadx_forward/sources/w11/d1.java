package w11;

/* loaded from: classes11.dex */
public class d1 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w11.e1 f523529a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f523530b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w11.f1 f523531c;

    public d1(w11.f1 f1Var, w11.e1 e1Var, boolean z17) {
        this.f523531c = f1Var;
        this.f523529a = e1Var;
        this.f523530b = z17;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String action = intent == null ? "" : intent.getAction();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenState", "ScreenReceiver action [%s] ", action);
        boolean equals = "android.intent.action.SCREEN_OFF".equals(action);
        w11.f1 f1Var = this.f523531c;
        if (equals) {
            f1Var.f523554a = java.lang.Boolean.FALSE;
        } else {
            f1Var.f523554a = java.lang.Boolean.TRUE;
        }
        w11.e1 e1Var = this.f523529a;
        if (e1Var != null) {
            e1Var.a(f1Var.f523554a.booleanValue());
        }
        if (this.f523530b) {
            try {
                context.unregisterReceiver(this);
            } catch (java.lang.Throwable unused) {
            }
        }
    }
}
