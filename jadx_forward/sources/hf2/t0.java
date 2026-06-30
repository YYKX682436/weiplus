package hf2;

/* loaded from: classes10.dex */
public final class t0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f362700d;

    /* renamed from: e, reason: collision with root package name */
    public int f362701e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hf2.y0 f362702f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(hf2.y0 y0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f362702f = y0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new hf2.t0(this.f362702f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((hf2.t0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bb A[RETURN] */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r11) {
        /*
            r10 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r10.f362701e
            java.lang.String r2 = "maas_confirm"
            java.lang.String r3 = ""
            r4 = 3
            r5 = 2
            r6 = 1
            hf2.y0 r7 = r10.f362702f
            if (r1 == 0) goto L32
            if (r1 == r6) goto L2a
            if (r1 == r5) goto L22
            if (r1 != r4) goto L1a
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            goto Lbc
        L1a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L22:
            java.lang.Object r1 = r10.f362700d
            java.lang.String r1 = (java.lang.String) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            goto L61
        L2a:
            java.lang.Object r1 = r10.f362700d
            java.lang.String r1 = (java.lang.String) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            goto L52
        L32:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            android.widget.EditText r11 = r7.f362738f
            if (r11 == 0) goto L45
            android.text.Editable r11 = r11.getText()
            if (r11 == 0) goto L45
            java.lang.String r11 = r11.toString()
            if (r11 != 0) goto L46
        L45:
            r11 = r3
        L46:
            r10.f362700d = r11
            r10.f362701e = r6
            java.lang.Object r1 = r7.d(r2, r10)
            if (r1 != r0) goto L51
            return r0
        L51:
            r1 = r11
        L52:
            hf2.x r11 = r7.f362733a
            r45.h84 r11 = r11.f362719r
            r10.f362700d = r1
            r10.f362701e = r5
            java.lang.Object r11 = r7.a(r11, r1, r10)
            if (r11 != r0) goto L61
            return r0
        L61:
            android.graphics.Bitmap r11 = (android.graphics.Bitmap) r11
            r5 = 0
            if (r11 == 0) goto L98
            hf2.x r8 = r7.f362733a
            r8.getClass()
            java.lang.String r9 = "text"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r1, r9)
            java.lang.String r9 = "replaceRestoreDataText_"
            java.lang.String r9 = r9.concat(r1)
            r8.a7(r9, r3)
            r45.ei0 r3 = r8.f362718q
            if (r3 == 0) goto L89
            java.util.LinkedList r3 = r3.f455062d
            if (r3 == 0) goto L89
            java.lang.Object r3 = kz5.n0.Z(r3)
            r45.ji0 r3 = (r45.ji0) r3
            goto L8a
        L89:
            r3 = r5
        L8a:
            if (r3 != 0) goto L8d
            goto L8f
        L8d:
            r3.f459362n = r1
        L8f:
            hf2.x r3 = r7.f362733a
            hf2.h0 r3 = r3.f7()
            r3.c(r2, r11)
        L98:
            hf2.x r11 = r7.f362733a
            hf2.l2 r11 = r11.l7()
            int r1 = r1.length()
            if (r1 <= 0) goto La5
            goto La6
        La5:
            r6 = 0
        La6:
            java.lang.String r1 = "MaasInputConfirm"
            r11.b(r1, r6)
            hf2.x r11 = r7.f362733a
            hf2.b2 r11 = r11.h7()
            r10.f362700d = r5
            r10.f362701e = r4
            java.lang.Object r11 = r11.g(r1, r10)
            if (r11 != r0) goto Lbc
            return r0
        Lbc:
            jz5.f0 r11 = jz5.f0.f384359a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: hf2.t0.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
