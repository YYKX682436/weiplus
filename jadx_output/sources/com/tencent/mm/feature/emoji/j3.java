package com.tencent.mm.feature.emoji;

/* loaded from: classes10.dex */
public final class j3 implements dr.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.emoji.c4 f66342a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f66343b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f66344c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f66345d;

    public j3(com.tencent.mm.feature.emoji.c4 c4Var, kotlin.jvm.internal.h0 h0Var, boolean z17, yz5.l lVar) {
        this.f66342a = c4Var;
        this.f66343b = h0Var;
        this.f66344c = z17;
        this.f66345d = lVar;
    }

    @Override // dr.q
    public void a(boolean z17) {
        com.tencent.mm.feature.emoji.c4 c4Var = this.f66342a;
        java.lang.String str = c4Var.f66207d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("download emoji image for single emoticon path: ");
        kotlin.jvm.internal.h0 h0Var = this.f66343b;
        sb6.append(((com.tencent.mm.storage.emotion.EmojiInfo) h0Var.f310123d).getMd5());
        sb6.append(", isSuccess: ");
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        yz5.l lVar = this.f66345d;
        java.lang.String str2 = "";
        if (z17) {
            if (this.f66344c) {
                str2 = ((com.tencent.mm.storage.emotion.EmojiInfo) h0Var.f310123d).T();
                kotlin.jvm.internal.o.f(str2, "getDecryptPath(...)");
            } else {
                java.lang.String Bi = c4Var.Bi((com.tencent.mm.storage.emotion.EmojiInfo) h0Var.f310123d);
                if (Bi.length() == 0) {
                    lVar.invoke("");
                    return;
                }
                str2 = Bi;
            }
        }
        lVar.invoke(str2);
    }
}
