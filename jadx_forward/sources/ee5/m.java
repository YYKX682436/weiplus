package ee5;

/* loaded from: classes10.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f333495d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ee5.z f333496e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f333497f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ee5.z zVar, android.view.View view, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f333496e = zVar;
        this.f333497f = view;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ee5.m(this.f333496e, this.f333497f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ee5.m) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ca  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r10) {
        /*
            r9 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r9.f333495d
            r2 = 2
            r3 = 0
            r4 = 1
            ee5.z r5 = r9.f333496e
            if (r1 == 0) goto L20
            if (r1 == r4) goto L1c
            if (r1 != r2) goto L14
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto Laa
        L14:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1c:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L42
        L20:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            java.lang.Class<qk.x7> r10 = qk.x7.class
            i95.m r10 = i95.n0.c(r10)
            qk.x7 r10 = (qk.x7) r10
            java.lang.String r1 = r5.f333632f
            c61.ec r10 = (c61.ec) r10
            r10.wi(r1)
            r9.f333495d = r4
            kotlinx.coroutines.p0 r10 = p3325xe03a0797.p3326xc267989b.q1.f392103c
            ee5.o r1 = new ee5.o
            r1.<init>(r5, r4, r3)
            java.lang.Object r10 = p3325xe03a0797.p3326xc267989b.l.g(r10, r1, r9)
            if (r10 != r0) goto L42
            return r0
        L42:
            jz5.l r10 = (jz5.l) r10
            java.lang.Object r1 = r10.f384366d
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r10 = r10.f384367e
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            r5.U6()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "get result >> "
            r6.<init>(r7)
            int r7 = r1.size()
            r6.append(r7)
            java.lang.String r7 = ", "
            r6.append(r7)
            int r7 = r10.size()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "MicroMsg.FTSMultiImageUIC"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r7, r6)
            nc5.b r6 = nc5.b.f417722a
            java.lang.String r7 = r5.f333632f
            r6.a(r7)
            java.lang.String r7 = ""
            nc5.b.f417724c = r7
            androidx.appcompat.app.AppCompatActivity r7 = r5.m158354x19263085()
            androidx.appcompat.app.AppCompatActivity r8 = r5.m158354x19263085()
            int r8 = com.p314xaae8f345.mm.ui.bl.c(r8)
            int r7 = i65.a.c(r7, r8)
            nc5.b.f417725d = r7
            java.lang.String r7 = r5.f333632f
            java.lang.String r8 = "<set-?>"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r7, r8)
            aq.o.f94454b = r7
            aq.p.f94463b = r6
            r9.f333495d = r2
            kotlinx.coroutines.p0 r2 = p3325xe03a0797.p3326xc267989b.q1.f392103c
            com.tencent.mm.storage.r8 r6 = new com.tencent.mm.storage.r8
            r6.<init>(r1, r10, r3)
            java.lang.Object r10 = p3325xe03a0797.p3326xc267989b.l.g(r2, r6, r9)
            if (r10 != r0) goto Laa
            return r0
        Laa:
            com.tencent.mm.ui.widget.dialog.u3 r10 = r5.f333634h
            if (r10 == 0) goto Lb5
            boolean r10 = r10.isShowing()
            if (r10 != r4) goto Lb5
            goto Lb6
        Lb5:
            r4 = 0
        Lb6:
            if (r4 == 0) goto Lc6
            com.tencent.mm.ui.widget.dialog.u3 r10 = r5.f333634h
            if (r10 == 0) goto Lbf
            r10.dismiss()
        Lbf:
            r5.f333634h = r3
            android.view.View r10 = r9.f333497f
            r5.V6(r10)
        Lc6:
            aq.n r10 = aq.o.f94455c
            if (r10 == 0) goto Ld1
            androidx.appcompat.app.AppCompatActivity r0 = r5.m158354x19263085()
            r10.a(r0)
        Ld1:
            fn5.n0 r10 = r5.Q6()
            java.lang.String r0 = "access$getImageDataQueryModel(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r10, r0)
            java.lang.String r0 = r5.f333633g
            java.util.List r1 = fn5.n0.E
            r10.P6(r0, r3)
            jz5.f0 r10 = jz5.f0.f384359a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ee5.m.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
