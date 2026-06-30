package p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd;

/* loaded from: classes14.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final p3325xe03a0797.p3326xc267989b.g3 f392017a;

    static {
        java.lang.String str;
        java.lang.Object next;
        int i17 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.n0.f392044a;
        p3325xe03a0797.p3326xc267989b.g3 g3Var = null;
        try {
            str = java.lang.System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (java.lang.SecurityException unused) {
            str = null;
        }
        if (str != null) {
            java.lang.Boolean.parseBoolean(str);
        }
        java.util.List y17 = q26.h0.y(q26.y.a(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.a0.a()));
        java.util.Iterator it = y17.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int mo143965x67ffef20 = ((p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.z) next).mo143965x67ffef20();
                do {
                    java.lang.Object next2 = it.next();
                    int mo143965x67ffef202 = ((p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.z) next2).mo143965x67ffef20();
                    if (mo143965x67ffef20 < mo143965x67ffef202) {
                        next = next2;
                        mo143965x67ffef20 = mo143965x67ffef202;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.z zVar = (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.z) next;
        if (zVar != null) {
            try {
                g3Var = zVar.mo143964x24898cc3(y17);
            } catch (java.lang.Throwable unused2) {
                zVar.mo143966x893b4ae2();
            }
            if (g3Var != null) {
                f392017a = g3Var;
                return;
            }
        }
        throw new java.lang.IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }
}
