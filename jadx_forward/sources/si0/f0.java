package si0;

/* loaded from: classes13.dex */
public final class f0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f489605d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ si0.l0 f489606e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(si0.l0 l0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f489606e = l0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new si0.f0(this.f489606e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((si0.f0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0052  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r6) {
        /*
            r5 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r5.f489605d
            r2 = 2
            r3 = 1
            si0.l0 r4 = r5.f489606e
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L3d
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L30
        L1e:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            kotlinx.coroutines.r2 r6 = r4.f489652v
            if (r6 == 0) goto L30
            r5.f489605d = r3
            kotlinx.coroutines.c3 r6 = (p3325xe03a0797.p3326xc267989b.c3) r6
            java.lang.Object r6 = r6.C(r5)
            if (r6 != r0) goto L30
            return r0
        L30:
            kotlinx.coroutines.r2 r6 = r4.f489653w
            if (r6 == 0) goto L3d
            r5.f489605d = r2
            java.lang.Object r6 = p3325xe03a0797.p3326xc267989b.v2.d(r6, r5)
            if (r6 != r0) goto L3d
            return r0
        L3d:
            android.animation.ValueAnimator r6 = r4.f489645o
            android.animation.ValueAnimator$AnimatorUpdateListener r0 = r4.A
            r6.removeUpdateListener(r0)
            android.animation.Animator$AnimatorListener r6 = r4.B
            android.animation.ValueAnimator r0 = r4.f489645o
            r0.removeListener(r6)
            r6 = 0
            r4.f489637g = r6
            org.libpag.PAGSurface r0 = r4.f489638h
            if (r0 == 0) goto L55
            r0.m154928xe496cc76()
        L55:
            org.libpag.PAGSurface r0 = r4.f489638h
            if (r0 == 0) goto L5c
            r0.m154931x41012807()
        L5c:
            r4.f489638h = r6
            org.libpag.PAGPlayer r0 = r4.f489636f
            if (r0 != 0) goto L63
            goto L66
        L63:
            r0.m154897x42c875eb(r6)
        L66:
            org.libpag.PAGPlayer r0 = r4.f489636f
            if (r0 == 0) goto L6d
            r0.m154888x41012807()
        L6d:
            si0.b r0 = r4.C
            if (r0 == 0) goto L76
            android.media.MediaPlayer r0 = r0.f489570a
            r0.stop()
        L76:
            si0.b r0 = r4.C
            if (r0 == 0) goto L7f
            android.media.MediaPlayer r0 = r0.f489570a
            r0.release()
        L7f:
            r4.C = r6
            jz5.f0 r6 = jz5.f0.f384359a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: si0.f0.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
