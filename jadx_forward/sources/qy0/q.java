package qy0;

/* loaded from: classes5.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f449170d;

    /* renamed from: e, reason: collision with root package name */
    public int f449171e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qy0.d0 f449172f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(qy0.d0 d0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f449172f = d0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qy0.q(this.f449172f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((qy0.q) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x009a A[LOOP:0: B:8:0x0094->B:10:0x009a, LOOP_END] */
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
            int r1 = r6.f449171e
            r2 = 2
            r3 = 1
            qy0.d0 r4 = r6.f449172f
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            java.lang.Object r0 = r6.f449170d
            java.util.List r0 = (java.util.List) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L73
        L16:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1e:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L33
        L22:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            nz0.o r7 = nz0.o.f423063a
            r6.f449171e = r3
            r1 = 0
            java.lang.String r3 = "cache_key_finder_album"
            java.lang.Object r7 = r7.c(r1, r3, r6)
            if (r7 != r0) goto L33
            return r0
        L33:
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto Lae
            jz5.g r1 = r4.f449110s
            jz5.n r1 = (jz5.n) r1
            java.lang.Object r1 = r1.mo141623x754a37bb()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L82
            android.app.Activity r1 = r4.m80379x76847179()
            java.lang.String r3 = "context"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r1, r3)
            pf5.z r3 = pf5.z.f435481a
            boolean r5 = r1 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112
            if (r5 == 0) goto L76
            androidx.appcompat.app.AppCompatActivity r1 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) r1
            pf5.v r1 = r3.a(r1)
            java.lang.Class<dz0.l> r3 = dz0.l.class
            pf5.c r1 = r1.c(r3)
            dz0.l r1 = (dz0.l) r1
            r6.f449170d = r7
            r6.f449171e = r2
            az0.i5 r1 = az0.i5.f97090a
            java.lang.Object r1 = r1.n(r7, r6)
            if (r1 != r0) goto L71
            return r0
        L71:
            r0 = r7
            r7 = r1
        L73:
            java.util.List r7 = (java.util.List) r7
            goto L83
        L76:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L82:
            r0 = r7
        L83:
            com.tencent.mm.mj_template.sns.compose.widget.m7 r1 = r4.f449116y
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = kz5.d0.q(r7, r3)
            r2.<init>(r3)
            java.util.Iterator r7 = r7.iterator()
        L94:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto Laa
            java.lang.Object r3 = r7.next()
            r45.rz6 r3 = (r45.rz6) r3
            com.tencent.mm.mj_template.sns.compose.widget.j5 r4 = com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.k5.f151558m
            com.tencent.mm.mj_template.sns.compose.widget.k5 r3 = r4.c(r3)
            r2.add(r3)
            goto L94
        Laa:
            r1.c(r2)
            r7 = r0
        Lae:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "loadNoRecommendList: "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = "MaasMultiTemplate.MaasAlbumMultiTemplateOverlayUIC"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r7)
            jz5.f0 r7 = jz5.f0.f384359a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: qy0.q.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
