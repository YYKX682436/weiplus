package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4;

/* loaded from: classes4.dex */
public class s extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.h1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i f251382d;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar) {
        this.f251382d = iVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0043, code lost:
    
        if (r2 != 54) goto L19;
     */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.h1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.view.ContextMenu r7, android.view.View r8, android.view.ContextMenu.ContextMenuInfo r9) {
        /*
            r6 = this;
            java.lang.String r9 = "onMMCreateContextMenu"
            java.lang.String r0 = "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$17"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r9, r0)
            java.lang.Object r1 = r8.getTag()
            boolean r2 = r1 instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.oj
            if (r2 == 0) goto L15
            com.tencent.mm.plugin.sns.ui.oj r1 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.oj) r1
            java.lang.String r1 = r1.f251635a
            goto L1f
        L15:
            boolean r2 = r1 instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i2
            if (r2 == 0) goto L1e
            com.tencent.mm.plugin.sns.ui.i2 r1 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i2) r1
            java.lang.String r1 = r1.f250083b
            goto L1f
        L1e:
            r1 = 0
        L1f:
            if (r1 == 0) goto L63
            com.tencent.mm.plugin.sns.storage.f2 r2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj()
            com.tencent.mm.plugin.sns.storage.SnsInfo r1 = r2.k1(r1)
            com.tencent.mm.protocal.protobuf.TimeLineObject r2 = r1.m70371x485d7()
            java.lang.String r3 = "favorite"
            j45.l.g(r3)
            r45.a90 r2 = r2.f39014x86965dde
            int r2 = r2.f451370e
            r3 = 1
            r4 = 2131773067(0x7f10468b, float:1.9177511E38)
            r5 = 0
            if (r2 == r3) goto L54
            r3 = 15
            if (r2 == r3) goto L46
            r3 = 54
            if (r2 == r3) goto L54
            goto L60
        L46:
            android.content.Context r8 = r8.getContext()
            java.lang.String r8 = r8.getString(r4)
            r2 = 10
            r7.add(r5, r2, r5, r8)
            goto L60
        L54:
            android.content.Context r8 = r8.getContext()
            java.lang.String r8 = r8.getString(r4)
            r2 = 2
            r7.add(r5, r2, r5, r8)
        L60:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2087xab215833.a.b(r7, r1)
        L63:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.s.a(android.view.ContextMenu, android.view.View, android.view.ContextMenu$ContextMenuInfo):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.h1
    public boolean b(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$17");
        java.lang.Object tag = view.getTag();
        java.lang.String str = tag instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.oj ? ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.oj) tag).f251635a : tag instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i2 ? ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i2) tag).f250083b : null;
        if (str == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$17");
            return false;
        }
        this.f251382d.f251342l.e(view, str, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(str).m70371x485d7());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$17");
        return true;
    }
}
