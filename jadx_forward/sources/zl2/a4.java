package zl2;

/* loaded from: classes3.dex */
public final class a4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f555180d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f555181e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f555182f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.ba4 f555183g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f555184h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f555185i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ gk2.e f555186m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(boolean z17, r45.ba4 ba4Var, android.content.Context context, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, gk2.e eVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f555182f = z17;
        this.f555183g = ba4Var;
        this.f555184h = context;
        this.f555185i = h0Var;
        this.f555186m = eVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        zl2.a4 a4Var = new zl2.a4(this.f555182f, this.f555183g, this.f555184h, this.f555185i, this.f555186m, interfaceC29045xdcb5ca57);
        a4Var.f555181e = obj;
        return a4Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((zl2.a4) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008f  */
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
            int r1 = r8.f555180d
            r45.ba4 r2 = r8.f555183g
            r3 = 0
            r4 = 2131763120(0x7f101fb0, float:1.9157336E38)
            android.content.Context r5 = r8.f555184h
            r6 = 1
            if (r1 == 0) goto L1d
            if (r1 != r6) goto L15
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)     // Catch: rm0.j -> L6f
            goto L42
        L15:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1d:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            java.lang.Object r9 = r8.f555181e
            kotlinx.coroutines.y0 r9 = (p3325xe03a0797.p3326xc267989b.y0) r9
            boolean r1 = r8.f555182f
            if (r1 == 0) goto L77
            oz5.l r9 = r9.getF93115e()     // Catch: rm0.j -> L6f
            kotlinx.coroutines.p0 r1 = p3325xe03a0797.p3326xc267989b.q1.f392103c     // Catch: rm0.j -> L6f
            oz5.l r9 = r9.mo7096x348d9a(r1)     // Catch: rm0.j -> L6f
            zl2.z3 r1 = new zl2.z3     // Catch: rm0.j -> L6f
            gk2.e r7 = r8.f555186m     // Catch: rm0.j -> L6f
            r1.<init>(r7, r2, r3)     // Catch: rm0.j -> L6f
            r8.f555180d = r6     // Catch: rm0.j -> L6f
            java.lang.Object r9 = p3325xe03a0797.p3326xc267989b.l.g(r9, r1, r8)     // Catch: rm0.j -> L6f
            if (r9 != r0) goto L42
            return r0
        L42:
            dk2.ef r9 = dk2.ef.f314905a     // Catch: rm0.j -> L6f
            java.lang.Class<mm2.c1> r0 = mm2.c1.class
            androidx.lifecycle.c1 r9 = r9.i(r0)     // Catch: rm0.j -> L6f
            mm2.c1 r9 = (mm2.c1) r9     // Catch: rm0.j -> L6f
            if (r9 != 0) goto L4f
            goto L51
        L4f:
            r9.A1 = r2     // Catch: rm0.j -> L6f
        L51:
            com.tencent.mm.plugin.finder.live.view.k0 r9 = dk2.ef.f314913e     // Catch: rm0.j -> L6f
            if (r9 == 0) goto L64
            qo0.b r0 = qo0.b.f446899i4     // Catch: rm0.j -> L6f
            android.os.Bundle r1 = new android.os.Bundle     // Catch: rm0.j -> L6f
            r1.<init>()     // Catch: rm0.j -> L6f
            java.lang.String r2 = "PARAM_FINDER_LIVE_AUDIO_MODE"
            r1.putBoolean(r2, r6)     // Catch: rm0.j -> L6f
            r9.mo46557x60d69242(r0, r1)     // Catch: rm0.j -> L6f
        L64:
            r9 = 2131763121(0x7f101fb1, float:1.9157338E38)
            java.lang.String r9 = r5.getString(r9)     // Catch: rm0.j -> L6f
            db5.t7.h(r5, r9)     // Catch: rm0.j -> L6f
            goto L7e
        L6f:
            java.lang.String r9 = r5.getString(r4)
            db5.t7.g(r5, r9)
            goto L7e
        L77:
            java.lang.String r9 = r5.getString(r4)
            db5.t7.g(r5, r9)
        L7e:
            kotlin.jvm.internal.h0 r9 = r8.f555185i
            java.lang.Object r0 = r9.f391656d
            com.tencent.mm.ui.widget.dialog.u3 r0 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3) r0
            if (r0 == 0) goto L89
            r0.setOnDismissListener(r3)
        L89:
            java.lang.Object r9 = r9.f391656d
            com.tencent.mm.ui.widget.dialog.u3 r9 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3) r9
            if (r9 == 0) goto L92
            r9.dismiss()
        L92:
            jz5.f0 r9 = jz5.f0.f384359a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: zl2.a4.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
