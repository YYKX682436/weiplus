package qz0;

/* loaded from: classes.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f449353d;

    /* renamed from: e, reason: collision with root package name */
    public int f449354e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ny0.f f449355f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.p929x364492.ActivityC11028x640d33e0 f449356g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ny0.f fVar, com.p314xaae8f345.mm.p916x4268f0dc.p929x364492.ActivityC11028x640d33e0 activityC11028x640d33e0, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f449355f = fVar;
        this.f449356g = activityC11028x640d33e0;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qz0.f(this.f449355f, this.f449356g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((qz0.f) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r10) {
        /*
            r9 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r9.f449354e
            jz5.f0 r2 = jz5.f0.f384359a
            com.tencent.mm.mj_template.test.TemplateTestUI r3 = r9.f449356g
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r1 == 0) goto L2c
            if (r1 == r6) goto L24
            if (r1 == r5) goto L20
            if (r1 != r4) goto L18
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L7f
        L18:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L20:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)     // Catch: java.lang.Throwable -> L5a
            goto L55
        L24:
            java.lang.Object r1 = r9.f449353d
            com.tencent.mm.mj_template.test.TemplateTestUI r1 = (com.p314xaae8f345.mm.p916x4268f0dc.p929x364492.ActivityC11028x640d33e0) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)     // Catch: java.lang.Throwable -> L5a
            goto L3f
        L2c:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            ny0.f r10 = r9.f449355f
            kotlin.Result$Companion r1 = p3321xbce91901.C29043x91b2b43d.INSTANCE     // Catch: java.lang.Throwable -> L5a
            r9.f449353d = r3     // Catch: java.lang.Throwable -> L5a
            r9.f449354e = r6     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r10 = r10.c(r7, r9)     // Catch: java.lang.Throwable -> L5a
            if (r10 != r0) goto L3e
            return r0
        L3e:
            r1 = r3
        L3f:
            ny0.e r10 = (ny0.e) r10     // Catch: java.lang.Throwable -> L5a
            kotlinx.coroutines.p0 r6 = p3325xe03a0797.p3326xc267989b.q1.f392101a     // Catch: java.lang.Throwable -> L5a
            kotlinx.coroutines.g3 r6 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a     // Catch: java.lang.Throwable -> L5a
            qz0.d r8 = new qz0.d     // Catch: java.lang.Throwable -> L5a
            r8.<init>(r1, r10, r7)     // Catch: java.lang.Throwable -> L5a
            r9.f449353d = r7     // Catch: java.lang.Throwable -> L5a
            r9.f449354e = r5     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r10 = p3325xe03a0797.p3326xc267989b.l.g(r6, r8, r9)     // Catch: java.lang.Throwable -> L5a
            if (r10 != r0) goto L55
            return r0
        L55:
            java.lang.Object r10 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r2)     // Catch: java.lang.Throwable -> L5a
            goto L65
        L5a:
            r10 = move-exception
            kotlin.Result$Companion r1 = p3321xbce91901.C29043x91b2b43d.INSTANCE
            java.lang.Object r10 = p3321xbce91901.C29044xefd6a286.m143914x452354ee(r10)
            java.lang.Object r10 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r10)
        L65:
            java.lang.Throwable r1 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(r10)
            if (r1 == 0) goto L7f
            kotlinx.coroutines.p0 r5 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            kotlinx.coroutines.g3 r5 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            qz0.e r6 = new qz0.e
            r6.<init>(r3, r1, r7)
            r9.f449353d = r10
            r9.f449354e = r4
            java.lang.Object r10 = p3325xe03a0797.p3326xc267989b.l.g(r5, r6, r9)
            if (r10 != r0) goto L7f
            return r0
        L7f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: qz0.f.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
