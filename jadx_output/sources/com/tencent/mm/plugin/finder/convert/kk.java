package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public class kk extends com.tencent.mm.plugin.finder.convert.zk {

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f103842r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kk(java.lang.String query, tu2.b itemViewConfig) {
        super(0, itemViewConfig, null, null, 13, null);
        kotlin.jvm.internal.o.g(query, "query");
        kotlin.jvm.internal.o.g(itemViewConfig, "itemViewConfig");
        this.f103842r = query;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0051  */
    @Override // com.tencent.mm.plugin.finder.convert.zk, in5.r
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(in5.s0 r7, com.tencent.mm.plugin.finder.model.BaseFinderFeed r8, int r9, int r10, boolean r11, java.util.List r12) {
        /*
            r6 = this;
            java.lang.String r0 = "holder"
            kotlin.jvm.internal.o.g(r7, r0)
            java.lang.String r0 = "item"
            kotlin.jvm.internal.o.g(r8, r0)
            super.h(r7, r8, r9, r10, r11, r12)
            java.lang.String r9 = r6.f103842r
            boolean r9 = com.tencent.mm.sdk.platformtools.t8.K0(r9)
            java.lang.String r10 = ""
            if (r9 == 0) goto L21
            com.tencent.mm.plugin.finder.storage.FinderItem r9 = r8.getFeedObject()
            java.lang.String r9 = r9.getDescription()
        L1f:
            r1 = r9
            goto L36
        L21:
            com.tencent.mm.plugin.finder.storage.FinderItem r9 = r8.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObject r9 = r9.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r9 = r9.getObjectDesc()
            if (r9 == 0) goto L35
            java.lang.String r9 = r9.getDescription()
            if (r9 != 0) goto L1f
        L35:
            r1 = r10
        L36:
            r9 = 2131307902(0x7f092d7e, float:1.8234044E38)
            android.view.View r9 = r7.p(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            java.lang.Class<le0.x> r11 = le0.x.class
            i95.m r12 = i95.n0.c(r11)
            le0.x r12 = (le0.x) r12
            android.content.Context r0 = com.tencent.mm.sdk.platformtools.x2.f193071a
            com.tencent.mm.plugin.finder.search.l4 r2 = com.tencent.mm.plugin.finder.search.l4.f125761a
            ya2.b2 r8 = r8.getContact()
            if (r8 == 0) goto L56
            java.lang.String r8 = r8.w0()
            goto L57
        L56:
            r8 = r10
        L57:
            android.text.Spanned r8 = r2.c(r8, r10)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            float r10 = r9.getTextSize()
            ke0.e r12 = (ke0.e) r12
            r12.getClass()
            android.text.SpannableString r8 = com.tencent.mm.pluginsdk.ui.span.c0.n(r0, r8, r10)
            r9.setText(r8)
            r8 = 2131305157(0x7f0922c5, float:1.8228477E38)
            android.view.View r7 = r7.p(r8)
            android.widget.TextView r7 = (android.widget.TextView) r7
            int r3 = com.tencent.mm.plugin.finder.search.l4.f125762b
            if (r7 != 0) goto L7b
            goto La4
        L7b:
            i95.m r8 = i95.n0.c(r11)
            le0.x r8 = (le0.x) r8
            android.content.Context r9 = com.tencent.mm.sdk.platformtools.x2.f193071a
            android.text.TextPaint r10 = r7.getPaint()
            java.lang.String r11 = "getPaint(...)"
            kotlin.jvm.internal.o.f(r10, r11)
            java.lang.String r4 = ""
            r5 = 0
            r0 = r2
            r2 = r10
            android.text.Spanned r10 = r0.b(r1, r2, r3, r4, r5)
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            ke0.e r8 = (ke0.e) r8
            r8.getClass()
            r8 = 0
            android.text.SpannableString r8 = com.tencent.mm.pluginsdk.ui.span.c0.n(r9, r10, r8)
            r7.setText(r8)
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.kk.h(in5.s0, com.tencent.mm.plugin.finder.model.BaseFinderFeed, int, int, boolean, java.util.List):void");
    }
}
