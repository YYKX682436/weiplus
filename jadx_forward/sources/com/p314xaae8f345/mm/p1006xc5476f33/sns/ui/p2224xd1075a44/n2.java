package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44;

/* loaded from: classes4.dex */
public final class n2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f252766d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.m f252767e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.m mVar) {
        super(2);
        this.f252766d = str;
        this.f252767e = mVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
    
        if (r12 < 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0091, code lost:
    
        r8 = (yd4.d[]) r8.getSpans(r12, r8.length(), yd4.d.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a2, code lost:
    
        if (r8.length != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a4, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a8, code lost:
    
        if ((!r9) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00aa, code lost:
    
        r8 = kz5.z.L(r8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r8, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.view.VerticalAlignAlphaImageSpan");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRect", "com.tencent.mm.plugin.sns.ui.view.VerticalAlignAlphaImageSpan");
        r8 = ((yd4.d) r8).f542618g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRect", "com.tencent.mm.plugin.sns.ui.view.VerticalAlignAlphaImageSpan");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c2, code lost:
    
        if (r8 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c4, code lost:
    
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("openEmoticonDetailUI", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c9, code lost:
    
        r9 = new int[2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00cf, code lost:
    
        if (com.p314xaae8f345.mm.ui.bk.y() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d1, code lost:
    
        r3.getLocationOnScreen(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d8, code lost:
    
        r10 = new android.content.Intent();
        r13 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.x1.f252839a.f(ca4.z0.F0(r20.f252766d), r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e9, code lost:
    
        if (r13 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00eb, code lost:
    
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("openEmoticonDetailUI", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f0, code lost:
    
        r10.putExtra("IntentKeyEmojiMd5", r13.f460763d);
        r10.putExtra("IntentKeyEmojiBuffer", r13.f460764e.f453374f.f273689a);
        r13 = (int) (r8.left + r9[0]);
        r9 = (int) (r8.top + r9[1]);
        r10.putExtra("IntentKeyThumbLocation", new android.graphics.Rect(r13, r9, ((int) r8.width()) + r13, ((int) r8.height()) + r9));
        r10.setClass(r3.getContext(), com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ActivityC18417x2fbe3352.class);
        r3 = r3.getContext();
        r8 = new java.util.ArrayList();
        r8.add(r10);
        java.util.Collections.reverse(r8);
        yj0.a.d(r3, r8.toArray(), "com/tencent/mm/plugin/sns/ui/widget/SnsCommentMediaLoadManager", "openEmoticonDetailUI", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/SnsCommentInfo;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        r3.startActivity((android.content.Intent) r8.get(0));
        yj0.a.f(r3, "com/tencent/mm/plugin/sns/ui/widget/SnsCommentMediaLoadManager", "openEmoticonDetailUI", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/SnsCommentInfo;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d5, code lost:
    
        r3.getLocationInWindow(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x016e, code lost:
    
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("openEmoticonDetailUI", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a6, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0090, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008e, code lost:
    
        if (r12 < 0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    @Override // yz5.p
    /* renamed from: invoke */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo149xb9724478(java.lang.Object r21, java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.n2.mo149xb9724478(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
