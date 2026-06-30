package qy1;

/* loaded from: classes13.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f449261d;

    /* renamed from: e, reason: collision with root package name */
    public int f449262e;

    /* renamed from: f, reason: collision with root package name */
    public int f449263f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qy1.m f449264g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(qy1.m mVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f449264g = mVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qy1.h(this.f449264g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((qy1.h) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x003c -> B:5:0x003f). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r7) {
        /*
            r6 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r6.f449263f
            r2 = 1
            if (r1 == 0) goto L1a
            if (r1 != r2) goto L12
            int r1 = r6.f449262e
            int r3 = r6.f449261d
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            r7 = r6
            goto L3f
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            qy1.m r7 = r6.f449264g
            int r7 = r7.f449277b
            r1 = 0
            r3 = r1
            r1 = r7
            r7 = r6
        L25:
            if (r3 >= r1) goto L48
            qy1.m r4 = r7.f449264g
            u26.w r4 = r4.f449278c
            qy1.i r5 = new qy1.i
            r5.<init>(r3)
            r7.f449261d = r3
            r7.f449262e = r1
            r7.f449263f = r2
            u26.o r4 = (u26.o) r4
            java.lang.Object r4 = r4.t(r5, r7)
            if (r4 != r0) goto L3f
            return r0
        L3f:
            qy1.m r4 = r7.f449264g
            java.util.concurrent.atomic.AtomicInteger r4 = r4.f449276a
            r4.incrementAndGet()
            int r3 = r3 + r2
            goto L25
        L48:
            jz5.f0 r7 = jz5.f0.f384359a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: qy1.h.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
