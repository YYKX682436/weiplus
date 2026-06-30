package wo2;

/* loaded from: classes2.dex */
public final class o0 extends zo2.b {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f529643g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.C14496x6858d351 f529644h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.C14496x6858d351 c14496x6858d351, java.util.ArrayList arrayList) {
        super((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activityC0065xcd7aa112, arrayList);
        this.f529643g = activityC0065xcd7aa112;
        this.f529644h = c14496x6858d351;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(activityC0065xcd7aa112, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
    }

    @Override // zo2.a
    public void a(boolean z17, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301 fragment) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x009a, code lost:
    
        if ((r9.get(1) instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1580x6bc8974a.C14519x3767b417) == false) goto L22;
     */
    @Override // zo2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(int r9, int r10, int r11, int r12) {
        /*
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onFragmentChange from:"
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r1 = " to:"
            r0.append(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Finder.FragmentChangeObserver"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            java.lang.Class<ml2.j0> r0 = ml2.j0.class
            i95.m r0 = i95.n0.c(r0)
            r1 = r0
            ml2.j0 r1 = (ml2.j0) r1
            r2 = 0
            ml2.x1 r3 = ml2.x1.f409735f
            java.lang.String r4 = "94"
            ml2.y r5 = ml2.y.f409773e
            r6 = r11
            r7 = r12
            r1.xj(r2, r3, r4, r5, r6, r7)
            com.tencent.mm.plugin.finder.nearby.NearbyHomeUIC r0 = r8.f529644h
            r0.f202985f = r10
            androidx.appcompat.app.AppCompatActivity r1 = r8.f529643g
            java.lang.String r2 = "activity"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r1, r2)
            pf5.z r3 = pf5.z.f435481a
            pf5.v r1 = r3.a(r1)
            java.lang.Class<wo2.m0> r4 = wo2.m0.class
            androidx.lifecycle.c1 r1 = r1.a(r4)
            java.lang.String r4 = "get(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r4)
            wo2.m0 r1 = (wo2.m0) r1
            com.google.android.material.tabs.TabLayout r1 = r1.R6()
            if (r1 == 0) goto L63
            oa.i r1 = r1.k(r10)
            if (r1 == 0) goto L63
            boolean r4 = r1.a()
            if (r4 != 0) goto L63
            r1.b()
        L63:
            r1 = 1
            r4 = -1
            java.lang.Class<zy2.rb> r5 = zy2.rb.class
            if (r9 == r4) goto L88
            if (r9 != r1) goto L6d
            if (r10 == 0) goto L71
        L6d:
            if (r9 != 0) goto Lb2
            if (r10 != r1) goto Lb2
        L71:
            androidx.appcompat.app.AppCompatActivity r9 = r0.m158354x19263085()
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r9, r2)
            pf5.v r9 = r3.a(r9)
            pf5.c r9 = r9.c(r5)
            zy2.rb r9 = (zy2.rb) r9
            com.tencent.mm.plugin.finder.viewmodel.component.h80 r9 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.h80) r9
            r9.O6()
            goto Lb2
        L88:
            if (r10 == 0) goto L9c
            if (r10 != r1) goto Lb2
            java.util.ArrayList r9 = r0.f202984e
            int r10 = r9.size()
            if (r10 <= r1) goto Lb2
            java.lang.Object r9 = r9.get(r1)
            boolean r9 = r9 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1580x6bc8974a.C14519x3767b417
            if (r9 != 0) goto Lb2
        L9c:
            androidx.appcompat.app.AppCompatActivity r9 = r0.m158354x19263085()
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r9, r2)
            pf5.v r9 = r3.a(r9)
            pf5.c r9 = r9.c(r5)
            zy2.rb r9 = (zy2.rb) r9
            com.tencent.mm.plugin.finder.viewmodel.component.h80 r9 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.h80) r9
            r9.O6()
        Lb2:
            r9 = 0
            r0.Q6(r11, r9)
            r0.Q6(r12, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wo2.o0.l(int, int, int, int):void");
    }
}
