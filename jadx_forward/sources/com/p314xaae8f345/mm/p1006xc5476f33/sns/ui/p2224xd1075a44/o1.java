package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44;

/* loaded from: classes4.dex */
public final class o1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.o f252772d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.b86 f252773e;

    public o1(com.p314xaae8f345.mm.p944x882e457a.o oVar, r45.b86 b86Var) {
        this.f252772d = oVar;
        this.f252773e = b86Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache$batchCommentContentFromServer$1$1");
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f252772d.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.SnsCommentDetailResponse");
        r45.c86 c86Var = (r45.c86) fVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentEmojiInfoCache", "batchCommentContentFromServer count:" + c86Var.f452909e.size());
        java.util.LinkedList<r45.a86> ContentResults = c86Var.f452909e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ContentResults, "ContentResults");
        for (r45.a86 a86Var : ContentResults) {
            java.util.LinkedList SnsEmojiInfo = a86Var.f451362g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(SnsEmojiInfo, "SnsEmojiInfo");
            if (!SnsEmojiInfo.isEmpty()) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.x1 x1Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.x1.f252839a;
                java.lang.Object first = a86Var.f451362g.getFirst();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(first, "getFirst(...)");
                r45.l86 l86Var = (r45.l86) first;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setEmojiInfo", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setEmojiInfo", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
                if (android.text.TextUtils.isEmpty(l86Var.f460763d)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setEmojiInfo", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
                } else {
                    r45.cu5 cu5Var = l86Var.f460764e;
                    if (cu5Var == null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setEmojiInfo", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
                    } else if (cu5Var.f453374f.f273689a.length <= 0) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setEmojiInfo", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentEmojiInfoCache", "setEmojiInfo >> md5: " + l86Var.f460763d + " expireTime: " + l86Var.f460770n);
                        r45.m86 m86Var = new r45.m86();
                        m86Var.f461780d = l86Var.f460763d;
                        m86Var.f461781e = l86Var;
                        m86Var.f461782f = (int) (java.lang.System.currentTimeMillis() / ((long) 1000));
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.x1.f252840b.put(l86Var.f460763d, m86Var);
                        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.v1(l86Var, m86Var));
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setEmojiInfo", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setEmojiInfo", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.x1 x1Var2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.x1.f252839a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getEmoticonBatchList$p", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        java.util.ArrayList arrayList = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.x1.f252842d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getEmoticonBatchList$p", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        java.util.LinkedList ContentReqs = this.f252773e.f452166e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ContentReqs, "ContentReqs");
        arrayList.removeAll(ContentReqs);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setRunning$p", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.x1.f252843e = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setRunning$p", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache$batchCommentContentFromServer$1$1");
    }
}
