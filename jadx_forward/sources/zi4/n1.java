package zi4;

/* loaded from: classes4.dex */
public final class n1 extends zi4.h0 {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f554775h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(java.lang.String cmdId, java.lang.ref.WeakReference weakReference, zi4.g0 host) {
        super(cmdId, weakReference, host, zi4.l1.f554768d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdId, "cmdId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
        this.f554775h = "MicroMsg.FLTStatusSimpleTestHandler";
    }

    @Override // zi4.h0
    public void b(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, zi4.r1 asyncResult) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(asyncResult, "asyncResult");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f554775h, "handleAsyncRequest: " + java.lang.Thread.currentThread().getName());
        bw5.yb ybVar = new bw5.yb();
        ybVar.f116956d = "This is Native Status Data";
        ybVar.f116957e[1] = true;
        pm0.v.X(new zi4.m1(this, (bw5.zb) fVar));
        asyncResult.a(ybVar, 0L, "");
    }
}
