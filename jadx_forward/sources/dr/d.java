package dr;

/* loaded from: classes12.dex */
public final class d extends dr.p {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f323911g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f323912h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d(com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 r3, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2482x5c28046.C19690x7f5eb045 r4, java.lang.String r5) {
        /*
            r2 = this;
            java.lang.String r0 = "emojiInfo"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r3, r0)
            java.lang.String r0 = "view"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r4, r0)
            java.lang.String r0 = "cacheKey"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r0)
            sr.a r0 = r4.getDelegate()
            java.lang.String r1 = "null cannot be cast to non-null type com.tencent.mm.emoji.loader.request.IRequest.Callback"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r0, r1)
            r2.<init>(r3, r4, r0)
            r2.f323911g = r5
            r3 = 1
            r2.f323912h = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dr.d.<init>(com.tencent.mm.storage.emotion.EmojiInfo, com.tencent.mm.pluginsdk.ui.emoji.ChattingEmojiView, java.lang.String):void");
    }

    @Override // dr.p, dr.s
    public void c(boolean z17) {
        android.graphics.drawable.Drawable drawable;
        java.lang.ref.WeakReference weakReference = this.f323935c;
        java.util.Objects.toString(weakReference != null ? (com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.AbstractC10447x8c9cf7d9) weakReference.get() : null);
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = this.f323933a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(interfaceC4987x84e327cb, "null cannot be cast to non-null type com.tencent.mm.storage.emotion.EmojiInfo");
        java.lang.ref.WeakReference weakReference2 = this.f323935c;
        com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.AbstractC10447x8c9cf7d9 abstractC10447x8c9cf7d9 = weakReference2 != null ? (com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.AbstractC10447x8c9cf7d9) weakReference2.get() : null;
        if (z17) {
            br.a aVar = new br.a();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(interfaceC4987x84e327cb, "null cannot be cast to non-null type com.tencent.mm.storage.emotion.EmojiInfo");
            drawable = aVar.b((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) interfaceC4987x84e327cb, new dr.b(this));
        } else {
            drawable = null;
        }
        if (drawable == null && this.f323912h) {
            this.f323912h = false;
            dr.s.e(this, false, 1, null);
            return;
        }
        final dr.a aVar2 = new dr.a(this, drawable, abstractC10447x8c9cf7d9, z17);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread())) {
            aVar2.mo152xb9724478();
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.c4.f274029b.f274030a.d(new java.lang.Runnable(aVar2) { // from class: dr.e

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ yz5.a f323913d;

                {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aVar2, "function");
                    this.f323913d = aVar2;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f323913d.mo152xb9724478();
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
    
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r2, r3 != null ? (com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.AbstractC10447x8c9cf7d9) r3.get() : null) != false) goto L23;
     */
    @Override // dr.p, dr.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(boolean r5) {
        /*
            r4 = this;
            com.tencent.mm.sdk.platformtools.r2 r5 = ar.b.f94888a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "get "
            r5.<init>(r0)
            java.lang.String r0 = r4.f323911g
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            java.lang.String r1 = "MicroMsg.EmojiLoader.AnimateCache"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r5)
            r5 = 0
            if (r0 != 0) goto L1b
            goto L2c
        L1b:
            com.tencent.mm.sdk.platformtools.r2 r1 = ar.b.f94888a
            java.lang.Object r0 = r1.get(r0)
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r0.get()
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            goto L2d
        L2c:
            r0 = r5
        L2d:
            java.util.Objects.toString(r0)
            java.lang.ref.WeakReference r1 = r4.f323935c
            if (r1 == 0) goto L3b
            java.lang.Object r1 = r1.get()
            com.tencent.mm.emoji.view.AbsEmojiView r1 = (com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.AbstractC10447x8c9cf7d9) r1
            goto L3c
        L3b:
            r1 = r5
        L3c:
            java.util.Objects.toString(r1)
            r1 = 1
            if (r0 == 0) goto L84
            android.graphics.drawable.Drawable$Callback r2 = r0.getCallback()
            if (r2 == 0) goto L5e
            android.graphics.drawable.Drawable$Callback r2 = r0.getCallback()
            java.lang.ref.WeakReference r3 = r4.f323935c
            if (r3 == 0) goto L57
            java.lang.Object r3 = r3.get()
            com.tencent.mm.emoji.view.AbsEmojiView r3 = (com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.AbstractC10447x8c9cf7d9) r3
            goto L58
        L57:
            r3 = r5
        L58:
            boolean r2 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r2, r3)
            if (r2 == 0) goto L84
        L5e:
            java.lang.ref.WeakReference r5 = r4.f323935c
            if (r5 == 0) goto L6d
            java.lang.Object r5 = r5.get()
            com.tencent.mm.emoji.view.AbsEmojiView r5 = (com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.AbstractC10447x8c9cf7d9) r5
            if (r5 == 0) goto L6d
            r5.setImageDrawable(r0)
        L6d:
            java.lang.ref.WeakReference r5 = r4.f323935c
            if (r5 == 0) goto L7c
            java.lang.Object r5 = r5.get()
            com.tencent.mm.emoji.view.AbsEmojiView r5 = (com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.AbstractC10447x8c9cf7d9) r5
            if (r5 == 0) goto L7c
            r5.m64933xc84dc82d()
        L7c:
            dr.q r5 = r4.f323930d
            if (r5 == 0) goto L99
            r5.a(r1)
            goto L99
        L84:
            com.tencent.mm.api.IEmojiInfo r0 = r4.f323933a
            boolean r0 = r0.E0()
            if (r0 == 0) goto L95
            dr.c r0 = new dr.c
            r0.<init>(r4)
            pm0.v.K(r5, r0)
            goto L99
        L95:
            r0 = 0
            dr.s.e(r4, r0, r1, r5)
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dr.d.f(boolean):void");
    }
}
