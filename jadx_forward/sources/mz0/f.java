package mz0;

/* loaded from: classes5.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f414476d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f414477e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f414478f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(mz0.b2 b2Var, java.util.List list, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f414477e = b2Var;
        this.f414478f = list;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mz0.f(this.f414477e, this.f414478f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((mz0.f) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0097 A[LOOP:0: B:7:0x0091->B:9:0x0097, LOOP_END] */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r8) {
        /*
            r7 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r7.f414476d
            java.lang.String r2 = "MicroMsg.Template.TemplateControlUIC"
            r3 = 1
            java.util.List r4 = r7.f414478f
            mz0.b2 r5 = r7.f414477e
            if (r1 == 0) goto L1b
            if (r1 != r3) goto L13
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L51
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            java.lang.String r8 = "show wecaht backend list"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r8)
            boolean r8 = r5.m7()
            if (r8 == 0) goto L82
            android.app.Activity r8 = r5.m80379x76847179()
            java.lang.String r1 = "context"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r1)
            pf5.z r1 = pf5.z.f435481a
            boolean r6 = r8 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112
            if (r6 == 0) goto L76
            androidx.appcompat.app.AppCompatActivity r8 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) r8
            pf5.v r8 = r1.a(r8)
            java.lang.Class<dz0.l> r1 = dz0.l.class
            pf5.c r8 = r8.c(r1)
            dz0.l r8 = (dz0.l) r8
            r7.f414476d = r3
            az0.i5 r8 = az0.i5.f97090a
            java.lang.Object r8 = r8.n(r4, r7)
            if (r8 != r0) goto L51
            return r0
        L51:
            java.util.List r8 = (java.util.List) r8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "template list filter before: "
            r0.<init>(r1)
            int r1 = r4.size()
            r0.append(r1)
            java.lang.String r1 = " after: "
            r0.append(r1)
            int r1 = r8.size()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)
            r4 = r8
            goto L82
        L76:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L82:
            java.util.ArrayList r8 = new java.util.ArrayList
            r0 = 10
            int r0 = kz5.d0.q(r4, r0)
            r8.<init>(r0)
            java.util.Iterator r0 = r4.iterator()
        L91:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto La7
            java.lang.Object r1 = r0.next()
            r45.rz6 r1 = (r45.rz6) r1
            com.tencent.mm.mj_template.sns.compose.widget.j5 r2 = com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.k5.f151558m
            com.tencent.mm.mj_template.sns.compose.widget.k5 r1 = r2.c(r1)
            r8.add(r1)
            goto L91
        La7:
            com.tencent.mm.mj_template.sns.compose.widget.m7 r0 = r5.o7()
            r0.c(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: mz0.f.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
