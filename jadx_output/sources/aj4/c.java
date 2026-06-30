package aj4;

/* loaded from: classes10.dex */
public final class c extends zi4.h0 {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f5311h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.lang.String cmdId, java.lang.ref.WeakReference weakReference, zi4.g0 host) {
        super(cmdId, weakReference, host, aj4.a.f5308d);
        kotlin.jvm.internal.o.g(cmdId, "cmdId");
        kotlin.jvm.internal.o.g(host, "host");
        this.f5311h = "MicroMsg.FLTStatusCompressMediaHandler";
    }

    @Override // zi4.h0
    public void b(com.tencent.mm.protobuf.f fVar, zi4.r1 asyncResult) {
        bw5.ab abVar = (bw5.ab) fVar;
        kotlin.jvm.internal.o.g(asyncResult, "asyncResult");
        java.util.LinkedList linkedList = abVar != null ? abVar.f25117e : null;
        if (linkedList == null || linkedList.isEmpty()) {
            com.tencent.mars.xlog.Log.e(this.f5311h, "handleAsyncRequest: empty items");
            asyncResult.a(new bw5.bb(), -1L, "no media items to compress");
            return;
        }
        com.tencent.mars.xlog.Log.i(this.f5311h, "handleAsyncRequest: count=" + linkedList.size());
        ((ku5.t0) ku5.t0.f312615d).g(new aj4.b(linkedList, asyncResult));
    }
}
