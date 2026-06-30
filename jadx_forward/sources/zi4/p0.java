package zi4;

/* loaded from: classes4.dex */
public final class p0 extends zi4.h0 {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f554780h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(java.lang.String cmdId, java.lang.ref.WeakReference weakReference, zi4.g0 host) {
        super(cmdId, weakReference, host, zi4.o0.f554777d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdId, "cmdId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
        this.f554780h = "MicroMsg.FLTStatusGetCachePathDirHandler";
    }

    @Override // zi4.h0
    public void b(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, zi4.r1 asyncResult) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(asyncResult, "asyncResult");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f554780h, "handleAsyncRequest: " + java.lang.Thread.currentThread().getName());
        bw5.db dbVar = new bw5.db();
        dbVar.f107949d = gm0.j1.u().d() + "textstatus/";
        dbVar.f107950e[1] = true;
        asyncResult.a(dbVar, 0L, "");
    }
}
