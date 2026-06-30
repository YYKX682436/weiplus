package cb1;

/* loaded from: classes2.dex */
public class a extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f121744d;

    /* renamed from: e, reason: collision with root package name */
    public final int f121745e = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560057a5);

    public a(java.lang.String str) {
        this.f121744d = str;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/jsapi/autofill/ExposeSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String str = this.f121744d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExposeSpan", "exposeUrl is null, return");
            yj0.a.h(this, "com/tencent/mm/plugin/appbrand/jsapi/autofill/ExposeSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("forceHideShare", true);
        j45.l.j(view.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/jsapi/autofill/ExposeSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(this.f121745e);
        textPaint.setUnderlineText(false);
    }
}
