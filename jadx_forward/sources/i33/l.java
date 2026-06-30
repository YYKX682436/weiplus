package i33;

/* loaded from: classes10.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i33.u f369749d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 f369750e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(i33.u uVar, com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f369749d = uVar;
        this.f369750e = abstractC15633xee433078;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new i33.l(this.f369749d, this.f369750e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        i33.l lVar = (i33.l) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        lVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0081, code lost:
    
        if (r4.isRecycled() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0098, code lost:
    
        r4.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0096, code lost:
    
        if (r4.isRecycled() != false) goto L38;
     */
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
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r15)
            i33.u r15 = r14.f369749d
            r15.getClass()
            java.lang.String r15 = "MicroMsg.AlbumFilePreviewUIC"
            java.lang.String r0 = "Saved thumbnail for "
            java.lang.String r1 = "Failed to save thumbnail for "
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r2 = r14.f369750e
            java.lang.String r3 = r2.f219963e
            if (r3 != 0) goto L18
            goto Lb4
        L18:
            java.lang.String r4 = r2.f219962d
            r5 = 1
            if (r4 == 0) goto L26
            boolean r4 = r26.n0.N(r4)
            if (r4 == 0) goto L24
            goto L26
        L24:
            r4 = 0
            goto L27
        L26:
            r4 = r5
        L27:
            if (r4 != 0) goto L2b
            goto Lb4
        L2b:
            t23.j r6 = t23.p0.h()     // Catch: java.lang.Exception -> La6
            java.lang.String r7 = r2.o()     // Catch: java.lang.Exception -> La6
            int r8 = r2.mo63659xfb85f7b0()     // Catch: java.lang.Exception -> La6
            java.lang.String r9 = r2.f219963e     // Catch: java.lang.Exception -> La6
            long r10 = r2.f219967i     // Catch: java.lang.Exception -> La6
            long r12 = r2.f219968m     // Catch: java.lang.Exception -> La6
            android.graphics.Bitmap r4 = r6.e(r7, r8, r9, r10, r12)     // Catch: java.lang.Exception -> La6
            if (r4 != 0) goto L44
            goto Lb4
        L44:
            java.lang.Class<pt.i0> r6 = pt.i0.class
            i95.m r6 = i95.n0.c(r6)     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L86
            pt.i0 r6 = (pt.i0) r6     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L86
            java.lang.String r7 = j33.d0.f(r3)     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L86
            java.lang.String r8 = "getFileName(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r7, r8)     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L86
            ot.k r6 = (ot.k) r6     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L86
            java.lang.String r6 = r6.Zi(r4, r7)     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L86
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L86
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L86
            r7.append(r3)     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L86
            java.lang.String r0 = " to "
            r7.append(r0)     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L86
            r7.append(r6)     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L86
            java.lang.String r0 = r7.toString()     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L86
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r15, r0)     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L86
            boolean r0 = r26.n0.N(r6)     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L86
            r0 = r0 ^ r5
            if (r0 == 0) goto L7a
            goto L7b
        L7a:
            r6 = 0
        L7b:
            r2.f219962d = r6     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L86
            boolean r0 = r4.isRecycled()     // Catch: java.lang.Exception -> La6
            if (r0 != 0) goto Lb4
            goto L98
        L84:
            r0 = move-exception
            goto L9c
        L86:
            r0 = move-exception
            java.lang.String r1 = r1.concat(r3)     // Catch: java.lang.Throwable -> L84
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L84
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r15, r1, r0)     // Catch: java.lang.Throwable -> L84
            boolean r0 = r4.isRecycled()     // Catch: java.lang.Exception -> La6
            if (r0 != 0) goto Lb4
        L98:
            r4.recycle()     // Catch: java.lang.Exception -> La6
            goto Lb4
        L9c:
            boolean r1 = r4.isRecycled()     // Catch: java.lang.Exception -> La6
            if (r1 != 0) goto La5
            r4.recycle()     // Catch: java.lang.Exception -> La6
        La5:
            throw r0     // Catch: java.lang.Exception -> La6
        La6:
            r0 = move-exception
            java.lang.String r1 = "Failed to generate thumbnail for "
            java.lang.String r1 = r1.concat(r3)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r15, r1, r0)
        Lb4:
            jz5.f0 r15 = jz5.f0.f384359a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: i33.l.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
