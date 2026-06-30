package yf2;

/* loaded from: classes3.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f543270d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f543271e;

    /* renamed from: f, reason: collision with root package name */
    public int f543272f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yf2.o f543273g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(yf2.o oVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f543273g = oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(p3321xbce91901.jvm.p3324x21ffc6bd.g0 r8, mm2.n0 r9, yf2.o r10, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r11) {
        /*
            boolean r0 = r11 instanceof yf2.j
            if (r0 == 0) goto L13
            r0 = r11
            yf2.j r0 = (yf2.j) r0
            int r1 = r0.f543259e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f543259e = r1
            goto L18
        L13:
            yf2.j r0 = new yf2.j
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f543258d
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f543259e
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2b:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            goto L94
        L2f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            re2.e0 r11 = re2.j1.f475971b
            jz5.f0 r2 = jz5.f0.f384359a
            if (r11 != 0) goto L39
            return r2
        L39:
            long r4 = r11.f475923c
            long r6 = r8.f391654d
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L42
            return r2
        L42:
            boolean r9 = r9.f410806r
            if (r9 != 0) goto L47
            return r2
        L47:
            long r4 = r11.f475923c
            r8.f391654d = r4
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "observeCoLiveTaskEventsForInvitee: subscribe invitationId="
            r8.<init>(r9)
            long r4 = r11.f475923c
            r8.append(r4)
            java.lang.String r9 = ", phase="
            r8.append(r9)
            re2.a0 r9 = r11.f475922b
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "Finder.CoLiveController"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r9, r8)
            boolean r8 = r11.d()
            if (r8 != 0) goto L82
            long r8 = r11.f475928h
            r4 = 0
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 == 0) goto L82
            long r6 = r11.f475929i
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 == 0) goto L82
            yf2.o.Z6(r10, r8, r6)
            return r2
        L82:
            kotlinx.coroutines.flow.n2 r8 = r11.f475931k
            yf2.k r9 = new yf2.k
            r9.<init>(r10)
            r0.f543259e = r3
            kotlinx.coroutines.flow.k2 r8 = (p3325xe03a0797.p3326xc267989b.p3328x30012e.k2) r8
            java.lang.Object r8 = r8.a(r9, r0)
            if (r8 != r1) goto L94
            return r1
        L94:
            jz5.d r8 = new jz5.d
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: yf2.l.a(kotlin.jvm.internal.g0, mm2.n0, yf2.o, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yf2.l(this.f543273g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((yf2.l) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
        return pz5.a.f440719d;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var;
        mm2.n0 n0Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f543272f;
        yf2.o oVar = this.f543273g;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            mm2.n0 n0Var2 = (mm2.n0) oVar.m56788xbba4bfc0(mm2.n0.class);
            g0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.g0();
            this.f543270d = n0Var2;
            this.f543271e = g0Var;
            this.f543272f = 1;
            if (a(g0Var, n0Var2, oVar, this) == aVar) {
                return aVar;
            }
            n0Var = n0Var2;
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                throw new jz5.d();
            }
            g0Var = (p3321xbce91901.jvm.p3324x21ffc6bd.g0) this.f543271e;
            n0Var = (mm2.n0) this.f543270d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        p3325xe03a0797.p3326xc267989b.p3328x30012e.f3 f3Var = n0Var.f410798g;
        yf2.i iVar = new yf2.i(g0Var, n0Var, oVar);
        this.f543270d = null;
        this.f543271e = null;
        this.f543272f = 2;
        if (((p3325xe03a0797.p3326xc267989b.p3328x30012e.l2) f3Var).a(iVar, this) == aVar) {
            return aVar;
        }
        throw new jz5.d();
    }
}
