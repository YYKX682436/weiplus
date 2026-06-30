package com.p314xaae8f345.p2845xc516c4b6.biz;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0019\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J0\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0018\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\b0\u0006R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/tencent/pigeon/biz/BizLocationCallbackApi;", "", "Lcom/tencent/pigeon/biz/BizUserLocationInfo;", "userLocationArg", "", "endTimeMsArg", "Lkotlin/Function1;", "Lkotlin/Result;", "Ljz5/f0;", "callback", "onPOIFetched", "Lio/flutter/plugin/common/BinaryMessenger;", "binaryMessenger", "Lio/flutter/plugin/common/BinaryMessenger;", "", "messageChannelSuffix", "Ljava/lang/String;", "<init>", "(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.pigeon.biz.BizLocationCallbackApi */
/* loaded from: classes11.dex */
public final class C23149x178594ad {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.p314xaae8f345.p2845xc516c4b6.biz.C23149x178594ad.Companion INSTANCE = new com.p314xaae8f345.p2845xc516c4b6.biz.C23149x178594ad.Companion(null);

    /* renamed from: codec$delegate */
    private static final jz5.g f40633x6102253 = jz5.h.b(com.p314xaae8f345.p2845xc516c4b6.biz.C23150x746e7d35.f40636x4fbc8495);
    private final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 binaryMessenger;
    private final java.lang.String messageChannelSuffix;

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR#\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/tencent/pigeon/biz/BizLocationCallbackApi$Companion;", "", "Lio/flutter/plugin/common/MessageCodec;", "codec$delegate", "Ljz5/g;", "getCodec", "()Lio/flutter/plugin/common/MessageCodec;", "codec", "<init>", "()V", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.tencent.pigeon.biz.BizLocationCallbackApi$Companion, reason: from kotlin metadata */
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
            this();
        }

        /* renamed from: getCodec */
        public final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28686xbb96606f<java.lang.Object> m85091x7444b660() {
            return (io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28686xbb96606f) com.p314xaae8f345.p2845xc516c4b6.biz.C23149x178594ad.f40633x6102253.mo141623x754a37bb();
        }
    }

    public C23149x178594ad(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 binaryMessenger, java.lang.String messageChannelSuffix) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binaryMessenger, "binaryMessenger");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(messageChannelSuffix, "messageChannelSuffix");
        this.binaryMessenger = binaryMessenger;
        this.messageChannelSuffix = messageChannelSuffix;
    }

    /* renamed from: onPOIFetched */
    public final void m85090x3171ce6e(com.p314xaae8f345.p2845xc516c4b6.biz.C23259xb2dc8081 userLocationArg, long j17, final yz5.l callback) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userLocationArg, "userLocationArg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (this.messageChannelSuffix.length() > 0) {
            str = "." + this.messageChannelSuffix;
        } else {
            str = "";
        }
        final java.lang.String str2 = "dev.flutter.pigeon.mm_auto_gen.BizLocationCallbackApi.onPOIFetched" + str;
        new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(this.binaryMessenger, str2, INSTANCE.m85091x7444b660()).m138403x35cf88(kz5.c0.i(userLocationArg, java.lang.Long.valueOf(j17)), new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply() { // from class: com.tencent.pigeon.biz.BizLocationCallbackApi$onPOIFetched$1
            @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply
            /* renamed from: reply */
            public final void mo84787x67612ea(java.lang.Object obj) {
                com.p314xaae8f345.p2845xc516c4b6.biz.C23283x7709af6c m85097x1eff7d2e;
                if (!(obj instanceof java.util.List)) {
                    yz5.l lVar = yz5.l.this;
                    p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    m85097x1eff7d2e = com.p314xaae8f345.p2845xc516c4b6.biz.C23153xca70faa7.m85097x1eff7d2e(str2);
                    lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(m85097x1eff7d2e))));
                    return;
                }
                java.util.List list = (java.util.List) obj;
                if (list.size() <= 1) {
                    yz5.l lVar2 = yz5.l.this;
                    p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    lVar2.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a)));
                    return;
                }
                yz5.l lVar3 = yz5.l.this;
                p3321xbce91901.C29043x91b2b43d.Companion companion3 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                java.lang.Object obj2 = list.get(0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
                java.lang.Object obj3 = list.get(1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj3, "null cannot be cast to non-null type kotlin.String");
                lVar3.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new com.p314xaae8f345.p2845xc516c4b6.biz.C23283x7709af6c((java.lang.String) obj2, (java.lang.String) obj3, (java.lang.String) list.get(2))))));
            }
        });
    }

    public /* synthetic */ C23149x178594ad(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, java.lang.String str, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(interfaceC28679x1b8c77f2, (i17 & 2) != 0 ? "" : str);
    }
}
