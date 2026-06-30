package df2;

/* loaded from: classes5.dex */
public final class ba extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f311322d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.zb f311323e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f311324f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, df2.zb zbVar, java.lang.String str) {
        super(2, interfaceC29045xdcb5ca57);
        this.f311322d = hVar;
        this.f311323e = zbVar;
        this.f311324f = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.ba(this.f311322d, interfaceC29045xdcb5ca57, this.f311323e, this.f311324f);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        df2.ba baVar = (df2.ba) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        baVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d3  */
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
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            xg2.h r8 = r7.f311322d
            xg2.i r8 = (xg2.i) r8
            java.lang.Object r8 = r8.f535926b
            r45.ye1 r8 = (r45.ye1) r8
            r0 = 1
            java.util.LinkedList r8 = r8.m75941xfb821914(r0)
            r1 = 0
            r2 = 0
            if (r8 == 0) goto L38
            java.util.Iterator r8 = r8.iterator()
        L1a:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L34
            java.lang.Object r3 = r8.next()
            r4 = r3
            r45.ze1 r4 = (r45.ze1) r4
            int r4 = r4.m75939xb282bd08(r2)
            r5 = 5
            if (r4 != r5) goto L30
            r4 = r0
            goto L31
        L30:
            r4 = r2
        L31:
            if (r4 == 0) goto L1a
            goto L35
        L34:
            r3 = r1
        L35:
            r45.ze1 r3 = (r45.ze1) r3
            goto L39
        L38:
            r3 = r1
        L39:
            df2.zb r8 = r7.f311323e
            if (r3 == 0) goto Lb3
            int r4 = r3.m75939xb282bd08(r0)
            if (r4 != 0) goto Lb3
            r4 = 3
            com.tencent.mm.protobuf.g r3 = r3.m75934xbce7f2f(r4)     // Catch: java.lang.Exception -> L9a
            if (r3 == 0) goto L4e
            byte[] r1 = r3.g()     // Catch: java.lang.Exception -> L9a
        L4e:
            if (r1 != 0) goto L52
            byte[] r1 = new byte[r2]     // Catch: java.lang.Exception -> L9a
        L52:
            r45.kf1 r3 = new r45.kf1     // Catch: java.lang.Exception -> L9a
            r3.<init>()     // Catch: java.lang.Exception -> L9a
            r3.mo11468x92b714fd(r1)     // Catch: java.lang.Exception -> L9a
            boolean r1 = r3.m75933x41a8a7f2(r2)     // Catch: java.lang.Exception -> L9a
            if (r1 != r0) goto L62
            r1 = r0
            goto L63
        L62:
            r1 = r2
        L63:
            java.lang.String r4 = r8.f313472m     // Catch: java.lang.Exception -> L97
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L97
            r5.<init>()     // Catch: java.lang.Exception -> L97
            java.lang.String r6 = "[aiAssistant] doStartDialog: bizSuccess="
            r5.append(r6)     // Catch: java.lang.Exception -> L97
            if (r1 == 0) goto L72
            r2 = r0
        L72:
            r5.append(r2)     // Catch: java.lang.Exception -> L97
            java.lang.String r2 = ", task_id="
            r5.append(r2)     // Catch: java.lang.Exception -> L97
            java.lang.String r0 = r3.m75945x2fec8307(r0)     // Catch: java.lang.Exception -> L97
            r5.append(r0)     // Catch: java.lang.Exception -> L97
            java.lang.String r0 = ", err_msg="
            r5.append(r0)     // Catch: java.lang.Exception -> L97
            r0 = 2
            java.lang.String r0 = r3.m75945x2fec8307(r0)     // Catch: java.lang.Exception -> L97
            r5.append(r0)     // Catch: java.lang.Exception -> L97
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Exception -> L97
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r0)     // Catch: java.lang.Exception -> L97
            r2 = r1
            goto Ld1
        L97:
            r0 = move-exception
            r2 = r1
            goto L9b
        L9a:
            r0 = move-exception
        L9b:
            java.lang.String r1 = r8.f313472m
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "[aiAssistant] doStartDialog: parse result failed: "
            r3.<init>(r4)
            java.lang.String r0 = r0.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r0)
            goto Ld1
        Lb3:
            java.lang.String r4 = r8.f313472m
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "[aiAssistant] doStartDialog: action result invalid, ret_code="
            r5.<init>(r6)
            if (r3 == 0) goto Lc7
            int r0 = r3.m75939xb282bd08(r0)
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
        Lc7:
            r5.append(r1)
            java.lang.String r0 = r5.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r4, r0)
        Ld1:
            if (r2 != 0) goto Ldd
            java.util.Set r0 = r8.f313474o
            java.lang.String r1 = r7.f311324f
            r0.remove(r1)
            df2.zb.Z6(r8, r1)
        Ldd:
            jz5.f0 r8 = jz5.f0.f384359a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.ba.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
