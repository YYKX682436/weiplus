package gr2;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f356331a;

    /* renamed from: b, reason: collision with root package name */
    public final int f356332b;

    /* renamed from: c, reason: collision with root package name */
    public final dr2.c f356333c;

    /* renamed from: d, reason: collision with root package name */
    public int f356334d;

    public o(android.content.Context context, int i17, dr2.c cVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f356331a = context;
        this.f356332b = i17;
        this.f356333c = cVar;
        this.f356334d = -1;
    }

    public final java.lang.String a(android.os.Bundle bundle) {
        cl0.g gVar = new cl0.g();
        try {
            java.util.Set<java.lang.String> keySet = bundle.keySet();
            java.util.Iterator<java.lang.String> it = keySet != null ? keySet.iterator() : null;
            if (it != null) {
                while (it.hasNext()) {
                    java.lang.String next = it.next();
                    gVar.s(next, bundle.get(next));
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("NewEntranceViewItemClick", "bundleToString err:" + e17.getMessage());
        }
        java.lang.String gVar2 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
        return gVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c2, code lost:
    
        if ((r2 <= r17 && r17 < -1) != false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String b(int r17, android.view.View r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gr2.o.b(int, android.view.View, java.lang.String):java.lang.String");
    }
}
