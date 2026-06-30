package ih;

/* loaded from: classes12.dex */
public class d {

    /* renamed from: c, reason: collision with root package name */
    public static volatile ih.d f373002c;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashSet f373003a;

    /* renamed from: b, reason: collision with root package name */
    public final android.app.Application f373004b;

    public d(android.app.Application application, qi.c cVar, java.util.HashSet hashSet, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.q qVar, ih.b bVar) {
        this.f373004b = application;
        this.f373003a = hashSet;
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g0.a(application, qVar);
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134367k.c(application, qVar.f134308a);
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((qi.b) it.next()).c(this.f373004b, cVar);
        }
    }

    public static boolean c() {
        return f373002c != null;
    }

    public static ih.d d() {
        if (f373002c != null) {
            return f373002c;
        }
        throw new java.lang.RuntimeException("you must init Matrix sdk first");
    }

    public qi.b a(java.lang.Class cls) {
        java.lang.String name = cls.getName();
        java.util.Iterator it = this.f373003a.iterator();
        while (it.hasNext()) {
            qi.b bVar = (qi.b) it.next();
            if (bVar.getClass().getName().equals(name)) {
                return bVar;
            }
        }
        return null;
    }

    public qi.b b(java.lang.String str) {
        java.util.Iterator it = this.f373003a.iterator();
        while (it.hasNext()) {
            qi.b bVar = (qi.b) it.next();
            if (bVar.b().equals(str)) {
                return bVar;
            }
        }
        return null;
    }
}
