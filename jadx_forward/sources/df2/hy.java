package df2;

/* loaded from: classes10.dex */
public final class hy extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f311893d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f311894e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f311895f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1663x2eb9da.C15393xd4ca7d1b f311896g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ df2.wy f311897h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hy(p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1663x2eb9da.C15393xd4ca7d1b c15393xd4ca7d1b, df2.wy wyVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f311895f = f0Var;
        this.f311896g = c15393xd4ca7d1b;
        this.f311897h = wyVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        df2.hy hyVar = new df2.hy(this.f311895f, this.f311896g, this.f311897h, interfaceC29045xdcb5ca57);
        hyVar.f311894e = obj;
        return hyVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.hy) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0033 -> B:5:0x0036). Please report as a decompilation issue!!! */
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
            int r1 = r5.f311893d
            r2 = 1
            if (r1 == 0) goto L1a
            if (r1 != r2) goto L12
            java.lang.Object r1 = r5.f311894e
            kotlinx.coroutines.y0 r1 = (p3325xe03a0797.p3326xc267989b.y0) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            r6 = r5
            goto L36
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            java.lang.Object r6 = r5.f311894e
            kotlinx.coroutines.y0 r6 = (p3325xe03a0797.p3326xc267989b.y0) r6
            r1 = r6
            r6 = r5
        L23:
            kotlin.jvm.internal.f0 r3 = r6.f311895f
            int r3 = r3.f391649d
            if (r3 <= 0) goto L44
            r6.f311894e = r1
            r6.f311893d = r2
            r3 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r3 = p3325xe03a0797.p3326xc267989b.k1.b(r3, r6)
            if (r3 != r0) goto L36
            return r0
        L36:
            kotlin.jvm.internal.f0 r3 = r6.f311895f
            int r4 = r3.f391649d
            int r4 = r4 + (-1)
            r3.f391649d = r4
            com.tencent.mm.plugin.finder.view.crit.LivePkCritDoingView r3 = r6.f311896g
            r3.m(r4)
            goto L23
        L44:
            p3325xe03a0797.p3326xc267989b.z0.g(r1)
            df2.wy r6 = r6.f311897h
            java.lang.String r0 = r6.f313269m
            java.lang.String r1 = "onCritQuestInfoChanged STAGE_QUEST_PROCESSING countDown finish"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)
            r6.l7()
            r0 = 3
            r6.f313270n = r0
            jz5.f0 r6 = jz5.f0.f384359a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.hy.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
