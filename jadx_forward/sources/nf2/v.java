package nf2;

/* loaded from: classes10.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f418337d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nf2.w f418338e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(nf2.w wVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f418338e = wVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new nf2.v(this.f418338e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((nf2.v) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if ((r0.f418217e.getVisibility() == 0) == true) goto L24;
     */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r13) {
        /*
            r12 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r12.f418337d
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 != r2) goto Ld
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            goto L23
        Ld:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L15:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            r12.f418337d = r2
            r3 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r13 = p3325xe03a0797.p3326xc267989b.k1.b(r3, r12)
            if (r13 != r0) goto L23
            return r0
        L23:
            nf2.w r13 = r12.f418338e
            r13.getClass()
            gm0.b0 r0 = gm0.j1.u()
            com.tencent.mm.storage.n3 r0 = r0.c()
            com.tencent.mm.storage.u3 r1 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_LYRICS_GESTURE_EDU_SHOWN_BOOLEAN_SYNC
            r3 = 0
            boolean r0 = r0.o(r1, r3)
            jz5.f0 r1 = jz5.f0.f384359a
            java.lang.String r4 = "FinderLiveLyricsController"
            if (r0 == 0) goto L44
            java.lang.String r13 = "tryShowGestureEducation: gesture edu is already shown"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r13)
            return r1
        L44:
            nf2.d1 r0 = r13.f418341m
            if (r0 == 0) goto L56
            android.view.View r0 = r0.f418217e
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L52
            r0 = r2
            goto L53
        L52:
            r0 = r3
        L53:
            if (r0 != r2) goto L56
            goto L57
        L56:
            r2 = r3
        L57:
            if (r2 != 0) goto L60
            java.lang.String r13 = "tryShowGestureEducation: lyrics view is not showing"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r13)
            return r1
        L60:
            nf2.d1 r0 = r13.f418341m
            if (r0 != 0) goto L65
            goto L90
        L65:
            nf2.d r2 = new nf2.d
            r2.<init>(r13)
            nf2.f r3 = new nf2.f
            r3.<init>(r13)
            com.tencent.mm.view.MMPAGView r13 = r0.f418235w
            if (r13 != 0) goto L74
            goto L90
        L74:
            android.view.View r4 = r0.f418234v
            if (r4 != 0) goto L79
            goto L90
        L79:
            nf2.x0 r5 = new nf2.x0
            r5.<init>(r2)
            r4.setOnClickListener(r5)
            kotlinx.coroutines.y0 r6 = r0.f418216d
            r7 = 0
            r8 = 0
            nf2.y0 r9 = new nf2.y0
            r0 = 0
            r9.<init>(r13, r4, r3, r0)
            r10 = 3
            r11 = 0
            p3325xe03a0797.p3326xc267989b.l.d(r6, r7, r8, r9, r10, r11)
        L90:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: nf2.v.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
