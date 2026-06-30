package vb1;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final vb1.b f516006c = new vb1.b(null);

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f516007d = new java.util.HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f516008a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f516009b;

    public d(java.lang.String appId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        this.f516008a = appId;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.a(appId, new vb1.a(this));
        this.f516009b = new java.util.concurrent.ConcurrentHashMap();
    }

    public final void a(int i17, com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        this.f516009b.put(java.lang.Integer.valueOf(i17), new vb1.c(view));
    }

    public final void b(int i17) {
        vb1.c cVar = (vb1.c) this.f516009b.get(java.lang.Integer.valueOf(i17));
        if (cVar == null) {
            return;
        }
        cVar.f516005b = false;
    }

    public final void c(int i17) {
        vb1.c cVar = (vb1.c) this.f516009b.get(java.lang.Integer.valueOf(i17));
        if (cVar == null) {
            return;
        }
        cVar.f516005b = true;
    }

    public final int d() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f516009b;
        int i17 = 0;
        if (!concurrentHashMap.isEmpty()) {
            java.util.Iterator it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                if (((vb1.c) ((java.util.Map.Entry) it.next()).getValue()).f516005b) {
                    i17++;
                }
            }
        }
        return i17;
    }
}
