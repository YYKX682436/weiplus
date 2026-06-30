package com.p314xaae8f345.p2845xc516c4b6.ecs;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0019\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J:\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0018\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\n0\u0007R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/tencent/pigeon/ecs/EcsMagicBizFlutterApi;", "", "", "bizNameArg", "apiNameArg", "", "dataArg", "Lkotlin/Function1;", "Lkotlin/Result;", "Lcom/tencent/pigeon/ecs/EcsMagicBizApiResponse;", "Ljz5/f0;", "callback", "invoke", "Lio/flutter/plugin/common/BinaryMessenger;", "binaryMessenger", "Lio/flutter/plugin/common/BinaryMessenger;", "messageChannelSuffix", "Ljava/lang/String;", "<init>", "(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.pigeon.ecs.EcsMagicBizFlutterApi */
/* loaded from: classes11.dex */
public final class C23651x33940179 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.p314xaae8f345.p2845xc516c4b6.ecs.C23651x33940179.Companion INSTANCE = new com.p314xaae8f345.p2845xc516c4b6.ecs.C23651x33940179.Companion(null);

    /* renamed from: codec$delegate */
    private static final jz5.g f41978x6102253 = jz5.h.b(com.p314xaae8f345.p2845xc516c4b6.ecs.C23652xadffcf01.f41981x4fbc8495);
    private final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 binaryMessenger;
    private final java.lang.String messageChannelSuffix;

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR#\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/tencent/pigeon/ecs/EcsMagicBizFlutterApi$Companion;", "", "Lio/flutter/plugin/common/MessageCodec;", "codec$delegate", "Ljz5/g;", "getCodec", "()Lio/flutter/plugin/common/MessageCodec;", "codec", "<init>", "()V", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.tencent.pigeon.ecs.EcsMagicBizFlutterApi$Companion, reason: from kotlin metadata */
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
            this();
        }

        /* renamed from: getCodec */
        public final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28686xbb96606f<java.lang.Object> m87669x7444b660() {
            return (io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28686xbb96606f) com.p314xaae8f345.p2845xc516c4b6.ecs.C23651x33940179.f41978x6102253.mo141623x754a37bb();
        }
    }

    public C23651x33940179(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 binaryMessenger, java.lang.String messageChannelSuffix) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binaryMessenger, "binaryMessenger");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(messageChannelSuffix, "messageChannelSuffix");
        this.binaryMessenger = binaryMessenger;
        this.messageChannelSuffix = messageChannelSuffix;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: invoke */
    public final void m87668xb9724478(java.lang.String bizNameArg, java.lang.String apiNameArg, byte[] bArr, final yz5.l callback) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizNameArg, "bizNameArg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiNameArg, "apiNameArg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (this.messageChannelSuffix.length() > 0) {
            str = "." + this.messageChannelSuffix;
        } else {
            str = "";
        }
        final java.lang.String str2 = "dev.flutter.pigeon.mm_auto_gen.EcsMagicBizFlutterApi.invoke" + str;
        new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(this.binaryMessenger, str2, INSTANCE.m87669x7444b660()).m138403x35cf88(kz5.c0.i(bizNameArg, apiNameArg, bArr), new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply() { // from class: com.tencent.pigeon.ecs.EcsMagicBizFlutterApi$invoke$1
            @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply
            /* renamed from: reply */
            public final void mo84787x67612ea(java.lang.Object obj) {
                com.p314xaae8f345.p2845xc516c4b6.ecs.C23688x7709af6c m87684x1eff7d2e;
                if (!(obj instanceof java.util.List)) {
                    yz5.l lVar = yz5.l.this;
                    p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    m87684x1eff7d2e = com.p314xaae8f345.p2845xc516c4b6.ecs.C23659xf9723017.m87684x1eff7d2e(str2);
                    lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(m87684x1eff7d2e))));
                    return;
                }
                java.util.List list = (java.util.List) obj;
                if (list.size() > 1) {
                    yz5.l lVar2 = yz5.l.this;
                    p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    java.lang.Object obj2 = list.get(0);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
                    java.lang.Object obj3 = list.get(1);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj3, "null cannot be cast to non-null type kotlin.String");
                    lVar2.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new com.p314xaae8f345.p2845xc516c4b6.ecs.C23688x7709af6c((java.lang.String) obj2, (java.lang.String) obj3, (java.lang.String) list.get(2))))));
                    return;
                }
                if (list.get(0) == null) {
                    yz5.l lVar3 = yz5.l.this;
                    p3321xbce91901.C29043x91b2b43d.Companion companion3 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    lVar3.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new com.p314xaae8f345.p2845xc516c4b6.ecs.C23688x7709af6c("null-error", "Flutter api returned null value for non-null return value.", "")))));
                } else {
                    java.lang.Object obj4 = list.get(0);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj4, "null cannot be cast to non-null type com.tencent.pigeon.ecs.EcsMagicBizApiResponse");
                    yz5.l.this.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813((com.p314xaae8f345.p2845xc516c4b6.ecs.C23650x66dc5ec0) obj4)));
                }
            }
        });
    }

    public /* synthetic */ C23651x33940179(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, java.lang.String str, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(interfaceC28679x1b8c77f2, (i17 & 2) != 0 ? "" : str);
    }
}
