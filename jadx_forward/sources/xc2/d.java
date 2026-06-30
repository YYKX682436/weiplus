package xc2;

/* loaded from: classes2.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc2.e f534644d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f534645e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xc2.w0 f534646f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f534647g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f534648h;

    public d(xc2.e eVar, android.view.View view, xc2.w0 w0Var, in5.s0 s0Var, java.lang.String str) {
        this.f534644d = eVar;
        this.f534645e = view;
        this.f534646f = w0Var;
        this.f534647g = s0Var;
        this.f534648h = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r27 = this;
            r0 = r27
            xc2.e r1 = r0.f534644d
            android.view.View r2 = r0.f534645e
            xc2.w0 r3 = r0.f534646f
            r1.B(r2, r3)
            in5.s0 r1 = r0.f534647g
            android.content.Context r2 = r1.f374654e
            java.lang.String r4 = "getContext(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r4)
            boolean r5 = r2 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
            if (r5 == 0) goto L29
            androidx.appcompat.app.AppCompatActivity r2 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) r2
            pf5.z r5 = pf5.z.f435481a
            pf5.v r2 = r5.a(r2)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.ny> r5 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class
            androidx.lifecycle.c1 r2 = r2.a(r5)
            com.tencent.mm.plugin.finder.viewmodel.component.ny r2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) r2
            goto L2a
        L29:
            r2 = 0
        L2a:
            if (r2 == 0) goto L30
            java.lang.String r5 = r2.f216915p
            if (r5 != 0) goto L32
        L30:
            java.lang.String r5 = ""
        L32:
            r8 = r5
            android.content.Context r1 = r1.f374654e
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r4)
            pf5.z r4 = pf5.z.f435481a
            boolean r5 = r1 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112
            if (r5 == 0) goto Lb6
            androidx.appcompat.app.AppCompatActivity r1 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) r1
            pf5.v r1 = r4.a(r1)
            java.lang.Class<sc2.a8> r4 = sc2.a8.class
            androidx.lifecycle.c1 r1 = r1.a(r4)
            sc2.a8 r1 = (sc2.a8) r1
            long r4 = r1.f487299y
            java.lang.String r1 = "comment"
            java.lang.String r7 = r0.f534648h
            boolean r1 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r1, r7)
            if (r1 == 0) goto L5c
            r1 = 2
        L59:
            r22 = r1
            goto L72
        L5c:
            java.lang.String r1 = "TWO_FLOW"
            boolean r1 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r1, r7)
            if (r1 == 0) goto L66
            r1 = 4
            goto L59
        L66:
            java.lang.String r1 = "single_comment"
            boolean r1 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r1, r7)
            if (r1 == 0) goto L70
            r1 = 5
            goto L59
        L70:
            r22 = 1
        L72:
            boolean r1 = r3.f534853l
            if (r1 != 0) goto Lb5
            java.lang.Class<com.tencent.mm.plugin.finder.report.o3> r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class
            i95.m r1 = i95.n0.c(r1)
            java.lang.String r7 = "getService(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r7)
            r7 = r1
            com.tencent.mm.plugin.finder.report.o3 r7 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) r7
            r9 = 0
            r10 = 0
            cl0.g r11 = r3.f534760f
            int r12 = r3.f534854m
            int r13 = r3.f534855n
            r1 = 0
            r16 = 0
            java.lang.String r6 = r3.f534764j
            long r14 = r3.f534763i
            r23 = 0
            if (r2 == 0) goto L9e
            r45.qt2 r2 = r2.V6()
            r24 = r2
            goto La0
        L9e:
            r24 = 0
        La0:
            r25 = 8640(0x21c0, float:1.2107E-41)
            r26 = 0
            r19 = r14
            r2 = 0
            r14 = r2
            r2 = 1
            r15 = r1
            r17 = r6
            r18 = r19
            r20 = r4
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.Pk(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r20, r22, r23, r24, r25, r26)
            r3.f534853l = r2
        Lb5:
            return
        Lb6:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Check failed."
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: xc2.d.run():void");
    }
}
