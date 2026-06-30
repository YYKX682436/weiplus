package rm5;

/* loaded from: classes10.dex */
public final class h implements rm5.k {

    /* renamed from: h, reason: collision with root package name */
    public static final rm5.c f479022h = new rm5.c(null);

    /* renamed from: i, reason: collision with root package name */
    public static final android.util.LruCache f479023i = new android.util.LruCache(200);

    /* renamed from: a, reason: collision with root package name */
    public final yz5.a f479024a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f479025b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25867x252329dc f479026c;

    /* renamed from: f, reason: collision with root package name */
    public boolean f479029f;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 f479027d = new com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85(300.0f, 300.0f);

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f479028e = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.tav.p2947x2eaf9f.C25658x29f502a8.ImageGeneratorListener f479030g = new rm5.g(this);

    public h(yz5.a aVar, java.lang.String str) {
        this.f479024a = aVar;
        this.f479025b = str;
        xm5.b.c("MicroMsg.VLogCompositionCoverGenerator", "init: " + hashCode(), new java.lang.Object[0]);
    }

    @Override // rm5.k
    public void a(java.util.List times, yz5.p callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(times, "times");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = times.iterator();
        while (true) {
            boolean z17 = false;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            long longValue = ((java.lang.Number) next).longValue();
            xm5.b.c("MicroMsg.VLogCompositionCoverGenerator", "requestFrames: " + longValue, new java.lang.Object[0]);
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) f479023i.get(this.f479025b + '-' + longValue);
            if (bitmap != null) {
                callback.mo149xb9724478(java.lang.Long.valueOf(longValue), bitmap);
            } else {
                z17 = true;
            }
            if (z17) {
                arrayList.add(next);
            }
        }
        java.util.List Q = kz5.n0.Q(arrayList);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(Q, 10));
        java.util.Iterator it6 = Q.iterator();
        while (it6.hasNext()) {
            arrayList2.add(new rm5.d(((java.lang.Number) it6.next()).longValue(), callback, null, 4, null));
        }
        if (arrayList2.isEmpty()) {
            xm5.b.c("MicroMsg.VLogCompositionCoverGenerator", "requestFrames: no new request", new java.lang.Object[0]);
            return;
        }
        synchronized (this.f479028e) {
            this.f479028e.addAll(arrayList2);
        }
        e();
    }

    @Override // rm5.k
    public void b(long j17) {
        synchronized (this.f479028e) {
            kz5.h0.B(this.f479028e, new rm5.e(j17));
        }
    }

    public final void c() {
        com.p314xaae8f345.tav.p2947x2eaf9f.C25658x29f502a8 m98480x37711792;
        if (this.f479026c != null) {
            xm5.b.c("MicroMsg.VLogCompositionCoverGenerator", "destroy generator: " + this.f479026c, new java.lang.Object[0]);
            com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25867x252329dc c25867x252329dc = this.f479026c;
            if (c25867x252329dc != null && (m98480x37711792 = c25867x252329dc.m98480x37711792()) != null) {
                m98480x37711792.m96444x41012807();
            }
            this.f479026c = null;
        }
    }

    public final void d() {
        com.p314xaae8f345.tav.p2947x2eaf9f.C25658x29f502a8 m98480x37711792;
        if (this.f479026c == null) {
            this.f479026c = new com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25867x252329dc((com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25876x5fee0d04) this.f479024a.mo152xb9724478(), this.f479027d);
            xm5.b.c("MicroMsg.VLogCompositionCoverGenerator", "create generator " + this.f479026c, new java.lang.Object[0]);
            com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25867x252329dc c25867x252329dc = this.f479026c;
            if (c25867x252329dc == null || (m98480x37711792 = c25867x252329dc.m98480x37711792()) == null) {
                return;
            }
            m98480x37711792.m96445x148a4ed5(com.p314xaae8f345.tav.p2947x2eaf9f.C25658x29f502a8.ApertureMode.aspectFill);
        }
    }

    @Override // rm5.k
    /* renamed from: destroy */
    public void mo122875x5cd39ffa() {
        xm5.b.c("MicroMsg.VLogCompositionCoverGenerator", "destroy: " + hashCode(), new java.lang.Object[0]);
        synchronized (this.f479028e) {
            this.f479028e.clear();
        }
        c();
    }

    public final void e() {
        synchronized (this.f479028e) {
            if (this.f479029f) {
                return;
            }
            if (!this.f479028e.isEmpty()) {
                java.lang.Object obj = this.f479028e.get(0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                rm5.d dVar = (rm5.d) obj;
                d();
                this.f479029f = true;
                com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25867x252329dc c25867x252329dc = this.f479026c;
                if (c25867x252329dc != null) {
                    c25867x252329dc.m98477x638ec777(dVar.f479016c, this.f479030g);
                }
            } else {
                c();
            }
        }
    }

    @Override // rm5.k
    /* renamed from: setSize */
    public void mo122876x76500f83(int i17, int i18) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a85 = this.f479027d;
        c25732x76648a85.f47833x6be2dc6 = i17;
        c25732x76648a85.f47832xb7389127 = i18;
    }
}
