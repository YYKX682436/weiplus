package xk2;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final kk4.c f536551a;

    public c() {
        df0.q qVar = (df0.q) i95.n0.c(df0.q.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        this.f536551a = ((cf0.q) qVar).wi(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r8, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof xk2.a
            if (r0 == 0) goto L13
            r0 = r9
            xk2.a r0 = (xk2.a) r0
            int r1 = r0.f536546i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f536546i = r1
            goto L18
        L13:
            xk2.a r0 = new xk2.a
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f536544g
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f536546i
            java.lang.String r3 = ", "
            java.lang.String r4 = "Finder.FinderLiveBgmPlayer"
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 != r5) goto L39
            java.lang.Object r8 = r0.f536543f
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r1 = r0.f536542e
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f536541d
            xk2.c r0 = (xk2.c) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            r9 = r8
            r8 = r1
            goto L99
        L39:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L41:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            r9 = 0
            java.lang.String r9 = com.p314xaae8f345.mm.vfs.w6.i(r8, r9)
            kk4.c r2 = r7.f536551a
            r6 = r2
            kk4.f0 r6 = (kk4.f0) r6
            r6.mo100945x683d6267(r9)
            r0.f536541d = r7
            r0.f536542e = r8
            r0.f536543f = r9
            r0.f536546i = r5
            kotlinx.coroutines.r r6 = new kotlinx.coroutines.r
            kotlin.coroutines.Continuation r0 = pz5.f.b(r0)
            r6.<init>(r0, r5)
            r6.k()
            v65.n r0 = new v65.n
            r0.<init>(r6)
            xk2.b r5 = new xk2.b
            r5.<init>(r7, r8, r9, r0)
            r0 = r2
            kk4.f0 r0 = (kk4.f0) r0
            r0.mo100957x5dd7c812(r5)
            kk4.f0 r2 = (kk4.f0) r2
            r2.mo100932x857611b5()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "prepareAsync "
            r0.<init>(r2)
            r0.append(r8)
            r0.append(r3)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r0)
            java.lang.Object r0 = r6.j()
            if (r0 != r1) goto L98
            return r1
        L98:
            r0 = r7
        L99:
            r0.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "prepare "
            r0.<init>(r1)
            r0.append(r8)
            r0.append(r3)
            r0.append(r9)
            java.lang.String r8 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r8)
            jz5.f0 r8 = jz5.f0.f384359a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: xk2.c.a(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveBgmPlayer", "release");
        ((kk4.f0) this.f536551a).mo100933x41012807();
    }

    public final void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveBgmPlayer", "stop");
        ((kk4.f0) this.f536551a).mo100976x360802();
    }
}
