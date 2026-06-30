package df2;

/* loaded from: classes.dex */
public final class ux extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f313096d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f313097e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f313098f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ df2.cy f313099g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ux(p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, df2.cy cyVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f313097e = f0Var;
        this.f313098f = h0Var;
        this.f313099g = cyVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.ux(this.f313097e, this.f313098f, this.f313099g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.ux) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x003c -> B:5:0x003f). Please report as a decompilation issue!!! */
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
            int r1 = r7.f313096d
            r2 = 1
            if (r1 == 0) goto L16
            if (r1 != r2) goto Le
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            r8 = r7
            goto L3f
        Le:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L16:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            r8 = r7
        L1a:
            kotlin.jvm.internal.f0 r1 = r8.f313097e
            int r1 = r1.f391649d
            r3 = 0
            kotlin.jvm.internal.h0 r4 = r8.f313098f
            if (r1 <= 0) goto L48
            java.lang.Object r1 = r4.f391656d
            com.tencent.mm.ui.widget.dialog.j0 r1 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0) r1
            if (r1 == 0) goto L31
            boolean r1 = r1.isShowing()
            if (r1 != r2) goto L31
            r1 = r2
            goto L32
        L31:
            r1 = r3
        L32:
            if (r1 == 0) goto L48
            r8.f313096d = r2
            r3 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r1 = p3325xe03a0797.p3326xc267989b.k1.b(r3, r8)
            if (r1 != r0) goto L3f
            return r0
        L3f:
            kotlin.jvm.internal.f0 r1 = r8.f313097e
            int r3 = r1.f391649d
            int r3 = r3 + (-1)
            r1.f391649d = r3
            goto L1a
        L48:
            df2.cy r8 = r8.f313099g
            java.lang.String r0 = r8.f311448m
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r5 = "showAlertDialog "
            r1.<init>(r5)
            java.lang.Object r6 = r4.f391656d
            com.tencent.mm.ui.widget.dialog.j0 r6 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0) r6
            int r6 = r6.hashCode()
            r1.append(r6)
            java.lang.String r6 = " countDown"
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)
            java.lang.Object r0 = r4.f391656d
            com.tencent.mm.ui.widget.dialog.j0 r0 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0) r0
            if (r0 == 0) goto L77
            boolean r0 = r0.isShowing()
            if (r0 != r2) goto L77
            goto L78
        L77:
            r2 = r3
        L78:
            if (r2 == 0) goto L9f
            java.lang.Object r0 = r4.f391656d
            com.tencent.mm.ui.widget.dialog.j0 r0 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0) r0
            r0.dismiss()
            java.lang.String r8 = r8.f311448m
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            java.lang.Object r1 = r4.f391656d
            com.tencent.mm.ui.widget.dialog.j0 r1 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0) r1
            int r1 = r1.hashCode()
            r0.append(r1)
            java.lang.String r1 = " auto dismiss"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r8, r0)
        L9f:
            jz5.f0 r8 = jz5.f0.f384359a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.ux.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
