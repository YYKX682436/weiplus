package z;

/* loaded from: classes14.dex */
public abstract class z1 {
    /* JADX WARN: Removed duplicated region for block: B:20:0x00fa A[Catch: CancellationException -> 0x004f, TryCatch #0 {CancellationException -> 0x004f, blocks: (B:15:0x0049, B:18:0x00ed, B:20:0x00fa, B:22:0x0122, B:28:0x0132), top: B:14:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x013e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(z.r r26, z.l r27, long r28, yz5.l r30, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r31) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z.z1.a(z.r, z.l, long, yz5.l, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static java.lang.Object b(z.r rVar, z.d0 d0Var, boolean z17, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        if ((i17 & 4) != 0) {
            lVar = z.w1.f550400d;
        }
        java.lang.Object a17 = a(rVar, new z.c0(d0Var, rVar.f550343d, rVar.mo128745x754a37bb(), rVar.f550345f), z17 ? rVar.f550346g : Long.MIN_VALUE, lVar, interfaceC29045xdcb5ca57);
        return a17 == pz5.a.f440719d ? a17 : jz5.f0.f384359a;
    }

    public static java.lang.Object c(z.r rVar, java.lang.Object obj, z.p pVar, boolean z17, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, int i17, java.lang.Object obj2) {
        if ((i17 & 2) != 0) {
            pVar = z.q.c(0.0f, 0.0f, null, 7, null);
        }
        z.p pVar2 = pVar;
        if ((i17 & 4) != 0) {
            z17 = false;
        }
        if ((i17 & 8) != 0) {
            lVar = z.x1.f550405d;
        }
        java.lang.Object a17 = a(rVar, new z.a2(pVar2, rVar.f550343d, rVar.mo128745x754a37bb(), obj, rVar.f550345f), z17 ? rVar.f550346g : Long.MIN_VALUE, lVar, interfaceC29045xdcb5ca57);
        return a17 == pz5.a.f440719d ? a17 : jz5.f0.f384359a;
    }

    public static final void d(z.o oVar, long j17, float f17, z.l lVar, z.r rVar, yz5.l lVar2) {
        long c17 = (f17 > 0.0f ? 1 : (f17 == 0.0f ? 0 : -1)) == 0 ? lVar.c() : ((float) (j17 - oVar.f550291c)) / f17;
        oVar.f550295g = j17;
        ((n0.q4) oVar.f550293e).mo148714x53d8522f(lVar.e(c17));
        z.w g17 = lVar.g(c17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(g17, "<set-?>");
        oVar.f550294f = g17;
        if (lVar.b(c17)) {
            oVar.f550296h = oVar.f550295g;
            ((n0.q4) oVar.f550297i).mo148714x53d8522f(java.lang.Boolean.FALSE);
        }
        f(oVar, rVar);
        lVar2.mo146xb9724478(oVar);
    }

    public static final float e(oz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lVar, "<this>");
        int i17 = z0.v.f550457r1;
        z0.v vVar = (z0.v) lVar.get(z0.u.f550456d);
        float floatValue = vVar != null ? ((java.lang.Number) ((n0.q4) ((p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.o3) vVar).f92209d).mo128745x754a37bb()).floatValue() : 1.0f;
        if (floatValue >= 0.0f) {
            return floatValue;
        }
        throw new java.lang.IllegalStateException("Check failed.".toString());
    }

    public static final void f(z.o oVar, z.r state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        ((n0.q4) state.f550344e).mo148714x53d8522f(oVar.b());
        z.w wVar = state.f550345f;
        z.w source = oVar.f550294f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        int b17 = wVar.b();
        for (int i17 = 0; i17 < b17; i17++) {
            wVar.e(i17, source.a(i17));
        }
        state.f550347h = oVar.f550296h;
        state.f550346g = oVar.f550295g;
        state.f550348i = oVar.d();
    }
}
