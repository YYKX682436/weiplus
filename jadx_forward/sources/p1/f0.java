package p1;

/* loaded from: classes14.dex */
public final class f0 extends p1.y {

    /* renamed from: f, reason: collision with root package name */
    public p1.b0 f432348f = p1.b0.Unknown;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p1.g0 f432349g;

    public f0(p1.g0 g0Var) {
        this.f432349g = g0Var;
    }

    @Override // p1.y
    public void b() {
        if (this.f432348f == p1.b0.Dispatching) {
            long uptimeMillis = android.os.SystemClock.uptimeMillis();
            p1.g0 g0Var = this.f432349g;
            p1.e0 e0Var = new p1.e0(g0Var);
            android.view.MotionEvent obtain = android.view.MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            obtain.setSource(0);
            e0Var.mo146xb9724478(obtain);
            obtain.recycle();
            this.f432348f = p1.b0.Unknown;
            g0Var.f432355f = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // p1.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(p1.l r7, p1.n r8, long r9) {
        /*
            r6 = this;
            java.lang.String r9 = "pointerEvent"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r7, r9)
            java.lang.String r9 = "pass"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r9)
            p1.g0 r9 = r6.f432349g
            boolean r10 = r9.f432355f
            r0 = 0
            r1 = 1
            java.util.List r2 = r7.f432375a
            if (r10 != 0) goto L3e
            int r10 = r2.size()
            r3 = r0
        L19:
            if (r3 >= r10) goto L38
            java.lang.Object r4 = r2.get(r3)
            p1.s r4 = (p1.s) r4
            boolean r5 = p1.m.a(r4)
            if (r5 != 0) goto L30
            boolean r4 = p1.m.c(r4)
            if (r4 == 0) goto L2e
            goto L30
        L2e:
            r4 = r0
            goto L31
        L30:
            r4 = r1
        L31:
            if (r4 == 0) goto L35
            r10 = r1
            goto L39
        L35:
            int r3 = r3 + 1
            goto L19
        L38:
            r10 = r0
        L39:
            if (r10 == 0) goto L3c
            goto L3e
        L3c:
            r10 = r0
            goto L3f
        L3e:
            r10 = r1
        L3f:
            p1.b0 r3 = r6.f432348f
            p1.b0 r4 = p1.b0.NotDispatching
            p1.n r5 = p1.n.Final
            if (r3 == r4) goto L57
            p1.n r3 = p1.n.Initial
            if (r8 != r3) goto L50
            if (r10 == 0) goto L50
            r6.v(r7)
        L50:
            if (r8 != r5) goto L57
            if (r10 != 0) goto L57
            r6.v(r7)
        L57:
            if (r8 != r5) goto L79
            int r7 = r2.size()
            r8 = r0
        L5e:
            if (r8 >= r7) goto L71
            java.lang.Object r10 = r2.get(r8)
            p1.s r10 = (p1.s) r10
            boolean r10 = p1.m.c(r10)
            if (r10 != 0) goto L6e
            r1 = r0
            goto L71
        L6e:
            int r8 = r8 + 1
            goto L5e
        L71:
            if (r1 == 0) goto L79
            p1.b0 r7 = p1.b0.Unknown
            r6.f432348f = r7
            r9.f432355f = r0
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.f0.c(p1.l, p1.n, long):void");
    }

    public final void v(p1.l lVar) {
        boolean z17;
        java.util.List list = lVar.f432375a;
        int size = list.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size) {
                z17 = false;
                break;
            } else {
                if (((p1.s) list.get(i17)).b()) {
                    z17 = true;
                    break;
                }
                i17++;
            }
        }
        p1.b0 b0Var = p1.b0.Dispatching;
        p1.g0 g0Var = this.f432349g;
        if (z17) {
            if (this.f432348f == b0Var) {
                s1.z zVar = this.f432458d;
                if (zVar == null) {
                    throw new java.lang.IllegalStateException("layoutCoordinates not set".toString());
                }
                int i18 = d1.e.f307159e;
                p1.i0.a(lVar, ((u1.c1) zVar).t0(d1.e.f307156b), new p1.c0(g0Var), true);
            }
            this.f432348f = p1.b0.NotDispatching;
            return;
        }
        s1.z zVar2 = this.f432458d;
        if (zVar2 == null) {
            throw new java.lang.IllegalStateException("layoutCoordinates not set".toString());
        }
        int i19 = d1.e.f307159e;
        p1.i0.a(lVar, ((u1.c1) zVar2).t0(d1.e.f307156b), new p1.d0(this, g0Var), false);
        if (this.f432348f == b0Var) {
            int size2 = list.size();
            for (int i27 = 0; i27 < size2; i27++) {
                ((p1.s) list.get(i27)).a();
            }
            p1.g gVar = lVar.f432376b;
            if (gVar == null) {
                return;
            }
            gVar.f432352c = !g0Var.f432355f;
        }
    }
}
