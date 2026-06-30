package gd2;

/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.ActivityC14126xa5cf9084 f352078a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.a f352079b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f352080c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f352081d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f352082e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f352083f;

    /* renamed from: g, reason: collision with root package name */
    public final gd2.j f352084g;

    /* renamed from: h, reason: collision with root package name */
    public final gd2.l f352085h;

    /* renamed from: i, reason: collision with root package name */
    public final gd2.k f352086i;

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f352087j;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.ActivityC14126xa5cf9084 activity, yz5.a gallery) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gallery, "gallery");
        this.f352078a = activity;
        this.f352079b = gallery;
        this.f352080c = new java.util.concurrent.ConcurrentHashMap();
        this.f352081d = new java.util.concurrent.ConcurrentHashMap();
        this.f352082e = new java.util.HashSet();
        this.f352084g = new gd2.j(this);
        this.f352085h = new gd2.l(this);
        this.f352086i = new gd2.k(this);
        this.f352087j = jz5.h.b(new gd2.m(this));
        activity.mo273xed6858b4().a(new p012xc85e97e9.p093xedfae76a.f() { // from class: com.tencent.mm.plugin.finder.feed.ui.commentimage.menu.FinderCommentImageMenuData$1
            @Override // p012xc85e97e9.p093xedfae76a.f, p012xc85e97e9.p093xedfae76a.h
            /* renamed from: onDestroy */
            public void mo7795xac79a11b(p012xc85e97e9.p093xedfae76a.y owner) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
                gd2.x xVar = (gd2.x) ((jz5.n) gd2.n.this.f352087j).mo141623x754a37bb();
                android.animation.ValueAnimator valueAnimator = xVar.f352109m;
                valueAnimator.setRepeatMode(1);
                valueAnimator.setRepeatCount(0);
                valueAnimator.end();
                xVar.f352109m.removeAllUpdateListeners();
                xVar.f352110n.mo48814x2efc64();
                xVar.b();
                gm0.j1.n().d(xVar.f352111o);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0060 A[Catch: Exception -> 0x003b, TryCatch #0 {Exception -> 0x003b, blocks: (B:31:0x0032, B:20:0x0060, B:22:0x0079, B:25:0x00a0, B:27:0x0042, B:29:0x004a), top: B:30:0x0032 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(java.lang.String r11) {
        /*
            r10 = this;
            java.lang.String r0 = "doWordDetectImage image overRatioLimit: "
            java.lang.String r1 = "photoTransLogic.scan :"
            r2 = 1
            r3 = 0
            if (r11 == 0) goto L11
            boolean r4 = r26.n0.N(r11)
            if (r4 == 0) goto Lf
            goto L11
        Lf:
            r4 = r3
            goto L12
        L11:
            r4 = r2
        L12:
            if (r4 != 0) goto Lbc
            java.util.concurrent.ConcurrentHashMap r4 = r10.f352081d
            boolean r5 = r4.containsKey(r11)
            if (r5 != 0) goto Lbc
            gm0.y r5 = gm0.j1.n()
            com.tencent.mm.modelbase.r1 r5 = r5.f354821b
            int r5 = r5.n()
            if (r5 == 0) goto Lbc
            boolean r5 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.k1.d()
            if (r5 == 0) goto Lbc
            java.lang.String r5 = "FinderCommentImageMenuData"
            if (r11 == 0) goto L3e
            int r6 = r11.length()     // Catch: java.lang.Exception -> L3b
            if (r6 != 0) goto L39
            goto L3e
        L39:
            r6 = r3
            goto L3f
        L3b:
            r11 = move-exception
            goto Lb5
        L3e:
            r6 = r2
        L3f:
            if (r6 == 0) goto L42
            goto L48
        L42:
            boolean r6 = com.p314xaae8f345.mm.vfs.w6.j(r11)     // Catch: java.lang.Exception -> L3b
            if (r6 != 0) goto L4a
        L48:
            r6 = 0
            goto L5e
        L4a:
            android.graphics.BitmapFactory$Options r6 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Exception -> L3b
            r6.<init>()     // Catch: java.lang.Exception -> L3b
            r6.inJustDecodeBounds = r2     // Catch: java.lang.Exception -> L3b
            com.p314xaae8f345.mm.p786x600aa8b.e.d(r11, r6)     // Catch: java.lang.Exception -> L3b
            android.graphics.Point r7 = new android.graphics.Point     // Catch: java.lang.Exception -> L3b
            int r8 = r6.outWidth     // Catch: java.lang.Exception -> L3b
            int r6 = r6.outHeight     // Catch: java.lang.Exception -> L3b
            r7.<init>(r8, r6)     // Catch: java.lang.Exception -> L3b
            r6 = r7
        L5e:
            if (r6 == 0) goto La0
            java.lang.Class<kd0.z2> r7 = kd0.z2.class
            i95.m r7 = i95.n0.c(r7)     // Catch: java.lang.Exception -> L3b
            java.lang.String r8 = "getService(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r7, r8)     // Catch: java.lang.Exception -> L3b
            kd0.z2 r7 = (kd0.z2) r7     // Catch: java.lang.Exception -> L3b
            int r8 = r6.x     // Catch: java.lang.Exception -> L3b
            int r9 = r6.y     // Catch: java.lang.Exception -> L3b
            jd0.u2 r7 = (jd0.u2) r7     // Catch: java.lang.Exception -> L3b
            boolean r7 = r7.wi(r8, r9)     // Catch: java.lang.Exception -> L3b
            if (r7 == 0) goto La0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3b
            r1.<init>(r0)     // Catch: java.lang.Exception -> L3b
            r1.append(r6)     // Catch: java.lang.Exception -> L3b
            java.lang.String r0 = " , imagePath:"
            r1.append(r0)     // Catch: java.lang.Exception -> L3b
            r1.append(r11)     // Catch: java.lang.Exception -> L3b
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Exception -> L3b
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r0)     // Catch: java.lang.Exception -> L3b
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L3b
            r4.put(r11, r0)     // Catch: java.lang.Exception -> L3b
            java.util.concurrent.ConcurrentHashMap r1 = r10.f352080c     // Catch: java.lang.Exception -> L3b
            r1.put(r11, r0)     // Catch: java.lang.Exception -> L3b
            java.util.HashSet r0 = r10.f352082e     // Catch: java.lang.Exception -> L3b
            r0.add(r11)     // Catch: java.lang.Exception -> L3b
            return r2
        La0:
            jz5.g r0 = r10.f352087j     // Catch: java.lang.Exception -> L3b
            jz5.n r0 = (jz5.n) r0     // Catch: java.lang.Exception -> L3b
            java.lang.Object r0 = r0.mo141623x754a37bb()     // Catch: java.lang.Exception -> L3b
            gd2.x r0 = (gd2.x) r0     // Catch: java.lang.Exception -> L3b
            r0.d(r11)     // Catch: java.lang.Exception -> L3b
            java.lang.String r11 = r1.concat(r11)     // Catch: java.lang.Exception -> L3b
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r11)     // Catch: java.lang.Exception -> L3b
            return r2
        Lb5:
            java.lang.String r0 = ""
            java.lang.Object[] r1 = new java.lang.Object[r3]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r5, r11, r0, r1)
        Lbc:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: gd2.n.a(java.lang.String):boolean");
    }
}
