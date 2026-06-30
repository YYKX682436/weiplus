package p12;

/* loaded from: classes10.dex */
public class w extends p12.h {

    /* renamed from: g, reason: collision with root package name */
    public rm5.k f432587g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.C13261x57992c3a f432588h;

    /* renamed from: i, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f432589i;

    /* renamed from: j, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18690x34c5bc78 f432590j;

    /* renamed from: k, reason: collision with root package name */
    public android.util.Range f432591k;

    /* renamed from: l, reason: collision with root package name */
    public final p12.v f432592l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(android.app.Activity activity, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.C13258x5720669f previewLayout) {
        super(activity, previewLayout);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(previewLayout, "previewLayout");
        this.f432589i = p3325xe03a0797.p3326xc267989b.z0.b();
        this.f432590j = new com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18690x34c5bc78(activity);
        this.f432591k = new android.util.Range(0, 0);
        this.f432592l = new p12.v(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x027b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object g(p12.w r20, java.lang.String r21, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r22) {
        /*
            Method dump skipped, instructions count: 636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p12.w.g(p12.w, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // p12.h
    public android.view.View a() {
        return this.f432590j;
    }

    @Override // p12.h
    public void b() {
        rm5.k kVar = this.f432587g;
        if (kVar != null) {
            kVar.mo122875x5cd39ffa();
        }
        this.f432587g = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18690x34c5bc78 c18690x34c5bc78 = this.f432590j;
        kk4.b player = c18690x34c5bc78.getPlayer();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(player);
        kk4.b.e(player, null, 1, null);
        kk4.v vVar = (kk4.v) player;
        vVar.R();
        vVar.P();
        player.mo143590x408b7293();
        c18690x34c5bc78.g();
        p3325xe03a0797.p3326xc267989b.z0.e(this.f432589i, null, 1, null);
    }

    @Override // p12.h
    public java.lang.Object c(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return g(this, null, interfaceC29045xdcb5ca57);
    }

    public l12.a d() {
        if (this.f432557c > 5000) {
            android.util.Range range = new android.util.Range(0, 5000);
            this.f432559e = range;
            this.f432591k = range;
            f(true);
            return l12.a.f396513e;
        }
        android.util.Range range2 = new android.util.Range(0, java.lang.Integer.valueOf(this.f432557c));
        this.f432559e = range2;
        this.f432591k = range2;
        f(false);
        return l12.a.f396514f;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r5, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof p12.i
            if (r0 == 0) goto L13
            r0 = r6
            p12.i r0 = (p12.i) r0
            int r1 = r0.f432565h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f432565h = r1
            goto L18
        L13:
            p12.i r0 = new p12.i
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f432563f
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f432565h
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.f432562e
            n12.n r5 = (n12.n) r5
            java.lang.Object r0 = r0.f432561d
            p12.w r0 = (p12.w) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L56
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            java.io.File r6 = new java.io.File
            r6.<init>(r5)
            r4.f432560f = r6
            n12.n r6 = new n12.n
            r2 = 0
            r6.<init>(r5, r2)
            r0.f432561d = r4
            r0.f432562e = r6
            r0.f432565h = r3
            java.lang.Object r5 = r6.b(r0)
            if (r5 != r1) goto L54
            return r1
        L54:
            r0 = r4
            r5 = r6
        L56:
            kotlinx.coroutines.flow.j2 r6 = r0.f432558d
            kotlinx.coroutines.flow.j2 r1 = r5.f415637d
            kotlinx.coroutines.flow.h3 r1 = (p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) r1
            java.lang.Object r1 = r1.mo144003x754a37bb()
            kotlinx.coroutines.flow.h3 r6 = (p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) r6
            r6.k(r1)
            int r5 = r5.f415636c
            r0.f432557c = r5
            jz5.f0 r5 = jz5.f0.f384359a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p12.w.e(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void f(boolean z17) {
        dk4.a aVar = new dk4.a();
        java.io.File file = this.f432560f;
        aVar.f316015s = file != null ? file.getAbsolutePath() : null;
        aVar.f316001e = true;
        java.io.File file2 = this.f432560f;
        aVar.f316016t = file2 != null ? file2.getAbsolutePath() : null;
        kk4.b player = this.f432590j.getPlayer();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(player);
        kk4.v vVar = (kk4.v) player;
        vVar.B(aVar);
        vVar.f390118j = true;
        vVar.A(true);
        vVar.C(true);
        vVar.G(p12.m.f432571d);
        vVar.D(p12.n.f432572d);
        vVar.f390128t = p12.o.f432573d;
        vVar.f390126r = new p12.p(this);
        if (z17) {
            vVar.H(0L, 5000L);
            vVar.I(new p12.r(this), 16L);
        }
        vVar.O();
    }
}
