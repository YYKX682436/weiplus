package ix0;

/* loaded from: classes5.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f376818d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ix0.g f376819e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 f376820f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ix0.g gVar, com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f376819e = gVar;
        this.f376820f = c4190xd8dd3713;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ix0.c(this.f376819e, this.f376820f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ix0.c) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (r11 == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0075, code lost:
    
        r11 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0076, code lost:
    
        if (r11 != r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0072, code lost:
    
        if (r11 == r0) goto L21;
     */
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
            int r1 = r10.f376818d
            jz5.f0 r2 = jz5.f0.f384359a
            r3 = 1
            if (r1 == 0) goto L17
            if (r1 != r3) goto Lf
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            goto L79
        Lf:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L17:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            ix0.g r11 = r10.f376819e
            ix0.a r11 = r11.f376843f
            com.tencent.maas.moviecomposing.segments.Segment r5 = r10.f376820f
            r10.f376818d = r3
            java.lang.String r1 = r11.f376809a
            int r4 = r1.length()
            if (r4 != 0) goto L2b
            goto L2c
        L2b:
            r3 = 0
        L2c:
            java.lang.String r4 = "ElementSegmentTextReadL"
            if (r3 == 0) goto L40
            java.lang.String r1 = "recover: clear"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r1)
            ix0.g r11 = r11.f376812d
            java.lang.String r1 = "recover"
            java.lang.Object r11 = r11.j(r5, r1, r10)
            if (r11 != r0) goto L75
            goto L76
        L40:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r6 = "recover: originAudioFilePath "
            r3.<init>(r6)
            r3.append(r1)
            java.lang.String r1 = " originRoleID "
            r3.append(r1)
            java.lang.String r1 = r11.f376810b
            r3.append(r1)
            java.lang.String r1 = " originRoleName "
            r3.append(r1)
            java.lang.String r1 = r11.f376811c
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r1)
            ix0.g r4 = r11.f376812d
            java.lang.String r6 = r11.f376810b
            java.lang.String r7 = r11.f376811c
            java.lang.String r8 = r11.f376809a
            r9 = r10
            java.lang.Object r11 = ix0.g.h(r4, r5, r6, r7, r8, r9)
            if (r11 != r0) goto L75
            goto L76
        L75:
            r11 = r2
        L76:
            if (r11 != r0) goto L79
            return r0
        L79:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ix0.c.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
