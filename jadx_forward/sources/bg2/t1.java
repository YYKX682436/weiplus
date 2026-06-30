package bg2;

/* loaded from: classes2.dex */
public final class t1 extends tc2.c implements tc2.h, uc2.e {

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewGroup f102043e;

    /* renamed from: f, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f102044f;

    /* renamed from: g, reason: collision with root package name */
    public int f102045g;

    /* renamed from: h, reason: collision with root package name */
    public volatile gg2.b f102046h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f102047i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f102048m;

    /* renamed from: n, reason: collision with root package name */
    public int f102049n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f102050o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f102051p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(tc2.g store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f102045g = -1;
        this.f102049n = 1;
        this.f102050o = new java.util.ArrayList();
        this.f102051p = "";
    }

    public static final gg2.b Y6(bg2.t1 t1Var, int i17) {
        gg2.b mVar;
        tc2.g gVar = t1Var.f498674d;
        if (i17 == 1) {
            mVar = new gg2.m(gVar);
        } else if (i17 == 12) {
            mVar = new gg2.q(gVar);
        } else if (i17 == 25) {
            mVar = new gg2.t(gVar);
        } else if (i17 == 27) {
            mVar = new gg2.y(gVar);
        } else if (i17 == 19) {
            mVar = new gg2.d(gVar);
        } else {
            if (i17 != 20) {
                return null;
            }
            mVar = new gg2.w(gVar);
        }
        return mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z6(bg2.t1 r11, android.view.View r12, android.view.View r13, android.view.ViewGroup r14, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r15) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bg2.t1.Z6(bg2.t1, android.view.View, android.view.View, android.view.ViewGroup, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d9  */
    @Override // tc2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Q6() {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bg2.t1.Q6():void");
    }

    @Override // tc2.c
    public void U6() {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f102044f;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        android.view.ViewGroup viewGroup = this.f102043e;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        this.f102043e = null;
        this.f102047i = false;
        this.f102048m = false;
        this.f102049n = 1;
        this.f102050o.clear();
        this.f102045g = -1;
        this.f102046h = null;
    }

    public final bg2.m1 a7() {
        bg2.m1 m1Var;
        r45.t12 t12Var;
        synchronized (this.f102050o) {
            java.util.ArrayList arrayList = this.f102050o;
            if (arrayList.size() > 1) {
                kz5.g0.t(arrayList, new bg2.n1());
            }
            m1Var = this.f102048m ? (bg2.m1) kz5.h0.E(this.f102050o) : (bg2.m1) kz5.n0.k0(this.f102050o);
            java.lang.String m75945x2fec8307 = (m1Var == null || (t12Var = m1Var.f101829a) == null) ? null : t12Var.m75945x2fec8307(2);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            this.f102051p = m75945x2fec8307;
        }
        return m1Var;
    }

    public final void b7() {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f102044f;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f498674d.f498680g;
        this.f102044f = y0Var != null ? p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new bg2.s1(this, null), 3, null) : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095  */
    @Override // tc2.h
    /* renamed from: onLiveMsg */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo10406x5aa1c816(r45.r71 r15) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bg2.t1.mo10406x5aa1c816(r45.r71):void");
    }
}
