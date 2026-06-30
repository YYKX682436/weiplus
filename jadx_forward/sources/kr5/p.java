package kr5;

/* loaded from: classes13.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static android.content.Context f393103a;

    /* renamed from: b, reason: collision with root package name */
    public static kr5.g f393104b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile boolean f393105c;

    public static void a(java.util.List list) {
        or5.b.d("DnsService.addLogNodes(%s) called", sr5.a.e(list));
        if (list == null) {
            return;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            or5.c cVar = (or5.c) it.next();
            java.util.List list2 = or5.d.f429237a;
            synchronized (or5.d.class) {
                if (cVar != null) {
                    ((java.util.ArrayList) or5.d.f429237a).add(cVar);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static tr5.z b(java.lang.String r4, java.lang.String r5, boolean r6, boolean r7) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kr5.p.b(java.lang.String, java.lang.String, boolean, boolean):tr5.z");
    }

    public static java.lang.String c(java.lang.String str) {
        java.lang.String b17 = kr5.c.c().b();
        tr5.e0 e0Var = new tr5.e0();
        e0Var.c(f393103a);
        e0Var.e(str);
        e0Var.g(f393104b.f393082d);
        e0Var.d(b17);
        e0Var.f(f393104b.f393081c);
        e0Var.b(f393104b.f393087i);
        e0Var.f502998g = true;
        kr5.g gVar = f393104b;
        e0Var.f502999h = gVar.f393089k;
        e0Var.f503003l = false;
        int i17 = gVar.f393090l;
        if (sr5.f.a(i17)) {
            throw new java.lang.IllegalArgumentException("customNetStack".concat(" is invalid"));
        }
        e0Var.f503002k = i17;
        tr5.g0 d17 = tr5.l.d(e0Var.a());
        ((lr5.d) lr5.e.f402303c).execute(new kr5.k(d17));
        return ((fs5.c) d17.f503026e).e();
    }

    public static void d() {
        java.util.Set set = f393104b.f393084f;
        if (set == null || set.isEmpty()) {
            return;
        }
        ((lr5.d) lr5.e.f402303c).execute(new kr5.o(sr5.a.f((java.lang.String[]) f393104b.f393084f.toArray(new java.lang.String[f393104b.f393084f.size()]), ",")));
    }
}
