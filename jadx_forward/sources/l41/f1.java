package l41;

/* loaded from: classes15.dex */
public final class f1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f397344d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l41.j1 f397345e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f397346f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(l41.j1 j1Var, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f397345e = j1Var;
        this.f397346f = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new l41.f1(this.f397345e, this.f397346f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((l41.f1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004e  */
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
            int r1 = r10.f397344d
            r2 = 1
            l41.j1 r3 = r10.f397345e
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            goto L3e
        Lf:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L17:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest r11 = r3.f397377c
            r1 = 0
            if (r11 == 0) goto L25
            boolean r11 = r11.f153808g
            if (r2 != r11) goto L25
            r11 = r2
            goto L26
        L25:
            r11 = r1
        L26:
            if (r11 == 0) goto L35
            jz5.l r11 = new jz5.l
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r1)
            java.lang.String r1 = ""
            r11.<init>(r0, r1)
            goto L40
        L35:
            r10.f397344d = r2
            java.lang.Object r11 = l41.j1.a(r3, r10)
            if (r11 != r0) goto L3e
            return r0
        L3e:
            jz5.l r11 = (jz5.l) r11
        L40:
            java.lang.Object r0 = r11.f384366d
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.Object r1 = r11.f384367e
            java.lang.Object r11 = r11.f384366d
            if (r0 != 0) goto L69
            android.os.ResultReceiver r4 = r3.l()
            long r5 = r3.m()
            r7 = 1
            java.lang.Number r11 = (java.lang.Number) r11
            int r8 = r11.intValue()
            r9 = r1
            java.lang.String r9 = (java.lang.String) r9
            l41.e2.a(r4, r5, r7, r8, r9)
            boolean r11 = r10.f397346f
            r3.r(r11)
            goto L8b
        L69:
            r0 = r11
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            r3.g(r0, r2)
            android.os.ResultReceiver r4 = r3.l()
            long r5 = r3.m()
            r7 = 0
            java.lang.Number r11 = (java.lang.Number) r11
            int r8 = r11.intValue()
            r9 = r1
            java.lang.String r9 = (java.lang.String) r9
            l41.e2.a(r4, r5, r7, r8, r9)
        L8b:
            jz5.f0 r11 = jz5.f0.f384359a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: l41.f1.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
