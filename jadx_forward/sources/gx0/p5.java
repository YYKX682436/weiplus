package gx0;

/* loaded from: classes5.dex */
public final class p5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f358351d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f358352e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f358353f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(gx0.w8 w8Var, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f358352e = w8Var;
        this.f358353f = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gx0.p5(this.f358352e, this.f358353f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.p5) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0068 A[RETURN] */
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
            int r1 = r6.f358351d
            r2 = 3
            r3 = 2
            gx0.w8 r4 = r6.f358352e
            r5 = 1
            if (r1 == 0) goto L25
            if (r1 == r5) goto L21
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L69
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L60
        L21:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L32
        L25:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            r6.f358351d = r5
            r7 = 0
            java.lang.Object r7 = yt0.c.o(r4, r7, r6, r5, r7)
            if (r7 != r0) goto L32
            return r0
        L32:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r1 = "doExitMovieComposing: releaseMaasCore = "
            r7.<init>(r1)
            com.tencent.mm.mj_publisher.finder.movie_composing.uic.MovieComposingConfig r1 = r4.v7()
            boolean r1 = r1.a()
            r1 = r1 ^ r5
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            java.lang.String r1 = "MovieComp.MainComposingUIC"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r7)
            com.tencent.mm.mj_publisher.finder.movie_composing.uic.MovieComposingConfig r7 = r4.v7()
            boolean r7 = r7.a()
            r7 = r7 ^ r5
            r6.f358351d = r3
            java.lang.Object r7 = gx0.w8.p7(r4, r7, r5, r6)
            if (r7 != r0) goto L60
            return r0
        L60:
            r6.f358351d = r2
            java.lang.Object r7 = r4.E4(r6)
            if (r7 != r0) goto L69
            return r0
        L69:
            android.content.Intent r7 = new android.content.Intent
            r7.<init>()
            java.lang.String r0 = "cancel"
            r7.putExtra(r0, r5)
            java.lang.String r0 = "edited"
            boolean r1 = r6.f358353f
            r7.putExtra(r0, r1)
            androidx.appcompat.app.AppCompatActivity r0 = r4.m158354x19263085()
            r1 = 0
            r0.setResult(r1, r7)
            androidx.appcompat.app.AppCompatActivity r7 = r4.m158354x19263085()
            r7.finish()
            jz5.f0 r7 = jz5.f0.f384359a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.p5.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
