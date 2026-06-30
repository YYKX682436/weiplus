package sr;

/* loaded from: classes10.dex */
public class l implements sr.a, dr.q {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.AbstractC10447x8c9cf7d9 f492930a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f492931b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb f492932c;

    public l(com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.AbstractC10447x8c9cf7d9 view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        this.f492930a = view;
        this.f492931b = "MicroMsg.EmojiViewDelegate";
    }

    @Override // dr.q
    public void a(boolean z17) {
        com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.AbstractC10447x8c9cf7d9 abstractC10447x8c9cf7d9 = this.f492930a;
        abstractC10447x8c9cf7d9.getClass();
        abstractC10447x8c9cf7d9.m43716xb42a35d(z17 ? 1 : -1);
    }

    @Override // sr.a
    /* renamed from: destroy */
    public void mo165058x5cd39ffa() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("destroy: ");
        sb6.append(this);
        sb6.append(' ');
        com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.AbstractC10447x8c9cf7d9 abstractC10447x8c9cf7d9 = this.f492930a;
        sb6.append(abstractC10447x8c9cf7d9);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f492931b, sb6.toString());
        zq.h.f556505a.b(abstractC10447x8c9cf7d9);
        abstractC10447x8c9cf7d9.m43715x36e51bc8(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        if (r1 != 49) goto L13;
     */
    @Override // sr.a
    /* renamed from: reload */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo165059xc84a8199() {
        /*
            r5 = this;
            com.tencent.mm.api.IEmojiInfo r0 = r5.f492932c
            com.tencent.mm.storage.emotion.EmojiInfo r0 = (com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) r0
            java.lang.String r1 = r5.f492931b
            com.tencent.mm.emoji.view.AbsEmojiView r2 = r5.f492930a
            if (r0 == 0) goto L5d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "reload: "
            r3.<init>(r4)
            java.lang.String r4 = r0.mo42933xb5885648()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r3)
            boolean r1 = r2.getGameUseCover()
            r3 = 1
            if (r1 == 0) goto L48
            int r1 = r0.f68653x95b20dd4
            r4 = 18
            if (r1 == r4) goto L37
            l75.e0 r4 = com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4.L2
            r4 = 50
            if (r1 == r4) goto L37
            r4 = 49
            if (r1 != r4) goto L48
        L37:
            r2.m43716xb42a35d(r3)
            android.content.Context r1 = r2.getContext()
            r3 = 300(0x12c, float:4.2E-43)
            android.graphics.Bitmap r0 = r0.a0(r1, r3)
            r2.setImageBitmap(r0)
            goto L68
        L48:
            r1 = 0
            r2.m43716xb42a35d(r1)
            zq.h r4 = zq.h.f556505a
            java.lang.String r4 = "emojiView"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r2, r4)
            dr.p r4 = new dr.p
            r4.<init>(r0, r2, r5)
            r0 = 0
            dr.s.g(r4, r1, r3, r0)
            goto L68
        L5d:
            java.lang.String r0 = "reload: emojiInfo is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            zq.h r0 = zq.h.f556505a
            r0.b(r2)
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sr.l.mo165059xc84a8199():void");
    }
}
