package cf;

/* loaded from: classes7.dex */
public final class m implements u81.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f40827d;

    /* renamed from: e, reason: collision with root package name */
    public final android.util.ArrayMap f40828e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f40829f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.a f40830g;

    public m(java.lang.String appId) {
        kotlin.jvm.internal.o.g(appId, "appId");
        this.f40827d = appId;
        this.f40828e = new android.util.ArrayMap(((kz5.b) cf.j.f40824a).d());
        this.f40829f = jz5.h.b(new cf.l(this));
    }

    @Override // u81.f
    public void D(java.lang.String str, u81.b bVar) {
        yz5.a aVar;
        if ((str == null || str.length() == 0) || !kotlin.jvm.internal.o.b(str, this.f40827d) || bVar == null || (aVar = (yz5.a) this.f40828e.get(bVar)) == null) {
            return;
        }
        aVar.invoke();
    }

    public final void a(yz5.a callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f40828e.put(u81.b.BACKGROUND, callback);
    }

    public final void b(yz5.a callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f40828e.put(u81.b.DESTROYED, callback);
    }
}
