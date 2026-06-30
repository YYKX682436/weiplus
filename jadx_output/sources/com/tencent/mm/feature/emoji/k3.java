package com.tencent.mm.feature.emoji;

/* loaded from: classes10.dex */
public final class k3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.api.IEmojiInfo f66355d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.emoji.c4 f66356e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f66357f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f66358g;

    public k3(com.tencent.mm.api.IEmojiInfo iEmojiInfo, com.tencent.mm.feature.emoji.c4 c4Var, android.content.Context context, yz5.l lVar) {
        this.f66355d = iEmojiInfo;
        this.f66356e = c4Var;
        this.f66357f = context;
        this.f66358g = lVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.lang.String groupId = this.f66355d.getGroupId();
        kotlin.jvm.internal.o.f(groupId, "getGroupId(...)");
        qk.c0 c0Var = new qk.c0(groupId);
        c0Var.f364198g = 20;
        com.tencent.mm.feature.emoji.api.p6 p6Var = (com.tencent.mm.feature.emoji.api.p6) i95.n0.c(com.tencent.mm.feature.emoji.api.p6.class);
        if (p6Var == null) {
            com.tencent.mars.xlog.Log.e(this.f66356e.f66207d, "emoticon liteapp service not found");
        } else {
            ((com.tencent.mm.feature.emoji.f4) p6Var).wi(this.f66357f, c0Var);
        }
        dialogInterface.cancel();
        this.f66358g.invoke(1);
    }
}
