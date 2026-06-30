package cb1;

/* loaded from: classes2.dex */
public class a extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f40211d;

    /* renamed from: e, reason: collision with root package name */
    public final int f40212e = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f478524a5);

    public a(java.lang.String str) {
        this.f40211d = str;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/jsapi/autofill/ExposeSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String str = this.f40211d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ExposeSpan", "exposeUrl is null, return");
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
        textPaint.setColor(this.f40212e);
        textPaint.setUnderlineText(false);
    }
}
