package ih;

/* loaded from: classes12.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Application f372998a;

    /* renamed from: b, reason: collision with root package name */
    public qi.c f372999b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.q f373000c = new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.q(new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.j0(false, false, kz5.p0.f395529d), false, false, new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p(null, 0, 0, null, null, 31, null), false);

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashSet f373001d = new java.util.HashSet();

    public c(android.app.Application application) {
        if (application == null) {
            throw new java.lang.RuntimeException("matrix init, application is null");
        }
        this.f372998a = application;
    }

    public ih.c a(qi.b bVar) {
        java.lang.String b17 = bVar.b();
        java.util.HashSet hashSet = this.f373001d;
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (b17.equals(((qi.b) it.next()).b())) {
                throw new java.lang.RuntimeException(java.lang.String.format("plugin with tag %s is already exist", b17));
            }
        }
        hashSet.add(bVar);
        return this;
    }
}
