package pp4;

/* loaded from: classes10.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f439048d;

    /* renamed from: e, reason: collision with root package name */
    public int f439049e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f439050f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2334x43cb00ee.p2336x683188c.C18816x3a93c0f9 f439051g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f439052h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f439053i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f439054m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2334x43cb00ee.p2336x683188c.C18816x3a93c0f9 c18816x3a93c0f9, java.lang.Long l17, long j17, long j18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f439051g = c18816x3a93c0f9;
        this.f439052h = l17;
        this.f439053i = j17;
        this.f439054m = j18;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        pp4.d dVar = new pp4.d(this.f439051g, this.f439052h, this.f439053i, this.f439054m, interfaceC29045xdcb5ca57);
        dVar.f439050f = obj;
        return dVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((pp4.d) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
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
            int r1 = r14.f439049e
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L25
            if (r1 == r3) goto L19
            if (r1 != r2) goto L11
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r15)
            goto Ld0
        L11:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L19:
            long r3 = r14.f439048d
            java.lang.Object r1 = r14.f439050f
            kotlinx.coroutines.y0 r1 = (p3325xe03a0797.p3326xc267989b.y0) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r15)
            r9 = r3
            r3 = r1
            goto L5c
        L25:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r15)
            java.lang.Object r15 = r14.f439050f
            r1 = r15
            kotlinx.coroutines.y0 r1 = (p3325xe03a0797.p3326xc267989b.y0) r1
            long r4 = java.lang.System.currentTimeMillis()
            com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout r15 = r14.f439051g
            java.lang.Class<lp4.u> r6 = lp4.u.class
            yt3.r2 r15 = r15.j(r6)
            r12 = r15
            lp4.u r12 = (lp4.u) r12
            if (r12 == 0) goto Ld0
            java.lang.Long r11 = r14.f439052h
            long r7 = r14.f439053i
            long r9 = r14.f439054m
            r14.f439050f = r1
            r14.f439048d = r4
            r14.f439049e = r3
            kotlinx.coroutines.p0 r15 = p3325xe03a0797.p3326xc267989b.q1.f392103c
            lp4.t r3 = new lp4.t
            r13 = 0
            r6 = r3
            r6.<init>(r7, r9, r11, r12, r13)
            java.lang.Object r15 = p3325xe03a0797.p3326xc267989b.l.g(r15, r3, r14)
            if (r15 != r0) goto L5a
            return r0
        L5a:
            r3 = r1
            r9 = r4
        L5c:
            rm5.v r15 = (rm5.v) r15
            if (r15 == 0) goto Ld0
            com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout r1 = r14.f439051g
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "jni updateTrackDuration coast:"
            r4.<init>(r5)
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r9
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r11 = "MicroMsg.TimelineProfile"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r11, r4)
            r4 = 0
            r5 = 0
            pp4.b r6 = new pp4.b
            r12 = 0
            r6.<init>(r1, r15, r12)
            r7 = 3
            r8 = 0
            p3325xe03a0797.p3326xc267989b.l.b(r3, r4, r5, r6, r7, r8)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "updateComposition:"
            r3.<init>(r4)
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r9
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r11, r3)
            com.tencent.mm.plugin.vlog.model.h1 r6 = np4.a.a(r15)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r3 = "videoComposition2VLogComposition coast:"
            r15.<init>(r3)
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r9
            r15.append(r3)
            java.lang.String r15 = r15.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r11, r15)
            kotlinx.coroutines.g3 r15 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            pp4.c r3 = new pp4.c
            r11 = 0
            r4 = r3
            r5 = r1
            r7 = r9
            r9 = r11
            r4.<init>(r5, r6, r7, r9)
            r14.f439050f = r12
            r14.f439049e = r2
            java.lang.Object r15 = p3325xe03a0797.p3326xc267989b.l.g(r15, r3, r14)
            if (r15 != r0) goto Ld0
            return r0
        Ld0:
            jz5.f0 r15 = jz5.f0.f384359a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: pp4.d.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
