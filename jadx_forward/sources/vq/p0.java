package vq;

/* loaded from: classes9.dex */
public final class p0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2614xca6eae71.g0 f520741d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.debug.EmojiDebugUI f520742e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(com.p314xaae8f345.mm.p2614xca6eae71.g0 g0Var, com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI) {
        super(0);
        this.f520741d = g0Var;
        this.f520742e = emojiDebugUI;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.vfs.w6.f("/sdcard/temp/emojiRes/system_emoji_new/");
        com.p314xaae8f345.mm.vfs.w6.u("/sdcard/temp/emojiRes/system_emoji_new/");
        java.util.LinkedList emojiDataItems = this.f520741d.f274789d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(emojiDataItems, "emojiDataItems");
        java.util.Iterator it = emojiDataItems.iterator();
        int i17 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI = this.f520742e;
            if (!hasNext) {
                pm0.v.X(new vq.o0(emojiDebugUI));
                return jz5.f0.f384359a;
            }
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.p314xaae8f345.mm.p2614xca6eae71.c cVar = (com.p314xaae8f345.mm.p2614xca6eae71.c) next;
            boolean z17 = com.p314xaae8f345.mm.p2614xca6eae71.q0.f274869d;
            com.p314xaae8f345.mm.p2614xca6eae71.q0 q0Var = com.p314xaae8f345.mm.p2614xca6eae71.l0.f274840a;
            java.lang.String str = q0Var.f274876c ? com.p314xaae8f345.mm.p2614xca6eae71.q0.f274872g : com.p314xaae8f345.mm.p2614xca6eae71.q0.f274871f;
            com.p314xaae8f345.mm.p2614xca6eae71.g1 g1Var = cVar.f274757e;
            int i19 = g1Var.f274792d;
            com.p314xaae8f345.mm.p2614xca6eae71.k0 k0Var = q0Var.f274875b;
            byte[] N = com.p314xaae8f345.mm.vfs.w6.N(str, i19 + (k0Var != null ? k0Var.f274837d : 0), g1Var.f274793e);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.LinkedList codePoints = cVar.f274756d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(codePoints, "codePoints");
            int i27 = 0;
            for (java.lang.Object obj : codePoints) {
                int i28 = i27 + 1;
                if (i27 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                java.lang.Integer num = (java.lang.Integer) obj;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
                sb6.append(java.lang.Integer.toHexString(num.intValue()));
                if (i27 < codePoints.size() - 1) {
                    sb6.append("-");
                }
                i27 = i28;
            }
            com.p314xaae8f345.mm.vfs.w6.R("/sdcard/temp/emojiRes/system_emoji_new/" + ((java.lang.Object) sb6) + ".png", N);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(emojiDebugUI.d, "emoji item: startPos=" + cVar.f274757e.f274792d + ", size=" + cVar.f274757e.f274793e);
            i17 = i18;
        }
    }
}
