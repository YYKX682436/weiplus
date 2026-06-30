package kj3;

/* loaded from: classes14.dex */
public final class d implements ej3.c {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f389978a = jz5.h.b(kj3.a.f389972d);

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f389979b = jz5.h.b(kj3.b.f389973d);

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // ej3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof kj3.c
            if (r0 == 0) goto L13
            r0 = r6
            kj3.c r0 = (kj3.c) r0
            int r1 = r0.f389977g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f389977g = r1
            goto L18
        L13:
            kj3.c r0 = new kj3.c
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f389975e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f389977g
            jz5.f0 r3 = jz5.f0.f384359a
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            java.lang.Object r0 = r0.f389974d
            kj3.d r0 = (kj3.d) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L40
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L35:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            r0.f389974d = r5
            r0.f389977g = r4
            if (r3 != r1) goto L3f
            return r1
        L3f:
            r0 = r5
        L40:
            jz5.g r6 = r0.f389978a
            jz5.n r6 = (jz5.n) r6
            java.lang.Object r6 = r6.mo141623x754a37bb()
            os0.c r6 = (os0.c) r6
            r6.n()
            jz5.g r6 = r0.f389979b
            jz5.n r6 = (jz5.n) r6
            java.lang.Object r6 = r6.mo141623x754a37bb()
            os0.e r6 = (os0.e) r6
            r6.n()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kj3.d.b(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // ej3.c
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public java.lang.Object c(kj3.e eVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        boolean z17 = eVar.f389983d;
        android.util.Size size = eVar.f389981b;
        mj3.g gVar = eVar.f389980a;
        int i17 = eVar.f389982c;
        if (z17) {
            os0.c cVar = (os0.c) ((jz5.n) this.f389978a).mo141623x754a37bb();
            cVar.H = i17;
            cVar.w(gVar.f408583a, gVar.f408584b);
            cVar.f429540p = gVar.f408586d;
            cVar.u(size.getWidth(), size.getHeight());
            cVar.s(gVar.f408585c);
            cVar.o();
        } else {
            os0.e eVar2 = (os0.e) ((jz5.n) this.f389979b).mo141623x754a37bb();
            eVar2.H = i17;
            eVar2.w(gVar.f408583a, gVar.f408584b);
            eVar2.f429540p = gVar.f408586d;
            eVar2.u(size.getWidth(), size.getHeight());
            eVar2.s(gVar.f408585c);
            eVar2.o();
        }
        return new kj3.f();
    }
}
