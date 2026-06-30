package dz0;

/* loaded from: classes5.dex */
public final class g0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f326377d;

    /* renamed from: e, reason: collision with root package name */
    public int f326378e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b f326379f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m5 f326380g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ dz0.k0 f326381h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f326382i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f326383m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.e0 f326384n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b c11015x5b190a3b, com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m5 m5Var, dz0.k0 k0Var, yz5.l lVar, java.lang.String str, p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f326379f = c11015x5b190a3b;
        this.f326380g = m5Var;
        this.f326381h = k0Var;
        this.f326382i = lVar;
        this.f326383m = str;
        this.f326384n = e0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new dz0.g0(this.f326379f, this.f326380g, this.f326381h, this.f326382i, this.f326383m, this.f326384n, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((dz0.g0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x00cc  */
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
            int r1 = r10.f326378e
            java.lang.String r2 = r10.f326383m
            kotlin.jvm.internal.e0 r3 = r10.f326384n
            dz0.k0 r4 = r10.f326381h
            r5 = 2
            r6 = 1
            com.tencent.mm.mj_template.maas.uic.MaasSdkUIC r7 = r10.f326379f
            if (r1 == 0) goto L27
            if (r1 == r6) goto L23
            if (r1 != r5) goto L1b
            long r0 = r10.f326377d
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            goto Lae
        L1b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L23:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            goto L3a
        L27:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            dz0.f0 r11 = new dz0.f0
            r11.<init>(r3, r7, r4, r2)
            r10.f326378e = r6
            com.tencent.mm.mj_template.sns.compose.widget.m5 r1 = r10.f326380g
            java.lang.Object r11 = r7.e7(r1, r11, r10)
            if (r11 != r0) goto L3a
            return r0
        L3a:
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            if (r11 == 0) goto L9a
            az0.e r0 = r4.f326435a
            if (r0 == 0) goto L4d
            java.lang.String r1 = r4.f326439e
            mz0.w1 r0 = (mz0.w1) r0
            r0.b(r1)
        L4d:
            yz5.l r0 = r10.f326382i
            if (r0 == 0) goto L56
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.mo146xb9724478(r1)
        L56:
            r0 = -8
            if (r11 != r0) goto L60
            r0 = 2131757757(0x7f100abd, float:1.9146459E38)
            r7.r7(r0)
            goto L66
        L60:
            r0 = 2131771685(0x7f104125, float:1.9174708E38)
            r7.r7(r0)
        L66:
            az0.yb r0 = new az0.yb
            r1 = 0
            r2 = 0
            r3 = 3
            r0.<init>(r1, r2, r3, r2)
            r0.f97623a = r1
            com.tencent.mm.autogen.mmdata.rpt.MaasAITemplateMakeReportStruct r1 = oy0.a.f431366a
            if (r1 != 0) goto L75
            goto L81
        L75:
            if (r11 == 0) goto L7e
            r4 = 1000(0x3e8, float:1.401E-42)
            if (r11 == r4) goto L7c
            goto L7f
        L7c:
            r5 = r3
            goto L7f
        L7e:
            r5 = r6
        L7f:
            r1.f140502d = r5
        L81:
            if (r1 != 0) goto L84
            goto L90
        L84:
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.String r3 = "failReason"
            java.lang.String r11 = r1.b(r3, r11, r6)
            r1.f140510l = r11
        L90:
            com.tencent.mm.autogen.mmdata.rpt.MaasAITemplateMakeReportStruct r11 = oy0.a.f431366a
            if (r11 == 0) goto L97
            r11.k()
        L97:
            oy0.a.f431366a = r2
            return r0
        L9a:
            long r8 = java.lang.System.currentTimeMillis()
            az0.e r11 = r4.f326435a
            float r1 = r3.f391648d
            r10.f326377d = r8
            r10.f326378e = r5
            java.lang.Object r11 = r7.T6(r2, r11, r1, r10)
            if (r11 != r0) goto Lad
            return r0
        Lad:
            r0 = r8
        Lae:
            az0.yb r11 = (az0.yb) r11
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "addMaasSwitchTemplateCostMs:"
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.AITemplateReportUtils"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            com.tencent.mm.autogen.mmdata.rpt.MaasAITemplateMakeReportStruct r0 = oy0.a.f431366a
            if (r0 == 0) goto Ld1
            long r4 = r0.f140509k
            long r4 = r4 + r2
            r0.f140509k = r4
        Ld1:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: dz0.g0.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
