package com.p314xaae8f345.p2845xc516c4b6.biz;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ*\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00060\u0004H&¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/tencent/pigeon/biz/BizAccountSelectorApi;", "", "Lcom/tencent/pigeon/biz/BizAccountSelectResult;", "ret", "Lkotlin/Function1;", "Lkotlin/Result;", "Ljz5/f0;", "callback", "notifyBizAccountSelectResult", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.pigeon.biz.BizAccountSelectorApi */
/* loaded from: classes11.dex */
public interface InterfaceC23057x349407a1 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23057x349407a1.Companion INSTANCE = com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23057x349407a1.Companion.f40423x83b00915;

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006R#\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/tencent/pigeon/biz/BizAccountSelectorApi$Companion;", "", "Lio/flutter/plugin/common/BinaryMessenger;", "binaryMessenger", "Lcom/tencent/pigeon/biz/BizAccountSelectorApi;", "api", "", "messageChannelSuffix", "Ljz5/f0;", "setUp", "Lio/flutter/plugin/common/MessageCodec;", "codec$delegate", "Ljz5/g;", "getCodec", "()Lio/flutter/plugin/common/MessageCodec;", "codec", "<init>", "()V", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.tencent.pigeon.biz.BizAccountSelectorApi$Companion, reason: from kotlin metadata */
    /* loaded from: classes11.dex */
    public static final class Companion {

        /* renamed from: $$INSTANCE */
        static final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23057x349407a1.Companion f40423x83b00915 = new com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23057x349407a1.Companion();

        /* renamed from: codec$delegate, reason: from kotlin metadata */
        private static final jz5.g codec = jz5.h.b(com.p314xaae8f345.p2845xc516c4b6.biz.C23058x8fe99b29.f40425x4fbc8495);

        private Companion() {
        }

        /* renamed from: setUp$default */
        public static /* synthetic */ void m84726x97a46f3a(com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23057x349407a1.Companion companion, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23057x349407a1 interfaceC23057x349407a1, java.lang.String str, int i17, java.lang.Object obj) {
            if ((i17 & 4) != 0) {
                str = "";
            }
            companion.m84728x684369d(interfaceC28679x1b8c77f2, interfaceC23057x349407a1, str);
        }

        /* renamed from: getCodec */
        public final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28686xbb96606f<java.lang.Object> m84727x7444b660() {
            return (io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28686xbb96606f) codec.mo141623x754a37bb();
        }

        /* renamed from: setUp */
        public final void m84728x684369d(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 binaryMessenger, final com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23057x349407a1 interfaceC23057x349407a1, java.lang.String messageChannelSuffix) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binaryMessenger, "binaryMessenger");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(messageChannelSuffix, "messageChannelSuffix");
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.BizAccountSelectorApi.notifyBizAccountSelectResult" + (messageChannelSuffix.length() > 0 ? ".".concat(messageChannelSuffix) : ""), m84727x7444b660());
            if (interfaceC23057x349407a1 != null) {
                c28677x2598ceaa.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: com.tencent.pigeon.biz.BizAccountSelectorApi$Companion$setUp$1$1

                    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Result;", "Ljz5/f0;", "result", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                    /* renamed from: com.tencent.pigeon.biz.BizAccountSelectorApi$Companion$setUp$1$1$1, reason: invalid class name */
                    /* loaded from: classes11.dex */
                    public static final class AnonymousClass1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

                        /* renamed from: $reply */
                        final /* synthetic */ io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply<java.lang.Object> f40427x43e48946;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply<java.lang.Object> reply) {
                            super(1);
                            this.f40427x43e48946 = reply;
                        }

                        @Override // yz5.l
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ java.lang.Object mo146xb9724478(java.lang.Object obj) {
                            m84730xb9724478(((p3321xbce91901.C29043x91b2b43d) obj).getValue());
                            return jz5.f0.f384359a;
                        }

                        /* renamed from: invoke */
                        public final void m84730xb9724478(java.lang.Object obj) {
                            java.util.List m84737xa75ba507;
                            java.util.List m84736xfc72afde;
                            java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(obj);
                            if (m143898xd4a2fc34 != null) {
                                io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply<java.lang.Object> reply = this.f40427x43e48946;
                                m84736xfc72afde = com.p314xaae8f345.p2845xc516c4b6.biz.C23061x32d44798.m84736xfc72afde(m143898xd4a2fc34);
                                reply.mo84787x67612ea(m84736xfc72afde);
                            } else {
                                io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply<java.lang.Object> reply2 = this.f40427x43e48946;
                                m84737xa75ba507 = com.p314xaae8f345.p2845xc516c4b6.biz.C23061x32d44798.m84737xa75ba507(null);
                                reply2.mo84787x67612ea(m84737xa75ba507);
                            }
                        }
                    }

                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply<java.lang.Object> reply) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reply, "reply");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        java.lang.Object obj2 = ((java.util.List) obj).get(0);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type com.tencent.pigeon.biz.BizAccountSelectResult");
                        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23057x349407a1.this.m84724x821099c((com.p314xaae8f345.p2845xc516c4b6.biz.C23056x2bcfff13) obj2, new com.p314xaae8f345.p2845xc516c4b6.biz.C23059xa53800bc.AnonymousClass1(reply));
                    }
                });
            } else {
                c28677x2598ceaa.m138404x12ef5e45(null);
            }
        }
    }

    /* renamed from: notifyBizAccountSelectResult */
    void m84724x821099c(com.p314xaae8f345.p2845xc516c4b6.biz.C23056x2bcfff13 c23056x2bcfff13, yz5.l lVar);
}
