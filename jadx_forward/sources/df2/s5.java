package df2;

/* loaded from: classes3.dex */
public final class s5 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.ir1 f312823d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f312824e;

    public s5(r45.ir1 gestureInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gestureInfo, "gestureInfo");
        this.f312823d = gestureInfo;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof df2.r5
            if (r0 == 0) goto L13
            r0 = r7
            df2.r5 r0 = (df2.r5) r0
            int r1 = r0.f312758g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f312758g = r1
            goto L18
        L13:
            df2.r5 r0 = new df2.r5
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f312756e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f312758g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.f312755d
            df2.s5 r0 = (df2.s5) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L46
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L33:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            sg2.x r7 = sg2.x.f489488a
            r0.f312755d = r6
            r0.f312758g = r3
            r45.ir1 r2 = r6.f312823d
            java.lang.Object r7 = r7.d(r2, r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            r0 = r6
        L46:
            sg2.b r7 = (sg2.b) r7
            java.lang.String r1 = ""
            if (r7 == 0) goto L50
            java.lang.String r2 = r7.f489418a
            if (r2 != 0) goto L51
        L50:
            r2 = r1
        L51:
            boolean r3 = com.p314xaae8f345.mm.ui.bk.C()
            if (r3 == 0) goto L5e
            if (r7 == 0) goto L66
            java.lang.String r7 = r7.f489419b
            if (r7 != 0) goto L65
            goto L66
        L5e:
            if (r7 == 0) goto L66
            java.lang.String r7 = r7.f489420c
            if (r7 != 0) goto L65
            goto L66
        L65:
            r1 = r7
        L66:
            boolean r7 = r0.f312824e
            r3 = 0
            java.lang.String r4 = "getImagePath "
            java.lang.String r5 = "Finder.GestureEffectAnchorSettingController"
            r45.ir1 r0 = r0.f312823d
            if (r7 == 0) goto L8d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r4)
            int r0 = r0.m75939xb282bd08(r3)
            r7.append(r0)
            java.lang.String r0 = " enablePath:"
            r7.append(r0)
            r7.append(r2)
            java.lang.String r7 = r7.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r7)
            return r2
        L8d:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r4)
            int r0 = r0.m75939xb282bd08(r3)
            r7.append(r0)
            java.lang.String r0 = " disablePath:"
            r7.append(r0)
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.s5.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        return 0;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return this.f312823d.m75939xb282bd08(0);
    }

    @Override // in5.c
    public int h() {
        return df2.s5.class.hashCode();
    }
}
