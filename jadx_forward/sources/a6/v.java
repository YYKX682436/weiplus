package a6;

/* loaded from: classes14.dex */
public final class v implements a6.a0 {

    /* renamed from: b, reason: collision with root package name */
    public final a6.d0 f83231b;

    /* renamed from: c, reason: collision with root package name */
    public final s5.c f83232c;

    /* renamed from: d, reason: collision with root package name */
    public final a6.u f83233d;

    public v(a6.d0 weakMemoryCache, s5.c referenceCounter, int i17, h6.k kVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(weakMemoryCache, "weakMemoryCache");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(referenceCounter, "referenceCounter");
        this.f83231b = weakMemoryCache;
        this.f83232c = referenceCounter;
        this.f83233d = new a6.u(this, i17);
    }

    @Override // a6.a0
    public synchronized void a(int i17) {
        if (i17 >= 40) {
            synchronized (this) {
                this.f83233d.m174746x6ebdebde(-1);
            }
        } else {
            boolean z17 = false;
            if (10 <= i17 && i17 < 20) {
                z17 = true;
            }
            if (z17) {
                a6.u uVar = this.f83233d;
                uVar.m174746x6ebdebde(uVar.m174743x35e001() / 2);
            }
        }
    }

    @Override // a6.a0
    public synchronized a6.r b(p135x2eae8f.p136xbfc2bd01.AbstractC1415x223acdfc key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        return (a6.r) this.f83233d.get(key);
    }

    @Override // a6.a0
    public synchronized void c(p135x2eae8f.p136xbfc2bd01.AbstractC1415x223acdfc key, android.graphics.Bitmap bitmap, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
        int a17 = h6.a.a(bitmap);
        if (a17 > this.f83233d.m174738x324fa785()) {
            if (((a6.t) this.f83233d.m174741xc84af884(key)) == null) {
                this.f83231b.c(key, bitmap, z17, a17);
            }
        } else {
            this.f83232c.c(bitmap);
            this.f83233d.put(key, new a6.t(bitmap, z17, a17));
        }
    }
}
