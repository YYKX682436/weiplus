package c01;

/* loaded from: classes11.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f37376d;

    public p(c01.u uVar, java.lang.String str) {
        this.f37376d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        c01.s sVar = c01.u.f37498f;
        if (sVar != null) {
            ((com.tencent.mm.app.w7) sVar).getClass();
            java.lang.String str = this.f37376d;
            com.tencent.mars.xlog.Log.i("MicroMsg.WorkerProfile", "summerdiz onReMoveNoticeId:%s", str);
            com.tencent.mm.autogen.events.BroadcastEvent broadcastEvent = new com.tencent.mm.autogen.events.BroadcastEvent();
            am.c1 c1Var = broadcastEvent.f54012g;
            c1Var.f6298a = 1;
            c1Var.f6299b = str;
            broadcastEvent.e();
        }
    }
}
