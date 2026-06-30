package df2;

/* loaded from: classes3.dex */
public final class n0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f312354d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.v0 f312355e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f312356f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.yg7 f312357g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f312358h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(df2.v0 v0Var, java.lang.String str, r45.yg7 yg7Var, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f312355e = v0Var;
        this.f312356f = str;
        this.f312357g = yg7Var;
        this.f312358h = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.n0(this.f312355e, this.f312356f, this.f312357g, this.f312358h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.n0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004e  */
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
            int r1 = r6.f312354d
            r2 = 2
            r3 = 1
            df2.v0 r4 = r6.f312355e
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L45
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L38
        L1e:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            df2.v0.a7(r4)
            java.lang.String r7 = r6.f312356f
            java.lang.String r1 = "$filePath"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r7, r1)
            r6.f312354d = r3
            r45.yg7 r1 = r6.f312357g
            boolean r5 = r6.f312358h
            java.lang.Object r7 = r4.d7(r7, r1, r5, r6)
            if (r7 != r0) goto L38
            return r0
        L38:
            r45.lw1 r7 = (r45.lw1) r7
            if (r7 == 0) goto L4a
            r6.f312354d = r2
            java.lang.Object r7 = r4.b7(r7, r3, r3, r6)
            if (r7 != r0) goto L45
            return r0
        L45:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            r7.booleanValue()
        L4a:
            com.tencent.mm.ui.widget.dialog.u3 r7 = r4.f313109q
            if (r7 == 0) goto L51
            r7.dismiss()
        L51:
            az2.j r7 = r4.f313108p
            if (r7 == 0) goto L58
            r7.j()
        L58:
            r7 = 0
            r4.f313109q = r7
            java.lang.Class<df2.od> r7 = df2.od.class
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r7 = r4.m56789x25fe639c(r7)
            df2.od r7 = (df2.od) r7
            if (r7 == 0) goto L6a
            r45.n72 r0 = r45.n72.kActionType_SetLiveRoomCoverImg
            r7.e7(r0)
        L6a:
            jz5.f0 r7 = jz5.f0.f384359a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.n0.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
