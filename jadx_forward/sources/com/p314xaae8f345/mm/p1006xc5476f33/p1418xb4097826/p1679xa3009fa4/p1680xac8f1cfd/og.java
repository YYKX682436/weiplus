package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class og extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f217005d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f217006e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public og(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f217006e = activityC0065xcd7aa112;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.og(this.f217006e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.og) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004e  */
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
            int r1 = r8.f217005d
            androidx.appcompat.app.AppCompatActivity r2 = r8.f217006e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L13
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L44
        L13:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1b:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L36
        L1f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            kotlinx.coroutines.flow.j2 r9 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bh.f215414e
            com.tencent.mm.plugin.finder.viewmodel.component.ig r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ig.f216273e
            kotlinx.coroutines.flow.h3 r9 = (p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) r9
            r9.k(r1)
            r8.f217005d = r4
            r6 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r9 = p3325xe03a0797.p3326xc267989b.k1.b(r6, r8)
            if (r9 != r0) goto L36
            return r0
        L36:
            db2.b5 r9 = new db2.b5
            r9.<init>(r2, r5)
            r8.f217005d = r3
            java.lang.Object r9 = rm0.h.b(r9, r8)
            if (r9 != r0) goto L44
            return r0
        L44:
            r0 = r9
            com.tencent.mm.modelbase.f r0 = (com.p314xaae8f345.mm.p944x882e457a.f) r0
            boolean r0 = r0.b()
            if (r0 == 0) goto L4e
            goto L4f
        L4e:
            r9 = r5
        L4f:
            com.tencent.mm.modelbase.f r9 = (com.p314xaae8f345.mm.p944x882e457a.f) r9
            if (r9 == 0) goto L58
            com.tencent.mm.protobuf.f r9 = r9.f152151d
            bw5.ig r9 = (bw5.ig) r9
            goto L59
        L58:
            r9 = r5
        L59:
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.i00.a(r9)
            kotlinx.coroutines.flow.j2 r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bh.f215414e
            com.tencent.mm.plugin.finder.viewmodel.component.ig r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ig.f216274f
            kotlinx.coroutines.flow.h3 r0 = (p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) r0
            r0.k(r1)
            com.tencent.mm.plugin.finder.viewmodel.component.bh r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bh.f215410a
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bh.a(r0, r2, r9, r5)
            jz5.f0 r9 = jz5.f0.f384359a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.og.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
