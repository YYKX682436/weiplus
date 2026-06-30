package com.p314xaae8f345.p2845xc516c4b6.sns;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007H&¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/tencent/pigeon/sns/PlatformEventEmitterApi;", "", "emitEvent", "", "eventId", "", "params", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.pigeon.sns.PlatformEventEmitterApi */
/* loaded from: classes11.dex */
public interface InterfaceC24790x5b7290f3 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24790x5b7290f3.Companion INSTANCE = com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24790x5b7290f3.Companion.f44350x83b00915;

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006R#\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/tencent/pigeon/sns/PlatformEventEmitterApi$Companion;", "", "Lio/flutter/plugin/common/BinaryMessenger;", "binaryMessenger", "Lcom/tencent/pigeon/sns/PlatformEventEmitterApi;", "api", "", "messageChannelSuffix", "Ljz5/f0;", "setUp", "Lio/flutter/plugin/common/MessageCodec;", "codec$delegate", "Ljz5/g;", "getCodec", "()Lio/flutter/plugin/common/MessageCodec;", "codec", "<init>", "()V", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.tencent.pigeon.sns.PlatformEventEmitterApi$Companion, reason: from kotlin metadata */
    /* loaded from: classes11.dex */
    public static final class Companion {

        /* renamed from: $$INSTANCE */
        static final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24790x5b7290f3.Companion f44350x83b00915 = new com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24790x5b7290f3.Companion();

        /* renamed from: codec$delegate, reason: from kotlin metadata */
        private static final jz5.g codec = jz5.h.b(com.p314xaae8f345.p2845xc516c4b6.sns.C24791xa2b33fb.f44352x4fbc8495);

        private Companion() {
        }

        /* renamed from: setUp$default */
        public static /* synthetic */ void m91817x97a46f3a(com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24790x5b7290f3.Companion companion, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24790x5b7290f3 interfaceC24790x5b7290f3, java.lang.String str, int i17, java.lang.Object obj) {
            if ((i17 & 4) != 0) {
                str = "";
            }
            companion.m91819x684369d(interfaceC28679x1b8c77f2, interfaceC24790x5b7290f3, str);
        }

        /* renamed from: getCodec */
        public final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28686xbb96606f<java.lang.Object> m91818x7444b660() {
            return (io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28686xbb96606f) codec.mo141623x754a37bb();
        }

        /* renamed from: setUp */
        public final void m91819x684369d(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 binaryMessenger, final com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24790x5b7290f3 interfaceC24790x5b7290f3, java.lang.String messageChannelSuffix) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binaryMessenger, "binaryMessenger");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(messageChannelSuffix, "messageChannelSuffix");
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.PlatformEventEmitterApi.emitEvent" + (messageChannelSuffix.length() > 0 ? ".".concat(messageChannelSuffix) : ""), m91818x7444b660());
            if (interfaceC24790x5b7290f3 != null) {
                c28677x2598ceaa.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: com.tencent.pigeon.sns.PlatformEventEmitterApi$Companion$setUp$1$1
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply<java.lang.Object> reply) {
                        java.util.List m92203xfc72afde;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reply, "reply");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        java.util.List list = (java.util.List) obj;
                        java.lang.Object obj2 = list.get(0);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
                        java.lang.String str = (java.lang.String) obj2;
                        java.lang.Object obj3 = list.get(1);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                        try {
                            m92203xfc72afde = kz5.b0.c(java.lang.Boolean.valueOf(com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24790x5b7290f3.this.m91815x3643de87(str, (java.util.Map) obj3)));
                        } catch (java.lang.Throwable th6) {
                            m92203xfc72afde = com.p314xaae8f345.p2845xc516c4b6.sns.C24898x384a4d95.m92203xfc72afde(th6);
                        }
                        reply.mo84787x67612ea(m92203xfc72afde);
                    }
                });
            } else {
                c28677x2598ceaa.m138404x12ef5e45(null);
            }
        }
    }

    /* renamed from: emitEvent */
    boolean m91815x3643de87(java.lang.String eventId, java.util.Map<java.lang.String, java.lang.String> params);
}
