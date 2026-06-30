package gx0;

/* loaded from: classes5.dex */
public final class ca extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.ac f357822d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f357823e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca(gx0.ac acVar, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f357822d = acVar;
        this.f357823e = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gx0.ca(this.f357822d, this.f357823e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.ca) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        ex0.q g17;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        gx0.ac acVar = this.f357822d;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = acVar.f304178q;
        java.lang.String str = this.f357823e;
        java.util.concurrent.CountDownLatch countDownLatch = (java.util.concurrent.CountDownLatch) concurrentHashMap.get(str);
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (countDownLatch == null) {
            return f0Var;
        }
        countDownLatch.await();
        ex0.a0 e86 = acVar.e8();
        if (e86 != null && (g17 = ex0.i0.g(e86, str)) != null) {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4179xedb0cdf9 c4179xedb0cdf9 : g17.I()) {
                java.lang.String m34366xfb85ada3 = c4179xedb0cdf9.m34366xfb85ada3();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m34366xfb85ada3, "getText(...)");
                linkedHashMap.put(m34366xfb85ada3, java.lang.Double.valueOf(c4179xedb0cdf9.m34367xdd1fba().m34005x51e8b0a().m33988x124aa384()));
            }
            acVar.f304184w.put(g17.f338701b, linkedHashMap);
            yy0.m0 m0Var = (yy0.m0) ((pp0.h0) i95.n0.c(pp0.h0.class));
            m0Var.getClass();
            boolean z17 = false;
            if (pp0.h0.Q2(m0Var, false, 1, null)) {
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2545xe20e94ff.p2546x5be56f80.C20389x968eb5f1()) == 1) {
                    z17 = true;
                }
            }
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713 = g17.f338700a;
            if (z17) {
                acVar.t7().getClass();
                if (!uu0.c.e().f512740b && !acVar.B) {
                    acVar.B = true;
                    com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951 c4189xeb0c3951 = c4190xd8dd3713 instanceof com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951 ? (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951) c4190xd8dd3713 : null;
                    if (c4189xeb0c3951 != null) {
                        pf5.e.m158344xbe96bc24(acVar, null, null, new cw0.a0(acVar, c4189xeb0c3951, null), 3, null);
                    }
                }
            }
            java.lang.String a17 = dw0.f.a(acVar.f304180s);
            java.lang.String str2 = acVar.f304180s.f129759d;
            if (((gx0.w) ((jz5.n) acVar.f304177p).mo141623x754a37bb()).g7(fv0.d.f348498q, a17)) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c4190xd8dd3713, "null cannot be cast to non-null type com.tencent.maas.moviecomposing.segments.NarrationSegment");
                com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951 c4189xeb0c39512 = (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951) c4190xd8dd3713;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
                com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = c4189xeb0c39512.D();
                if (D != null) {
                    com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951.A1(c4189xeb0c39512, a17, str2, D);
                }
                acVar.h8(c4189xeb0c39512, a17, str2);
                java.lang.String string = acVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574040hj);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                acVar.U7(string);
            }
        }
        return f0Var;
    }
}
