package aj4;

/* loaded from: classes10.dex */
public final class c extends zi4.h0 {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f86844h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.lang.String cmdId, java.lang.ref.WeakReference weakReference, zi4.g0 host) {
        super(cmdId, weakReference, host, aj4.a.f86841d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdId, "cmdId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
        this.f86844h = "MicroMsg.FLTStatusCompressMediaHandler";
    }

    @Override // zi4.h0
    public void b(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, zi4.r1 asyncResult) {
        bw5.ab abVar = (bw5.ab) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(asyncResult, "asyncResult");
        java.util.LinkedList linkedList = abVar != null ? abVar.f106650e : null;
        if (linkedList == null || linkedList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f86844h, "handleAsyncRequest: empty items");
            asyncResult.a(new bw5.bb(), -1L, "no media items to compress");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f86844h, "handleAsyncRequest: count=" + linkedList.size());
        ((ku5.t0) ku5.t0.f394148d).g(new aj4.b(linkedList, asyncResult));
    }
}
