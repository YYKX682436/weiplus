package on2;

/* loaded from: classes2.dex */
public final class m3 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f428504d;

    public m3(java.lang.ref.WeakReference rContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rContext, "rContext");
        this.f428504d = rContext;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/lottery/ProductGiftLicenseSpanClick", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        android.content.Context context = (android.content.Context) this.f428504d.get();
        if (context == null) {
            int i17 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ProductGiftLicenseSpanClick", "on click but rContext is null!", null);
            yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/ProductGiftLicenseSpanClick", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
        } else {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", "https://store.weixin.qq.com/chengzhang/webdoc/wiki/7524/b6abad60f28e8c63/service_account_doc");
            intent.putExtra("convertActivityFromTranslucent", true);
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
            yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/ProductGiftLicenseSpanClick", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ds6, "ds");
        ds6.setColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77827x4b0c744c));
        ds6.setUnderlineText(false);
        ds6.clearShadowLayer();
    }
}
