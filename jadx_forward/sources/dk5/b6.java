package dk5;

/* loaded from: classes2.dex */
public class b6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f316063d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tg3.y0 f316064e;

    public b6(dk5.s5 s5Var, android.content.Context context, tg3.y0 y0Var) {
        this.f316063d = context;
        this.f316064e = y0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean i17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.hd.i(this.f316063d);
        android.content.Context context = this.f316063d;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        boolean e17 = com.p314xaae8f345.p3200xd0d7bedf.api.AbstractC27778x5479f090.a(context).e();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendToWeWorkHelper", "isSupportBufferMsgForward:%s costTime:%s", java.lang.Boolean.valueOf(e17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendMsgMgr", "isSupportForwardToWeWork: isSupportForwardToWeWork:%s isSupportBufferMsgForward:%s", java.lang.Boolean.valueOf(i17), java.lang.Boolean.valueOf(e17));
        ((ku5.t0) ku5.t0.f394148d).B(new dk5.a6(this, e17, i17));
    }
}
