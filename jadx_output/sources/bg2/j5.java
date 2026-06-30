package bg2;

/* loaded from: classes2.dex */
public final class j5 extends tc2.c {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f20198e;

    /* renamed from: f, reason: collision with root package name */
    public int f20199f;

    /* renamed from: g, reason: collision with root package name */
    public int f20200g;

    /* renamed from: h, reason: collision with root package name */
    public final int f20201h;

    /* renamed from: i, reason: collision with root package name */
    public int f20202i;

    /* renamed from: m, reason: collision with root package name */
    public bg2.d5 f20203m;

    /* renamed from: n, reason: collision with root package name */
    public r45.hg6 f20204n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(tc2.g store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f20198e = "Finder.LiveEntryController";
        this.f20199f = 2;
        this.f20201h = 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Y6(bg2.j5 r5, android.view.View r6, long r7, kotlin.coroutines.Continuation r9) {
        /*
            r5.getClass()
            boolean r0 = r9 instanceof bg2.e5
            if (r0 == 0) goto L16
            r0 = r9
            bg2.e5 r0 = (bg2.e5) r0
            int r1 = r0.f20060g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f20060g = r1
            goto L1b
        L16:
            bg2.e5 r0 = new bg2.e5
            r0.<init>(r5, r9)
        L1b:
            java.lang.Object r5 = r0.f20058e
            pz5.a r9 = pz5.a.f359186d
            int r1 = r0.f20060g
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            java.lang.Object r6 = r0.f20057d
            android.view.View r6 = (android.view.View) r6
            kotlin.ResultKt.throwOnFailure(r5)
            goto L4a
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            kotlin.ResultKt.throwOnFailure(r5)
            r3 = 0
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 <= 0) goto L6f
            r0.f20057d = r6
            r0.f20060g = r2
            java.lang.Object r5 = kotlinx.coroutines.k1.b(r7, r0)
            if (r5 != r9) goto L4a
            goto L71
        L4a:
            if (r6 == 0) goto L55
            android.view.ViewPropertyAnimator r5 = r6.animate()
            if (r5 == 0) goto L55
            r5.cancel()
        L55:
            if (r6 == 0) goto L6f
            android.view.ViewPropertyAnimator r5 = r6.animate()
            if (r5 == 0) goto L6f
            r6 = 0
            android.view.ViewPropertyAnimator r5 = r5.alpha(r6)
            if (r5 == 0) goto L6f
            r6 = 300(0x12c, double:1.48E-321)
            android.view.ViewPropertyAnimator r5 = r5.setDuration(r6)
            if (r5 == 0) goto L6f
            r5.start()
        L6f:
            jz5.f0 r9 = jz5.f0.f302826a
        L71:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: bg2.j5.Y6(bg2.j5, android.view.View, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z6(bg2.j5 r14, android.view.View r15, long r16, kotlin.coroutines.Continuation r18) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bg2.j5.Z6(bg2.j5, android.view.View, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0146, code lost:
    
        if (((java.lang.Boolean) ((nb2.a) ((jz5.n) ae2.in.L7).getValue()).r()).booleanValue() != false) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01d8 A[EDGE_INSN: B:83:0x01d8->B:70:0x01d8 BREAK  A[LOOP:1: B:59:0x01b6->B:80:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00e0  */
    @Override // tc2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void P6() {
        /*
            Method dump skipped, instructions count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bg2.j5.P6():void");
    }

    @Override // tc2.c
    public void Q6() {
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        r45.nw1 liveInfo;
        tc2.g gVar = this.f417141d;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = gVar.f417148h;
        if ((baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null || (liveInfo = feedObject.getLiveInfo()) == null || liveInfo.getInteger(2) != 2) ? false : true) {
            return;
        }
        uc2.g gVar2 = (uc2.g) O6(uc2.g.class);
        android.view.View Y6 = gVar2 != null ? ((sb2.l) gVar2).Y6() : null;
        if (Y6 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(Y6, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveEntryController", "onFocusFeedCenter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            Y6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(Y6, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveEntryController", "onFocusFeedCenter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        kotlinx.coroutines.y0 y0Var = gVar.f417147g;
        if (y0Var != null) {
            kotlinx.coroutines.l.d(y0Var, null, null, new bg2.i5(Y6, this, null), 3, null);
        }
    }

    @Override // tc2.c
    public void U6() {
        uc2.g gVar = (uc2.g) O6(uc2.g.class);
        android.view.View Y6 = gVar != null ? ((sb2.l) gVar).Y6() : null;
        if (Y6 == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(Y6, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveEntryController", "onUnFocusFeedCenter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        Y6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(Y6, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveEntryController", "onUnFocusFeedCenter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
