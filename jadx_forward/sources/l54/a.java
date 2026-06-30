package l54;

/* loaded from: classes5.dex */
public class a extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 {
    public a(android.content.Context context, int i17, int i18) {
        super(context, i17, i18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(nd1.h.f72932x24728b, "com.tencent.mm.plugin.sns.ad.landingpage.dialog.AdProgressDialog");
        android.view.Window window = getWindow();
        if (window != null) {
            window.addFlags(8);
            window.getDecorView().setSystemUiVisibility(4102);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(nd1.h.f72932x24728b, "com.tencent.mm.plugin.sns.ad.landingpage.dialog.AdProgressDialog");
    }

    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 h(android.content.Context context, int i17, android.content.DialogInterface.OnCancelListener onCancelListener) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getProgressDialog", "com.tencent.mm.plugin.sns.ad.landingpage.dialog.AdProgressDialog");
        if (!(context instanceof android.app.Activity)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getProgressDialog", "com.tencent.mm.plugin.sns.ad.landingpage.dialog.AdProgressDialog");
            return null;
        }
        java.lang.String string = i17 > 0 ? context.getString(i17) : "";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("progressDialog", "com.tencent.mm.plugin.sns.ad.landingpage.dialog.AdProgressDialog");
        l54.a aVar = new l54.a(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd, 0);
        if (!android.text.TextUtils.isEmpty(string)) {
            aVar.setMessage(string);
        }
        aVar.setCancelable(true);
        aVar.setOnCancelListener(onCancelListener);
        aVar.setCanceledOnTouchOutside(false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("progressDialog", "com.tencent.mm.plugin.sns.ad.landingpage.dialog.AdProgressDialog");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getProgressDialog", "com.tencent.mm.plugin.sns.ad.landingpage.dialog.AdProgressDialog");
        return aVar;
    }
}
