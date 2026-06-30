package q71;

/* loaded from: classes8.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f441855d;

    /* renamed from: e, reason: collision with root package name */
    public int f441856e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.zi5 f441857f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.q f441858g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(r45.zi5 zi5Var, yz5.q qVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f441857f = zi5Var;
        this.f441858g = qVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new q71.a0(this.f441857f, this.f441858g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((q71.a0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00cc A[RETURN] */
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
            int r1 = r7.f441856e
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L2a
            if (r1 == r5) goto L26
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto Lcd
        L15:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1d:
            java.lang.Object r1 = r7.f441855d
            com.tencent.mm.modelbase.f r1 = (com.p314xaae8f345.mm.p944x882e457a.f) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto Lb7
        L26:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L61
        L2a:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            r45.ui5 r8 = new r45.ui5
            r8.<init>()
            r45.zi5 r1 = r7.f441857f
            r8.f468937d = r1
            com.tencent.mm.modelbase.l r1 = new com.tencent.mm.modelbase.l
            r1.<init>()
            r6 = 415(0x19f, float:5.82E-43)
            r1.f152200d = r6
            java.lang.String r6 = "/cgi-bin/micromsg-bin/rcptinfoadd"
            r1.f152199c = r6
            r1.f152197a = r8
            r45.vi5 r8 = new r45.vi5
            r8.<init>()
            r1.f152198b = r8
            com.tencent.mm.modelbase.o r8 = r1.a()
            com.tencent.mm.modelbase.i r1 = new com.tencent.mm.modelbase.i
            r1.<init>()
            r1.p(r8)
            r7.f441856e = r5
            java.lang.Object r8 = rm0.h.b(r1, r7)
            if (r8 != r0) goto L61
            return r0
        L61:
            r1 = r8
            com.tencent.mm.modelbase.f r1 = (com.p314xaae8f345.mm.p944x882e457a.f) r1
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r6 = "doCgi, errType = "
            r8.<init>(r6)
            int r6 = r1.f152148a
            r8.append(r6)
            java.lang.String r6 = ", errCode = "
            r8.append(r6)
            int r6 = r1.f152149b
            r8.append(r6)
            java.lang.String r6 = ", errMsg = "
            r8.append(r6)
            java.lang.String r6 = r1.f152150c
            r8.append(r6)
            java.lang.String r8 = r8.toString()
            java.lang.String r6 = "MicroMsg.RcptInfoAddCgi"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r6, r8)
            int r8 = r1.f152148a
            if (r8 != 0) goto Lb7
            int r8 = r1.f152149b
            if (r8 != 0) goto Lb7
            com.tencent.mm.protobuf.f r8 = r1.f152151d
            r45.vi5 r8 = (r45.vi5) r8
            r45.yi5 r8 = r8.f469826d
            java.util.LinkedList r8 = r8.f472672e
            if (r8 == 0) goto La0
            goto La1
        La0:
            r5 = 0
        La1:
            if (r5 == 0) goto Lb7
            kotlinx.coroutines.p0 r5 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            kotlinx.coroutines.g3 r5 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            q71.y r6 = new q71.y
            r6.<init>(r8, r4)
            r7.f441855d = r1
            r7.f441856e = r3
            java.lang.Object r8 = p3325xe03a0797.p3326xc267989b.l.g(r5, r6, r7)
            if (r8 != r0) goto Lb7
            return r0
        Lb7:
            kotlinx.coroutines.p0 r8 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            kotlinx.coroutines.g3 r8 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            q71.z r3 = new q71.z
            yz5.q r5 = r7.f441858g
            r3.<init>(r5, r1, r4)
            r7.f441855d = r4
            r7.f441856e = r2
            java.lang.Object r8 = p3325xe03a0797.p3326xc267989b.l.g(r8, r3, r7)
            if (r8 != r0) goto Lcd
            return r0
        Lcd:
            jz5.f0 r8 = jz5.f0.f384359a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: q71.a0.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
