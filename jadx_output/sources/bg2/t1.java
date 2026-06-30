package bg2;

/* loaded from: classes2.dex */
public final class t1 extends tc2.c implements tc2.h, uc2.e {

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewGroup f20510e;

    /* renamed from: f, reason: collision with root package name */
    public kotlinx.coroutines.r2 f20511f;

    /* renamed from: g, reason: collision with root package name */
    public int f20512g;

    /* renamed from: h, reason: collision with root package name */
    public volatile gg2.b f20513h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f20514i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f20515m;

    /* renamed from: n, reason: collision with root package name */
    public int f20516n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f20517o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f20518p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(tc2.g store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f20512g = -1;
        this.f20516n = 1;
        this.f20517o = new java.util.ArrayList();
        this.f20518p = "";
    }

    public static final gg2.b Y6(bg2.t1 t1Var, int i17) {
        gg2.b mVar;
        tc2.g gVar = t1Var.f417141d;
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
    public static final java.lang.Object Z6(bg2.t1 r11, android.view.View r12, android.view.View r13, android.view.ViewGroup r14, kotlin.coroutines.Continuation r15) {
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
        kotlinx.coroutines.r2 r2Var = this.f20511f;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        android.view.ViewGroup viewGroup = this.f20510e;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        this.f20510e = null;
        this.f20514i = false;
        this.f20515m = false;
        this.f20516n = 1;
        this.f20517o.clear();
        this.f20512g = -1;
        this.f20513h = null;
    }

    public final bg2.m1 a7() {
        bg2.m1 m1Var;
        r45.t12 t12Var;
        synchronized (this.f20517o) {
            java.util.ArrayList arrayList = this.f20517o;
            if (arrayList.size() > 1) {
                kz5.g0.t(arrayList, new bg2.n1());
            }
            m1Var = this.f20515m ? (bg2.m1) kz5.h0.E(this.f20517o) : (bg2.m1) kz5.n0.k0(this.f20517o);
            java.lang.String string = (m1Var == null || (t12Var = m1Var.f20296a) == null) ? null : t12Var.getString(2);
            if (string == null) {
                string = "";
            }
            this.f20518p = string;
        }
        return m1Var;
    }

    public final void b7() {
        kotlinx.coroutines.r2 r2Var = this.f20511f;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        kotlinx.coroutines.y0 y0Var = this.f417141d.f417147g;
        this.f20511f = y0Var != null ? kotlinx.coroutines.l.d(y0Var, null, null, new bg2.s1(this, null), 3, null) : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095  */
    @Override // tc2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLiveMsg(r45.r71 r15) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bg2.t1.onLiveMsg(r45.r71):void");
    }
}
