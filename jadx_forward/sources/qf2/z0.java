package qf2;

/* loaded from: classes.dex */
public final class z0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f444206d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qf2.y1 f444207e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f444208f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, qf2.y1 y1Var, yz5.l lVar) {
        super(2, interfaceC29045xdcb5ca57);
        this.f444206d = hVar;
        this.f444207e = y1Var;
        this.f444208f = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qf2.z0(this.f444206d, interfaceC29045xdcb5ca57, this.f444207e, this.f444208f);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        qf2.z0 z0Var = (qf2.z0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        z0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if (r0 == null) goto L14;
     */
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
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            xg2.h r6 = r5.f444206d
            xg2.b r6 = (xg2.b) r6
            java.lang.Object r6 = r6.f535914b
            xg2.a r6 = (xg2.a) r6
            rm0.j r0 = r6.f535912a
            r1 = 0
            qf2.y1 r2 = r5.f444207e
            if (r0 == 0) goto L27
            java.lang.String r0 = r0.f478959g
            if (r0 == 0) goto L27
            int r3 = r0.length()
            if (r3 <= 0) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = r1
        L21:
            if (r3 == 0) goto L24
            goto L25
        L24:
            r0 = 0
        L25:
            if (r0 != 0) goto L3b
        L27:
            android.content.Context r0 = r2.O6()
            android.content.res.Resources r0 = r0.getResources()
            r3 = 2131763140(0x7f101fc4, float:1.9157377E38)
            java.lang.String r0 = r0.getString(r3)
            java.lang.String r3 = "getString(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r3)
        L3b:
            rm0.j r6 = r6.f535912a
            if (r6 == 0) goto L42
            int r3 = r6.f478958f
            goto L43
        L42:
            r3 = r1
        L43:
            if (r6 == 0) goto L47
            int r1 = r6.f478957e
        L47:
            java.lang.Class<com.tencent.mm.plugin.finder.live.plugin.na> r6 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.na.class
            com.tencent.mm.plugin.finder.live.plugin.l r6 = r2.R6(r6)
            com.tencent.mm.plugin.finder.live.plugin.na r6 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.na) r6
            if (r6 == 0) goto L54
            r6.y1()
        L54:
            java.lang.Class<com.tencent.mm.plugin.finder.live.plugin.x7> r6 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7.class
            com.tencent.mm.plugin.finder.live.plugin.l r6 = r2.R6(r6)
            com.tencent.mm.plugin.finder.live.plugin.x7 r6 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7) r6
            if (r6 == 0) goto L62
            r4 = 2
            r6.H1(r4)
        L62:
            android.content.Context r6 = r2.O6()
            db5.t7.g(r6, r0)
            yz5.l r6 = r5.f444208f
            if (r6 == 0) goto L72
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r6.mo146xb9724478(r2)
        L72:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r2 = "anchorNewAcceptBattle fail, errCode: "
            r6.<init>(r2)
            r6.append(r3)
            java.lang.String r2 = " errMsg: "
            r6.append(r2)
            r6.append(r0)
            java.lang.String r0 = " errType: "
            r6.append(r0)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            java.lang.String r0 = "FinderLiveMicAnchorBattlePkController"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r6)
            jz5.f0 r6 = jz5.f0.f384359a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: qf2.z0.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
