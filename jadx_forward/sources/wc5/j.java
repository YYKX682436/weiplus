package wc5;

/* loaded from: classes10.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f526114d;

    /* renamed from: e, reason: collision with root package name */
    public int f526115e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f526116f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wc5.q f526117g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(wc5.q qVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f526117g = qVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        wc5.j jVar = new wc5.j(this.f526117g, interfaceC29045xdcb5ca57);
        jVar.f526116f = obj;
        return jVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((wc5.j) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0080  */
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
            int r1 = r8.f526115e
            r2 = 2
            r3 = 1
            jz5.f0 r4 = jz5.f0.f384359a
            r5 = 0
            if (r1 == 0) goto L27
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)     // Catch: java.lang.Throwable -> L6f
            goto L6a
        L13:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1b:
            java.lang.Object r1 = r8.f526114d
            com.tencent.mm.plugin.mvvmlist.MvvmList r1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe) r1
            java.lang.Object r3 = r8.f526116f
            wc5.q r3 = (wc5.q) r3
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)     // Catch: java.lang.Throwable -> L6f
            goto L54
        L27:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            java.lang.Object r9 = r8.f526116f
            kotlinx.coroutines.y0 r9 = (p3325xe03a0797.p3326xc267989b.y0) r9
            wc5.q r9 = r8.f526117g
            kotlin.Result$Companion r1 = p3321xbce91901.C29043x91b2b43d.INSTANCE     // Catch: java.lang.Throwable -> L6f
            uc5.r r1 = r9.X6()     // Catch: java.lang.Throwable -> L6f
            com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI r1 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3) r1     // Catch: java.lang.Throwable -> L6f
            com.tencent.mm.plugin.mvvmlist.MvvmList r1 = r1.l7()     // Catch: java.lang.Throwable -> L6f
            if (r1 != 0) goto L3f
            return r4
        L3f:
            kotlinx.coroutines.flow.n2 r6 = r1.f233605v     // Catch: java.lang.Throwable -> L6f
            wc5.h r7 = new wc5.h     // Catch: java.lang.Throwable -> L6f
            r7.<init>(r5)     // Catch: java.lang.Throwable -> L6f
            r8.f526116f = r9     // Catch: java.lang.Throwable -> L6f
            r8.f526114d = r1     // Catch: java.lang.Throwable -> L6f
            r8.f526115e = r3     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r3 = p3325xe03a0797.p3326xc267989b.p3328x30012e.l.l(r6, r7, r8)     // Catch: java.lang.Throwable -> L6f
            if (r3 != r0) goto L53
            return r0
        L53:
            r3 = r9
        L54:
            kotlinx.coroutines.p0 r9 = p3325xe03a0797.p3326xc267989b.q1.f392101a     // Catch: java.lang.Throwable -> L6f
            kotlinx.coroutines.g3 r9 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a     // Catch: java.lang.Throwable -> L6f
            wc5.i r6 = new wc5.i     // Catch: java.lang.Throwable -> L6f
            r6.<init>(r1, r3, r5)     // Catch: java.lang.Throwable -> L6f
            r8.f526116f = r5     // Catch: java.lang.Throwable -> L6f
            r8.f526114d = r5     // Catch: java.lang.Throwable -> L6f
            r8.f526115e = r2     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r9 = p3325xe03a0797.p3326xc267989b.l.g(r9, r6, r8)     // Catch: java.lang.Throwable -> L6f
            if (r9 != r0) goto L6a
            return r0
        L6a:
            java.lang.Object r9 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r4)     // Catch: java.lang.Throwable -> L6f
            goto L7a
        L6f:
            r9 = move-exception
            kotlin.Result$Companion r0 = p3321xbce91901.C29043x91b2b43d.INSTANCE
            java.lang.Object r9 = p3321xbce91901.C29044xefd6a286.m143914x452354ee(r9)
            java.lang.Object r9 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r9)
        L7a:
            java.lang.Throwable r9 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(r9)
            if (r9 == 0) goto L8a
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "MicroMsg.MsgHistoryGalleryInitialLoadUIC"
            java.lang.String r2 = "emptyLoadWatcher error"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r1, r9, r2, r0)
        L8a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: wc5.j.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
