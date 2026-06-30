package qg5;

/* loaded from: classes8.dex */
public final class y3 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qg5.a4 f444801d;

    public y3(qg5.a4 a4Var) {
        this.f444801d = a4Var;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/feature/api/YuanBaoCopyChatRecordsTosDialog$createTosLink$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        qg5.a4 a4Var = this.f444801d;
        a4Var.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", "https://support.weixin.qq.com/cgi-bin/mmsupportacctnodeweb-bin/pages/q7p0eWsNfnmqsfYh");
        intent.putExtra("hide_option_menu", true);
        j45.l.j(a4Var.f444440a, "webview", ".ui.tools.WebViewUI", intent, null);
        ((qg5.e3) a4Var.a()).uj(3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.YuanBaoCopyChatRecordsTosDialog", "TOS link clicked");
        yj0.a.h(this, "com/tencent/mm/ui/feature/api/YuanBaoCopyChatRecordsTosDialog$createTosLink$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ds6, "ds");
        super.updateDrawState(ds6);
        ds6.setColor(b3.l.m9702x7444d5ad(this.f444801d.f444440a, com.p314xaae8f345.mm.R.C30859x5a72f63.f77827x4b0c744c));
        ds6.setUnderlineText(false);
    }
}
