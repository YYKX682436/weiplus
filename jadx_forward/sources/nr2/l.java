package nr2;

/* loaded from: classes2.dex */
public final class l extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f420784d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f420785e;

    /* renamed from: f, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f420786f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f420787g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f420788h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f420789i;

    /* renamed from: m, reason: collision with root package name */
    public nr2.m f420790m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f420791n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f420785e = new java.util.ArrayList();
        this.f420786f = p3325xe03a0797.p3326xc267989b.z0.a(((p3325xe03a0797.p3326xc267989b.c3) p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.q1.f392103c));
        this.f420787g = true;
        this.f420789i = "";
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(6:18|19|(1:21)(1:28)|(1:23)|24|(2:26|27))|11|12|13))|31|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007a, code lost:
    
        r9 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        r8 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(r8));
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O6(nr2.l r8, so2.q6 r9, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r10) {
        /*
            r8.getClass()
            boolean r0 = r10 instanceof nr2.b
            if (r0 == 0) goto L16
            r0 = r10
            nr2.b r0 = (nr2.b) r0
            int r1 = r0.f420697f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f420697f = r1
            goto L1b
        L16:
            nr2.b r0 = new nr2.b
            r0.<init>(r8, r10)
        L1b:
            r5 = r0
            java.lang.Object r10 = r5.f420695d
            pz5.a r0 = pz5.a.f440719d
            int r1 = r5.f420697f
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)     // Catch: java.lang.Throwable -> L79
            goto L72
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            kotlin.Result$Companion r10 = p3321xbce91901.C29043x91b2b43d.INSTANCE     // Catch: java.lang.Throwable -> L79
            db2.t1 r1 = new db2.t1     // Catch: java.lang.Throwable -> L79
            android.app.Activity r8 = r8.m80379x76847179()     // Catch: java.lang.Throwable -> L79
            java.lang.String r10 = "context"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r10)     // Catch: java.lang.Throwable -> L79
            boolean r10 = r8 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f     // Catch: java.lang.Throwable -> L79
            r3 = 0
            if (r10 == 0) goto L59
            androidx.appcompat.app.AppCompatActivity r8 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) r8     // Catch: java.lang.Throwable -> L79
            pf5.z r10 = pf5.z.f435481a     // Catch: java.lang.Throwable -> L79
            pf5.v r8 = r10.a(r8)     // Catch: java.lang.Throwable -> L79
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.ny> r10 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class
            androidx.lifecycle.c1 r8 = r8.a(r10)     // Catch: java.lang.Throwable -> L79
            com.tencent.mm.plugin.finder.viewmodel.component.ny r8 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) r8     // Catch: java.lang.Throwable -> L79
            goto L5a
        L59:
            r8 = r3
        L5a:
            if (r8 == 0) goto L60
            r45.qt2 r3 = r8.V6()     // Catch: java.lang.Throwable -> L79
        L60:
            r1.<init>(r9, r3)     // Catch: java.lang.Throwable -> L79
            r8 = 0
            r4 = 0
            r6 = 3
            r7 = 0
            r5.f420697f = r2     // Catch: java.lang.Throwable -> L79
            r2 = r8
            java.lang.Object r10 = rm0.h.a(r1, r2, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L79
            if (r10 != r0) goto L72
            goto L85
        L72:
            r45.oa1 r10 = (r45.oa1) r10     // Catch: java.lang.Throwable -> L79
            java.lang.Object r8 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r10)     // Catch: java.lang.Throwable -> L79
            goto L84
        L79:
            r8 = move-exception
            kotlin.Result$Companion r9 = p3321xbce91901.C29043x91b2b43d.INSTANCE
            java.lang.Object r8 = p3321xbce91901.C29044xefd6a286.m143914x452354ee(r8)
            java.lang.Object r8 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r8)
        L84:
            r0 = r8
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nr2.l.O6(nr2.l, so2.q6, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View P6() {
        /*
            Method dump skipped, instructions count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nr2.l.P6():android.view.View");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        byte[] byteArrayExtra = m80379x76847179().getIntent().getByteArrayExtra("paid_collection_info");
        if (byteArrayExtra != null) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd = new r45.do2().mo11468x92b714fd(byteArrayExtra);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo11468x92b714fd, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderPaidCollectionInfo");
            this.f420790m = new nr2.m((r45.do2) mo11468x92b714fd);
        }
        this.f420789i = pm0.v.u(m158359x1e885992().getLongExtra("key_ref_object_id", 0L));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f420785e = new java.util.ArrayList();
        this.f420786f = p3325xe03a0797.p3326xc267989b.z0.a(((p3325xe03a0797.p3326xc267989b.c3) p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.q1.f392103c));
        this.f420787g = true;
        this.f420789i = "";
    }
}
