package cw2;

/* loaded from: classes14.dex */
public final class q4 implements cw2.aa {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15358xa415fd5d f305482a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.xm f305483b;

    public q4(android.content.Context context, r45.mb4 media) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(media, "media");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15358xa415fd5d c15358xa415fd5d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15358xa415fd5d(context);
        this.f305482a = c15358xa415fd5d;
        java.lang.String m75945x2fec8307 = media.m75945x2fec8307(0);
        this.f305483b = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.xm(m75945x2fec8307 == null ? "" : m75945x2fec8307, c15358xa415fd5d.m62434x3a06c52a());
    }

    @Override // cw2.aa
    public void a(yz5.a onReady, yz5.a onDestroy, yz5.l onSeekFrame) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onReady, "onReady");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onDestroy, "onDestroy");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onSeekFrame, "onSeekFrame");
        try {
            this.f305483b.e(onReady, onDestroy, onSeekFrame);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("FinderNormalVideoCoverPreview", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // cw2.aa
    /* renamed from: destroy */
    public void mo122847x5cd39ffa() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.xm xmVar = this.f305483b;
        xmVar.d();
        xmVar.a().g();
        xmVar.b().g();
        android.os.HandlerThread handlerThread = xmVar.f214882j;
        if (handlerThread == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("ht");
            throw null;
        }
        handlerThread.quit();
        yz5.a aVar = xmVar.f214889q;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }

    @Override // cw2.aa
    /* renamed from: getBitmap */
    public android.graphics.Bitmap mo122848x12501425() {
        return this.f305482a.m62434x3a06c52a().getBitmap();
    }

    @Override // cw2.aa
    /* renamed from: getCurrentPositionMs */
    public long mo122849xddd35a52() {
        return this.f305483b.f214884l;
    }

    @Override // cw2.aa
    /* renamed from: getView */
    public android.view.View mo122850xfb86a31b() {
        return this.f305482a;
    }

    @Override // cw2.aa
    /* renamed from: resume */
    public void mo122851xc84dc82d() {
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0083 A[Catch: all -> 0x0094, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x0025, B:8:0x002d, B:10:0x0033, B:11:0x007f, B:13:0x0083, B:15:0x0087, B:16:0x008a, B:17:0x008d, B:22:0x003b, B:24:0x004b, B:26:0x004f, B:27:0x0052, B:29:0x0056, B:30:0x0059), top: B:3:0x0007 }] */
    @Override // cw2.aa
    /* renamed from: seekTo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo122852xc9fc1b13(long r14) {
        /*
            r13 = this;
            com.tencent.mm.plugin.finder.view.xm r0 = r13.f305483b
            java.lang.String r1 = "lxl change taget, start sync time:"
            java.lang.Object r2 = r0.f214876d
            monitor-enter(r2)
            r0.f214884l = r14     // Catch: java.lang.Throwable -> L94
            gp.c r3 = r0.b()     // Catch: java.lang.Throwable -> L94
            long r4 = r0.f214884l     // Catch: java.lang.Throwable -> L94
            r6 = 1000(0x3e8, float:1.401E-42)
            long r6 = (long) r6     // Catch: java.lang.Throwable -> L94
            long r4 = r4 * r6
            r8 = 0
            r3.h(r4, r8)     // Catch: java.lang.Throwable -> L94
            gp.c r3 = r0.b()     // Catch: java.lang.Throwable -> L94
            long r3 = r3.b()     // Catch: java.lang.Throwable -> L94
            long r9 = r0.f214885m     // Catch: java.lang.Throwable -> L94
            int r5 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r5 != 0) goto L3b
            long r9 = r0.f214886n     // Catch: java.lang.Throwable -> L94
            r11 = 0
            int r5 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r5 < 0) goto L3b
            long r11 = r14 * r6
            int r5 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r5 >= 0) goto L3b
            java.lang.String r14 = r0.f214875c     // Catch: java.lang.Throwable -> L94
            java.lang.String r15 = "lxl same taget~"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r14, r15)     // Catch: java.lang.Throwable -> L94
            goto L7f
        L3b:
            r0.f214885m = r3     // Catch: java.lang.Throwable -> L94
            gp.c r3 = r0.a()     // Catch: java.lang.Throwable -> L94
            long r4 = r0.f214884l     // Catch: java.lang.Throwable -> L94
            long r4 = r4 * r6
            r3.h(r4, r8)     // Catch: java.lang.Throwable -> L94
            boolean r3 = r0.f214888p     // Catch: java.lang.Throwable -> L94
            if (r3 == 0) goto L59
            android.media.MediaCodec r3 = r0.f214879g     // Catch: java.lang.Throwable -> L94
            if (r3 == 0) goto L52
            r3.flush()     // Catch: java.lang.Throwable -> L94
        L52:
            android.media.MediaCodec r3 = r0.f214879g     // Catch: java.lang.Throwable -> L94
            if (r3 == 0) goto L59
            r3.start()     // Catch: java.lang.Throwable -> L94
        L59:
            java.lang.String r3 = r0.f214875c     // Catch: java.lang.Throwable -> L94
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L94
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L94
            long r8 = r0.f214885m     // Catch: java.lang.Throwable -> L94
            long r8 = r8 / r6
            r4.append(r8)     // Catch: java.lang.Throwable -> L94
            java.lang.String r1 = ", target time:"
            r4.append(r1)     // Catch: java.lang.Throwable -> L94
            r4.append(r14)     // Catch: java.lang.Throwable -> L94
            java.lang.String r14 = ", flush:"
            r4.append(r14)     // Catch: java.lang.Throwable -> L94
            boolean r14 = r0.f214888p     // Catch: java.lang.Throwable -> L94
            r4.append(r14)     // Catch: java.lang.Throwable -> L94
            java.lang.String r14 = r4.toString()     // Catch: java.lang.Throwable -> L94
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r14)     // Catch: java.lang.Throwable -> L94
        L7f:
            boolean r14 = r0.f214888p     // Catch: java.lang.Throwable -> L94
            if (r14 != 0) goto L8d
            android.media.MediaCodec r14 = r0.f214879g     // Catch: java.lang.Throwable -> L94
            if (r14 == 0) goto L8a
            r14.start()     // Catch: java.lang.Throwable -> L94
        L8a:
            r14 = 1
            r0.f214888p = r14     // Catch: java.lang.Throwable -> L94
        L8d:
            java.lang.Object r14 = r0.f214876d     // Catch: java.lang.Throwable -> L94
            r14.notify()     // Catch: java.lang.Throwable -> L94
            monitor-exit(r2)
            return
        L94:
            r14 = move-exception
            monitor-exit(r2)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: cw2.q4.mo122852xc9fc1b13(long):void");
    }
}
