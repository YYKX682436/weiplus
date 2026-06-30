package gk0;

/* loaded from: classes9.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f353960a;

    public j(java.util.List ppcList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ppcList, "ppcList");
        this.f353960a = ppcList;
    }

    public static /* synthetic */ g75.u b(gk0.j jVar, g75.z zVar, java.lang.ref.WeakReference weakReference, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: attach");
        }
        if ((i17 & 2) != 0) {
            weakReference = null;
        }
        return jVar.a(zVar, weakReference);
    }

    public final g75.u a(g75.z pipelineState, java.lang.ref.WeakReference weakReference) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pipelineState, "pipelineState");
        java.lang.String bizName = "CommonImageLoader@" + (java.lang.System.currentTimeMillis() % 4);
        gk0.i iVar = weakReference != null ? new gk0.i(weakReference) : null;
        java.util.List componentList = this.f353960a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(componentList, "componentList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        g75.r rVar = new g75.r(kz5.n0.X0(componentList), pipelineState, bizName, iVar, true);
        rVar.d();
        return new g75.u(new java.lang.ref.WeakReference(rVar));
    }
}
