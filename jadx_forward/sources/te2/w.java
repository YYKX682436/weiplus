package te2;

/* loaded from: classes3.dex */
public final class w implements te2.u {

    /* renamed from: d, reason: collision with root package name */
    public te2.v f500036d;

    public w(android.content.Context context, gk2.e liveData, qo0.c statusMonitor) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
    }

    @Override // fs2.a
    /* renamed from: onAttach */
    public void mo56536x3b13c504(java.lang.Object obj) {
        te2.v callback = (te2.v) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f500036d = callback;
    }

    @Override // fs2.a
    /* renamed from: onDetach */
    public void mo979x3f5eee52() {
    }
}
