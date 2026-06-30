package com.tencent.mm.plugin.appbrand.jsapi.webview;

/* loaded from: classes9.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f83883d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f83884e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.webview.EmojiFetcher$EmojiArgs f83885f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f83886g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.plugin.appbrand.jsapi.webview.EmojiFetcher$EmojiArgs emojiFetcher$EmojiArgs, com.tencent.mm.ipcinvoker.r rVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f83885f = emojiFetcher$EmojiArgs;
        this.f83886g = rVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.appbrand.jsapi.webview.f fVar = new com.tencent.mm.plugin.appbrand.jsapi.webview.f(this.f83885f, this.f83886g, continuation);
        fVar.f83884e = obj;
        return fVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.appbrand.jsapi.webview.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        byte[] wi6;
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f83883d;
        java.lang.String str2 = null;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f83884e;
            com.tencent.mm.plugin.appbrand.jsapi.webview.EmojiFetcher$EmojiArgs args = this.f83885f;
            kotlin.jvm.internal.o.f(args, "$args");
            this.f83884e = y0Var;
            this.f83883d = 1;
            if (((com.tencent.mm.feature.emoji.q0) ((com.tencent.mm.feature.emoji.api.z5) i95.n0.c(com.tencent.mm.feature.emoji.api.z5.class))).Ri()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandHTMLWebView.EmojiFetcher.MMLogic", "load with args:" + args + ", invalid state, emojiMgr is NULL");
                obj = null;
            } else {
                kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
                com.tencent.mm.api.IEmojiInfo Ni = ((com.tencent.mm.feature.emoji.q0) ((com.tencent.mm.feature.emoji.api.z5) i95.n0.c(com.tencent.mm.feature.emoji.api.z5.class))).Ni(args.f83865d);
                h0Var.f310123d = Ni;
                if (Ni == null) {
                    ((com.tencent.mm.feature.emoji.k0) ((com.tencent.mm.feature.emoji.api.v5) i95.n0.c(com.tencent.mm.feature.emoji.api.v5.class))).getClass();
                    com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = new com.tencent.mm.storage.emotion.EmojiInfo();
                    emojiInfo.field_md5 = args.f83865d;
                    emojiInfo.field_groupId = args.f83868g;
                    emojiInfo.field_encrypturl = args.f83866e;
                    emojiInfo.field_aeskey = args.f83867f;
                    emojiInfo.field_catalog = 65;
                    emojiInfo.field_designerID = args.f83869h;
                    emojiInfo.field_temp = 1;
                    h0Var.f310123d = emojiInfo;
                    ((com.tencent.mm.feature.emoji.k0) ((com.tencent.mm.feature.emoji.api.v5) i95.n0.c(com.tencent.mm.feature.emoji.api.v5.class))).wi((com.tencent.mm.api.IEmojiInfo) h0Var.f310123d);
                }
                java.lang.Object obj2 = h0Var.f310123d;
                kotlin.jvm.internal.o.d(obj2);
                if (((com.tencent.mm.api.IEmojiInfo) obj2).Q1()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandHTMLWebView.EmojiFetcher.MMLogic", "load with args:" + args + ", return cached info");
                    obj = (com.tencent.mm.api.IEmojiInfo) h0Var.f310123d;
                } else {
                    kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
                    rVar.k();
                    ((com.tencent.mm.feature.emoji.m0) ((com.tencent.mm.feature.emoji.api.w5) i95.n0.c(com.tencent.mm.feature.emoji.api.w5.class))).wi((com.tencent.mm.api.IEmojiInfo) h0Var.f310123d, new com.tencent.mm.plugin.appbrand.jsapi.webview.e(args, rVar, h0Var));
                    obj = rVar.j();
                }
            }
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = (com.tencent.mm.api.IEmojiInfo) obj;
        if (iEmojiInfo == null) {
            com.tencent.mm.ipcinvoker.r rVar2 = this.f83886g;
            if (rVar2 != null) {
                rVar2.a(null);
            }
            return jz5.f0.f302826a;
        }
        if (((com.tencent.mm.feature.emoji.q0) ((com.tencent.mm.feature.emoji.api.z5) i95.n0.c(com.tencent.mm.feature.emoji.api.z5.class))).Ri()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandHTMLWebView.EmojiFetcher.MMLogic", "decode with md5:" + iEmojiInfo.getMd5() + ", invalid state, emojiMgr is NULL");
            wi6 = null;
        } else {
            wi6 = ((com.tencent.mm.feature.emoji.q0) ((com.tencent.mm.feature.emoji.api.z5) i95.n0.c(com.tencent.mm.feature.emoji.api.z5.class))).wi(iEmojiInfo);
        }
        if (wi6 != null) {
            if (!(wi6.length == 0)) {
                synchronized (lp0.b.class) {
                    str = lp0.b.e() + "appbrand/emojicache/";
                }
                java.lang.String str3 = str + iEmojiInfo.getMd5() + ".data";
                try {
                    com.tencent.mm.vfs.w6.u(str);
                    com.tencent.mm.vfs.w6.S(str3, wi6, 0, wi6.length);
                    str2 = str3;
                } catch (java.io.IOException unused) {
                }
                com.tencent.mm.ipcinvoker.r rVar3 = this.f83886g;
                if (rVar3 != null) {
                    rVar3.a(new com.tencent.mm.ipcinvoker.type.IPCString(str2));
                }
                return jz5.f0.f302826a;
            }
        }
        com.tencent.mm.ipcinvoker.r rVar4 = this.f83886g;
        if (rVar4 != null) {
            rVar4.a(null);
        }
        return jz5.f0.f302826a;
    }
}
