package y00;

/* loaded from: classes8.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y00.s f540026d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f540027e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(y00.s sVar, p3325xe03a0797.p3326xc267989b.q qVar) {
        super(1);
        this.f540026d = sVar;
        this.f540027e = qVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = y00.f.f540056a;
        y00.s sVar = this.f540026d;
        p3325xe03a0797.p3326xc267989b.q qVar = this.f540027e;
        synchronized (concurrentHashMap) {
            java.util.List list = (java.util.List) concurrentHashMap.get(java.lang.Long.valueOf(sVar.f540079b));
            if (list != null) {
                list.remove(qVar);
            }
        }
        return jz5.f0.f384359a;
    }
}
