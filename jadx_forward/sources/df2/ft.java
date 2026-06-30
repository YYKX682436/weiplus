package df2;

/* loaded from: classes10.dex */
public final class ft extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f311700d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.lt f311701e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ft(df2.lt ltVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f311701e = ltVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.ft(this.f311701e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.ft) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a9 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x00a7 -> B:12:0x0023). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r11) {
        /*
            r10 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r10.f311700d
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L19
            if (r1 == r3) goto L19
            if (r1 != r2) goto L11
            goto L1f
        L11:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L19:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            r11 = r10
            goto L96
        L1f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            r11 = r10
        L23:
            df2.lt r1 = r11.f311701e
            com.tencent.mm.view.RecyclerHorizontalViewPager r6 = r1.f312239n
            r7 = 0
            if (r6 != 0) goto L2b
            goto L2e
        L2b:
            r6.m82658x69a99e53(r7)
        L2e:
            boolean r6 = r1.f312248w
            if (r6 == 0) goto L3f
            r1.f312248w = r7
            r11.f311700d = r4
            r6 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r1 = p3325xe03a0797.p3326xc267989b.k1.b(r6, r11)
            if (r1 != r0) goto L96
            return r0
        L3f:
            in5.c r1 = r1.f312243r
            boolean r6 = r1 instanceof dk2.h
            if (r6 == 0) goto L48
            dk2.h r1 = (dk2.h) r1
            goto L49
        L48:
            r1 = r5
        L49:
            if (r1 == 0) goto L96
            java.lang.String r6 = df2.lt.W
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "delay title: "
            r6.<init>(r7)
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r7 = r1.f315074d
            if (r7 == 0) goto L5d
            java.lang.String r7 = r7.m76523x98b23862()
            goto L5e
        L5d:
            r7 = r5
        L5e:
            r6.append(r7)
            java.lang.String r7 = " , time: "
            r6.append(r7)
            r7 = 17
            r45.bm1 r1 = r1.f315078h
            if (r1 == 0) goto L76
            int r8 = r1.m75939xb282bd08(r7)
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r8)
            goto L77
        L76:
            r9 = r5
        L77:
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            java.lang.String r8 = "Finder.LivePromoteBannerController"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r8, r6)
            if (r1 == 0) goto L8b
            int r1 = r1.m75939xb282bd08(r7)
            long r6 = (long) r1
            goto L8d
        L8b:
            r6 = 5000(0x1388, double:2.4703E-320)
        L8d:
            r11.f311700d = r3
            java.lang.Object r1 = p3325xe03a0797.p3326xc267989b.k1.b(r6, r11)
            if (r1 != r0) goto L96
            return r0
        L96:
            kotlinx.coroutines.p0 r1 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            kotlinx.coroutines.g3 r1 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            df2.et r6 = new df2.et
            df2.lt r7 = r11.f311701e
            r6.<init>(r7, r5)
            r11.f311700d = r2
            java.lang.Object r1 = p3325xe03a0797.p3326xc267989b.l.g(r1, r6, r11)
            if (r1 != r0) goto L23
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.ft.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
