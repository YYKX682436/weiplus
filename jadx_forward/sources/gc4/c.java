package gc4;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final gc4.c f351980a = new gc4.c();

    public static int a(gc4.c cVar, android.content.Context context, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("calculateInputViewMaxHeight$default", "com.tencent.mm.plugin.sns.ui.helper.SnsCommentFooterHeightProvider");
        if ((i38 & 2) != 0) {
            i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.a(context);
        }
        if ((i38 & 4) != 0) {
            i18 = com.p314xaae8f345.mm.ui.zk.e(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561156ay);
        }
        if ((i38 & 8) != 0) {
            i19 = com.p314xaae8f345.mm.ui.bl.h(context);
        }
        if ((i38 & 16) != 0) {
            i27 = com.p314xaae8f345.mm.ui.bl.c(context);
        }
        if ((i38 & 32) != 0) {
            i28 = com.p314xaae8f345.mm.ui.bl.b(context).y;
        }
        if ((i38 & 64) != 0) {
            i29 = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        }
        if ((i38 & 128) != 0) {
            i37 = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        }
        cVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("calculateInputViewMaxHeight", "com.tencent.mm.plugin.sns.ui.helper.SnsCommentFooterHeightProvider");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentFooter.HeightProvider", "calculateInputViewMaxHeight context:" + context + ", screenHeight:" + i28 + ", keyboardHeight:" + i17 + ", actionBarHeight:" + i18 + ", statusBarHeight:" + i19 + ", bottomHeight:" + i27 + ", paddingTop:" + i29 + ", paddingBottom:" + i37);
        int i39 = (((((i28 - i19) - i18) - i27) - i17) / 2) - (i29 + i37);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calculateInputViewMaxHeight", "com.tencent.mm.plugin.sns.ui.helper.SnsCommentFooterHeightProvider");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calculateInputViewMaxHeight$default", "com.tencent.mm.plugin.sns.ui.helper.SnsCommentFooterHeightProvider");
        return i39;
    }
}
