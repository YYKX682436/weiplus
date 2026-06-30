package kw1;

/* loaded from: classes14.dex */
public final class k implements hw1.c {

    /* renamed from: a, reason: collision with root package name */
    public final oz5.l f394384a;

    /* renamed from: b, reason: collision with root package name */
    public final mw1.e f394385b;

    /* renamed from: c, reason: collision with root package name */
    public final qw1.j f394386c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f394387d;

    /* renamed from: e, reason: collision with root package name */
    public final rw1.a f394388e;

    /* renamed from: f, reason: collision with root package name */
    public final pw1.d f394389f;

    /* renamed from: g, reason: collision with root package name */
    public final nw1.d f394390g;

    public k(oz5.l glCoroutineContext, mw1.e renderTargetHolder, qw1.j textureManager) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(glCoroutineContext, "glCoroutineContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderTargetHolder, "renderTargetHolder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textureManager, "textureManager");
        this.f394384a = glCoroutineContext;
        this.f394385b = renderTargetHolder;
        this.f394386c = textureManager;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f394387d = arrayList;
        rw1.a aVar = new rw1.a();
        arrayList.add(aVar);
        this.f394388e = aVar;
        pw1.d dVar = new pw1.d();
        arrayList.add(dVar);
        this.f394389f = dVar;
        nw1.d dVar2 = new nw1.d();
        arrayList.add(dVar2);
        this.f394390g = dVar2;
        arrayList.add(new ow1.a());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // hw1.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof kw1.h
            if (r0 == 0) goto L13
            r0 = r7
            kw1.h r0 = (kw1.h) r0
            int r1 = r0.f394376g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f394376g = r1
            goto L18
        L13:
            kw1.h r0 = new kw1.h
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f394374e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f394376g
            jz5.f0 r3 = jz5.f0.f384359a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L40
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r2 = r0.f394373d
            java.util.Iterator r2 = (java.util.Iterator) r2
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L59
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L38:
            java.lang.Object r2 = r0.f394373d
            kw1.k r2 = (kw1.k) r2
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L52
        L40:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            java.lang.String r7 = "MicroMsg.MTR.GLDispatchMTRTask"
            java.lang.String r2 = "init: "
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r7, r2)
            r0.f394373d = r6
            r0.f394376g = r5
            if (r3 != r1) goto L51
            return r1
        L51:
            r2 = r6
        L52:
            java.util.List r7 = r2.f394387d
            java.util.Iterator r7 = r7.iterator()
            r2 = r7
        L59:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L70
            java.lang.Object r7 = r2.next()
            hw1.c r7 = (hw1.c) r7
            r0.f394373d = r2
            r0.f394376g = r4
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L59
            return r1
        L70:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kw1.k.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // hw1.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof kw1.i
            if (r0 == 0) goto L13
            r0 = r7
            kw1.i r0 = (kw1.i) r0
            int r1 = r0.f394380g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f394380g = r1
            goto L18
        L13:
            kw1.i r0 = new kw1.i
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f394378e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f394380g
            jz5.f0 r3 = jz5.f0.f384359a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L40
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r2 = r0.f394377d
            java.util.Iterator r2 = (java.util.Iterator) r2
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L5a
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L38:
            java.lang.Object r2 = r0.f394377d
            kw1.k r2 = (kw1.k) r2
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L53
        L40:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            java.lang.String r7 = "MicroMsg.MTR.GLDispatchMTRTask"
            java.lang.String r2 = "release: "
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r7, r2)
            r0.f394377d = r6
            r0.f394380g = r5
            if (r3 != r1) goto L52
            return r1
        L52:
            r2 = r6
        L53:
            java.util.List r7 = r2.f394387d
            java.util.Iterator r7 = r7.iterator()
            r2 = r7
        L5a:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L71
            java.lang.Object r7 = r2.next()
            hw1.c r7 = (hw1.c) r7
            r0.f394377d = r2
            r0.f394380g = r4
            java.lang.Object r7 = r7.b(r0)
            if (r7 != r1) goto L5a
            return r1
        L71:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kw1.k.b(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0024. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // hw1.c
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(kw1.o r9, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r10) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kw1.k.c(kw1.o, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.lang.Object e(java.lang.String str, yz5.p pVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        mw1.b a17 = this.f394385b.a(str);
        if (a17 == null) {
            return null;
        }
        lw1.l lVar = lw1.m.f403093e;
        return p3325xe03a0797.p3326xc267989b.l.g(this.f394384a.mo7096x348d9a(new lw1.m(new lw1.i(a17))), new kw1.j(pVar, a17, null), interfaceC29045xdcb5ca57);
    }
}
