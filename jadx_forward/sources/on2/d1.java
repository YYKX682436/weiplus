package on2;

/* loaded from: classes3.dex */
public final class d1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ on2.j1 f428404d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ on2.z0 f428405e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.dz1 f428406f;

    public d1(on2.j1 j1Var, on2.z0 z0Var, r45.dz1 dz1Var) {
        this.f428404d = j1Var;
        this.f428405e = z0Var;
        this.f428406f = dz1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c1  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r12) {
        /*
            r11 = this;
            java.lang.String r0 = "com/tencent/mm/plugin/finder/lottery/FinderLiveLotteryPanelListAdapter$setProductImgIfNeeded$1$1$1"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r12)
            java.lang.Object[] r5 = r4.toArray()
            r4.clear()
            r4 = r11
            yj0.a.b(r0, r1, r2, r3, r4, r5)
            on2.z0 r12 = r11.f428405e
            android.view.View r12 = r12.f3639x46306858
            android.content.Context r1 = r12.getContext()
            java.lang.String r12 = "getContext(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r12)
            on2.j1 r12 = r11.f428404d
            r12.getClass()
            r45.y23 r12 = new r45.y23
            r12.<init>()
            r0 = 9
            r45.dz1 r2 = r11.f428406f
            com.tencent.mm.protobuf.f r0 = r2.m75936x14adae67(r0)
            r45.gz1 r0 = (r45.gz1) r0
            r2 = 0
            if (r0 == 0) goto L54
            r3 = 1
            com.tencent.mm.protobuf.f r0 = r0.m75936x14adae67(r3)
            r45.yd4 r0 = (r45.yd4) r0
            if (r0 == 0) goto L54
            r3 = 4
            com.tencent.mm.protobuf.g r0 = r0.m75934xbce7f2f(r3)
            if (r0 == 0) goto L54
            byte[] r0 = r0.g()
            goto L55
        L54:
            r0 = r2
        L55:
            java.lang.String r3 = ""
            if (r0 != 0) goto L5a
            goto L69
        L5a:
            r12.mo11468x92b714fd(r0)     // Catch: java.lang.Exception -> L5f
            r5 = r12
            goto L6a
        L5f:
            r12 = move-exception
            java.lang.String r0 = "safeParser"
            java.lang.Object[] r12 = new java.lang.Object[]{r12}
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a(r0, r3, r12)
        L69:
            r5 = r2
        L6a:
            gk2.e r2 = dk2.ef.I
            if (r2 == 0) goto Lcd
            if (r5 == 0) goto Lcd
            st2.c2 r4 = st2.c2.f493782a
            r6 = 1205(0x4b5, float:1.689E-42)
            r7 = 0
            java.lang.String r8 = ""
            r10 = 1
            r9 = r2
            l81.b1 r12 = r4.c(r5, r6, r7, r8, r9, r10)
            zl2.b0 r0 = zl2.b0.f555196a
            java.lang.Class<mm2.c1> r4 = mm2.c1.class
            androidx.lifecycle.c1 r4 = r2.a(r4)
            mm2.c1 r4 = (mm2.c1) r4
            java.lang.String r4 = r4.f410385o
            r0.a(r4, r3, r12)
            pf5.z r0 = pf5.z.f435481a
            boolean r3 = r1 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112
            if (r3 == 0) goto Lc1
            r3 = r1
            androidx.appcompat.app.AppCompatActivity r3 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) r3
            pf5.v r0 = r0.a(r3)
            java.lang.Class<zy2.v9> r3 = zy2.v9.class
            pf5.c r0 = r0.c(r3)
            zy2.v9 r0 = (zy2.v9) r0
            java.lang.Class<mm2.e1> r3 = mm2.e1.class
            androidx.lifecycle.c1 r3 = r2.a(r3)
            mm2.e1 r3 = (mm2.e1) r3
            r45.nw1 r3 = r3.f410521r
            r4 = 0
            long r3 = r3.m75942xfb822ef2(r4)
            com.tencent.mm.plugin.finder.live.viewmodel.aa r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.aa) r0
            r0.U6(r3, r12)
            dk2.q4 r0 = dk2.q4.f315471a
            r4 = 1
            r5 = 0
            r6 = 16
            r7 = 0
            r3 = r12
            dk2.q4.m(r0, r1, r2, r3, r4, r5, r6, r7)
            goto Lcd
        Lc1:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r12.<init>(r0)
            throw r12
        Lcd:
            java.lang.String r12 = "onClick"
            java.lang.String r0 = "(Landroid/view/View;)V"
            java.lang.String r1 = "com/tencent/mm/plugin/finder/lottery/FinderLiveLotteryPanelListAdapter$setProductImgIfNeeded$1$1$1"
            java.lang.String r2 = "android/view/View$OnClickListener"
            yj0.a.h(r11, r1, r2, r12, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: on2.d1.onClick(android.view.View):void");
    }
}
