package hf2;

/* loaded from: classes10.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f362674d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hf2.x f362675e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f362676f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f362677g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(hf2.x xVar, int i17, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f362675e = xVar;
        this.f362676f = i17;
        this.f362677g = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new hf2.q(this.f362675e, this.f362676f, this.f362677g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((hf2.q) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0082  */
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
            int r1 = r13.f362674d
            r2 = 0
            r3 = 2
            r4 = 0
            java.lang.String r5 = "showStickerEdit"
            r6 = 1
            hf2.x r7 = r13.f362675e
            if (r1 == 0) goto L23
            if (r1 == r6) goto L1f
            if (r1 != r3) goto L17
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            goto L73
        L17:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            goto L33
        L23:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            hf2.b2 r14 = r7.h7()
            r13.f362674d = r6
            java.lang.Object r14 = r14.g(r5, r13)
            if (r14 != r0) goto L33
            return r0
        L33:
            hf2.h0 r14 = r7.f7()
            int r1 = r13.f362676f
            java.lang.String r8 = r13.f362677g
            r14.b(r1, r4, r8)
            hf2.l2 r14 = r7.l7()
            r45.ei0 r1 = r7.f362718q
            if (r1 == 0) goto L55
            java.util.LinkedList r1 = r1.f455062d
            if (r1 == 0) goto L55
            java.lang.Object r1 = kz5.n0.Z(r1)
            r45.ji0 r1 = (r45.ji0) r1
            if (r1 == 0) goto L55
            java.lang.String r1 = r1.f459362n
            goto L56
        L55:
            r1 = r2
        L56:
            if (r1 == 0) goto L61
            int r1 = r1.length()
            if (r1 != 0) goto L5f
            goto L61
        L5f:
            r1 = r4
            goto L62
        L61:
            r1 = r6
        L62:
            r1 = r1 ^ r6
            r14.b(r5, r1)
            hf2.y0 r14 = r7.g7()
            r13.f362674d = r3
            java.lang.Object r14 = r14.d(r5, r13)
            if (r14 != r0) goto L73
            return r0
        L73:
            java.lang.Class<je2.g> r14 = je2.g.class
            androidx.lifecycle.c1 r0 = r7.m56788xbba4bfc0(r14)
            je2.g r0 = (je2.g) r0
            android.graphics.Bitmap r0 = r0.f380756h
            java.lang.String r1 = "setTextBitmap"
            if (r0 == 0) goto L99
            hf2.b2 r2 = r7.h7()
            androidx.lifecycle.c1 r14 = r7.m56788xbba4bfc0(r14)
            je2.g r14 = (je2.g) r14
            float r14 = r14.f380757i
            r2.d(r1, r0, r14)
            hf2.h0 r14 = r7.f7()
            r14.c(r1, r0)
            goto Lce
        L99:
            r45.ei0 r14 = r7.f362718q
            if (r14 == 0) goto Lac
            java.util.LinkedList r14 = r14.f455062d
            if (r14 == 0) goto Lac
            java.lang.Object r14 = kz5.n0.Z(r14)
            r45.ji0 r14 = (r45.ji0) r14
            if (r14 == 0) goto Lac
            java.lang.String r14 = r14.f459362n
            goto Lad
        Lac:
            r14 = r2
        Lad:
            if (r14 == 0) goto Lb7
            int r14 = r14.length()
            if (r14 != 0) goto Lb6
            goto Lb7
        Lb6:
            r6 = r4
        Lb7:
            if (r6 == 0) goto Lc1
            hf2.b2 r14 = r7.h7()
            r14.f(r1, r4)
            goto Lce
        Lc1:
            kotlinx.coroutines.p0 r8 = p3325xe03a0797.p3326xc267989b.q1.f392103c
            r9 = 0
            hf2.p r10 = new hf2.p
            r10.<init>(r7, r2)
            r11 = 2
            r12 = 0
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(r7, r8, r9, r10, r11, r12)
        Lce:
            jz5.f0 r14 = jz5.f0.f384359a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: hf2.q.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
