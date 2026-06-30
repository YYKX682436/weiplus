package vq;

/* loaded from: classes12.dex */
public final class x0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.debug.EmojiDebugUI f520766d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI) {
        super(0);
        this.f520766d = emojiDebugUI;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.ArrayList arrayList;
        com.p314xaae8f345.mm.p2614xca6eae71.e1 b17 = com.p314xaae8f345.mm.p2614xca6eae71.e1.b();
        synchronized (b17.f274776c) {
            arrayList = new java.util.ArrayList(b17.f274776c);
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21055x16b9a563 c21055x16b9a563 = (com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21055x16b9a563) it.next();
            com.p314xaae8f345.mm.p2614xca6eae71.t1 a17 = com.p314xaae8f345.mm.p2614xca6eae71.t1.f274908m.a();
            java.lang.String field_key = c21055x16b9a563.f67353x4b6e619a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_key, "field_key");
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21054xf494c2df f17 = a17.f(field_key);
            java.lang.String d17 = com.p314xaae8f345.mm.p2614xca6eae71.g.b().d(c21055x16b9a563.f67353x4b6e619a);
            if (f17 == null) {
                int i17 = c21055x16b9a563.f67353x4b6e619a.codePoints().toArray()[0];
                r26.a.a(16);
                java.lang.String num = java.lang.Integer.toString(i17, 16);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(num, "toString(...)");
                java.lang.String concat = "\\\\u".concat(num);
                java.lang.String field_key2 = c21055x16b9a563.f67353x4b6e619a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_key2, "field_key");
                java.nio.charset.Charset charset = r26.c.f450398a;
                byte[] bytes = field_key2.getBytes(charset);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
                byte[] encode = android.util.Base64.encode(bytes, 0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(encode, "encode(...)");
                new java.lang.String(encode, charset);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f520766d.d, "smiley key : " + c21055x16b9a563.f67353x4b6e619a + ", " + concat + ", " + d17);
            }
        }
        return jz5.f0.f384359a;
    }
}
