package com.p314xaae8f345.mm.p679x5c28046.p680xb06291ee;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/emoji/decode/MMGIFJNIFactory;", "", "()V", "Companion", "plugin-emojisdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.mm.emoji.decode.MMGIFJNIFactory */
/* loaded from: classes12.dex */
public final class C10437x90aa8ac9 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.p314xaae8f345.mm.p679x5c28046.p680xb06291ee.C10437x90aa8ac9.Companion INSTANCE = new com.p314xaae8f345.mm.p679x5c28046.p680xb06291ee.C10437x90aa8ac9.Companion(null);
    private static final java.lang.String TAG = "MicroMsg.MMGIFJNIFactory";

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tJ\u0010\u0010\b\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ-\u0010\b\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\b\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\tJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u000bJ\"\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eR\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/tencent/mm/emoji/decode/MMGIFJNIFactory$Companion;", "", "Lwq/d;", "decoder", "Landroid/graphics/Bitmap;", "decodeThumbInternal", "", "md5", "getDecoder", "Lcom/tencent/mm/storage/emotion/EmojiInfo;", "emojiInfo", "", "bytes", "cacheKey", "", "isWxEmoji", "([BLjava/lang/String;Ljava/lang/Boolean;)Lwq/d;", "isValid", "decodeThumb", "byteArray", "TAG", "Ljava/lang/String;", "<init>", "()V", "plugin-emojisdk_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.tencent.mm.emoji.decode.MMGIFJNIFactory$Companion, reason: from kotlin metadata */
    /* loaded from: classes12.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
            this();
        }

        /* renamed from: decodeThumbInternal */
        private final android.graphics.Bitmap m43676x75435765(wq.d decoder) {
            if (!m43685x7b953cf2(decoder)) {
                return null;
            }
            decoder.c();
            android.graphics.Bitmap mo174306x74704fb7 = decoder.mo174306x74704fb7();
            decoder.mo174305x5cd39ffa();
            return mo174306x74704fb7;
        }

        /* renamed from: getDecoder$default */
        public static /* synthetic */ wq.d m43677x35d11fab(com.p314xaae8f345.mm.p679x5c28046.p680xb06291ee.C10437x90aa8ac9.Companion companion, byte[] bArr, java.lang.String str, java.lang.Boolean bool, int i17, java.lang.Object obj) {
            if ((i17 & 2) != 0) {
                str = "";
            }
            return companion.m43684x99bce80e(bArr, str, bool);
        }

        /* renamed from: decodeThumb */
        public final android.graphics.Bitmap m43678x46823488(com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 emojiInfo) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiInfo, "emojiInfo");
            wq.d m43681x99bce80e = m43681x99bce80e(emojiInfo);
            if (!m43685x7b953cf2(m43681x99bce80e)) {
                return null;
            }
            m43681x99bce80e.c();
            android.graphics.Bitmap mo174306x74704fb7 = m43681x99bce80e.mo174306x74704fb7();
            m43681x99bce80e.mo174305x5cd39ffa();
            return mo174306x74704fb7;
        }

        /* renamed from: getDecoder */
        public final wq.d m43682x99bce80e(java.lang.String md52) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(md52, "md5");
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 u17 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().u1(md52);
            return u17 == null ? new wq.b() : m43681x99bce80e(u17);
        }

        /* renamed from: isValid */
        public final boolean m43685x7b953cf2(wq.d decoder) {
            return (decoder == null || (decoder instanceof wq.b)) ? false : true;
        }

        /* renamed from: getDecoder */
        public final wq.d m43683x99bce80e(byte[] bytes) {
            return m43684x99bce80e(bytes, null, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x005d A[RETURN] */
        /* renamed from: getDecoder */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final wq.d m43684x99bce80e(byte[] r4, java.lang.String r5, java.lang.Boolean r6) {
            /*
                r3 = this;
                if (r4 == 0) goto L54
                r0 = 0
                boolean r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.h(r4)     // Catch: com.p314xaae8f345.mm.p1006xc5476f33.gif.C16078xe0714eab -> L3a
                if (r1 == 0) goto L28
                java.lang.String r1 = ""
                if (r5 == 0) goto L21
                boolean r2 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r5, r1)     // Catch: com.p314xaae8f345.mm.p1006xc5476f33.gif.C16078xe0714eab -> L3a
                if (r2 != 0) goto L21
                wq.g r1 = new wq.g     // Catch: com.p314xaae8f345.mm.p1006xc5476f33.gif.C16078xe0714eab -> L3a
                if (r6 == 0) goto L1c
                boolean r6 = r6.booleanValue()     // Catch: com.p314xaae8f345.mm.p1006xc5476f33.gif.C16078xe0714eab -> L3a
                goto L1d
            L1c:
                r6 = r0
            L1d:
                r1.<init>(r4, r5, r6)     // Catch: com.p314xaae8f345.mm.p1006xc5476f33.gif.C16078xe0714eab -> L3a
                goto L55
            L21:
                wq.g r5 = new wq.g     // Catch: com.p314xaae8f345.mm.p1006xc5476f33.gif.C16078xe0714eab -> L3a
                r5.<init>(r4, r1, r0)     // Catch: com.p314xaae8f345.mm.p1006xc5476f33.gif.C16078xe0714eab -> L3a
                r1 = r5
                goto L55
            L28:
                boolean r5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.d(r4)     // Catch: com.p314xaae8f345.mm.p1006xc5476f33.gif.C16078xe0714eab -> L3a
                if (r5 == 0) goto L34
                wq.f r1 = new wq.f     // Catch: com.p314xaae8f345.mm.p1006xc5476f33.gif.C16078xe0714eab -> L3a
                r1.<init>(r4)     // Catch: com.p314xaae8f345.mm.p1006xc5476f33.gif.C16078xe0714eab -> L3a
                goto L55
            L34:
                wq.e r1 = new wq.e     // Catch: com.p314xaae8f345.mm.p1006xc5476f33.gif.C16078xe0714eab -> L3a
                r1.<init>(r4)     // Catch: com.p314xaae8f345.mm.p1006xc5476f33.gif.C16078xe0714eab -> L3a
                goto L55
            L3a:
                r5 = move-exception
                java.lang.String r6 = com.p314xaae8f345.mm.p679x5c28046.p680xb06291ee.C10437x90aa8ac9.m43675x8b314d6d()
                java.lang.String r1 = "decode bytes error"
                java.lang.Object[] r0 = new java.lang.Object[r0]
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r6, r5, r1, r0)
                int r5 = r5.m64939x130a215f()
                r6 = 103(0x67, float:1.44E-43)
                if (r5 != r6) goto L54
                wq.e r1 = new wq.e
                r1.<init>(r4)
                goto L55
            L54:
                r1 = 0
            L55:
                if (r1 != 0) goto L5d
                wq.b r4 = new wq.b
                r4.<init>()
                return r4
            L5d:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p679x5c28046.p680xb06291ee.C10437x90aa8ac9.Companion.m43684x99bce80e(byte[], java.lang.String, java.lang.Boolean):wq.d");
        }

        /* renamed from: decodeThumb */
        public final android.graphics.Bitmap m43679x46823488(byte[] byteArray) {
            return m43676x75435765(m43683x99bce80e(byteArray));
        }

        /* renamed from: decodeThumb */
        public final android.graphics.Bitmap m43680x46823488(byte[] byteArray, java.lang.String cacheKey, boolean isWxEmoji) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cacheKey, "cacheKey");
            return m43676x75435765(m43684x99bce80e(byteArray, cacheKey, java.lang.Boolean.valueOf(isWxEmoji)));
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x00a3  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x00a9 A[RETURN] */
        /* renamed from: getDecoder */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final wq.d m43681x99bce80e(com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 r6) {
            /*
                r5 = this;
                java.lang.Class<k12.s> r0 = k12.s.class
                java.lang.String r1 = "emojiInfo"
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r1)
                int r1 = r6.f68653x95b20dd4     // Catch: com.p314xaae8f345.mm.p1006xc5476f33.gif.C16078xe0714eab -> L66
                r2 = 18
                if (r1 == r2) goto L58
                l75.e0 r2 = com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4.L2     // Catch: com.p314xaae8f345.mm.p1006xc5476f33.gif.C16078xe0714eab -> L66
                r2 = 50
                if (r1 == r2) goto L58
                r2 = 49
                if (r1 != r2) goto L18
                goto L58
            L18:
                boolean r1 = r6.I1()     // Catch: com.p314xaae8f345.mm.p1006xc5476f33.gif.C16078xe0714eab -> L66
                if (r1 == 0) goto L33
                wq.f r1 = new wq.f     // Catch: com.p314xaae8f345.mm.p1006xc5476f33.gif.C16078xe0714eab -> L66
                android.content.Context r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a     // Catch: com.p314xaae8f345.mm.p1006xc5476f33.gif.C16078xe0714eab -> L66
                java.lang.String r3 = r6.mo42934xfb82e301()     // Catch: com.p314xaae8f345.mm.p1006xc5476f33.gif.C16078xe0714eab -> L66
                java.io.InputStream r2 = h12.e.a(r2, r3)     // Catch: com.p314xaae8f345.mm.p1006xc5476f33.gif.C16078xe0714eab -> L66
                java.lang.String r3 = "getEmojiFile(...)"
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r3)     // Catch: com.p314xaae8f345.mm.p1006xc5476f33.gif.C16078xe0714eab -> L66
                r1.<init>(r2)     // Catch: com.p314xaae8f345.mm.p1006xc5476f33.gif.C16078xe0714eab -> L66
                goto La1
            L33:
                i95.m r1 = i95.n0.c(r0)     // Catch: com.p314xaae8f345.mm.p1006xc5476f33.gif.C16078xe0714eab -> L66
                k12.s r1 = (k12.s) r1     // Catch: com.p314xaae8f345.mm.p1006xc5476f33.gif.C16078xe0714eab -> L66
                g30.h r1 = (g30.h) r1     // Catch: com.p314xaae8f345.mm.p1006xc5476f33.gif.C16078xe0714eab -> L66
                s25.b r1 = r1.Bi()     // Catch: com.p314xaae8f345.mm.p1006xc5476f33.gif.C16078xe0714eab -> L66
                byte[] r1 = r1.z(r6)     // Catch: com.p314xaae8f345.mm.p1006xc5476f33.gif.C16078xe0714eab -> L66
                if (r1 == 0) goto La0
                boolean r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.h(r1)     // Catch: com.p314xaae8f345.mm.p1006xc5476f33.gif.C16078xe0714eab -> L66
                if (r2 == 0) goto L51
                wq.h r2 = new wq.h     // Catch: com.p314xaae8f345.mm.p1006xc5476f33.gif.C16078xe0714eab -> L66
                r2.<init>(r1)     // Catch: com.p314xaae8f345.mm.p1006xc5476f33.gif.C16078xe0714eab -> L66
                goto L56
            L51:
                wq.f r2 = new wq.f     // Catch: com.p314xaae8f345.mm.p1006xc5476f33.gif.C16078xe0714eab -> L66
                r2.<init>(r1)     // Catch: com.p314xaae8f345.mm.p1006xc5476f33.gif.C16078xe0714eab -> L66
            L56:
                r1 = r2
                goto La1
            L58:
                wq.e r1 = new wq.e     // Catch: com.p314xaae8f345.mm.p1006xc5476f33.gif.C16078xe0714eab -> L66
                android.content.Context r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a     // Catch: com.p314xaae8f345.mm.p1006xc5476f33.gif.C16078xe0714eab -> L66
                r3 = 300(0x12c, float:4.2E-43)
                android.graphics.Bitmap r2 = r6.a0(r2, r3)     // Catch: com.p314xaae8f345.mm.p1006xc5476f33.gif.C16078xe0714eab -> L66
                r1.<init>(r2)     // Catch: com.p314xaae8f345.mm.p1006xc5476f33.gif.C16078xe0714eab -> L66
                goto La1
            L66:
                r1 = move-exception
                java.lang.String r2 = com.p314xaae8f345.mm.p679x5c28046.p680xb06291ee.C10437x90aa8ac9.m43675x8b314d6d()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r4 = "decode error: "
                r3.<init>(r4)
                int r4 = r1.m64939x130a215f()
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r2, r3)
                int r1 = r1.m64939x130a215f()
                r2 = 103(0x67, float:1.44E-43)
                if (r1 != r2) goto La0
                i95.m r0 = i95.n0.c(r0)
                k12.s r0 = (k12.s) r0
                g30.h r0 = (g30.h) r0
                s25.b r0 = r0.Bi()
                byte[] r6 = r0.z(r6)
                if (r6 == 0) goto La0
                wq.e r1 = new wq.e
                r1.<init>(r6)
                goto La1
            La0:
                r1 = 0
            La1:
                if (r1 != 0) goto La9
                wq.b r6 = new wq.b
                r6.<init>()
                return r6
            La9:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p679x5c28046.p680xb06291ee.C10437x90aa8ac9.Companion.m43681x99bce80e(com.tencent.mm.storage.emotion.EmojiInfo):wq.d");
        }
    }
}
