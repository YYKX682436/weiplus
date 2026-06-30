package fs;

/* loaded from: classes12.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final fs.h[] f347617a = {null};

    /* renamed from: b, reason: collision with root package name */
    public static k95.a f347618b;

    /* renamed from: c, reason: collision with root package name */
    public static android.app.Application f347619c;

    public static boolean a(java.lang.Class cls, java.lang.Object obj, fs.o oVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList(16);
        for (fs.q qVar : ((fs.c) f(cls)).all()) {
            if (qVar.mo210xb7045565(obj) && d(f347619c, qVar)) {
                arrayList.add(qVar);
            }
        }
        if (arrayList.size() <= 1) {
            if (arrayList.size() == 1) {
                return oVar.a((fs.n) ((fs.q) arrayList.get(0)).get());
            }
            return false;
        }
        throw new java.lang.IllegalStateException("More than one extension was registered on key '" + obj + "': " + arrayList);
    }

    public static boolean b(java.lang.Class cls, fs.o oVar) {
        for (fs.q qVar : ((fs.c) f(cls)).all()) {
            if (d(f347619c, qVar) && oVar.a((fs.n) qVar.get())) {
                return true;
            }
        }
        return false;
    }

    public static boolean c(java.lang.Class cls, java.lang.Object obj, fs.o oVar) {
        for (fs.q qVar : ((fs.c) f(cls)).all()) {
            if (qVar.mo210xb7045565(obj) && d(f347619c, qVar) && oVar.a((fs.n) qVar.get())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0033 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean d(android.content.Context r1, fs.q r2) {
        /*
            boolean r1 = e(r1, r2)
            r0 = 0
            if (r1 != 0) goto L8
            return r0
        L8:
            java.lang.String r1 = "accountAware"
            java.lang.Object r1 = r2.mo209xe96b5b08(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r2 = 1
            if (r1 == 0) goto L34
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L34
            k95.a r1 = fs.g.f347618b
            if (r1 == 0) goto L30
            boolean r1 = gm0.j1.h()
            if (r1 == 0) goto L2b
            boolean r1 = gm0.j1.a()
            if (r1 == 0) goto L2b
            r1 = r2
            goto L2c
        L2b:
            r1 = r0
        L2c:
            if (r1 == 0) goto L30
            r1 = r2
            goto L31
        L30:
            r1 = r0
        L31:
            if (r1 != 0) goto L34
            return r0
        L34:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: fs.g.d(android.content.Context, fs.q):boolean");
    }

    public static boolean e(android.content.Context context, fs.q qVar) {
        java.lang.Object mo209xe96b5b08 = qVar.mo209xe96b5b08("onProcess");
        if (mo209xe96b5b08 == null) {
            return true;
        }
        if (mo209xe96b5b08 instanceof com.p314xaae8f345.mm.app.c6) {
            return ((com.p314xaae8f345.mm.app.c6) mo209xe96b5b08).m43004x321e8933(context);
        }
        if (!(mo209xe96b5b08 instanceof java.util.List)) {
            throw new java.lang.IllegalStateException("Unexpected 'onProcess' value type '" + mo209xe96b5b08.getClass().getName() + "' of '" + qVar + "'");
        }
        java.util.List list = (java.util.List) mo209xe96b5b08;
        if (list.isEmpty()) {
            return true;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((com.p314xaae8f345.mm.app.c6) it.next()).m43004x321e8933(context)) {
                return true;
            }
        }
        return false;
    }

    public static fs.i f(java.lang.Class cls) {
        fs.h[] hVarArr = f347617a;
        if (hVarArr[0] == null) {
            synchronized (hVarArr) {
                if (hVarArr[0] == null) {
                    throw new java.lang.IllegalStateException("Please call init(...) first.");
                }
            }
        }
        return new fs.c(((fs.k2) hVarArr[0]).a(cls));
    }

    public static fs.q g(java.lang.Class cls, java.lang.Object obj) {
        int i17 = 0;
        fs.q qVar = null;
        for (fs.q qVar2 : ((fs.c) f(cls)).all()) {
            if (qVar2.mo210xb7045565(obj)) {
                i17++;
                if (qVar == null) {
                    qVar = qVar2;
                }
            }
        }
        if (i17 <= 1) {
            return qVar;
        }
        throw new java.lang.IllegalStateException("More than one implementation of unique-expected extendable interface: ".concat(cls.getName()));
    }
}
