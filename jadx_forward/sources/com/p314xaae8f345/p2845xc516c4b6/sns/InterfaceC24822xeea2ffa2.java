package com.p314xaae8f345.p2845xc516c4b6.sns;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/tencent/pigeon/sns/PlatformPathApi;", "", "getCachePath", "", "getMediaPath", "getPublishPath", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.pigeon.sns.PlatformPathApi */
/* loaded from: classes11.dex */
public interface InterfaceC24822xeea2ffa2 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24822xeea2ffa2.Companion INSTANCE = com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24822xeea2ffa2.Companion.f44436x83b00915;

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006R#\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/tencent/pigeon/sns/PlatformPathApi$Companion;", "", "Lio/flutter/plugin/common/BinaryMessenger;", "binaryMessenger", "Lcom/tencent/pigeon/sns/PlatformPathApi;", "api", "", "messageChannelSuffix", "Ljz5/f0;", "setUp", "Lio/flutter/plugin/common/MessageCodec;", "codec$delegate", "Ljz5/g;", "getCodec", "()Lio/flutter/plugin/common/MessageCodec;", "codec", "<init>", "()V", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.tencent.pigeon.sns.PlatformPathApi$Companion, reason: from kotlin metadata */
    /* loaded from: classes11.dex */
    public static final class Companion {

        /* renamed from: $$INSTANCE */
        static final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24822xeea2ffa2.Companion f44436x83b00915 = new com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24822xeea2ffa2.Companion();

        /* renamed from: codec$delegate, reason: from kotlin metadata */
        private static final jz5.g codec = jz5.h.b(com.p314xaae8f345.p2845xc516c4b6.sns.C24823xfed4f4ea.f44438x4fbc8495);

        private Companion() {
        }

        /* renamed from: setUp$default */
        public static /* synthetic */ void m91965x97a46f3a(com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24822xeea2ffa2.Companion companion, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24822xeea2ffa2 interfaceC24822xeea2ffa2, java.lang.String str, int i17, java.lang.Object obj) {
            if ((i17 & 4) != 0) {
                str = "";
            }
            companion.m91967x684369d(interfaceC28679x1b8c77f2, interfaceC24822xeea2ffa2, str);
        }

        /* renamed from: getCodec */
        public final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28686xbb96606f<java.lang.Object> m91966x7444b660() {
            return (io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28686xbb96606f) codec.mo141623x754a37bb();
        }

        /* renamed from: setUp */
        public final void m91967x684369d(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 binaryMessenger, final com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24822xeea2ffa2 interfaceC24822xeea2ffa2, java.lang.String messageChannelSuffix) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binaryMessenger, "binaryMessenger");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(messageChannelSuffix, "messageChannelSuffix");
            java.lang.String concat = messageChannelSuffix.length() > 0 ? ".".concat(messageChannelSuffix) : "";
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.PlatformPathApi.getMediaPath" + concat, m91966x7444b660());
            if (interfaceC24822xeea2ffa2 != null) {
                c28677x2598ceaa.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: com.tencent.pigeon.sns.PlatformPathApi$Companion$setUp$1$1
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply<java.lang.Object> reply) {
                        java.util.List m92203xfc72afde;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reply, "reply");
                        try {
                            m92203xfc72afde = kz5.b0.c(com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24822xeea2ffa2.this.mo91962x7f002773());
                        } catch (java.lang.Throwable th6) {
                            m92203xfc72afde = com.p314xaae8f345.p2845xc516c4b6.sns.C24898x384a4d95.m92203xfc72afde(th6);
                        }
                        reply.mo84787x67612ea(m92203xfc72afde);
                    }
                });
            } else {
                c28677x2598ceaa.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa2 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.PlatformPathApi.getPublishPath" + concat, m91966x7444b660());
            if (interfaceC24822xeea2ffa2 != null) {
                c28677x2598ceaa2.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: com.tencent.pigeon.sns.PlatformPathApi$Companion$setUp$2$1
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply<java.lang.Object> reply) {
                        java.util.List m92203xfc72afde;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reply, "reply");
                        try {
                            m92203xfc72afde = kz5.b0.c(com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24822xeea2ffa2.this.mo91963xb5319c9e());
                        } catch (java.lang.Throwable th6) {
                            m92203xfc72afde = com.p314xaae8f345.p2845xc516c4b6.sns.C24898x384a4d95.m92203xfc72afde(th6);
                        }
                        reply.mo84787x67612ea(m92203xfc72afde);
                    }
                });
            } else {
                c28677x2598ceaa2.m138404x12ef5e45(null);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa3 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(binaryMessenger, "dev.flutter.pigeon.mm_auto_gen.PlatformPathApi.getCachePath" + concat, m91966x7444b660());
            if (interfaceC24822xeea2ffa2 != null) {
                c28677x2598ceaa3.m138404x12ef5e45(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler() { // from class: com.tencent.pigeon.sns.PlatformPathApi$Companion$setUp$3$1
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler
                    /* renamed from: onMessage */
                    public final void mo84686x88910128(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply<java.lang.Object> reply) {
                        java.util.List m92203xfc72afde;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reply, "reply");
                        try {
                            m92203xfc72afde = kz5.b0.c(com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24822xeea2ffa2.this.mo91961xde6c6811());
                        } catch (java.lang.Throwable th6) {
                            m92203xfc72afde = com.p314xaae8f345.p2845xc516c4b6.sns.C24898x384a4d95.m92203xfc72afde(th6);
                        }
                        reply.mo84787x67612ea(m92203xfc72afde);
                    }
                });
            } else {
                c28677x2598ceaa3.m138404x12ef5e45(null);
            }
        }
    }

    /* renamed from: getCachePath */
    java.lang.String mo91961xde6c6811();

    /* renamed from: getMediaPath */
    java.lang.String mo91962x7f002773();

    /* renamed from: getPublishPath */
    java.lang.String mo91963xb5319c9e();
}
