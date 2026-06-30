package bs5;

/* loaded from: classes13.dex */
public abstract class f implements tr5.p {

    /* renamed from: a, reason: collision with root package name */
    public int f105552a;

    /* renamed from: b, reason: collision with root package name */
    public final tr5.a0 f105553b;

    /* renamed from: c, reason: collision with root package name */
    public final tr5.r f105554c;

    /* renamed from: d, reason: collision with root package name */
    public java.nio.channels.SelectionKey f105555d = null;

    /* renamed from: e, reason: collision with root package name */
    public final bs5.g f105556e;

    /* renamed from: f, reason: collision with root package name */
    public final bs5.f f105557f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f105558g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ bs5.h f105559h;

    public f(bs5.h hVar, tr5.a0 a0Var, tr5.r rVar, bs5.f fVar) {
        this.f105559h = hVar;
        this.f105552a = 0;
        bs5.g gVar = new bs5.g();
        this.f105556e = gVar;
        this.f105558g = java.util.Collections.emptyList();
        if (a0Var == null) {
            throw new java.lang.IllegalArgumentException("lookupContext".concat(" can not be null"));
        }
        if (rVar == null) {
            throw new java.lang.IllegalArgumentException("dns".concat(" can not be null"));
        }
        gVar.f347883g = java.lang.System.currentTimeMillis();
        tr5.f0 f0Var = a0Var.f502973a;
        gVar.f105568r = f0Var.f503020m;
        boolean z17 = f0Var.f503019l;
        gVar.f105570t = z17;
        gVar.f105571u = f0Var.f503021n;
        this.f105553b = a0Var;
        this.f105554c = rVar;
        this.f105557f = fVar;
        if (z17 || hVar.f105573a.b(f0Var.f503009b) == null) {
            return;
        }
        this.f105552a = 3;
    }

    public abstract int a();

    public final void b() {
        if (4 == this.f105552a) {
            return;
        }
        this.f105552a = 4;
        this.f105556e.h();
        bs5.b bVar = (bs5.b) this;
        sr5.a.a(bVar.f105540i);
        bVar.f105544m = null;
        bVar.f105542k = null;
        bVar.f105543l = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (r3.f105572v != 200) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        if (r3.f105572v == 401) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
    
        if (r3.f105562i != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
    
        r0.f105573a.c(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        r3.f105564n = r4.f303661a;
        r0 = r4.f303663c;
        r3.f105565o = r0;
        r3.f105566p = r3.i(r0);
        r3.f347880d = r4.f303662b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007c, code lost:
    
        if (r4 == cs5.a.f303660e) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007e, code lost:
    
        b();
        f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008a, code lost:
    
        return sr5.a.d(r3.f347880d, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0058, code lost:
    
        r0.f105573a.a(r2.f503022o);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String[] c() {
        /*
            r6 = this;
            bs5.h r0 = r6.f105559h
            int r1 = r6.f105552a
            r2 = 3
            bs5.g r3 = r6.f105556e
            if (r2 == r1) goto L21
            tr5.r r0 = r6.f105554c
            tr5.g r0 = r0.mo11135x730bcac6()
            int r0 = r0.f503024b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "HttpDns(%d) mState is not readable"
            or5.b.a(r1, r0)
            java.lang.String[] r0 = r3.f347880d
            return r0
        L21:
            cs5.a r1 = cs5.a.f303659d
            tr5.a0 r2 = r6.f105553b
            tr5.f0 r2 = r2.f502973a
            boolean r4 = r0.d(r2, r3)     // Catch: java.lang.Throwable -> L8d
            if (r4 == 0) goto L3a
            java.lang.String[] r0 = r3.f347880d     // Catch: java.lang.Throwable -> L8d
            cs5.a r2 = cs5.a.f303660e
            if (r1 == r2) goto L39
            r6.b()
            r6.f()
        L39:
            return r0
        L3a:
            cs5.a r4 = r6.e()     // Catch: java.lang.Throwable -> L8d
            if (r4 == r1) goto L4c
            cs5.a r1 = cs5.a.f303660e     // Catch: java.lang.Throwable -> L4a
            if (r4 == r1) goto L4c
            java.lang.String[] r1 = r4.f303662b     // Catch: java.lang.Throwable -> L4a
            int r1 = r1.length     // Catch: java.lang.Throwable -> L4a
            if (r1 != 0) goto L52
            goto L4c
        L4a:
            r0 = move-exception
            goto L8b
        L4c:
            int r1 = r3.f105572v     // Catch: java.lang.Throwable -> L4a
            r5 = 200(0xc8, float:2.8E-43)
            if (r1 == r5) goto L58
        L52:
            int r1 = r3.f105572v     // Catch: java.lang.Throwable -> L4a
            r5 = 401(0x191, float:5.62E-43)
            if (r1 != r5) goto L5f
        L58:
            bs5.o r1 = r0.f105573a     // Catch: java.lang.Throwable -> L4a
            java.lang.String r5 = r2.f503022o     // Catch: java.lang.Throwable -> L4a
            r1.a(r5)     // Catch: java.lang.Throwable -> L4a
        L5f:
            int r1 = r3.f105562i     // Catch: java.lang.Throwable -> L4a
            if (r1 != 0) goto L68
            bs5.o r0 = r0.f105573a     // Catch: java.lang.Throwable -> L4a
            r0.c(r2, r4)     // Catch: java.lang.Throwable -> L4a
        L68:
            java.lang.String r0 = r4.f303661a     // Catch: java.lang.Throwable -> L4a
            r3.f105564n = r0     // Catch: java.lang.Throwable -> L4a
            java.util.Map r0 = r4.f303663c     // Catch: java.lang.Throwable -> L4a
            r3.f105565o = r0     // Catch: java.lang.Throwable -> L4a
            long r0 = r3.i(r0)     // Catch: java.lang.Throwable -> L4a
            r3.f105566p = r0     // Catch: java.lang.Throwable -> L4a
            java.lang.String[] r0 = r4.f303662b     // Catch: java.lang.Throwable -> L4a
            r3.f347880d = r0     // Catch: java.lang.Throwable -> L4a
            cs5.a r0 = cs5.a.f303660e
            if (r4 == r0) goto L84
            r6.b()
            r6.f()
        L84:
            java.lang.String[] r0 = r3.f347880d
            java.lang.String[] r0 = sr5.a.d(r0, r2)
            return r0
        L8b:
            r1 = r4
            goto L8e
        L8d:
            r0 = move-exception
        L8e:
            cs5.a r2 = cs5.a.f303660e
            if (r1 == r2) goto L98
            r6.b()
            r6.f()
        L98:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bs5.f.c():java.lang.String[]");
    }

    public abstract int d();

    public abstract cs5.a e();

    public final void f() {
        if (4 != this.f105552a) {
            return;
        }
        bs5.f fVar = this.f105557f;
        if (fVar != null) {
            fVar.b();
        }
        java.util.Iterator it = this.f105558g.iterator();
        while (it.hasNext()) {
            ((bs5.f) it.next()).b();
        }
    }
}
