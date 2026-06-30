package ir2;

/* loaded from: classes2.dex */
public final class a1 extends pf5.e implements ir2.y {

    /* renamed from: r, reason: collision with root package name */
    public static final ir2.g0 f375622r = new ir2.g0(null);

    /* renamed from: s, reason: collision with root package name */
    public static final jz5.g f375623s = jz5.h.b(ir2.f0.f375670d);

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f375624d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final u26.w f375625e;

    /* renamed from: f, reason: collision with root package name */
    public ir2.a0 f375626f;

    /* renamed from: g, reason: collision with root package name */
    public ir2.a0 f375627g;

    /* renamed from: h, reason: collision with root package name */
    public ir2.a0 f375628h;

    /* renamed from: i, reason: collision with root package name */
    public ir2.a0 f375629i;

    /* renamed from: m, reason: collision with root package name */
    public ir2.a0 f375630m;

    /* renamed from: n, reason: collision with root package name */
    public ym5.m1 f375631n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f375632o;

    /* renamed from: p, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j f375633p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f375634q;

    public a1() {
        u26.w a17 = u26.z.a(Integer.MAX_VALUE, null, null, 6, null);
        this.f375625e = a17;
        this.f375632o = jz5.h.b(new ir2.q0(this));
        this.f375633p = new p3325xe03a0797.p3326xc267989b.p3328x30012e.e(a17, false, null, 0, null, 28, null);
        this.f375634q = jz5.h.b(new ir2.k0(this));
        p3325xe03a0797.p3326xc267989b.l.d(mo144225x95f74600(), null, null, new ir2.e0(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object N6(ir2.a1 r5, yz5.l r6, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r7) {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof ir2.h0
            if (r0 == 0) goto L16
            r0 = r7
            ir2.h0 r0 = (ir2.h0) r0
            int r1 = r0.f375680g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f375680g = r1
            goto L1b
        L16:
            ir2.h0 r0 = new ir2.h0
            r0.<init>(r5, r7)
        L1b:
            java.lang.Object r5 = r0.f375678e
            pz5.a r7 = pz5.a.f440719d
            int r1 = r0.f375680g
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            long r6 = r0.f375677d
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r5)
            goto L47
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r5)
            long r3 = c01.id.c()
            r0.f375677d = r3
            r0.f375680g = r2
            java.lang.Object r5 = r6.mo146xb9724478(r0)
            if (r5 != r7) goto L46
            goto L51
        L46:
            r6 = r3
        L47:
            long r0 = c01.id.c()
            long r0 = r0 - r6
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r0)
        L51:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ir2.a1.N6(ir2.a1, yz5.l, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.util.List O6() {
        return this.f375624d;
    }

    public final java.util.List P6(java.lang.Class clazz) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clazz, "clazz");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (so2.j5 j5Var : this.f375624d) {
            if (clazz.isInstance(j5Var)) {
                arrayList.add(j5Var);
            }
        }
        return arrayList;
    }

    public void Q6(so2.j5 data, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(data);
        pf5.e.m158343xd39de650(this, null, null, new ir2.l0(this, new ir2.b0(arrayList, i17, 0L, z17, 4, null), null), 3, null);
    }

    public final void R6(yz5.l observer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        pf5.e.m158343xd39de650(this, null, null, new ir2.t0(this, observer, null), 3, null);
    }

    public void S6(ir2.u event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        pf5.e.m158343xd39de650(this, null, null, new ir2.u0(this, event, null), 3, null);
    }

    public final java.lang.Object T6(ir2.x xVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.Object obj = this.f375625e;
        boolean j17 = ((u26.o) obj).j();
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (j17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NewLoader", "send is closed");
            return f0Var;
        }
        java.lang.Object t17 = ((u26.o) obj).t(xVar, interfaceC29045xdcb5ca57);
        return t17 == pz5.a.f440719d ? t17 : f0Var;
    }

    @Override // pf5.e, p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        by1.d a17;
        super.mo528x82b764cd();
        ir2.z[] zVarArr = new ir2.z[4];
        ir2.a0 a0Var = this.f375627g;
        zVarArr[0] = a0Var != null ? a0Var.mo8871xb5884f29() : null;
        ir2.a0 a0Var2 = this.f375628h;
        zVarArr[1] = a0Var2 != null ? a0Var2.mo8871xb5884f29() : null;
        ir2.a0 a0Var3 = this.f375630m;
        zVarArr[2] = a0Var3 != null ? a0Var3.mo8871xb5884f29() : null;
        ir2.a0 a0Var4 = this.f375629i;
        zVarArr[3] = a0Var4 != null ? a0Var4.mo8871xb5884f29() : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NewLoader", "clearFutureCache:4");
        for (int i17 = 0; i17 < 4; i17++) {
            ir2.z zVar = zVarArr[i17];
            if (zVar != null && (a17 = by1.c.f117886b.a().a(zVar)) != null) {
            }
        }
    }
}
