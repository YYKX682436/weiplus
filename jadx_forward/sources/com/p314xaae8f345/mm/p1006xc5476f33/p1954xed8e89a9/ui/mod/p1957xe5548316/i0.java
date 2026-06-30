package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316;

/* loaded from: classes10.dex */
public final class i0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f235456d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f235457e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f235458f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.j0 f235459g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f235460h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(java.util.List list, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.j0 j0Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f235458f = list;
        this.f235459g = j0Var;
        this.f235460h = f4Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.i0 i0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.i0(this.f235458f, this.f235459g, this.f235460h, interfaceC29045xdcb5ca57);
        i0Var.f235457e = obj;
        return i0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.i0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x005d  */
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
            int r1 = r8.f235456d
            com.tencent.mm.ui.widget.dialog.f4 r2 = r8.f235460h
            jz5.f0 r3 = jz5.f0.f384359a
            r4 = 1
            if (r1 == 0) goto L1d
            if (r1 != r4) goto L15
            java.lang.Object r0 = r8.f235457e
            kotlinx.coroutines.y0 r0 = (p3325xe03a0797.p3326xc267989b.y0) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L5a
        L15:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1d:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            java.lang.Object r9 = r8.f235457e
            kotlinx.coroutines.y0 r9 = (p3325xe03a0797.p3326xc267989b.y0) r9
            r1 = 0
            java.util.List r5 = r8.f235458f
            if (r5 == 0) goto L5b
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L32:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L4a
            java.lang.Object r7 = r5.next()
            com.tencent.mm.choosemsgfile.compat.MsgFile r7 = (com.p314xaae8f345.mm.p659xbe8cc686.p660xaf3f3382.C10396xb34a007d) r7
            if (r7 == 0) goto L43
            java.lang.String r7 = r7.f146295e
            goto L44
        L43:
            r7 = r1
        L44:
            if (r7 == 0) goto L32
            r6.add(r7)
            goto L32
        L4a:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r2)
            r8.f235457e = r9
            r8.f235456d = r4
            com.tencent.mm.plugin.profile.ui.mod.components.j0 r9 = r8.f235459g
            java.lang.Object r9 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.j0.m7(r9, r2, r6, r4, r8)
            if (r9 != r0) goto L5a
            return r0
        L5a:
            r1 = r3
        L5b:
            if (r1 != 0) goto L67
            java.lang.String r9 = "MicroMsg.ModProfile.ModImageDescriptionUI"
            java.lang.String r0 = "onGetChatImage tempSelectImagePathList is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r9, r0)
            r2.dismiss()
        L67:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.i0.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
