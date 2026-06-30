package wv1;

/* loaded from: classes12.dex */
public class f extends wv1.e {

    /* renamed from: f, reason: collision with root package name */
    public ot0.q f531472f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f531473g;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.w wVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str) {
        super(wVar, f9Var);
    }

    @Override // wv1.a
    public java.lang.String c() {
        return p() != null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.u1(p().f430223o, "") : "";
    }

    @Override // wv1.a
    public java.lang.String d() {
        return p() != null ? p().n() : "";
    }

    @Override // wv1.a
    public long e() {
        if (p() != null) {
            return p().f430215m;
        }
        return 0L;
    }

    @Override // wv1.a
    public int h() {
        return 1;
    }

    @Override // wv1.a
    public void k(android.view.View view, wv1.a aVar) {
        boolean z17;
        boolean z18;
        xv1.b a17 = a();
        long f17 = f();
        synchronized (a17) {
            java.util.Set set = a17.f538923d;
            z17 = true;
            if (set != null) {
                if (((java.util.HashSet) set).contains(java.lang.Long.valueOf(f17))) {
                    z18 = true;
                }
            }
            z18 = false;
        }
        if (z18) {
            return;
        }
        int i17 = this.f531466e;
        if (i17 != 4 && i17 != 5) {
            z17 = false;
        }
        if (z17) {
            return;
        }
        if (i()) {
            xv1.d.c(b(), f(), this.f531463b.Q0());
        } else {
            xv1.d.h(b(), a().f538920a);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x011b, code lost:
    
        if (r4.equals("txt") != false) goto L194;
     */
    @Override // wv1.e, wv1.a
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(wv1.o r3, int r4, wv1.a r5) {
        /*
            Method dump skipped, instructions count: 1200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wv1.f.j(wv1.o, int, wv1.a):void");
    }

    public final ot0.q p() {
        if (this.f531472f == null) {
            this.f531472f = ot0.q.v(this.f531463b.j());
        }
        return this.f531472f;
    }
}
