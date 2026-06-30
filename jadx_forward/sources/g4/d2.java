package g4;

/* loaded from: classes5.dex */
public final class d2 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f349786d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f349787e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g4.a1 f349788f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(g4.a1 a1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(3, interfaceC29045xdcb5ca57);
        this.f349788f = a1Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public final java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        g4.t0 previous = (g4.t0) obj;
        g4.t0 next = (g4.t0) obj2;
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 continuation = (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(previous, "previous");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(next, "next");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(continuation, "continuation");
        g4.d2 d2Var = new g4.d2(this.f349788f, continuation);
        d2Var.f349786d = previous;
        d2Var.f349787e = next;
        return d2Var.mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
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
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            java.lang.Object r7 = r6.f349786d
            g4.t0 r7 = (g4.t0) r7
            java.lang.Object r0 = r6.f349787e
            g4.t0 r0 = (g4.t0) r0
            java.lang.String r1 = "$this$shouldPrioritizeOver"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r0, r1)
            java.lang.String r1 = "previous"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r7, r1)
            java.lang.String r1 = "loadType"
            g4.a1 r2 = r6.f349788f
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r2, r1)
            int r1 = r0.f350095a
            int r3 = r7.f350095a
            if (r1 <= r3) goto L25
            goto L60
        L25:
            g4.b5 r1 = r7.f350096b
            boolean r3 = r1 instanceof g4.a5
            g4.b5 r4 = r0.f350096b
            if (r3 == 0) goto L32
            boolean r3 = r4 instanceof g4.z4
            if (r3 == 0) goto L32
            goto L60
        L32:
            boolean r3 = r4 instanceof g4.a5
            if (r3 == 0) goto L3b
            boolean r3 = r1 instanceof g4.z4
            if (r3 == 0) goto L3b
            goto L5e
        L3b:
            int r3 = r4.f349750c
            int r5 = r1.f349750c
            if (r3 == r5) goto L42
            goto L60
        L42:
            int r3 = r4.f349751d
            int r5 = r1.f349751d
            if (r3 == r5) goto L49
            goto L60
        L49:
            g4.a1 r3 = g4.a1.PREPEND
            if (r2 != r3) goto L54
            int r3 = r1.f349748a
            int r5 = r4.f349748a
            if (r3 >= r5) goto L54
            goto L5e
        L54:
            g4.a1 r3 = g4.a1.APPEND
            if (r2 != r3) goto L60
            int r1 = r1.f349749b
            int r2 = r4.f349749b
            if (r1 >= r2) goto L60
        L5e:
            r1 = 0
            goto L61
        L60:
            r1 = 1
        L61:
            if (r1 == 0) goto L64
            r7 = r0
        L64:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.d2.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
