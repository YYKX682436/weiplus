package mi1;

/* loaded from: classes7.dex */
public final class x2 implements mi1.g2 {

    /* renamed from: a, reason: collision with root package name */
    public final mi1.i2 f408258a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f408259b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f408260c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f408261d;

    public x2(mi1.i2 stateOwner) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stateOwner, "stateOwner");
        this.f408258a = stateOwner;
        this.f408259b = jz5.h.b(mi1.u2.f408234d);
        this.f408260c = jz5.h.b(mi1.w2.f408254d);
        this.f408261d = kz5.c0.k(1, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // mi1.g2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof mi1.v2
            if (r0 == 0) goto L13
            r0 = r6
            mi1.v2 r0 = (mi1.v2) r0
            int r1 = r0.f408251f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f408251f = r1
            goto L18
        L13:
            mi1.v2 r0 = new mi1.v2
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f408249d
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f408251f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L50
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            mi1.i2 r6 = r5.f408258a
            mi1.h2 r2 = r6.getF172578m()
            int r2 = r2.f408100a
            r4 = 2
            if (r2 != r4) goto L58
            jz5.g r2 = r5.f408259b
            jz5.n r2 = (jz5.n) r2
            java.lang.Object r2 = r2.mo141623x754a37bb()
            mi1.h2 r2 = (mi1.h2) r2
            r0.f408251f = r3
            java.lang.Object r6 = r6.a(r2, r0)
            if (r6 != r1) goto L50
            return r1
        L50:
            java.lang.String r6 = "TipsAnimatorConsumer"
            java.lang.String r0 = "tips dismiss"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r6, r0)
        L58:
            jz5.f0 r6 = jz5.f0.f384359a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: mi1.x2.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // mi1.g2
    public java.lang.Object b(mi1.j0 j0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (j0Var != null) {
            if (d(j0Var)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TipsAnimatorConsumer", "tips transToTargetState but is same,ignore");
                return f0Var;
            }
            mi1.i2 i2Var = this.f408258a;
            if (i2Var.getF172578m().f408100a == 0) {
                jz5.g gVar = this.f408260c;
                ((mi1.h2) ((jz5.n) gVar).mo141623x754a37bb()).f408101b = j0Var;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TipsAnimatorConsumer", "tips adjustState: transTo expandedState");
                java.lang.Object a17 = i2Var.a((mi1.h2) ((jz5.n) gVar).mo141623x754a37bb(), interfaceC29045xdcb5ca57);
                if (a17 == pz5.a.f440719d) {
                    return a17;
                }
            }
        }
        return f0Var;
    }

    @Override // mi1.g2
    public java.util.List c() {
        return this.f408261d;
    }

    @Override // mi1.g2
    public boolean d(mi1.j0 j0Var) {
        if (j0Var == null) {
            return true;
        }
        mi1.h2 f172578m = this.f408258a.getF172578m();
        java.util.Objects.toString(f172578m);
        if (f172578m.f408100a == 2) {
            mi1.j0 j0Var2 = (mi1.j0) f172578m.f408101b;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(j0Var.f408124g, j0Var2 != null ? j0Var2.f408124g : null)) {
                return true;
            }
        }
        return false;
    }

    @Override // mi1.g2
    /* renamed from: isShow */
    public boolean mo147328xb9a8b747() {
        return this.f408258a.getF172578m().f408100a != 0;
    }
}
