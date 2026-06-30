package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes2.dex */
public final class km extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f194804d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f194805e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f194806f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f194807g;

    /* renamed from: h, reason: collision with root package name */
    public int f194808h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f194809i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f194810m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f194811n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public km(java.util.LinkedList linkedList, long j17, java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f194809i = linkedList;
        this.f194810m = j17;
        this.f194811n = obj;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.km(this.f194809i, this.f194810m, this.f194811n, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.km) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x007e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004f -> B:5:0x0073). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0070 -> B:5:0x0073). Please report as a decompilation issue!!! */
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
            int r1 = r12.f194808h
            java.lang.String r2 = "Finder.FinderLiveGiftPlayPlugin"
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 != r3) goto L1c
            long r4 = r12.f194804d
            java.lang.Object r1 = r12.f194807g
            r45.zy6 r1 = (r45.zy6) r1
            java.lang.Object r6 = r12.f194806f
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r7 = r12.f194805e
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            r13 = r12
            goto L73
        L1c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L24:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            java.util.LinkedList r13 = r12.f194809i
            java.util.Iterator r13 = r13.iterator()
            long r4 = r12.f194810m
            java.lang.Object r1 = r12.f194811n
            r6 = r13
            r7 = r1
            r13 = r12
        L34:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto La5
            java.lang.Object r1 = r6.next()
            r45.zy6 r1 = (r45.zy6) r1
            r8 = 0
            long r8 = r1.m75942xfb822ef2(r8)
            long r10 = c01.id.c()
            long r10 = r10 - r4
            long r8 = r8 - r10
            r10 = 0
            int r10 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r10 <= 0) goto L73
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "doVibrate delay:"
            r10.<init>(r11)
            r10.append(r8)
            java.lang.String r10 = r10.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r10)
            r13.f194805e = r7
            r13.f194806f = r6
            r13.f194807g = r1
            r13.f194804d = r4
            r13.f194808h = r3
            java.lang.Object r8 = p3325xe03a0797.p3326xc267989b.k1.b(r8, r13)
            if (r8 != r0) goto L73
            return r0
        L73:
            long r8 = r1.m75942xfb822ef2(r3)
            r10 = 10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 >= 0) goto L7e
            goto L82
        L7e:
            long r10 = r1.m75942xfb822ef2(r3)
        L82:
            boolean r1 = r7 instanceof android.os.Vibrator
            if (r1 == 0) goto L34
            java.lang.String r1 = "doVibrate"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r8 = 26
            if (r1 < r8) goto L9e
            r1 = r7
            android.os.Vibrator r1 = (android.os.Vibrator) r1
            r8 = 255(0xff, float:3.57E-43)
            android.os.VibrationEffect r8 = android.os.VibrationEffect.createOneShot(r10, r8)
            r1.vibrate(r8)
            goto L34
        L9e:
            r1 = r7
            android.os.Vibrator r1 = (android.os.Vibrator) r1
            r1.vibrate(r10)
            goto L34
        La5:
            jz5.f0 r13 = jz5.f0.f384359a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.km.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
