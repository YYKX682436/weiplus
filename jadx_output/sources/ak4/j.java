package ak4;

/* loaded from: classes11.dex */
public final class j extends ej4.r {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f5647d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f5648e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5649f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5650g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(android.view.View subject, ak4.d span, java.lang.String username) {
        super(subject, username, "");
        kotlin.jvm.internal.o.g(subject, "subject");
        kotlin.jvm.internal.o.g(span, "span");
        kotlin.jvm.internal.o.g(username, "username");
        this.f5647d = "MicroMsg.TextStatus.TSItemSpanListener";
        this.f5648e = new java.lang.ref.WeakReference(span);
        int hashCode = subject.hashCode();
        this.f5649f = hashCode;
        int hashCode2 = span.hashCode();
        this.f5650g = hashCode2;
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TSItemSpanListener", "[TSItemSpanListener] init register username=" + username + " subKey='' subjectHash=" + hashCode + " subjectClass=" + subject.getClass().getSimpleName() + " spanHash=" + hashCode2 + " listenerHash=" + hashCode());
    }

    @Override // ej4.r
    public void b() {
        ak4.d dVar = (ak4.d) this.f5648e.get();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[TSItemSpanListener] onChange fire username=");
        sb6.append(this.f253374a);
        sb6.append(" subjectHash=");
        int i17 = this.f5649f;
        sb6.append(i17);
        sb6.append(" spanAlive=");
        sb6.append(dVar != null);
        sb6.append(" spanHash=");
        sb6.append(this.f5650g);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f5647d;
        com.tencent.mars.xlog.Log.i(str, sb7);
        if (dVar == null) {
            com.tencent.mars.xlog.Log.w(str, "[TSItemSpanListener] onChange skip: span, subjectHash=" + i17);
        } else {
            try {
                dVar.j();
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace(str, th6, "onChange err", new java.lang.Object[0]);
            }
        }
    }
}
