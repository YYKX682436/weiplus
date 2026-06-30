package gr;

/* loaded from: classes12.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 f356233a;

    /* renamed from: b, reason: collision with root package name */
    public final gr.w f356234b;

    /* renamed from: c, reason: collision with root package name */
    public final s25.a f356235c;

    public y(com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 emojiInfo, gr.w wVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiInfo, "emojiInfo");
        this.f356233a = emojiInfo;
        this.f356234b = wVar;
        this.f356235c = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi();
        boolean z17 = false;
        if (com.p314xaae8f345.mm.vfs.w6.j(this.f356233a.N0())) {
            if (com.p314xaae8f345.mm.vfs.w6.k(this.f356233a.N0()) <= ((y12.h) r12).L(this.f356233a, true)) {
                gr.v vVar = gr.v.f356229a;
                vVar.a(false);
                if (vVar.b().getBoolean("capture_full", false)) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = this.f356233a;
                    int i17 = c21053xdbf1e5f4.f68651xd681f13a;
                    if (i17 < 5) {
                        c21053xdbf1e5f4.f68651xd681f13a = i17 + 1;
                        if (wVar != null) {
                            ((qr.f) wVar).a(1, null, null);
                        }
                    } else if (wVar != null) {
                        ((qr.f) wVar).a(9, null, null);
                    }
                } else {
                    z17 = true;
                }
            } else if (wVar != null) {
                ((qr.f) wVar).a(2, null, null);
            }
        } else if (wVar != null) {
            ((qr.f) wVar).a(10, null, null);
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiUploadLogic", "start upload emoji");
            qr.y yVar = qr.y.f447585d;
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 emojiInfo2 = this.f356233a;
            gr.x xVar = new gr.x(this);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiInfo2, "emojiInfo");
            new qr.o(emojiInfo2, true, null, 0, null, null, null, false, xVar);
        }
    }
}
