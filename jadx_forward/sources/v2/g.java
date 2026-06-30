package v2;

/* loaded from: classes15.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    public final v2.i f514168b;

    /* renamed from: c, reason: collision with root package name */
    public final v2.f f514169c;

    /* renamed from: d, reason: collision with root package name */
    public v2.g f514170d;

    /* renamed from: i, reason: collision with root package name */
    public u2.j f514175i;

    /* renamed from: a, reason: collision with root package name */
    public final v2.o f514167a = new v2.o(this);

    /* renamed from: e, reason: collision with root package name */
    public int f514171e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f514172f = -1;

    /* renamed from: g, reason: collision with root package name */
    public v2.e f514173g = v2.e.NONE;

    /* renamed from: h, reason: collision with root package name */
    public int f514174h = 0;

    public g(v2.i iVar, v2.f fVar) {
        this.f514168b = iVar;
        this.f514169c = fVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        if ((r8.f514168b.Q > 0) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0050, code lost:
    
        if (r4 != r6) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0065, code lost:
    
        if (r4 != r6) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x007a, code lost:
    
        if (r4 != r7) goto L53;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x003f. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(v2.g r9, int r10, int r11, v2.e r12, int r13, boolean r14) {
        /*
            r8 = this;
            r0 = 1
            r1 = 0
            if (r9 != 0) goto L14
            r9 = 0
            r8.f514170d = r9
            r8.f514171e = r1
            r9 = -1
            r8.f514172f = r9
            v2.e r9 = v2.e.NONE
            r8.f514173g = r9
            r9 = 2
            r8.f514174h = r9
            return r0
        L14:
            if (r14 != 0) goto L82
            v2.f r14 = v2.f.BASELINE
            v2.f r2 = r8.f514169c
            v2.i r3 = r9.f514168b
            v2.f r4 = r9.f514169c
            if (r4 != r2) goto L37
            if (r2 != r14) goto L7c
            int r14 = r3.Q
            if (r14 <= 0) goto L28
            r14 = r0
            goto L29
        L28:
            r14 = r1
        L29:
            if (r14 == 0) goto L7e
            v2.i r14 = r8.f514168b
            int r14 = r14.Q
            if (r14 <= 0) goto L33
            r14 = r0
            goto L34
        L33:
            r14 = r1
        L34:
            if (r14 != 0) goto L7c
            goto L7e
        L37:
            int r5 = r2.ordinal()
            v2.f r6 = v2.f.CENTER_Y
            v2.f r7 = v2.f.CENTER_X
            switch(r5) {
                case 0: goto L7e;
                case 1: goto L68;
                case 2: goto L53;
                case 3: goto L68;
                case 4: goto L53;
                case 5: goto L7e;
                case 6: goto L4c;
                case 7: goto L7e;
                case 8: goto L7e;
                default: goto L42;
            }
        L42:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            java.lang.String r10 = r2.name()
            r9.<init>(r10)
            throw r9
        L4c:
            if (r4 == r14) goto L7e
            if (r4 == r7) goto L7e
            if (r4 == r6) goto L7e
            goto L7c
        L53:
            v2.f r14 = v2.f.TOP
            if (r4 == r14) goto L5e
            v2.f r14 = v2.f.BOTTOM
            if (r4 != r14) goto L5c
            goto L5e
        L5c:
            r14 = r1
            goto L5f
        L5e:
            r14 = r0
        L5f:
            boolean r2 = r3 instanceof v2.l
            if (r2 == 0) goto L7f
            if (r14 != 0) goto L7c
            if (r4 != r6) goto L7e
            goto L7c
        L68:
            v2.f r14 = v2.f.LEFT
            if (r4 == r14) goto L73
            v2.f r14 = v2.f.RIGHT
            if (r4 != r14) goto L71
            goto L73
        L71:
            r14 = r1
            goto L74
        L73:
            r14 = r0
        L74:
            boolean r2 = r3 instanceof v2.l
            if (r2 == 0) goto L7f
            if (r14 != 0) goto L7c
            if (r4 != r7) goto L7e
        L7c:
            r14 = r0
            goto L7f
        L7e:
            r14 = r1
        L7f:
            if (r14 != 0) goto L82
            return r1
        L82:
            r8.f514170d = r9
            if (r10 <= 0) goto L89
            r8.f514171e = r10
            goto L8b
        L89:
            r8.f514171e = r1
        L8b:
            r8.f514172f = r11
            r8.f514173g = r12
            r8.f514174h = r13
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v2.g.a(v2.g, int, int, v2.e, int, boolean):boolean");
    }

    public int b() {
        v2.g gVar;
        if (this.f514168b.Y == 8) {
            return 0;
        }
        int i17 = this.f514172f;
        return (i17 <= -1 || (gVar = this.f514170d) == null || gVar.f514168b.Y != 8) ? this.f514171e : i17;
    }

    public boolean c() {
        return this.f514170d != null;
    }

    public void d() {
        this.f514170d = null;
        this.f514171e = 0;
        this.f514172f = -1;
        this.f514173g = v2.e.STRONG;
        this.f514174h = 0;
        this.f514167a.j();
    }

    public void e(u2.c cVar) {
        u2.j jVar = this.f514175i;
        if (jVar == null) {
            this.f514175i = new u2.j(u2.i.UNRESTRICTED, null);
        } else {
            jVar.c();
        }
    }

    /* renamed from: toString */
    public java.lang.String m170987x9616526c() {
        return this.f514168b.Z + ":" + this.f514169c.toString();
    }
}
