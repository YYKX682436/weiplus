package u56;

/* loaded from: classes16.dex */
public final class c extends java.util.concurrent.atomic.AtomicLong implements p56.n {

    /* renamed from: d, reason: collision with root package name */
    public boolean f506351d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f506352e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Throwable f506353f;

    /* renamed from: g, reason: collision with root package name */
    public final u56.b f506354g;

    public c(u56.b bVar) {
        this.f506354g = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0096, code lost:
    
        r14.f506351d = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0099, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x002a, code lost:
    
        r1 = r14.f506353f;
        r2 = r10.f484790m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x002e, code lost:
    
        if (r1 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0030, code lost:
    
        r2.mo157869xaf8aa769(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0034, code lost:
    
        r2.mo157868xaa8b332c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0037, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a() {
        /*
            Method dump skipped, instructions count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u56.c.a():void");
    }

    public void b(java.lang.Throwable th6) {
        if (this.f506352e) {
            return;
        }
        this.f506353f = th6;
        this.f506352e = true;
        a();
    }

    @Override // p56.n
    public void d(long j17) {
        boolean z17;
        if (j17 == 0) {
            return;
        }
        while (true) {
            long j18 = get();
            boolean z18 = true;
            z17 = j18 == 0;
            long j19 = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
            if (j18 == com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697) {
                break;
            }
            if (j17 == com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697) {
                j19 = j17;
            } else {
                if (j18 <= com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697 - j17) {
                    j19 = j18 + j17;
                }
                z18 = z17;
            }
            if (compareAndSet(j18, j19)) {
                z17 = z18;
                break;
            }
        }
        if (z17) {
            a();
        }
    }
}
