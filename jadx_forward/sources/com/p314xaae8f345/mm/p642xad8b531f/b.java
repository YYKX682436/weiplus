package com.p314xaae8f345.mm.p642xad8b531f;

/* loaded from: classes12.dex */
public class b implements c01.z7 {

    /* renamed from: c, reason: collision with root package name */
    public static c01.z7 f144836c;

    /* renamed from: d, reason: collision with root package name */
    public static volatile com.p314xaae8f345.mm.p642xad8b531f.b f144837d;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f144838a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f144839b;

    public b() {
        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.l5) i95.n0.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.l5.class)).wi(new com.p314xaae8f345.mm.p642xad8b531f.a(this));
        if (this.f144839b == null) {
            final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
            this.f144839b = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5890x658ae60a>(a0Var) { // from class: com.tencent.mm.booter.BackgroundPlayer$2
                @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
                /* renamed from: callback */
                public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5890x658ae60a c5890x658ae60a) {
                    int i17 = c5890x658ae60a.f136198g.f88319a;
                    com.p314xaae8f345.mm.p642xad8b531f.b bVar = com.p314xaae8f345.mm.p642xad8b531f.b.this;
                    if (i17 == 0) {
                        bVar.a();
                        return false;
                    }
                    if (i17 != 1) {
                        return false;
                    }
                    bVar.b();
                    return false;
                }
            };
        }
        this.f144839b.mo48813x58998cd();
    }

    public static c01.z7 c() {
        if (f144836c == null) {
            f144836c = d();
        }
        return f144836c;
    }

    public static com.p314xaae8f345.mm.p642xad8b531f.b d() {
        if (f144837d == null) {
            synchronized (com.p314xaae8f345.mm.p642xad8b531f.b.class) {
                if (f144837d == null) {
                    f144837d = new com.p314xaae8f345.mm.p642xad8b531f.b();
                }
            }
        }
        return f144837d;
    }

    public void a() {
        java.util.List list = this.f144838a;
        if (list == null) {
            return;
        }
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (it.hasNext()) {
            ((c01.a8) it.next()).d();
        }
    }

    public void b() {
        java.util.List list = this.f144838a;
        if (list == null) {
            return;
        }
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (it.hasNext()) {
            ((c01.a8) it.next()).b();
        }
    }
}
