package com.p314xaae8f345.p2845xc516c4b6.biz;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ*\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00060\u0004H&¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/tencent/pigeon/biz/BizImagePreviewApi;", "", "Lcom/tencent/pigeon/biz/BizImagePreviewActionResult;", "ret", "Lkotlin/Function1;", "Lkotlin/Result;", "Ljz5/f0;", "callback", "notifyBizImagePreviewActionList", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.pigeon.biz.BizImagePreviewApi */
/* loaded from: classes11.dex */
public interface InterfaceC23126xb87bc77a {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23126xb87bc77a.Companion INSTANCE = com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23126xb87bc77a.Companion.f40586x83b00915;

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006R#\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/tencent/pigeon/biz/BizImagePreviewApi$Companion;", "", "Lio/flutter/plugin/common/BinaryMessenger;", "binaryMessenger", "Lcom/tencent/pigeon/biz/BizImagePreviewApi;", "api", "", "messageChannelSuffix", "Ljz5/f0;", "setUp", "Lio/flutter/plugin/common/MessageCodec;", "codec$delegate", "Ljz5/g;", "getCodec", "()Lio/flutter/plugin/common/MessageCodec;", "codec", "<init>", "()V", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.tencent.pigeon.biz.BizImagePreviewApi$Companion, reason: from kotlin metadata */
    /* loaded from: classes11.dex */
    public static final class Companion {

        /* renamed from: $$INSTANCE */
        static final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23126xb87bc77a.Companion f40586x83b00915 = new com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23126xb87bc77a.Companion();

        /* renamed from: codec$delegate, reason: from kotlin metadata */
        private static final jz5.g codec = jz5.h.b(com.p314xaae8f345.p2845xc516c4b6.biz.C23127xfc6c76c2.f40588x4fbc8495);

        private Companion() {
        }

        /* renamed from: setUp$default */
        public static /* synthetic */ void m85015x97a46f3a(com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23126xb87bc77a.Companion companion, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23126xb87bc77a interfaceC23126xb87bc77a, java.lang.String str, int i17, java.lang.Object obj) {
            if ((i17 & 4) != 0) {
                str = "";
            }
            companion.m85017x684369d(interfaceC28679x1b8c77f2, interfaceC23126xb87bc77a, str);
        }

        /* renamed from: getCodec */
        public final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28686xbb96606f<java.lang.Object> m85016x7444b660() {
            return (io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28686xbb96606f) codec.mo141623x754a37bb();
        }

        /* renamed from: setUp */
        public final void m85017x684369d(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 binaryMessenger, final com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23126xb87bc77a interfaceC23126xb87bc77a, java.lang.String messageChannelSuffix) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binaryMessenger, "binaryMessenger");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(messageChannelSuffix, "messageChannelSuffix");
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.BizImagePreviewApi.notifyBizImagePreviewActionList" + (messageChannelSuffix.length() > 0 ? ".".concat(messageChannelSuffix) : ""), m85016x7444b660());
            if (interfaceC23126xb87bc77a != null) {
                c28677x2598ceaa.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: com.tencent.pigeon.biz.BizImagePreviewApi$Companion$setUp$1$1

                    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Result;", "Ljz5/f0;", "result", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                    /* renamed from: com.tencent.pigeon.biz.BizImagePreviewApi$Companion$setUp$1$1$1, reason: invalid class name */
                    /* loaded from: classes11.dex */
                    public static final class AnonymousClass1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

                        /* renamed from: $reply */
                        final /* synthetic */ io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply<java.lang.Object> f40590x43e48946;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply<java.lang.Object> reply) {
                            super(1);
                            this.f40590x43e48946 = reply;
                        }

                        @Override // yz5.l
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ java.lang.Object mo146xb9724478(java.lang.Object obj) {
                            m85019xb9724478(((p3321xbce91901.C29043x91b2b43d) obj).getValue());
                            return jz5.f0.f384359a;
                        }

                        /* renamed from: invoke */
                        public final void m85019xb9724478(java.lang.Object obj) {
                            java.util.List m85024xa75ba507;
                            java.util.List m85023xfc72afde;
                            java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(obj);
                            if (m143898xd4a2fc34 != null) {
                                io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply<java.lang.Object> reply = this.f40590x43e48946;
                                m85023xfc72afde = com.p314xaae8f345.p2845xc516c4b6.biz.C23130x6737875f.m85023xfc72afde(m143898xd4a2fc34);
                                reply.mo84787x67612ea(m85023xfc72afde);
                            } else {
                                io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply<java.lang.Object> reply2 = this.f40590x43e48946;
                                m85024xa75ba507 = com.p314xaae8f345.p2845xc516c4b6.biz.C23130x6737875f.m85024xa75ba507(null);
                                reply2.mo84787x67612ea(m85024xa75ba507);
                            }
                        }
                    }

                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply<java.lang.Object> reply) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reply, "reply");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        java.lang.Object obj2 = ((java.util.List) obj).get(0);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type com.tencent.pigeon.biz.BizImagePreviewActionResult");
                        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23126xb87bc77a.this.mo85013x426c7b6b((com.p314xaae8f345.p2845xc516c4b6.biz.C23124x3ab2f093) obj2, new com.p314xaae8f345.p2845xc516c4b6.biz.C23128xfc725a15.AnonymousClass1(reply));
                    }
                });
            } else {
                c28677x2598ceaa.m138404x12ef5e45(null);
            }
        }
    }

    /* renamed from: notifyBizImagePreviewActionList */
    void mo85013x426c7b6b(com.p314xaae8f345.p2845xc516c4b6.biz.C23124x3ab2f093 c23124x3ab2f093, yz5.l lVar);
}
