package wc5;

/* loaded from: classes10.dex */
public final class w0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f526183d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f526184e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wc5.y0 f526185f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(wc5.y0 y0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f526185f = y0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        wc5.w0 w0Var = new wc5.w0(this.f526185f, interfaceC29045xdcb5ca57);
        w0Var.f526184e = obj;
        return w0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((wc5.w0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x009a  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r0 = "imageIdentify: toIdentify="
            pz5.a r1 = pz5.a.f440719d
            int r2 = r8.f526183d
            r3 = 0
            java.lang.String r4 = "MicroMsg.MsgHistoryGallerySearchFilterUIC"
            jz5.f0 r5 = jz5.f0.f384359a
            r6 = 1
            if (r2 == 0) goto L1c
            if (r2 != r6) goto L14
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)     // Catch: java.lang.Throwable -> L89
            goto L81
        L14:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1c:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            java.lang.Object r9 = r8.f526184e
            kotlinx.coroutines.y0 r9 = (p3325xe03a0797.p3326xc267989b.y0) r9
            wc5.y0 r2 = r8.f526185f
            kotlin.Result$Companion r7 = p3321xbce91901.C29043x91b2b43d.INSTANCE     // Catch: java.lang.Throwable -> L89
            nc5.a r7 = nc5.a.f417721a     // Catch: java.lang.Throwable -> L89
            uc5.r r2 = r2.U6()     // Catch: java.lang.Throwable -> L89
            com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI r2 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3) r2     // Catch: java.lang.Throwable -> L89
            java.lang.String r2 = r2.j7()     // Catch: java.lang.Throwable -> L89
            android.util.Pair r2 = r7.g(r2, r3)     // Catch: java.lang.Throwable -> L89
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L89
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L89
            java.lang.Object r0 = r2.first     // Catch: java.lang.Throwable -> L89
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> L89
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L89
            r7.append(r0)     // Catch: java.lang.Throwable -> L89
            java.lang.String r0 = ", oldData="
            r7.append(r0)     // Catch: java.lang.Throwable -> L89
            java.lang.Object r0 = r2.second     // Catch: java.lang.Throwable -> L89
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> L89
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L89
            r7.append(r0)     // Catch: java.lang.Throwable -> L89
            java.lang.String r0 = r7.toString()     // Catch: java.lang.Throwable -> L89
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r0)     // Catch: java.lang.Throwable -> L89
            p3325xe03a0797.p3326xc267989b.z0.g(r9)     // Catch: java.lang.Throwable -> L89
            aq.n r9 = aq.o.f94455c     // Catch: java.lang.Throwable -> L89
            if (r9 == 0) goto L83
            java.lang.Object r0 = r2.first     // Catch: java.lang.Throwable -> L89
            java.lang.String r7 = "first"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r7)     // Catch: java.lang.Throwable -> L89
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> L89
            java.lang.Object r2 = r2.second     // Catch: java.lang.Throwable -> L89
            java.lang.String r7 = "second"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r7)     // Catch: java.lang.Throwable -> L89
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch: java.lang.Throwable -> L89
            r8.f526183d = r6     // Catch: java.lang.Throwable -> L89
            java.lang.Object r9 = r9.c(r0, r2, r8)     // Catch: java.lang.Throwable -> L89
            if (r9 != r1) goto L81
            return r1
        L81:
            r9 = r5
            goto L84
        L83:
            r9 = 0
        L84:
            java.lang.Object r9 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r9)     // Catch: java.lang.Throwable -> L89
            goto L94
        L89:
            r9 = move-exception
            kotlin.Result$Companion r0 = p3321xbce91901.C29043x91b2b43d.INSTANCE
            java.lang.Object r9 = p3321xbce91901.C29044xefd6a286.m143914x452354ee(r9)
            java.lang.Object r9 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r9)
        L94:
            java.lang.Throwable r9 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(r9)
            if (r9 == 0) goto La2
            java.lang.String r0 = "startBackgroundImageIdentify failed"
            java.lang.Object[] r1 = new java.lang.Object[r3]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r4, r9, r0, r1)
        La2:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: wc5.w0.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
