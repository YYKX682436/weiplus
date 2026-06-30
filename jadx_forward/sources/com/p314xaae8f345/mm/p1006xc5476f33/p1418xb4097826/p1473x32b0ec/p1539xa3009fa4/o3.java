package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes5.dex */
public final class o3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f198827d;

    /* renamed from: e, reason: collision with root package name */
    public int f198828e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.u3 f198829f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.u3 u3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f198829f = u3Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.o3(this.f198829f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.o3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00c4, code lost:
    
        if ((r0.length() > 0) == true) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00bb  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r15) {
        /*
            r14 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r14.f198828e
            com.tencent.mm.plugin.finder.live.viewmodel.u3 r2 = r14.f198829f
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 != r3) goto L14
            java.lang.Object r0 = r14.f198827d
            com.tencent.mm.plugin.finder.live.viewmodel.u3 r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.u3) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r15)
            goto Lad
        L14:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L1c:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r15)
            r45.v11 r15 = r2.f198985i
            r1 = 0
            if (r15 == 0) goto Lb1
            r4 = 5
            com.tencent.mm.protobuf.f r15 = r15.m75936x14adae67(r4)
            r45.gs2 r15 = (r45.gs2) r15
            if (r15 == 0) goto Lb1
            r4 = 7
            java.lang.String r15 = r15.m75945x2fec8307(r4)
            if (r15 == 0) goto Lb1
            java.lang.Class<s40.b1> r4 = s40.b1.class
            i95.m r4 = i95.n0.c(r4)
            s40.b1 r4 = (s40.b1) r4
            androidx.appcompat.app.AppCompatActivity r11 = r2.m158354x19263085()
            r14.f198827d = r2
            r14.f198828e = r3
            r7 = r4
            com.tencent.mm.feature.finder.live.t6 r7 = (com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.t6) r7
            r7.getClass()
            kotlinx.coroutines.r r4 = new kotlinx.coroutines.r
            kotlin.coroutines.Continuation r5 = pz5.f.b(r14)
            r4.<init>(r5, r3)
            r4.k()
            kotlin.jvm.internal.h0 r12 = new kotlin.jvm.internal.h0
            r12.<init>()
            v65.n r8 = new v65.n
            r8.<init>(r4)
            com.tencent.mm.feature.finder.live.s6 r13 = new com.tencent.mm.feature.finder.live.s6
            r6 = 40005(0x9c45, float:5.6059E-41)
            r5 = r13
            r9 = r11
            r10 = r12
            r5.<init>(r6, r7, r8, r9, r10)
            r12.f391656d = r13
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            java.lang.String r6 = "open_custom_style_url"
            r5.putExtra(r6, r3)
            java.lang.String r6 = "forceHideShare"
            r5.putExtra(r6, r3)
            java.lang.String r6 = "show_native_web_view"
            r5.putExtra(r6, r3)
            java.lang.String r6 = "rawUrl"
            r5.putExtra(r6, r15)
            java.lang.String r15 = "screen_orientation"
            r5.putExtra(r15, r3)
            boolean r15 = r11 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
            if (r15 == 0) goto L92
            r1 = r11
            com.tencent.mm.ui.MMActivity r1 = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) r1
        L92:
            if (r1 == 0) goto L9b
            java.lang.Object r15 = r12.f391656d
            com.tencent.mm.ui.xc r15 = (com.p314xaae8f345.mm.ui.xc) r15
            r1.m78747x6b661de(r15)
        L9b:
            java.lang.String r15 = ".ui.tools.WebViewUI"
            r1 = 40005(0x9c45, float:5.6059E-41)
            java.lang.String r6 = "webview"
            j45.l.n(r11, r6, r15, r5, r1)
            java.lang.Object r15 = r4.j()
            if (r15 != r0) goto Lac
            return r0
        Lac:
            r0 = r2
        Lad:
            r1 = r15
            java.lang.String r1 = (java.lang.String) r1
            goto Lb2
        Lb1:
            r0 = r2
        Lb2:
            r0.f198981e = r1
            android.view.View r15 = r2.f198982f
            java.lang.String r0 = r2.f198981e
            r1 = 0
            if (r0 == 0) goto Lc7
            int r0 = r0.length()
            if (r0 <= 0) goto Lc3
            r0 = r3
            goto Lc4
        Lc3:
            r0 = r1
        Lc4:
            if (r0 != r3) goto Lc7
            goto Lc8
        Lc7:
            r3 = r1
        Lc8:
            r2.V6(r15, r3)
            r2.U6()
            jz5.f0 r15 = jz5.f0.f384359a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.o3.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
