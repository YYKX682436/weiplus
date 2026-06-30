package xt2;

/* loaded from: classes2.dex */
public final class t2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f538558d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xt2.e3 f538559e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f538560f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f538561g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(xt2.e3 e3Var, cm2.m0 m0Var, java.util.LinkedList linkedList, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f538559e = e3Var;
        this.f538560f = m0Var;
        this.f538561g = linkedList;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new xt2.t2(this.f538559e, this.f538560f, this.f538561g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((xt2.t2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x008f -> B:7:0x0026). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r9) {
        /*
            r8 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r8.f538558d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1d
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L25
        L10:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L18:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            r9 = r8
            goto L70
        L1d:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            xt2.e3 r9 = r8.f538559e
            r1 = 0
            r9.E = r1
        L25:
            r9 = r8
        L26:
            xt2.e3 r1 = r9.f538559e
            int r4 = r1.E
            cm2.m0 r5 = r9.f538560f
            r1.f(r5, r4)
            r9.f538558d = r3
            r1.getClass()
            kotlinx.coroutines.r r4 = new kotlinx.coroutines.r
            kotlin.coroutines.Continuation r5 = pz5.f.b(r9)
            r4.<init>(r5, r3)
            r4.k()
            v65.n r5 = new v65.n
            r5.<init>(r4)
            float[] r6 = new float[r2]
            r6 = {x0092: FILL_ARRAY_DATA , data: [1058642330, 1065353216} // fill-array
            android.widget.LinearLayout r1 = r1.f538256z
            java.lang.String r7 = "alpha"
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofFloat(r1, r7, r6)
            xt2.b2 r6 = new xt2.b2
            r6.<init>(r5)
            r1.addListener(r6)
            r5 = 200(0xc8, double:9.9E-322)
            r1.setDuration(r5)
            r1.start()
            java.lang.Object r1 = r4.j()
            pz5.a r4 = pz5.a.f440719d
            if (r1 != r4) goto L6b
            goto L6d
        L6b:
            jz5.f0 r1 = jz5.f0.f384359a
        L6d:
            if (r1 != r0) goto L70
            return r0
        L70:
            xt2.e3 r1 = r9.f538559e
            int r4 = r1.E
            int r4 = r4 + r3
            java.util.LinkedList r5 = r9.f538561g
            int r5 = r5.size()
            int r4 = r4 % r5
            r1.E = r4
            cm2.m0 r1 = r9.f538560f
            r45.y23 r1 = r1.f124901v
            r4 = 55
            int r1 = r1.m75939xb282bd08(r4)
            long r4 = (long) r1
            r9.f538558d = r2
            java.lang.Object r1 = p3325xe03a0797.p3326xc267989b.k1.b(r4, r9)
            if (r1 != r0) goto L26
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xt2.t2.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
