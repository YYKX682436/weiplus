package mh2;

/* loaded from: classes10.dex */
public final class k extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final ah2.f f407908d;

    /* renamed from: e, reason: collision with root package name */
    public final ah2.a f407909e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14297x38ab218 f407910f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f407911g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Bitmap f407912h;

    /* renamed from: i, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f407913i;

    /* renamed from: m, reason: collision with root package name */
    public om2.d0 f407914m;

    /* renamed from: n, reason: collision with root package name */
    public mh2.b f407915n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(android.content.Context context, ah2.f contentService, ah2.a ktvLiveRoomCoverAbility) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentService, "contentService");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ktvLiveRoomCoverAbility, "ktvLiveRoomCoverAbility");
        this.f407908d = contentService;
        this.f407909e = ktvLiveRoomCoverAbility;
        setClipChildren(false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14297x38ab218 c14297x38ab218 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14297x38ab218(context, null, 0, 6, null);
        c14297x38ab218.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        c14297x38ab218.setVisibility(8);
        c14297x38ab218.setAlpha(0.0f);
        c14297x38ab218.f197310g = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.l0.f197981d;
        c14297x38ab218.f197311h = new float[]{0.0f, 0.5f, 1.0f};
        c14297x38ab218.f197312i = new float[]{1.0f, 1.0f, 0.0f};
        c14297x38ab218.n();
        c14297x38ab218.invalidate();
        this.f407910f = c14297x38ab218;
        addView(c14297x38ab218, new android.widget.FrameLayout.LayoutParams(-1, -2));
        ae2.in inVar = ae2.in.f85221a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85272f0).mo141623x754a37bb()).r()).intValue() > 0) {
            android.view.View view = new android.view.View(context);
            view.setBackgroundResource(com.p314xaae8f345.mm.R.raw.f80486xb6ef7281);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/ktv/view/KTVCoverBackgroundWidget", "<init>", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/ktv/api/ISingerContentService;Lcom/tencent/mm/plugin/finder/live/ktv/api/IKTVLiveRoomCoverAbility;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/ktv/view/KTVCoverBackgroundWidget", "<init>", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/ktv/api/ISingerContentService;Lcom/tencent/mm/plugin/finder/live/ktv/api/IKTVLiveRoomCoverAbility;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f407911g = view;
            addView(view, new android.widget.FrameLayout.LayoutParams(-1, context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561214ch)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f5, code lost:
    
        if (r14 == r1) goto L74;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r1v0, types: [pz5.a] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(mh2.k r12, om2.e0 r13, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r14) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mh2.k.a(mh2.k, om2.e0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final int b(android.graphics.Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width <= 0 || height <= 0) {
            return 0;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14297x38ab218 c14297x38ab218 = this.f407910f;
        if (!c14297x38ab218.isAttachedToWindow()) {
            return 0;
        }
        java.lang.Object parent = c14297x38ab218.getParent();
        android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
        int width2 = view != null ? view.getWidth() : 0;
        if (width2 <= 0) {
            width2 = getContext().getResources().getDisplayMetrics().widthPixels;
        }
        return (int) ((height * width2) / width);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (r0.a() == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r7 = this;
            kotlinx.coroutines.r2 r0 = r7.f407913i
            if (r0 == 0) goto Lc
            boolean r0 = r0.a()
            r1 = 1
            if (r0 != r1) goto Lc
            goto Ld
        Lc:
            r1 = 0
        Ld:
            if (r1 == 0) goto L10
            goto L26
        L10:
            ah2.f r0 = r7.f407908d
            kotlinx.coroutines.y0 r1 = r0.a()
            r2 = 0
            r3 = 0
            mh2.d r4 = new mh2.d
            r0 = 0
            r4.<init>(r7, r0)
            r5 = 3
            r6 = 0
            kotlinx.coroutines.r2 r0 = p3325xe03a0797.p3326xc267989b.l.d(r1, r2, r3, r4, r5, r6)
            r7.f407913i = r0
        L26:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mh2.k.c():void");
    }

    public final void d(android.graphics.Bitmap bitmap) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14297x38ab218 c14297x38ab218 = this.f407910f;
        c14297x38ab218.animate().cancel();
        h(bitmap);
        c14297x38ab218.setImageBitmap(bitmap);
        c14297x38ab218.animate().alpha(1.0f).setDuration(300L).withStartAction(new mh2.e(this)).start();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004e A[Catch: Exception -> 0x002c, TryCatch #0 {Exception -> 0x002c, blocks: (B:10:0x0028, B:11:0x004a, B:13:0x004e, B:14:0x0052, B:16:0x0059, B:17:0x005d, B:19:0x0069, B:30:0x0039), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059 A[Catch: Exception -> 0x002c, TryCatch #0 {Exception -> 0x002c, blocks: (B:10:0x0028, B:11:0x004a, B:13:0x004e, B:14:0x0052, B:16:0x0059, B:17:0x005d, B:19:0x0069, B:30:0x0039), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069 A[Catch: Exception -> 0x002c, TRY_LEAVE, TryCatch #0 {Exception -> 0x002c, blocks: (B:10:0x0028, B:11:0x004a, B:13:0x004e, B:14:0x0052, B:16:0x0059, B:17:0x005d, B:19:0x0069, B:30:0x0039), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(om2.e0 r8, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r9) {
        /*
            r7 = this;
            java.lang.String r0 = "getCoverFromLiveRoomController: "
            boolean r1 = r9 instanceof mh2.f
            if (r1 == 0) goto L15
            r1 = r9
            mh2.f r1 = (mh2.f) r1
            int r2 = r1.f407858f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f407858f = r2
            goto L1a
        L15:
            mh2.f r1 = new mh2.f
            r1.<init>(r7, r9)
        L1a:
            java.lang.Object r9 = r1.f407856d
            pz5.a r2 = pz5.a.f440719d
            int r3 = r1.f407858f
            java.lang.String r4 = "KTVCoverBackgroundWidget"
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L36
            if (r3 != r5) goto L2e
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)     // Catch: java.lang.Exception -> L2c
            goto L4a
        L2c:
            r8 = move-exception
            goto L6d
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            om2.o r8 = r8.f427832a     // Catch: java.lang.Exception -> L2c
            java.lang.String r9 = r8.f427895c     // Catch: java.lang.Exception -> L2c
            java.lang.String r8 = r8.f427893a     // Catch: java.lang.Exception -> L2c
            ah2.a r3 = r7.f407909e     // Catch: java.lang.Exception -> L2c
            r1.f407858f = r5     // Catch: java.lang.Exception -> L2c
            java.lang.Object r9 = r3.i(r8, r9, r1)     // Catch: java.lang.Exception -> L2c
            if (r9 != r2) goto L4a
            return r2
        L4a:
            r45.by1 r9 = (r45.by1) r9     // Catch: java.lang.Exception -> L2c
            if (r9 == 0) goto L51
            r45.ay1 r8 = r9.f452676d     // Catch: java.lang.Exception -> L2c
            goto L52
        L51:
            r8 = r6
        L52:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2c
            r9.<init>(r0)     // Catch: java.lang.Exception -> L2c
            if (r8 == 0) goto L5c
            java.lang.String r0 = r8.f451894r     // Catch: java.lang.Exception -> L2c
            goto L5d
        L5c:
            r0 = r6
        L5d:
            r9.append(r0)     // Catch: java.lang.Exception -> L2c
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Exception -> L2c
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r9)     // Catch: java.lang.Exception -> L2c
            if (r8 == 0) goto L82
            java.lang.String r8 = r8.f451894r     // Catch: java.lang.Exception -> L2c
            r6 = r8
            goto L82
        L6d:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "getCoverFromLiveRoomController failed: "
            r9.<init>(r0)
            java.lang.String r8 = r8.getMessage()
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r4, r8)
        L82:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: mh2.k.e(om2.e0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004e A[Catch: Exception -> 0x002c, TryCatch #0 {Exception -> 0x002c, blocks: (B:10:0x0028, B:11:0x004a, B:13:0x004e, B:14:0x0052, B:16:0x0059, B:17:0x005d, B:19:0x0069, B:30:0x0039), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059 A[Catch: Exception -> 0x002c, TryCatch #0 {Exception -> 0x002c, blocks: (B:10:0x0028, B:11:0x004a, B:13:0x004e, B:14:0x0052, B:16:0x0059, B:17:0x005d, B:19:0x0069, B:30:0x0039), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069 A[Catch: Exception -> 0x002c, TRY_LEAVE, TryCatch #0 {Exception -> 0x002c, blocks: (B:10:0x0028, B:11:0x004a, B:13:0x004e, B:14:0x0052, B:16:0x0059, B:17:0x005d, B:19:0x0069, B:30:0x0039), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(om2.e0 r8, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r9) {
        /*
            r7 = this;
            java.lang.String r0 = "getCoverFromNetwork: "
            boolean r1 = r9 instanceof mh2.g
            if (r1 == 0) goto L15
            r1 = r9
            mh2.g r1 = (mh2.g) r1
            int r2 = r1.f407887f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f407887f = r2
            goto L1a
        L15:
            mh2.g r1 = new mh2.g
            r1.<init>(r7, r9)
        L1a:
            java.lang.Object r9 = r1.f407885d
            pz5.a r2 = pz5.a.f440719d
            int r3 = r1.f407887f
            java.lang.String r4 = "KTVCoverBackgroundWidget"
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L36
            if (r3 != r5) goto L2e
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)     // Catch: java.lang.Exception -> L2c
            goto L4a
        L2c:
            r8 = move-exception
            goto L6d
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            om2.o r8 = r8.f427832a     // Catch: java.lang.Exception -> L2c
            java.lang.String r9 = r8.f427895c     // Catch: java.lang.Exception -> L2c
            java.lang.String r8 = r8.f427893a     // Catch: java.lang.Exception -> L2c
            ah2.a r3 = r7.f407909e     // Catch: java.lang.Exception -> L2c
            r1.f407887f = r5     // Catch: java.lang.Exception -> L2c
            java.lang.Object r9 = r3.i(r8, r9, r1)     // Catch: java.lang.Exception -> L2c
            if (r9 != r2) goto L4a
            return r2
        L4a:
            r45.by1 r9 = (r45.by1) r9     // Catch: java.lang.Exception -> L2c
            if (r9 == 0) goto L51
            r45.ay1 r8 = r9.f452676d     // Catch: java.lang.Exception -> L2c
            goto L52
        L51:
            r8 = r6
        L52:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2c
            r9.<init>(r0)     // Catch: java.lang.Exception -> L2c
            if (r8 == 0) goto L5c
            java.lang.String r0 = r8.f451894r     // Catch: java.lang.Exception -> L2c
            goto L5d
        L5c:
            r0 = r6
        L5d:
            r9.append(r0)     // Catch: java.lang.Exception -> L2c
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Exception -> L2c
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r9)     // Catch: java.lang.Exception -> L2c
            if (r8 == 0) goto L82
            java.lang.String r8 = r8.f451894r     // Catch: java.lang.Exception -> L2c
            r6 = r8
            goto L82
        L6d:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "getCoverFromNetwork failed: "
            r9.<init>(r0)
            java.lang.String r8 = r8.getMessage()
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r4, r8)
        L82:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: mh2.k.f(om2.e0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void g() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14297x38ab218 c14297x38ab218 = this.f407910f;
        c14297x38ab218.animate().cancel();
        c14297x38ab218.setVisibility(8);
        c14297x38ab218.setAlpha(0.0f);
        android.view.View view = this.f407911g;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/ktv/view/KTVCoverBackgroundWidget", "hideKTVCover", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/ktv/view/KTVCoverBackgroundWidget", "hideKTVCover", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f407912h = null;
        setBackgroundColor(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0085, code lost:
    
        r2 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(android.graphics.Bitmap r13) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mh2.k.h(android.graphics.Bitmap):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KTVCoverBackgroundWidget", "attach to window, flush cover image");
        android.graphics.Bitmap bitmap = this.f407912h;
        if (bitmap != null && this.f407910f.isAttachedToWindow()) {
            d(bitmap);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KTVCoverBackgroundWidget", "detach from window, clean resources");
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f407913i;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f407913i = null;
        this.f407912h = null;
        this.f407914m = null;
        this.f407915n = null;
        g();
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KTVCoverBackgroundWidget", "cover size changed, relayout cover view");
        android.graphics.Bitmap bitmap = this.f407912h;
        if (bitmap != null && this.f407910f.getVisibility() == 0) {
            h(bitmap);
        }
    }
}
