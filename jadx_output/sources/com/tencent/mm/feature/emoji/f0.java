package com.tencent.mm.feature.emoji;

/* loaded from: classes12.dex */
public class f0 implements dr.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.g5 f66255a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.emotion.EmojiInfo f66256b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.emoji.b0 f66257c;

    public f0(com.tencent.mm.feature.emoji.b0 b0Var, com.tencent.mm.storage.g5 g5Var, com.tencent.mm.storage.emotion.EmojiInfo emojiInfo) {
        this.f66257c = b0Var;
        this.f66255a = g5Var;
        this.f66256b = emojiInfo;
    }

    @Override // dr.q
    public void a(boolean z17) {
        com.tencent.mm.feature.emoji.b0 b0Var = this.f66257c;
        b0Var.aj(this.f66255a);
        com.tencent.mm.feature.emoji.api.q5 q5Var = b0Var.f66176n;
        if (q5Var != null) {
            q5Var.a(z17, this.f66256b);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiFeatureService", "doCDNDownloadScene callback is null");
        }
    }
}
