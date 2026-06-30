package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public final class qb extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f282835d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f282836e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f282837f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f282838g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ub f282839h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f282840i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f282841m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ob f282842n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yz5.a f282843o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qb(yz5.a aVar, android.widget.TextView textView, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ub ubVar, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, java.lang.String str, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ob obVar, yz5.a aVar2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f282837f = aVar;
        this.f282838g = textView;
        this.f282839h = ubVar;
        this.f282840i = activityC0065xcd7aa112;
        this.f282841m = str;
        this.f282842n = obVar;
        this.f282843o = aVar2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.qb qbVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.qb(this.f282837f, this.f282838g, this.f282839h, this.f282840i, this.f282841m, this.f282842n, this.f282843o, interfaceC29045xdcb5ca57);
        qbVar.f282836e = obj;
        return qbVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.qb) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x008d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0068 -> B:6:0x006b). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r13) {
        /*
            r12 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r12.f282835d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L26
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            java.lang.Object r1 = r12.f282836e
            kotlinx.coroutines.y0 r1 = (p3325xe03a0797.p3326xc267989b.y0) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            r4 = r12
            goto L6b
        L15:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1d:
            java.lang.Object r1 = r12.f282836e
            kotlinx.coroutines.y0 r1 = (p3325xe03a0797.p3326xc267989b.y0) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            r13 = r12
            goto L44
        L26:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            java.lang.Object r13 = r12.f282836e
            kotlinx.coroutines.y0 r13 = (p3325xe03a0797.p3326xc267989b.y0) r13
            r1 = r12
        L2e:
            boolean r4 = p3325xe03a0797.p3326xc267989b.z0.h(r13)
            if (r4 == 0) goto L90
            r1.f282836e = r13
            r1.f282835d = r3
            r4 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r4 = p3325xe03a0797.p3326xc267989b.k1.b(r4, r1)
            if (r4 != r0) goto L41
            return r0
        L41:
            r11 = r1
            r1 = r13
            r13 = r11
        L44:
            boolean r4 = p3325xe03a0797.p3326xc267989b.z0.h(r1)
            if (r4 == 0) goto L90
            yz5.a r4 = r13.f282837f
            if (r4 != 0) goto L4f
            goto L90
        L4f:
            kotlinx.coroutines.p0 r4 = p3325xe03a0797.p3326xc267989b.q1.f392103c
            com.tencent.mm.ui.chatting.gallery.pb r5 = new com.tencent.mm.ui.chatting.gallery.pb
            yz5.a r6 = r13.f282843o
            r7 = 0
            com.tencent.mm.ui.chatting.gallery.ub r8 = r13.f282839h
            java.lang.String r9 = r13.f282841m
            r5.<init>(r8, r9, r6, r7)
            r13.f282836e = r1
            r13.f282835d = r2
            java.lang.Object r4 = p3325xe03a0797.p3326xc267989b.l.g(r4, r5, r13)
            if (r4 != r0) goto L68
            return r0
        L68:
            r11 = r4
            r4 = r13
            r13 = r11
        L6b:
            com.tencent.mm.ui.chatting.gallery.nb r13 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.nb) r13
            com.tencent.mm.ui.chatting.gallery.ub r5 = r4.f282839h
            androidx.appcompat.app.AppCompatActivity r6 = r4.f282840i
            java.lang.String r7 = r4.f282841m
            com.tencent.mm.ui.chatting.gallery.ob r8 = r4.f282842n
            yz5.a r9 = r4.f282843o
            java.lang.Object r9 = r9.mo152xb9724478()
            r10 = r9
            com.tencent.mm.ui.chatting.gallery.mb r10 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.mb) r10
            r9 = r13
            android.text.SpannableStringBuilder r5 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ub.b(r5, r6, r7, r8, r9, r10)
            android.widget.TextView r6 = r4.f282838g
            r6.setText(r5)
            boolean r13 = r13.f282762c
            if (r13 == 0) goto L8d
            goto L90
        L8d:
            r13 = r1
            r1 = r4
            goto L2e
        L90:
            jz5.f0 r13 = jz5.f0.f384359a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.qb.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
