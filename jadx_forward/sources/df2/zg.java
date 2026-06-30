package df2;

/* loaded from: classes3.dex */
public final class zg extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f313499d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.bh f313500e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zg(df2.bh bhVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f313500e = bhVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.zg(this.f313500e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.zg) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:5:0x002e). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r14) {
        /*
            r13 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r13.f313499d
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            r1 = r0
            r0 = r13
            goto L2e
        Lf:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L17:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            r14 = r13
        L1b:
            df2.bh r1 = r14.f313500e
            u26.w r1 = r1.f311339o
            r14.f313499d = r2
            u26.k r1 = (u26.k) r1
            java.lang.Object r1 = r1.r(r14)
            if (r1 != r0) goto L2a
            return r0
        L2a:
            r12 = r0
            r0 = r14
            r14 = r1
            r1 = r12
        L2e:
            jz5.l r14 = (jz5.l) r14
            df2.bh r3 = r0.f313500e
            java.lang.String r4 = r3.f311337m
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "loc = "
            r5.<init>(r6)
            r5.append(r14)
            java.lang.String r6 = ", isEmpty = "
            r5.append(r6)
            u26.w r6 = r3.f311339o
            boolean r6 = r6.mo167477x7aab3243()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r5)
            df2.bh r6 = r0.f313500e
            r7 = 0
            r8 = 0
            df2.yg r9 = new df2.yg
            r4 = 0
            r9.<init>(r6, r14, r4)
            r10 = 3
            r11 = 0
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(r6, r7, r8, r9, r10, r11)
            java.lang.String r14 = r3.f311337m
            java.lang.String r3 = "receive end"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r14, r3)
            r14 = r0
            r0 = r1
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.zg.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
