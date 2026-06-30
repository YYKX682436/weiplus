package d9;

/* loaded from: classes15.dex */
public final class p implements r9.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.net.Uri f308915a;

    /* renamed from: b, reason: collision with root package name */
    public final r9.k f308916b;

    /* renamed from: c, reason: collision with root package name */
    public final d9.q f308917c;

    /* renamed from: d, reason: collision with root package name */
    public final t9.g f308918d;

    /* renamed from: e, reason: collision with root package name */
    public final q8.k f308919e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f308920f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f308921g;

    /* renamed from: h, reason: collision with root package name */
    public long f308922h;

    /* renamed from: i, reason: collision with root package name */
    public long f308923i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d9.t f308924j;

    public p(d9.t tVar, android.net.Uri uri, r9.k kVar, d9.q qVar, t9.g gVar) {
        this.f308924j = tVar;
        uri.getClass();
        this.f308915a = uri;
        kVar.getClass();
        this.f308916b = kVar;
        qVar.getClass();
        this.f308917c = qVar;
        this.f308918d = gVar;
        this.f308919e = new q8.k();
        this.f308921g = true;
        this.f308923i = -1L;
    }

    @Override // r9.c0
    public void a() {
        q8.b bVar;
        int i17 = 0;
        while (i17 == 0 && !this.f308920f) {
            try {
                long j17 = this.f308919e.f442173a;
                long b17 = this.f308916b.b(new r9.n(this.f308915a, j17, -1L, this.f308924j.f308938n));
                this.f308923i = b17;
                if (b17 != -1) {
                    this.f308923i = b17 + j17;
                }
                r9.k kVar = this.f308916b;
                bVar = new q8.b(kVar, j17, this.f308923i);
                try {
                    q8.e a17 = this.f308917c.a(bVar, kVar.mo10287xb5887636());
                    if (this.f308921g) {
                        a17.mo131097x35ce78(j17, this.f308922h);
                        this.f308921g = false;
                    }
                    while (i17 == 0 && !this.f308920f) {
                        t9.g gVar = this.f308918d;
                        synchronized (gVar) {
                            while (!gVar.f498045a) {
                                gVar.wait();
                            }
                        }
                        i17 = a17.a(bVar, this.f308919e);
                        long j18 = bVar.f442151c;
                        if (j18 > this.f308924j.f308939o + j17) {
                            t9.g gVar2 = this.f308918d;
                            synchronized (gVar2) {
                                gVar2.f498045a = false;
                            }
                            d9.t tVar = this.f308924j;
                            tVar.f308945u.post(tVar.f308944t);
                            j17 = j18;
                        }
                    }
                    if (i17 == 1) {
                        i17 = 0;
                    } else {
                        this.f308919e.f442173a = bVar.f442151c;
                    }
                    t9.d0.e(this.f308916b);
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    if (i17 != 1 && bVar != null) {
                        this.f308919e.f442173a = bVar.f442151c;
                    }
                    t9.d0.e(this.f308916b);
                    throw th;
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
                bVar = null;
            }
        }
    }

    @Override // r9.c0
    public boolean b() {
        return this.f308920f;
    }

    @Override // r9.c0
    public void c() {
        this.f308920f = true;
    }
}
