package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* loaded from: classes5.dex */
public final class t3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f179728d;

    /* renamed from: e, reason: collision with root package name */
    public int f179729e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f179730f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13321xc8d9d4b6 f179731g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13321xc8d9d4b6 activityC13321xc8d9d4b6, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f179731g = activityC13321xc8d9d4b6;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.t3 t3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.t3(this.f179731g, interfaceC29045xdcb5ca57);
        t3Var.f179730f = obj;
        return t3Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.t3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006f  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r12) {
        /*
            r11 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r11.f179729e
            jz5.f0 r2 = jz5.f0.f384359a
            java.lang.String r3 = "MicroMsg.EmoticonCustomCreateDirectFinderLogic"
            r4 = 2
            r5 = 0
            r6 = 1
            com.tencent.mm.plugin.emoji.ui.EmoticonCustomCreateDirectFinderUI r7 = r11.f179731g
            if (r1 == 0) goto L2f
            if (r1 == r6) goto L27
            if (r1 != r4) goto L1f
            java.lang.Object r0 = r11.f179728d
            com.tencent.mm.plugin.emoji.ui.EmoticonCustomCreateDirectFinderUI r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13321xc8d9d4b6) r0
            java.lang.Object r1 = r11.f179730f
            kotlinx.coroutines.y0 r1 = (p3325xe03a0797.p3326xc267989b.y0) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            goto L6b
        L1f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L27:
            java.lang.Object r1 = r11.f179730f
            kotlinx.coroutines.y0 r1 = (p3325xe03a0797.p3326xc267989b.y0) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            goto L4b
        L2f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            java.lang.Object r12 = r11.f179730f
            r1 = r12
            kotlinx.coroutines.y0 r1 = (p3325xe03a0797.p3326xc267989b.y0) r1
            n12.e r12 = new n12.e
            r12.<init>(r5)
            long r8 = r7.f179387e
            java.lang.String r10 = r7.f179388f
            r11.f179730f = r1
            r11.f179729e = r6
            java.lang.Object r12 = r12.a(r8, r10, r11)
            if (r12 != r0) goto L4b
            return r0
        L4b:
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L97
            n12.g r8 = new n12.g
            r8.<init>()
            n12.f r9 = n12.f.f415607e
            r8.f415610b = r9
            n12.n r9 = new n12.n
            r9.<init>(r12, r8)
            r11.f179730f = r1
            r11.f179728d = r7
            r11.f179729e = r4
            java.lang.Object r12 = r9.c(r11)
            if (r12 != r0) goto L6a
            return r0
        L6a:
            r0 = r7
        L6b:
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L8f
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r4 = r0.f179391i
            java.lang.Class<com.tencent.mm.plugin.emoji.ui.EmoticonEditorActivityDirectFinder> r8 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13323x5e994e71.class
            r1.<init>(r4, r8)
            java.lang.String r4 = "is_video"
            r1.putExtra(r4, r6)
            java.lang.String r4 = "media_path"
            r1.putExtra(r4, r12)
            long r8 = r0.f179387e
            java.lang.String r12 = "feedId"
            r1.putExtra(r12, r8)
            r12 = 1048576(0x100000, float:1.469368E-39)
            r0.startActivityForResult(r1, r12)
        L8f:
            java.lang.String r12 = "preprocess video failed"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r12)
            r12 = r2
            goto L98
        L97:
            r12 = r5
        L98:
            if (r12 != 0) goto Lb7
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "download finder video failed for feedId:"
            r12.<init>(r0)
            long r0 = r7.f179387e
            r12.append(r0)
            java.lang.String r0 = ", nonceId:"
            r12.append(r0)
            java.lang.String r0 = r7.f179388f
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r12)
        Lb7:
            com.tencent.mm.ui.widget.dialog.f4 r12 = r7.f179390h
            if (r12 == 0) goto Lc2
            r12.dismiss()
            r7.finish()
            return r2
        Lc2:
            java.lang.String r12 = "toast"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r12)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.t3.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
