package com.p314xaae8f345.p2845xc516c4b6.biz;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014J$\u0010\u0007\u001a\u00020\u00052\u001a\u0010\u0006\u001a\u0016\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0004\u0012\u00020\u00050\u0002H&J\b\u0010\t\u001a\u00020\bH&J\b\u0010\n\u001a\u00020\bH&J\"\u0010\f\u001a\u00020\u00052\u0018\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0003\u0012\u0004\u0012\u00020\u00050\u0002H&J\"\u0010\r\u001a\u00020\u00052\u0018\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0003\u0012\u0004\u0012\u00020\u00050\u0002H&J$\u0010\u000e\u001a\u00020\u00052\u001a\u0010\u0006\u001a\u0016\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0004\u0012\u00020\u00050\u0002H&J\"\u0010\u000f\u001a\u00020\u00052\u0018\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0004\u0012\u00020\u00050\u0002H&J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0010H&J\"\u0010\u0012\u001a\u00020\u00052\u0018\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0003\u0012\u0004\u0012\u00020\u00050\u0002H&J\"\u0010\u0013\u001a\u00020\u00052\u0018\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0004\u0012\u00020\u00050\u0002H&¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lcom/tencent/pigeon/biz/BizLocationApi;", "", "Lkotlin/Function1;", "Lkotlin/Result;", "Lcom/tencent/pigeon/biz/BizPOIInfo;", "Ljz5/f0;", "callback", "getBizPOIInfo", "", "isOpenK1kLocation", "isOpenSystemLocation", "", "requestLocationAuth", "requestLocationWithSystemAuth", "getCacheLocationInfo", "gotoSystemLocationSettings", "Lcom/tencent/pigeon/biz/BizUserLocationInfo;", "getUserLocation", "isUnderFreqControl", "markLastGetPOITime", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.pigeon.biz.BizLocationApi */
/* loaded from: classes11.dex */
public interface InterfaceC23136x3de96732 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23136x3de96732.Companion INSTANCE = com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23136x3de96732.Companion.f40611x83b00915;

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006R#\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/tencent/pigeon/biz/BizLocationApi$Companion;", "", "Lio/flutter/plugin/common/BinaryMessenger;", "binaryMessenger", "Lcom/tencent/pigeon/biz/BizLocationApi;", "api", "", "messageChannelSuffix", "Ljz5/f0;", "setUp", "Lio/flutter/plugin/common/MessageCodec;", "codec$delegate", "Ljz5/g;", "getCodec", "()Lio/flutter/plugin/common/MessageCodec;", "codec", "<init>", "()V", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.tencent.pigeon.biz.BizLocationApi$Companion, reason: from kotlin metadata */
    /* loaded from: classes11.dex */
    public static final class Companion {

        /* renamed from: $$INSTANCE */
        static final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23136x3de96732.Companion f40611x83b00915 = new com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23136x3de96732.Companion();

        /* renamed from: codec$delegate, reason: from kotlin metadata */
        private static final jz5.g codec = jz5.h.b(com.p314xaae8f345.p2845xc516c4b6.biz.C23137x85c6987a.f40613x4fbc8495);

        private Companion() {
        }

        /* renamed from: setUp$default */
        public static /* synthetic */ void m85076x97a46f3a(com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23136x3de96732.Companion companion, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23136x3de96732 interfaceC23136x3de96732, java.lang.String str, int i17, java.lang.Object obj) {
            if ((i17 & 4) != 0) {
                str = "";
            }
            companion.m85078x684369d(interfaceC28679x1b8c77f2, interfaceC23136x3de96732, str);
        }

        /* renamed from: getCodec */
        public final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28686xbb96606f<java.lang.Object> m85077x7444b660() {
            return (io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28686xbb96606f) codec.mo141623x754a37bb();
        }

        /* renamed from: setUp */
        public final void m85078x684369d(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 binaryMessenger, final com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23136x3de96732 interfaceC23136x3de96732, java.lang.String messageChannelSuffix) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binaryMessenger, "binaryMessenger");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(messageChannelSuffix, "messageChannelSuffix");
            java.lang.String concat = messageChannelSuffix.length() > 0 ? ".".concat(messageChannelSuffix) : "";
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.BizLocationApi.getBizPOIInfo" + concat, m85077x7444b660());
            if (interfaceC23136x3de96732 != null) {
                c28677x2598ceaa.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: com.tencent.pigeon.biz.BizLocationApi$Companion$setUp$1$1

                    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Result;", "Lcom/tencent/pigeon/biz/BizPOIInfo;", "result", "Ljz5/f0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                    /* renamed from: com.tencent.pigeon.biz.BizLocationApi$Companion$setUp$1$1$1, reason: invalid class name */
                    /* loaded from: classes11.dex */
                    public static final class AnonymousClass1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

                        /* renamed from: $reply */
                        final /* synthetic */ io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply<java.lang.Object> f40615x43e48946;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply<java.lang.Object> reply) {
                            super(1);
                            this.f40615x43e48946 = reply;
                        }

                        @Override // yz5.l
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ java.lang.Object mo146xb9724478(java.lang.Object obj) {
                            m85080xb9724478(((p3321xbce91901.C29043x91b2b43d) obj).getValue());
                            return jz5.f0.f384359a;
                        }

                        /* renamed from: invoke */
                        public final void m85080xb9724478(java.lang.Object obj) {
                            java.util.List m85099xa75ba507;
                            java.util.List m85098xfc72afde;
                            java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(obj);
                            if (m143898xd4a2fc34 != null) {
                                io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply<java.lang.Object> reply = this.f40615x43e48946;
                                m85098xfc72afde = com.p314xaae8f345.p2845xc516c4b6.biz.C23153xca70faa7.m85098xfc72afde(m143898xd4a2fc34);
                                reply.mo84787x67612ea(m85098xfc72afde);
                            } else {
                                if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(obj)) {
                                    obj = null;
                                }
                                io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply<java.lang.Object> reply2 = this.f40615x43e48946;
                                m85099xa75ba507 = com.p314xaae8f345.p2845xc516c4b6.biz.C23153xca70faa7.m85099xa75ba507((com.p314xaae8f345.p2845xc516c4b6.biz.C23184x5f38fda5) obj);
                                reply2.mo84787x67612ea(m85099xa75ba507);
                            }
                        }
                    }

                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply<java.lang.Object> reply) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reply, "reply");
                        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23136x3de96732.this.mo85065xd6a7d97b(new com.p314xaae8f345.p2845xc516c4b6.biz.C23138x97caedcd.AnonymousClass1(reply));
                    }
                });
            } else {
                c28677x2598ceaa.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa2 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.BizLocationApi.isOpenK1kLocation" + concat, m85077x7444b660());
            if (interfaceC23136x3de96732 != null) {
                c28677x2598ceaa2.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: com.tencent.pigeon.biz.BizLocationApi$Companion$setUp$2$1
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply<java.lang.Object> reply) {
                        java.util.List m85098xfc72afde;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reply, "reply");
                        try {
                            m85098xfc72afde = kz5.b0.c(java.lang.Long.valueOf(com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23136x3de96732.this.mo85069x2ccac7a6()));
                        } catch (java.lang.Throwable th6) {
                            m85098xfc72afde = com.p314xaae8f345.p2845xc516c4b6.biz.C23153xca70faa7.m85098xfc72afde(th6);
                        }
                        reply.mo84787x67612ea(m85098xfc72afde);
                    }
                });
            } else {
                c28677x2598ceaa2.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa3 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.BizLocationApi.isOpenSystemLocation" + concat, m85077x7444b660());
            if (interfaceC23136x3de96732 != null) {
                c28677x2598ceaa3.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: com.tencent.pigeon.biz.BizLocationApi$Companion$setUp$3$1
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply<java.lang.Object> reply) {
                        java.util.List m85098xfc72afde;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reply, "reply");
                        try {
                            m85098xfc72afde = kz5.b0.c(java.lang.Long.valueOf(com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23136x3de96732.this.mo85070xcda092b8()));
                        } catch (java.lang.Throwable th6) {
                            m85098xfc72afde = com.p314xaae8f345.p2845xc516c4b6.biz.C23153xca70faa7.m85098xfc72afde(th6);
                        }
                        reply.mo84787x67612ea(m85098xfc72afde);
                    }
                });
            } else {
                c28677x2598ceaa3.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa4 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.BizLocationApi.requestLocationAuth" + concat, m85077x7444b660());
            if (interfaceC23136x3de96732 != null) {
                c28677x2598ceaa4.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: com.tencent.pigeon.biz.BizLocationApi$Companion$setUp$4$1

                    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Result;", "", "result", "Ljz5/f0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                    /* renamed from: com.tencent.pigeon.biz.BizLocationApi$Companion$setUp$4$1$1, reason: invalid class name */
                    /* loaded from: classes11.dex */
                    public static final class AnonymousClass1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

                        /* renamed from: $reply */
                        final /* synthetic */ io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply<java.lang.Object> f40621x43e48946;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply<java.lang.Object> reply) {
                            super(1);
                            this.f40621x43e48946 = reply;
                        }

                        @Override // yz5.l
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ java.lang.Object mo146xb9724478(java.lang.Object obj) {
                            m85082xb9724478(((p3321xbce91901.C29043x91b2b43d) obj).getValue());
                            return jz5.f0.f384359a;
                        }

                        /* renamed from: invoke */
                        public final void m85082xb9724478(java.lang.Object obj) {
                            java.util.List m85099xa75ba507;
                            java.util.List m85098xfc72afde;
                            java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(obj);
                            if (m143898xd4a2fc34 != null) {
                                io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply<java.lang.Object> reply = this.f40621x43e48946;
                                m85098xfc72afde = com.p314xaae8f345.p2845xc516c4b6.biz.C23153xca70faa7.m85098xfc72afde(m143898xd4a2fc34);
                                reply.mo84787x67612ea(m85098xfc72afde);
                            } else {
                                if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(obj)) {
                                    obj = null;
                                }
                                io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply<java.lang.Object> reply2 = this.f40621x43e48946;
                                m85099xa75ba507 = com.p314xaae8f345.p2845xc516c4b6.biz.C23153xca70faa7.m85099xa75ba507((java.lang.Boolean) obj);
                                reply2.mo84787x67612ea(m85099xa75ba507);
                            }
                        }
                    }

                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply<java.lang.Object> reply) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reply, "reply");
                        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23136x3de96732.this.mo85073xd9edf72c(new com.p314xaae8f345.p2845xc516c4b6.biz.C23142x97caf910.AnonymousClass1(reply));
                    }
                });
            } else {
                c28677x2598ceaa4.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa5 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.BizLocationApi.requestLocationWithSystemAuth" + concat, m85077x7444b660());
            if (interfaceC23136x3de96732 != null) {
                c28677x2598ceaa5.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: com.tencent.pigeon.biz.BizLocationApi$Companion$setUp$5$1

                    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Result;", "", "result", "Ljz5/f0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                    /* renamed from: com.tencent.pigeon.biz.BizLocationApi$Companion$setUp$5$1$1, reason: invalid class name */
                    /* loaded from: classes11.dex */
                    public static final class AnonymousClass1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

                        /* renamed from: $reply */
                        final /* synthetic */ io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply<java.lang.Object> f40623x43e48946;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply<java.lang.Object> reply) {
                            super(1);
                            this.f40623x43e48946 = reply;
                        }

                        @Override // yz5.l
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ java.lang.Object mo146xb9724478(java.lang.Object obj) {
                            m85083xb9724478(((p3321xbce91901.C29043x91b2b43d) obj).getValue());
                            return jz5.f0.f384359a;
                        }

                        /* renamed from: invoke */
                        public final void m85083xb9724478(java.lang.Object obj) {
                            java.util.List m85099xa75ba507;
                            java.util.List m85098xfc72afde;
                            java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(obj);
                            if (m143898xd4a2fc34 != null) {
                                io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply<java.lang.Object> reply = this.f40623x43e48946;
                                m85098xfc72afde = com.p314xaae8f345.p2845xc516c4b6.biz.C23153xca70faa7.m85098xfc72afde(m143898xd4a2fc34);
                                reply.mo84787x67612ea(m85098xfc72afde);
                            } else {
                                if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(obj)) {
                                    obj = null;
                                }
                                io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply<java.lang.Object> reply2 = this.f40623x43e48946;
                                m85099xa75ba507 = com.p314xaae8f345.p2845xc516c4b6.biz.C23153xca70faa7.m85099xa75ba507((java.lang.Boolean) obj);
                                reply2.mo84787x67612ea(m85099xa75ba507);
                            }
                        }
                    }

                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply<java.lang.Object> reply) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reply, "reply");
                        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23136x3de96732.this.mo85074x2d79e661(new com.p314xaae8f345.p2845xc516c4b6.biz.C23143x97cafcd1.AnonymousClass1(reply));
                    }
                });
            } else {
                c28677x2598ceaa5.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa6 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.BizLocationApi.getCacheLocationInfo" + concat, m85077x7444b660());
            if (interfaceC23136x3de96732 != null) {
                c28677x2598ceaa6.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: com.tencent.pigeon.biz.BizLocationApi$Companion$setUp$6$1

                    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Result;", "Lcom/tencent/pigeon/biz/BizPOIInfo;", "result", "Ljz5/f0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                    /* renamed from: com.tencent.pigeon.biz.BizLocationApi$Companion$setUp$6$1$1, reason: invalid class name */
                    /* loaded from: classes11.dex */
                    public static final class AnonymousClass1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

                        /* renamed from: $reply */
                        final /* synthetic */ io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply<java.lang.Object> f40625x43e48946;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply<java.lang.Object> reply) {
                            super(1);
                            this.f40625x43e48946 = reply;
                        }

                        @Override // yz5.l
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ java.lang.Object mo146xb9724478(java.lang.Object obj) {
                            m85084xb9724478(((p3321xbce91901.C29043x91b2b43d) obj).getValue());
                            return jz5.f0.f384359a;
                        }

                        /* renamed from: invoke */
                        public final void m85084xb9724478(java.lang.Object obj) {
                            java.util.List m85099xa75ba507;
                            java.util.List m85098xfc72afde;
                            java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(obj);
                            if (m143898xd4a2fc34 != null) {
                                io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply<java.lang.Object> reply = this.f40625x43e48946;
                                m85098xfc72afde = com.p314xaae8f345.p2845xc516c4b6.biz.C23153xca70faa7.m85098xfc72afde(m143898xd4a2fc34);
                                reply.mo84787x67612ea(m85098xfc72afde);
                            } else {
                                if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(obj)) {
                                    obj = null;
                                }
                                io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply<java.lang.Object> reply2 = this.f40625x43e48946;
                                m85099xa75ba507 = com.p314xaae8f345.p2845xc516c4b6.biz.C23153xca70faa7.m85099xa75ba507((com.p314xaae8f345.p2845xc516c4b6.biz.C23184x5f38fda5) obj);
                                reply2.mo84787x67612ea(m85099xa75ba507);
                            }
                        }
                    }

                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply<java.lang.Object> reply) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reply, "reply");
                        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23136x3de96732.this.mo85066x9f1cedef(new com.p314xaae8f345.p2845xc516c4b6.biz.C23144x97cb0092.AnonymousClass1(reply));
                    }
                });
            } else {
                c28677x2598ceaa6.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa7 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.BizLocationApi.gotoSystemLocationSettings" + concat, m85077x7444b660());
            if (interfaceC23136x3de96732 != null) {
                c28677x2598ceaa7.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: com.tencent.pigeon.biz.BizLocationApi$Companion$setUp$7$1

                    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Result;", "Ljz5/f0;", "result", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                    /* renamed from: com.tencent.pigeon.biz.BizLocationApi$Companion$setUp$7$1$1, reason: invalid class name */
                    /* loaded from: classes11.dex */
                    public static final class AnonymousClass1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

                        /* renamed from: $reply */
                        final /* synthetic */ io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply<java.lang.Object> f40627x43e48946;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply<java.lang.Object> reply) {
                            super(1);
                            this.f40627x43e48946 = reply;
                        }

                        @Override // yz5.l
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ java.lang.Object mo146xb9724478(java.lang.Object obj) {
                            m85085xb9724478(((p3321xbce91901.C29043x91b2b43d) obj).getValue());
                            return jz5.f0.f384359a;
                        }

                        /* renamed from: invoke */
                        public final void m85085xb9724478(java.lang.Object obj) {
                            java.util.List m85099xa75ba507;
                            java.util.List m85098xfc72afde;
                            java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(obj);
                            if (m143898xd4a2fc34 != null) {
                                io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply<java.lang.Object> reply = this.f40627x43e48946;
                                m85098xfc72afde = com.p314xaae8f345.p2845xc516c4b6.biz.C23153xca70faa7.m85098xfc72afde(m143898xd4a2fc34);
                                reply.mo84787x67612ea(m85098xfc72afde);
                            } else {
                                io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply<java.lang.Object> reply2 = this.f40627x43e48946;
                                m85099xa75ba507 = com.p314xaae8f345.p2845xc516c4b6.biz.C23153xca70faa7.m85099xa75ba507(null);
                                reply2.mo84787x67612ea(m85099xa75ba507);
                            }
                        }
                    }

                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply<java.lang.Object> reply) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reply, "reply");
                        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23136x3de96732.this.mo85068x50cd648a(new com.p314xaae8f345.p2845xc516c4b6.biz.C23145x97cb0453.AnonymousClass1(reply));
                    }
                });
            } else {
                c28677x2598ceaa7.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa8 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.BizLocationApi.getUserLocation" + concat, m85077x7444b660());
            if (interfaceC23136x3de96732 != null) {
                c28677x2598ceaa8.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: com.tencent.pigeon.biz.BizLocationApi$Companion$setUp$8$1
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply<java.lang.Object> reply) {
                        java.util.List m85098xfc72afde;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reply, "reply");
                        try {
                            m85098xfc72afde = kz5.b0.c(com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23136x3de96732.this.mo85067xa47c8716());
                        } catch (java.lang.Throwable th6) {
                            m85098xfc72afde = com.p314xaae8f345.p2845xc516c4b6.biz.C23153xca70faa7.m85098xfc72afde(th6);
                        }
                        reply.mo84787x67612ea(m85098xfc72afde);
                    }
                });
            } else {
                c28677x2598ceaa8.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa9 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.BizLocationApi.isUnderFreqControl" + concat, m85077x7444b660());
            if (interfaceC23136x3de96732 != null) {
                c28677x2598ceaa9.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: com.tencent.pigeon.biz.BizLocationApi$Companion$setUp$9$1

                    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Result;", "", "result", "Ljz5/f0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                    /* renamed from: com.tencent.pigeon.biz.BizLocationApi$Companion$setUp$9$1$1, reason: invalid class name */
                    /* loaded from: classes11.dex */
                    public static final class AnonymousClass1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

                        /* renamed from: $reply */
                        final /* synthetic */ io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply<java.lang.Object> f40630x43e48946;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply<java.lang.Object> reply) {
                            super(1);
                            this.f40630x43e48946 = reply;
                        }

                        @Override // yz5.l
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ java.lang.Object mo146xb9724478(java.lang.Object obj) {
                            m85086xb9724478(((p3321xbce91901.C29043x91b2b43d) obj).getValue());
                            return jz5.f0.f384359a;
                        }

                        /* renamed from: invoke */
                        public final void m85086xb9724478(java.lang.Object obj) {
                            java.util.List m85099xa75ba507;
                            java.util.List m85098xfc72afde;
                            java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(obj);
                            if (m143898xd4a2fc34 != null) {
                                io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply<java.lang.Object> reply = this.f40630x43e48946;
                                m85098xfc72afde = com.p314xaae8f345.p2845xc516c4b6.biz.C23153xca70faa7.m85098xfc72afde(m143898xd4a2fc34);
                                reply.mo84787x67612ea(m85098xfc72afde);
                            } else {
                                if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(obj)) {
                                    obj = null;
                                }
                                io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply<java.lang.Object> reply2 = this.f40630x43e48946;
                                m85099xa75ba507 = com.p314xaae8f345.p2845xc516c4b6.biz.C23153xca70faa7.m85099xa75ba507((java.lang.Boolean) obj);
                                reply2.mo84787x67612ea(m85099xa75ba507);
                            }
                        }
                    }

                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply<java.lang.Object> reply) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reply, "reply");
                        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23136x3de96732.this.mo85071x93dc9b17(new com.p314xaae8f345.p2845xc516c4b6.biz.C23147x97cb0bd5.AnonymousClass1(reply));
                    }
                });
            } else {
                c28677x2598ceaa9.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa10 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.BizLocationApi.markLastGetPOITime" + concat, m85077x7444b660());
            if (interfaceC23136x3de96732 != null) {
                c28677x2598ceaa10.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: com.tencent.pigeon.biz.BizLocationApi$Companion$setUp$10$1

                    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Result;", "Ljz5/f0;", "result", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                    /* renamed from: com.tencent.pigeon.biz.BizLocationApi$Companion$setUp$10$1$1, reason: invalid class name */
                    /* loaded from: classes11.dex */
                    public static final class AnonymousClass1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

                        /* renamed from: $reply */
                        final /* synthetic */ io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply<java.lang.Object> f40617x43e48946;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply<java.lang.Object> reply) {
                            super(1);
                            this.f40617x43e48946 = reply;
                        }

                        @Override // yz5.l
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ java.lang.Object mo146xb9724478(java.lang.Object obj) {
                            m85081xb9724478(((p3321xbce91901.C29043x91b2b43d) obj).getValue());
                            return jz5.f0.f384359a;
                        }

                        /* renamed from: invoke */
                        public final void m85081xb9724478(java.lang.Object obj) {
                            java.util.List m85099xa75ba507;
                            java.util.List m85098xfc72afde;
                            java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(obj);
                            if (m143898xd4a2fc34 != null) {
                                io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply<java.lang.Object> reply = this.f40617x43e48946;
                                m85098xfc72afde = com.p314xaae8f345.p2845xc516c4b6.biz.C23153xca70faa7.m85098xfc72afde(m143898xd4a2fc34);
                                reply.mo84787x67612ea(m85098xfc72afde);
                            } else {
                                io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply<java.lang.Object> reply2 = this.f40617x43e48946;
                                m85099xa75ba507 = com.p314xaae8f345.p2845xc516c4b6.biz.C23153xca70faa7.m85099xa75ba507(null);
                                reply2.mo84787x67612ea(m85099xa75ba507);
                            }
                        }
                    }

                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply<java.lang.Object> reply) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reply, "reply");
                        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23136x3de96732.this.mo85072x2648f64(new com.p314xaae8f345.p2845xc516c4b6.biz.C23139x6192f77d.AnonymousClass1(reply));
                    }
                });
            } else {
                c28677x2598ceaa10.m138404x12ef5e45(null);
            }
        }
    }

    /* renamed from: getBizPOIInfo */
    void mo85065xd6a7d97b(yz5.l lVar);

    /* renamed from: getCacheLocationInfo */
    void mo85066x9f1cedef(yz5.l lVar);

    /* renamed from: getUserLocation */
    com.p314xaae8f345.p2845xc516c4b6.biz.C23259xb2dc8081 mo85067xa47c8716();

    /* renamed from: gotoSystemLocationSettings */
    void mo85068x50cd648a(yz5.l lVar);

    /* renamed from: isOpenK1kLocation */
    long mo85069x2ccac7a6();

    /* renamed from: isOpenSystemLocation */
    long mo85070xcda092b8();

    /* renamed from: isUnderFreqControl */
    void mo85071x93dc9b17(yz5.l lVar);

    /* renamed from: markLastGetPOITime */
    void mo85072x2648f64(yz5.l lVar);

    /* renamed from: requestLocationAuth */
    void mo85073xd9edf72c(yz5.l lVar);

    /* renamed from: requestLocationWithSystemAuth */
    void mo85074x2d79e661(yz5.l lVar);
}
