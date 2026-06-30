package ak4;

/* loaded from: classes11.dex */
public final class j extends ej4.r {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f87180d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f87181e;

    /* renamed from: f, reason: collision with root package name */
    public final int f87182f;

    /* renamed from: g, reason: collision with root package name */
    public final int f87183g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(android.view.View subject, ak4.d span, java.lang.String username) {
        super(subject, username, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subject, "subject");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(span, "span");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        this.f87180d = "MicroMsg.TextStatus.TSItemSpanListener";
        this.f87181e = new java.lang.ref.WeakReference(span);
        int hashCode = subject.hashCode();
        this.f87182f = hashCode;
        int hashCode2 = span.hashCode();
        this.f87183g = hashCode2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TSItemSpanListener", "[TSItemSpanListener] init register username=" + username + " subKey='' subjectHash=" + hashCode + " subjectClass=" + subject.getClass().getSimpleName() + " spanHash=" + hashCode2 + " listenerHash=" + hashCode());
    }

    @Override // ej4.r
    public void b() {
        ak4.d dVar = (ak4.d) this.f87181e.get();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[TSItemSpanListener] onChange fire username=");
        sb6.append(this.f334907a);
        sb6.append(" subjectHash=");
        int i17 = this.f87182f;
        sb6.append(i17);
        sb6.append(" spanAlive=");
        sb6.append(dVar != null);
        sb6.append(" spanHash=");
        sb6.append(this.f87183g);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f87180d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
        if (dVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "[TSItemSpanListener] onChange skip: span, subjectHash=" + i17);
        } else {
            try {
                dVar.j();
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, th6, "onChange err", new java.lang.Object[0]);
            }
        }
    }
}
