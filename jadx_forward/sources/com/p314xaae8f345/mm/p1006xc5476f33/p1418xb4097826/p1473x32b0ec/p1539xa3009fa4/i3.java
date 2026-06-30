package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class i3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f198671d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.m3 f198672e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.r2 f198673f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f198674g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.m3 m3Var, p3325xe03a0797.p3326xc267989b.r2 r2Var, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f198672e = m3Var;
        this.f198673f = r2Var;
        this.f198674g = activityC0065xcd7aa112;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.i3(this.f198672e, this.f198673f, this.f198674g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.i3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        if (r1 == null) goto L22;
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
            int r1 = r5.f198671d
            com.tencent.mm.plugin.finder.live.viewmodel.m3 r2 = r5.f198672e
            r3 = 1
            if (r1 == 0) goto L17
            if (r1 != r3) goto Lf
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L23
        Lf:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L17:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            r5.f198671d = r3
            java.lang.Object r6 = r2.U6(r5)
            if (r6 != r0) goto L23
            return r0
        L23:
            jz5.l r6 = (jz5.l) r6
            java.lang.Object r0 = r6.f384366d
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L5f
            kotlinx.coroutines.r2 r0 = r5.f198673f
            r1 = 0
            p3325xe03a0797.p3326xc267989b.p2.a(r0, r1, r3, r1)
            r0 = 0
            r2.f198775f = r0
            r2.X6()
            java.lang.Object r6 = r6.f384367e
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L4e
            int r4 = r6.length()
            if (r4 <= 0) goto L48
            goto L49
        L48:
            r3 = r0
        L49:
            if (r3 == 0) goto L4c
            r1 = r6
        L4c:
            if (r1 != 0) goto L5c
        L4e:
            androidx.appcompat.app.AppCompatActivity r6 = r5.f198674g
            r0 = 2131780989(0x7f10657d, float:1.9193579E38)
            java.lang.String r1 = r6.getString(r0)
            java.lang.String r6 = "getString(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r6)
        L5c:
            r2.V6(r1)
        L5f:
            jz5.f0 r6 = jz5.f0.f384359a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.i3.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
