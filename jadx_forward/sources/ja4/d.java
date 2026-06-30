package ja4;

/* loaded from: classes4.dex */
public abstract class d {
    public static android.app.Dialog a(android.content.Context context, android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showTipsDialog", "com.tencent.mm.plugin.sns.lucky.ui.SnsLuckyCommentAlertUI");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.btx, (android.view.ViewGroup) null);
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.m() ? "font_1.otf" : com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.n() ? "font_2.otf" : null;
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.j7a);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            textView.setTypeface(android.graphics.Typeface.createFromAsset(context.getAssets(), str));
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.j()) {
            textView.setTextSize(1, 10.0f);
        }
        sp.b bVar = new sp.b(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        bVar.setContentView(inflate);
        bVar.setTitle((java.lang.CharSequence) null);
        bVar.setOnCancelListener(new ja4.a(bVar));
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.gso)).setOnClickListener(new ja4.b(bVar, view));
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.oaa);
        int d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(context, 10.0f);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q(findViewById, d17, d17, d17, d17);
        findViewById.setOnClickListener(new ja4.c(bVar));
        bVar.show();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showTipsDialog", "com.tencent.mm.plugin.sns.lucky.ui.SnsLuckyCommentAlertUI");
        return bVar;
    }
}
