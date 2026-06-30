package ni2;

/* loaded from: classes.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f418812d;

    /* renamed from: e, reason: collision with root package name */
    public int f418813e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ni2.g f418814f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ni2.g gVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f418814f = gVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ni2.e(this.f418814f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ni2.e) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0091  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r15) {
        /*
            r14 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r14.f418813e
            r2 = 0
            ni2.g r3 = r14.f418814f
            r4 = 2
            r5 = 3
            r6 = 1
            if (r1 == 0) goto L2f
            if (r1 == r6) goto L2b
            if (r1 == r4) goto L23
            if (r1 != r5) goto L1b
            java.lang.Object r0 = r14.f418812d
            xg2.h r0 = (xg2.h) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r15)
            goto La9
        L1b:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L23:
            java.lang.Object r1 = r14.f418812d
            xg2.h r1 = (xg2.h) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r15)
            goto L8d
        L2b:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r15)
            goto L6e
        L2f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r15)
            r45.my1 r15 = new r45.my1
            r15.<init>()
            db2.t4 r1 = db2.t4.f309704a
            r7 = 8334(0x208e, float:1.1678E-41)
            r45.kv0 r1 = r1.a(r7)
            r15.set(r6, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r15.set(r4, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            r15.set(r5, r1)
            com.tencent.mm.modelbase.i r15 = r15.d()
            az2.j r15 = (az2.j) r15
            android.content.Context r8 = r3.f199914d
            r9 = 0
            r10 = 0
            r12 = 6
            r13 = 0
            r7 = r15
            az2.j.u(r7, r8, r9, r10, r12, r13)
            kotlinx.coroutines.p0 r1 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            kotlinx.coroutines.g3 r1 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            r14.f418813e = r6
            java.lang.Object r15 = xg2.g.b(r15, r1, r14)
            if (r15 != r0) goto L6e
            return r0
        L6e:
            r1 = r15
            xg2.h r1 = (xg2.h) r1
            boolean r15 = r1 instanceof xg2.i
            if (r15 == 0) goto L8d
            oz5.l r15 = r1.f535925a
            if (r15 != 0) goto L7d
            oz5.l r15 = r14.mo48699x76847179()
        L7d:
            ni2.d r6 = new ni2.d
            r6.<init>(r1, r2, r3)
            r14.f418812d = r1
            r14.f418813e = r4
            java.lang.Object r15 = p3325xe03a0797.p3326xc267989b.l.g(r15, r6, r14)
            if (r15 != r0) goto L8d
            return r0
        L8d:
            boolean r15 = r1 instanceof xg2.b
            if (r15 == 0) goto La9
            oz5.l r15 = r1.f535925a
            if (r15 != 0) goto L99
            oz5.l r15 = r14.mo48699x76847179()
        L99:
            ni2.c r3 = new ni2.c
            r3.<init>(r1, r2)
            r14.f418812d = r1
            r14.f418813e = r5
            java.lang.Object r15 = p3325xe03a0797.p3326xc267989b.l.g(r15, r3, r14)
            if (r15 != r0) goto La9
            return r0
        La9:
            jz5.f0 r15 = jz5.f0.f384359a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: ni2.e.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
