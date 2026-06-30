package qg5;

/* loaded from: classes8.dex */
public final class j extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qg5.p f444556d;

    public j(qg5.p pVar) {
        this.f444556d = pVar;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/feature/api/ChatRecordsAnalyzeStagingDialog$createTosLink$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        qg5.p pVar = this.f444556d;
        java.lang.String str = ((com.p314xaae8f345.mm.p689xc5a27af6.p772xce036727.C10698x53096d50) ((jz5.n) pVar.f444660i).mo141623x754a37bb()).f149400f;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        j45.l.j(pVar.f444652a, "webview", ".ui.tools.WebViewUI", intent, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatRecordsAnalyzeStagingDialog", "TOS link clicked");
        qg5.p.a(pVar, 5, pVar.b());
        yj0.a.h(this, "com/tencent/mm/ui/feature/api/ChatRecordsAnalyzeStagingDialog$createTosLink$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ds6, "ds");
        super.updateDrawState(ds6);
        ds6.setColor(b3.l.m9702x7444d5ad(this.f444556d.f444652a, com.p314xaae8f345.mm.R.C30859x5a72f63.f77827x4b0c744c));
        ds6.setUnderlineText(false);
    }
}
