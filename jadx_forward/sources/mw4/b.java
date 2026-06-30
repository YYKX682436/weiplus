package mw4;

/* loaded from: classes.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f413292d;

    /* renamed from: e, reason: collision with root package name */
    public int f413293e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f413294f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f413295g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String str, java.lang.String str2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f413294f = str;
        this.f413295g = str2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mw4.b(this.f413294f, this.f413295g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((mw4.b) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0077, code lost:
    
        if ((r0.length() > 0) == true) goto L26;
     */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r9) {
        /*
            r8 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r8.f413293e
            java.lang.String r2 = "MicroMsg.EmoticonInterceptor"
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L1c
            if (r1 != r4) goto L14
            java.lang.Object r0 = r8.f413292d
            com.tencent.mm.api.IEmojiInfo r0 = (com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L62
        L14:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1c:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            java.lang.String r1 = "md5"
            java.lang.String r5 = r8.f413294f
            r9.putString(r1, r5)
            java.lang.String r1 = "emojiInfoBuf"
            java.lang.String r5 = r8.f413295g
            r9.putString(r1, r5)
            java.lang.String r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a
            java.lang.Class<mw4.d> r5 = mw4.d.class
            android.os.Parcelable r9 = com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(r1, r9, r5)
            com.tencent.mm.api.IEmojiInfo r9 = (com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb) r9
            if (r9 != 0) goto L44
            java.lang.String r9 = "input emojiInfoBuf is invalid"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r9)
            return r3
        L44:
            r8.f413292d = r9
            r8.f413293e = r4
            oz5.n r5 = new oz5.n
            kotlin.coroutines.Continuation r6 = pz5.f.b(r8)
            r5.<init>(r6)
            mw4.a r6 = new mw4.a
            r6.<init>(r5)
            java.lang.Class<mw4.f> r7 = mw4.f.class
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(r1, r9, r7, r6)
            java.lang.Object r9 = r5.a()
            if (r9 != r0) goto L62
            return r0
        L62:
            r0 = r9
            com.tencent.mm.ipcinvoker.type.IPCString r0 = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) r0
            r1 = 0
            if (r0 == 0) goto L7a
            java.lang.String r0 = r0.m46222x9616526c()
            if (r0 == 0) goto L7a
            int r0 = r0.length()
            if (r0 <= 0) goto L76
            r0 = r4
            goto L77
        L76:
            r0 = r1
        L77:
            if (r0 != r4) goto L7a
            goto L7b
        L7a:
            r4 = r1
        L7b:
            if (r4 == 0) goto L7e
            goto L7f
        L7e:
            r9 = r3
        L7f:
            com.tencent.mm.ipcinvoker.type.IPCString r9 = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) r9
            if (r9 == 0) goto L94
            java.lang.String r9 = r9.f149939d     // Catch: java.lang.Exception -> L8c
            r0 = -1
            byte[] r9 = com.p314xaae8f345.mm.vfs.w6.N(r9, r1, r0)     // Catch: java.lang.Exception -> L8c
            r3 = r9
            goto L94
        L8c:
            r9 = move-exception
            java.lang.String r0 = "failed to read emoticon file"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r2, r9, r0, r1)
        L94:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: mw4.b.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
