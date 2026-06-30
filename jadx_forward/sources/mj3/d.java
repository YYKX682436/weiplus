package mj3;

/* loaded from: classes14.dex */
public final class d implements ej3.c {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f408579a = jz5.h.b(mj3.b.f408574d);

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
            boolean r0 = r6 instanceof mj3.c
            if (r0 == 0) goto L13
            r0 = r6
            mj3.c r0 = (mj3.c) r0
            int r1 = r0.f408578g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f408578g = r1
            goto L18
        L13:
            mj3.c r0 = new mj3.c
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f408576e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f408578g
            jz5.f0 r3 = jz5.f0.f384359a
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            java.lang.Object r0 = r0.f408575d
            mj3.d r0 = (mj3.d) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L40
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L35:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            r0.f408575d = r5
            r0.f408578g = r4
            if (r3 != r1) goto L3f
            return r1
        L3f:
            r0 = r5
        L40:
            mj3.a r6 = r0.e()
            r6.n()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: mj3.d.b(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // ej3.c
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public java.lang.Object c(mj3.e eVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        if (eVar.f408582c.f419434e.isLocked()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.GLYuvRenderMTRTask", "execute: texture uploading, skip frame");
        } else {
            java.util.concurrent.locks.ReentrantLock reentrantLock = eVar.f408582c.f419434e;
            reentrantLock.lock();
            try {
                f(eVar);
            } finally {
                reentrantLock.unlock();
            }
        }
        return new mj3.f();
    }

    public final mj3.a e() {
        return (mj3.a) ((jz5.n) this.f408579a).mo141623x754a37bb();
    }

    public final void f(mj3.e params) {
        mj3.a e17 = e();
        e17.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        mj3.g gVar = params.f408580a;
        e17.w(gVar.f408583a, gVar.f408584b);
        android.util.Size size = params.f408581b;
        e17.u(size.getWidth(), size.getHeight());
        e17.f429538n = gVar.f408585c;
        e17.f429530f = gVar.f408587e ? 2 : 6;
        e17.f408573J = params;
        if (params.f408580a.f408587e) {
            e().f429530f = 2;
        } else {
            e().f429530f = 6;
        }
        e().o();
    }
}
