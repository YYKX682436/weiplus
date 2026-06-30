package b92;

/* loaded from: classes.dex */
public final class x0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f100089d;

    /* renamed from: e, reason: collision with root package name */
    public int f100090e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f100091f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f100092g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f100093h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(android.content.Context context, long j17, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f100091f = context;
        this.f100092g = j17;
        this.f100093h = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new b92.x0(this.f100091f, this.f100092g, this.f100093h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((b92.x0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008e  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r14) {
        /*
            r13 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r13.f100090e
            r2 = 2
            r3 = 3
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L2d
            if (r1 == r5) goto L29
            if (r1 == r2) goto L21
            if (r1 != r3) goto L19
            java.lang.Object r0 = r13.f100089d
            xg2.h r0 = (xg2.h) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            goto La6
        L19:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L21:
            java.lang.Object r1 = r13.f100089d
            xg2.h r1 = (xg2.h) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            goto L8a
        L29:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            goto L69
        L2d:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            r45.qs1 r14 = new r45.qs1
            r14.<init>()
            db2.t4 r1 = db2.t4.f309704a
            r6 = 30026(0x754a, float:4.2075E-41)
            r45.kv0 r1 = r1.a(r6)
            r14.set(r5, r1)
            long r6 = r13.f100092g
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            r14.set(r3, r1)
            r1 = 5
            java.lang.String r6 = r13.f100093h
            r14.set(r1, r6)
            com.tencent.mm.modelbase.i r14 = r14.d()
            az2.j r14 = (az2.j) r14
            android.content.Context r7 = r13.f100091f
            r8 = 0
            r9 = 0
            r11 = 6
            r12 = 0
            r6 = r14
            az2.j.u(r6, r7, r8, r9, r11, r12)
            r13.f100090e = r5
            java.lang.Object r14 = xg2.g.d(r14, r4, r13, r5, r4)
            if (r14 != r0) goto L69
            return r0
        L69:
            r1 = r14
            xg2.h r1 = (xg2.h) r1
            boolean r14 = r1 instanceof xg2.i
            if (r14 == 0) goto L8a
            oz5.l r14 = r1.f535925a
            if (r14 != 0) goto L78
            oz5.l r14 = r13.mo48699x76847179()
        L78:
            b92.w0 r5 = new b92.w0
            android.content.Context r6 = r13.f100091f
            r5.<init>(r1, r4, r6)
            r13.f100089d = r1
            r13.f100090e = r2
            java.lang.Object r14 = p3325xe03a0797.p3326xc267989b.l.g(r14, r5, r13)
            if (r14 != r0) goto L8a
            return r0
        L8a:
            boolean r14 = r1 instanceof xg2.b
            if (r14 == 0) goto La6
            oz5.l r14 = r1.f535925a
            if (r14 != 0) goto L96
            oz5.l r14 = r13.mo48699x76847179()
        L96:
            b92.v0 r2 = new b92.v0
            r2.<init>(r1, r4)
            r13.f100089d = r1
            r13.f100090e = r3
            java.lang.Object r14 = p3325xe03a0797.p3326xc267989b.l.g(r14, r2, r13)
            if (r14 != r0) goto La6
            return r0
        La6:
            jz5.f0 r14 = jz5.f0.f384359a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: b92.x0.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
