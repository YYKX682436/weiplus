package ef0;

/* loaded from: classes2.dex */
public final class h4 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vk4.c f333761a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.q f333762b;

    public h4(vk4.c cVar, yz5.q qVar) {
        this.f333761a = cVar;
        this.f333762b = qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0061  */
    @Override // gm5.a
    /* renamed from: call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object r10) {
        /*
            r9 = this;
            com.tencent.mm.modelbase.f r10 = (com.p314xaae8f345.mm.p944x882e457a.f) r10
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "fetchListenItem callback errType: "
            r0.<init>(r1)
            int r1 = r10.f152148a
            r0.append(r1)
            java.lang.String r1 = ", errCode: "
            r0.append(r1)
            int r1 = r10.f152149b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.TingUtilService"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            int r0 = r10.f152148a
            java.lang.String r2 = ""
            yz5.q r3 = r9.f333762b
            r4 = 0
            if (r0 != 0) goto Lb0
            int r0 = r10.f152149b
            if (r0 != 0) goto Lb0
            vk4.c r0 = r9.f333761a
            r0.getClass()
            r5 = 0
            com.tencent.mm.modelbase.o r0 = r0.f152179f     // Catch: java.lang.Throwable -> L51
            com.tencent.mm.modelbase.n r0 = r0.f152244b     // Catch: java.lang.Throwable -> L51
            com.tencent.mm.protobuf.f r0 = r0.f152233a     // Catch: java.lang.Throwable -> L51
            boolean r6 = r0 instanceof qk.t9     // Catch: java.lang.Throwable -> L51
            if (r6 == 0) goto L41
            qk.t9 r0 = (qk.t9) r0     // Catch: java.lang.Throwable -> L51
            goto L42
        L41:
            r0 = r4
        L42:
            if (r0 == 0) goto L5b
            byte[] r0 = r0.f445871d     // Catch: java.lang.Throwable -> L51
            if (r0 == 0) goto L5b
            bw5.z70 r6 = new bw5.z70     // Catch: java.lang.Throwable -> L51
            r6.<init>()     // Catch: java.lang.Throwable -> L51
            r6.mo11468x92b714fd(r0)     // Catch: java.lang.Throwable -> L51
            goto L5c
        L51:
            r0 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.String r7 = "MicroMsg.TingFetchListenItemCGI"
            java.lang.String r8 = "getResponse exception"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r7, r0, r8, r6)
        L5b:
            r6 = r4
        L5c:
            if (r6 == 0) goto L61
            java.util.LinkedList r0 = r6.f117382d
            goto L62
        L61:
            r0 = r4
        L62:
            if (r0 == 0) goto L6a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L6b
        L6a:
            r5 = 1
        L6b:
            if (r5 != 0) goto Lab
            if (r6 == 0) goto L8b
            java.util.LinkedList r10 = r6.f117382d
            if (r10 == 0) goto L8b
            java.lang.Object r10 = kz5.n0.Z(r10)
            bw5.y70 r10 = (bw5.y70) r10
            if (r10 == 0) goto L8b
            boolean[] r0 = r10.f116928g
            r5 = 2
            boolean r0 = r0[r5]
            if (r0 == 0) goto L85
            bw5.v70 r10 = r10.f116926e
            goto L8c
        L85:
            bw5.v70 r10 = new bw5.v70
            r10.<init>()
            goto L8c
        L8b:
            r10 = r4
        L8c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r5 = "fetchListenItem callback resultListenItem.listenId: "
            r0.<init>(r5)
            if (r10 == 0) goto L99
            java.lang.String r4 = r10.m13170xcc16feb8()
        L99:
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            if (r3 == 0) goto Lbd
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r3.mo147xb9724478(r0, r2, r10)
            goto Lbd
        Lab:
            java.lang.String r0 = "fetchListenItem failed"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r0)
        Lb0:
            if (r3 == 0) goto Lbd
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            java.lang.String r10 = r10.f152150c
            if (r10 != 0) goto Lb9
            goto Lba
        Lb9:
            r2 = r10
        Lba:
            r3.mo147xb9724478(r0, r2, r4)
        Lbd:
            jz5.f0 r10 = jz5.f0.f384359a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ef0.h4.mo1059x2e7a5e(java.lang.Object):java.lang.Object");
    }
}
