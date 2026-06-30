package sw5;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f495022a = new java.util.LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f495023b = new java.util.LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final android.os.Handler f495024c = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f495025d = new java.util.LinkedHashMap();

    public final synchronized qw5.b a(kw5.b bVar, yz5.a aVar) {
        if (bVar == null) {
            return null;
        }
        java.lang.Object obj = ((java.util.LinkedHashMap) this.f495022a).get(bVar);
        if (obj == null) {
            if (aVar != null) {
                ow5.a bizConfig = (ow5.a) aVar.mo152xb9724478();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizConfig, "bizConfig");
                qw5.b bVar2 = new qw5.b(bizConfig);
                this.f495022a.put(bVar, bVar2);
                this.f495023b.put(bVar, aVar);
                obj = bVar2;
            } else {
                yz5.a aVar2 = (yz5.a) ((java.util.LinkedHashMap) this.f495023b).get(bVar);
                if (aVar2 != null) {
                    ow5.a bizConfig2 = (ow5.a) aVar2.mo152xb9724478();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizConfig2, "bizConfig");
                    obj = new qw5.b(bizConfig2);
                    this.f495022a.put(bVar, obj);
                }
            }
        }
        return (qw5.b) obj;
    }

    public final synchronized void b(kw5.b bVar) {
        qw5.b a17 = a(bVar, null);
        if (a17 != null) {
            vw5.b bVar2 = a17.f448766d;
            if (bVar2 != null) {
                ((xw5.d) bVar2).b();
                zw5.a aVar = yw5.a.f548533a;
                yw5.a.f548534b.remove(java.lang.Long.valueOf(a17.f448764b));
            }
            com.p314xaae8f345.p3178x498cab9f.p3179xf7e5dd3b.p3181xc5476f33.scl.p3182xe480f708.b.f301575b.e(a17.f448764b);
            ((rw5.a) a17.f448765c).a();
        }
        synchronized (kw5.b.f394747b) {
            if (bVar != null) {
            }
        }
        this.f495022a.remove(bVar);
        this.f495023b.remove(bVar);
    }
}
