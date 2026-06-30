package im2;

/* loaded from: classes3.dex */
public final class x0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f374135d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ im2.z3 f374136e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f374137f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f374138g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(im2.z3 z3Var, int i17, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f374136e = z3Var;
        this.f374137f = i17;
        this.f374138g = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new im2.x0(this.f374136e, this.f374137f, this.f374138g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((im2.x0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0088, code lost:
    
        r2.U6(r2.L1, r12, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007e, code lost:
    
        r12 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        if (r12 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0079, code lost:
    
        if (r12 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0082, code lost:
    
        if (r2.Z1 == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0084, code lost:
    
        r2.V6(r12, r3);
     */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r12) {
        /*
            r11 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r11.f374135d
            im2.z3 r2 = r11.f374136e
            int r3 = r11.f374137f
            r4 = 1
            if (r1 == 0) goto L19
            if (r1 != r4) goto L11
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            goto L77
        L11:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L19:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            android.app.Activity r12 = r2.m80379x76847179()
            java.lang.String r1 = "context"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r12, r1)
            pf5.z r1 = pf5.z.f435481a
            boolean r5 = r12 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112
            if (r5 == 0) goto L90
            androidx.appcompat.app.AppCompatActivity r12 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) r12
            pf5.v r12 = r1.a(r12)
            java.lang.Class<te2.s8> r1 = te2.s8.class
            androidx.lifecycle.c1 r12 = r12.a(r1)
            java.lang.String r1 = "get(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r12, r1)
            te2.p8 r12 = (te2.p8) r12
            int r1 = r12.E1
            if (r1 != r4) goto L64
            te2.sc r0 = te2.sc.f499945a
            r45.s52 r0 = r0.b(r3)
            if (r0 != 0) goto L4f
            r45.s52 r0 = new r45.s52
            r0.<init>()
        L4f:
            r12.v7(r0)
            kotlinx.coroutines.y0 r5 = p3325xe03a0797.p3326xc267989b.z0.b()
            r6 = 0
            r7 = 0
            te2.b8 r8 = new te2.b8
            r0 = 0
            r8.<init>(r12, r4, r0)
            r9 = 3
            r10 = 0
            p3325xe03a0797.p3326xc267989b.l.d(r5, r6, r7, r8, r9, r10)
            goto L8d
        L64:
            java.lang.String r12 = r11.f374138g
            boolean r1 = com.p314xaae8f345.mm.vfs.w6.j(r12)
            if (r1 == 0) goto L7c
            zl2.o0 r1 = zl2.o0.f555440a
            r11.f374135d = r4
            java.lang.Object r12 = r1.b(r12, r11)
            if (r12 != r0) goto L77
            return r0
        L77:
            java.lang.String r12 = (java.lang.String) r12
            if (r12 != 0) goto L80
            goto L7e
        L7c:
            if (r12 != 0) goto L80
        L7e:
            java.lang.String r12 = ""
        L80:
            boolean r0 = r2.Z1
            if (r0 == 0) goto L88
            r2.V6(r12, r3)
            goto L8d
        L88:
            int r0 = r2.L1
            r2.U6(r0, r12, r3)
        L8d:
            jz5.f0 r12 = jz5.f0.f384359a
            return r12
        L90:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r12.<init>(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: im2.x0.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
