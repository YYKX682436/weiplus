package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class te implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.af f109056a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f109057b;

    public te(com.tencent.mm.plugin.finder.feed.af afVar, boolean z17) {
        this.f109056a = afVar;
        this.f109057b = z17;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003f A[Catch: Exception -> 0x0050, TryCatch #0 {Exception -> 0x0050, blocks: (B:11:0x0006, B:13:0x001e, B:17:0x002b, B:19:0x0031, B:20:0x0037, B:22:0x003f, B:24:0x0049, B:25:0x004f), top: B:10:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049 A[Catch: Exception -> 0x0050, TryCatch #0 {Exception -> 0x0050, blocks: (B:11:0x0006, B:13:0x001e, B:17:0x002b, B:19:0x0031, B:20:0x0037, B:22:0x003f, B:24:0x0049, B:25:0x004f), top: B:10:0x0006 }] */
    @Override // ep0.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(ip0.a r11, cp0.n r12, java.lang.Object r13) {
        /*
            r10 = this;
            android.graphics.Bitmap r13 = (android.graphics.Bitmap) r13
            com.tencent.mm.plugin.finder.feed.af r11 = r10.f109056a
            if (r13 == 0) goto L5b
            xy2.b r0 = xy2.b.f458155b     // Catch: java.lang.Exception -> L50
            java.lang.String r1 = "FinderLiveConcertTicketUIC_ImageLoader_recycle_check"
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            com.tencent.mm.plugin.finder.feed.se r7 = new com.tencent.mm.plugin.finder.feed.se     // Catch: java.lang.Exception -> L50
            r7.<init>(r13)     // Catch: java.lang.Exception -> L50
            r8 = 60
            r9 = 0
            pm0.z.b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L50
            r45.l70 r12 = r11.U     // Catch: java.lang.Exception -> L50
            if (r12 == 0) goto L28
            r0 = 10
            boolean r12 = r12.getBoolean(r0)     // Catch: java.lang.Exception -> L50
            r0 = 1
            if (r12 != r0) goto L28
            goto L29
        L28:
            r0 = 0
        L29:
            if (r0 == 0) goto L37
            boolean r12 = r13.isRecycled()     // Catch: java.lang.Exception -> L50
            if (r12 != 0) goto L37
            r12 = 1103626240(0x41c80000, float:25.0)
            android.graphics.Bitmap r13 = com.tencent.mm.plugin.finder.feed.af.P6(r11, r13, r12)     // Catch: java.lang.Exception -> L50
        L37:
            java.util.LinkedList r12 = r11.f106279y0     // Catch: java.lang.Exception -> L50
            jz5.l r0 = new jz5.l     // Catch: java.lang.Exception -> L50
            android.widget.ImageView r1 = r11.E     // Catch: java.lang.Exception -> L50
            if (r1 == 0) goto L49
            r0.<init>(r1, r13)     // Catch: java.lang.Exception -> L50
            r12.add(r0)     // Catch: java.lang.Exception -> L50
            r11.c7()     // Catch: java.lang.Exception -> L50
            goto L6e
        L49:
            java.lang.String r12 = "concertlayoutBg"
            kotlin.jvm.internal.o.o(r12)     // Catch: java.lang.Exception -> L50
            r12 = 0
            throw r12     // Catch: java.lang.Exception -> L50
        L50:
            r12 = move-exception
            java.lang.String r11 = r11.f106255d
            java.lang.String r12 = r12.toString()
            com.tencent.mars.xlog.Log.e(r11, r12)
            goto L6e
        L5b:
            boolean r12 = r10.f109057b
            if (r12 == 0) goto L6b
            r11.getClass()
            com.tencent.mm.plugin.finder.feed.we r12 = new com.tencent.mm.plugin.finder.feed.we
            r12.<init>(r11)
            pm0.v.X(r12)
            goto L6e
        L6b:
            r11.c7()
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.te.a(ip0.a, cp0.n, java.lang.Object):void");
    }
}
