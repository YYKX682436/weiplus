package pe3;

/* loaded from: classes7.dex */
public final class f extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public hq0.e0 f435185d;

    /* renamed from: e, reason: collision with root package name */
    public final se3.e f435186e;

    /* renamed from: f, reason: collision with root package name */
    public final oe3.c f435187f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.FrameLayout f435188g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p012xc85e97e9.p093xedfae76a.c1 a17 = p012xc85e97e9.p093xedfae76a.k1.a(activity, null).a(se3.e.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        se3.e eVar = (se3.e) a17;
        this.f435186e = eVar;
        oe3.c cVar = new oe3.c();
        cVar.f426329z = eVar;
        cVar.A = new java.lang.ref.WeakReference(activity);
        this.f435187f = cVar;
        this.f435188g = new android.widget.FrameLayout(activity);
    }

    public final void O6(n0.o oVar, int i17) {
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(838515586);
        java.lang.Object obj = n0.e1.f415025a;
        pe3.a aVar = new pe3.a(this);
        int i18 = z0.t.f550455q1;
        r2.f0.a(aVar, d0.a3.e(z0.p.f550454d, 0.0f, 1, null), null, y0Var, 48, 4);
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f415141d = new pe3.b(this, i17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P6(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof pe3.c
            if (r0 == 0) goto L13
            r0 = r8
            pe3.c r0 = (pe3.c) r0
            int r1 = r0.f435174f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f435174f = r1
            goto L18
        L13:
            pe3.c r0 = new pe3.c
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f435172d
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f435174f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L2b:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L79
        L2f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            android.widget.FrameLayout r8 = r7.f435188g
            oe3.c r2 = r7.f435187f
            r2.getClass()
            java.lang.String r4 = "container"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r4)
            java.lang.Class<com.tencent.mm.plugin.magicbrush.d4> r4 = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.d4.class
            i95.m r4 = i95.n0.c(r4)
            com.tencent.mm.plugin.magicbrush.d4 r4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.d4) r4
            android.content.Context r5 = r8.getContext()
            java.lang.String r6 = "getContext(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r5, r6)
            com.tencent.mm.plugin.magicbrush.m5 r4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.m5) r4
            bf3.p r4 = r4.Di(r5)
            r4.a(r8)
            r2.f426327x = r4
            r2.f426328y = r8
            r2.X0()
            r2.mo123044x68ac462()
            se3.e r8 = r7.f435186e
            kotlinx.coroutines.flow.i2 r8 = r8.f488447d
            pe3.d r2 = new pe3.d
            r2.<init>(r7)
            r0.f435174f = r3
            kotlinx.coroutines.flow.q2 r8 = (p3325xe03a0797.p3326xc267989b.p3328x30012e.q2) r8
            r8.getClass()
            java.lang.Object r8 = p3325xe03a0797.p3326xc267989b.p3328x30012e.q2.l(r8, r2, r0)
            if (r8 != r1) goto L79
            return r1
        L79:
            jz5.d r8 = new jz5.d
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: pe3.f.P6(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new pe3.e(this, null), 3, null);
    }
}
