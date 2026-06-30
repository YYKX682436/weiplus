package sg2;

/* loaded from: classes3.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f489475d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f489476e;

    /* renamed from: f, reason: collision with root package name */
    public int f489477f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f489478g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f489479h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f489480i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(java.util.List list, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f489479h = list;
        this.f489480i = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        sg2.v vVar = new sg2.v(this.f489479h, this.f489480i, interfaceC29045xdcb5ca57);
        vVar.f489478g = obj;
        return vVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((sg2.v) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x008d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x00ae -> B:5:0x00b2). Please report as a decompilation issue!!! */
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
            int r1 = r14.f489477f
            r2 = 1
            if (r1 == 0) goto L26
            if (r1 != r2) goto L1e
            java.lang.Object r1 = r14.f489476e
            java.lang.StringBuilder r1 = (java.lang.StringBuilder) r1
            java.lang.Object r3 = r14.f489475d
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r14.f489478g
            java.util.Iterator r4 = (java.util.Iterator) r4
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r15)
            r5 = r3
            r3 = r1
            r1 = r0
            r0 = r14
            goto Lb2
        L1e:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L26:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r15)
            java.lang.Object r15 = r14.f489478g
            kotlinx.coroutines.y0 r15 = (p3325xe03a0797.p3326xc267989b.y0) r15
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r3 = r14.f489479h
            java.util.Iterator r9 = r3.iterator()
        L38:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L81
            java.lang.Object r3 = r9.next()
            r10 = r3
            r45.ir1 r10 = (r45.ir1) r10
            r4 = 0
            r5 = 0
            sg2.r r6 = new sg2.r
            boolean r11 = r14.f489480i
            r12 = 0
            r6.<init>(r10, r11, r12)
            r7 = 3
            r8 = 0
            r3 = r15
            kotlinx.coroutines.f1 r3 = p3325xe03a0797.p3326xc267989b.l.b(r3, r4, r5, r6, r7, r8)
            r1.add(r3)
            sg2.s r6 = new sg2.s
            r6.<init>(r10, r11, r12)
            r3 = r15
            kotlinx.coroutines.f1 r3 = p3325xe03a0797.p3326xc267989b.l.b(r3, r4, r5, r6, r7, r8)
            r1.add(r3)
            sg2.t r6 = new sg2.t
            r6.<init>(r10, r12)
            r3 = r15
            kotlinx.coroutines.f1 r3 = p3325xe03a0797.p3326xc267989b.l.b(r3, r4, r5, r6, r7, r8)
            r1.add(r3)
            sg2.u r6 = new sg2.u
            r6.<init>(r10, r11, r12)
            r3 = r15
            kotlinx.coroutines.f1 r3 = p3325xe03a0797.p3326xc267989b.l.b(r3, r4, r5, r6, r7, r8)
            r1.add(r3)
            goto L38
        L81:
            java.util.Iterator r15 = r1.iterator()
            r4 = r15
            r15 = r14
        L87:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto Lc1
            java.lang.Object r1 = r4.next()
            kotlinx.coroutines.f1 r1 = (p3325xe03a0797.p3326xc267989b.f1) r1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "#refreshInner result:"
            r3.append(r5)
            r15.f489478g = r4
            java.lang.String r5 = "FinderGesturesFilesManager"
            r15.f489475d = r5
            r15.f489476e = r3
            r15.f489477f = r2
            java.lang.Object r1 = r1.k(r15)
            if (r1 != r0) goto Lae
            return r0
        Lae:
            r13 = r0
            r0 = r15
            r15 = r1
            r1 = r13
        Lb2:
            java.lang.String r15 = (java.lang.String) r15
            r3.append(r15)
            java.lang.String r15 = r3.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r15)
            r15 = r0
            r0 = r1
            goto L87
        Lc1:
            jz5.f0 r15 = jz5.f0.f384359a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: sg2.v.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
