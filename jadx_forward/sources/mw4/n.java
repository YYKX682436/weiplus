package mw4;

/* loaded from: classes5.dex */
public final class n {

    /* renamed from: c, reason: collision with root package name */
    public yz5.r f413316c;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f413314a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f413315b = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f413317d = new java.util.LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    public final mw4.o f413318e = new mw4.o();

    public static mw4.n c(mw4.n nVar, java.lang.String sessionId, java.lang.String trustedOrigin, java.lang.String str, java.lang.String str2, int i17, java.lang.Object obj) {
        java.lang.String str3 = (i17 & 4) != 0 ? null : str;
        java.lang.String str4 = (i17 & 8) != 0 ? null : str2;
        nVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(trustedOrigin, "trustedOrigin");
        nVar.f413316c = new mw4.m(str3, str4, trustedOrigin, sessionId, nVar);
        return nVar;
    }

    public final mw4.p a() {
        yz5.q kVar;
        if (((java.util.ArrayList) this.f413314a).isEmpty()) {
            kVar = null;
        } else {
            yz5.r rVar = this.f413316c;
            java.util.List list = this.f413315b;
            if (rVar != null) {
                ((java.util.ArrayList) list).add(0, rVar);
            }
            kVar = new mw4.k(this);
            java.util.ArrayList arrayList = (java.util.ArrayList) list;
            if (!arrayList.isEmpty() && !arrayList.isEmpty()) {
                java.util.ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (listIterator.hasPrevious()) {
                    kVar = new mw4.j((yz5.r) listIterator.previous(), kVar);
                }
            }
        }
        return new mw4.p(kVar, this.f413318e, null);
    }

    public final mw4.n b(java.lang.String targetUrlPath, yz5.r handler) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetUrlPath, "targetUrlPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handler, "handler");
        this.f413317d.add(targetUrlPath);
        ((java.util.ArrayList) this.f413314a).add(new mw4.l(targetUrlPath, handler));
        return this;
    }
}
