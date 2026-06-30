package n34;

/* loaded from: classes4.dex */
public final class n3 {
    public n3(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final int a(android.content.Context context, boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("estimateBottomHeight", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper$Companion");
        if (context == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("estimateBottomHeight", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper$Companion");
            return 0;
        }
        int h17 = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        int h18 = z17 ? i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7) : 0;
        int h19 = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        int b17 = i65.a.b(context, 14) + i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl) + i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn) + i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
        if (z17 && z18) {
            int i17 = h17 + h18 + h19 + b17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("estimateBottomHeight", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper$Companion");
            return i17;
        }
        if (z17 || !z18) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("estimateBottomHeight", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper$Companion");
            return b17;
        }
        int i18 = h17 + b17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("estimateBottomHeight", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper$Companion");
        return i18;
    }
}
