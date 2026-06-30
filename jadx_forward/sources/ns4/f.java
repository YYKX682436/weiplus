package ns4;

/* loaded from: classes3.dex */
public final class f implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ns4.s f421050d;

    public f(ns4.s sVar) {
        this.f421050d = sVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.lang.Long l17 = (java.lang.Long) obj;
        ns4.s sVar = this.f421050d;
        sVar.getClass();
        if (l17 != null) {
            long longValue = l17.longValue();
            android.view.View view = sVar.f421177i;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mCustomView");
                throw null;
            }
            android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.m3i);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/BuyGoodsBottomDialog", "updateTitleBalance", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/wallet/wecoin/ui/BuyGoodsBottomDialog", "updateTitleBalance", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = sVar.f421177i;
            if (view2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mCustomView");
                throw null;
            }
            android.view.View findViewById2 = view2.findViewById(com.p314xaae8f345.mm.R.id.f568085ln5);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
            android.widget.TextView textView = (android.widget.TextView) findViewById2;
            os4.h.m(textView, 15);
            com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
            boolean z17 = sVar.f421174f;
            p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f = sVar.f421169a;
            if (z17) {
                textView.setTextColor(activityC1102x9ee2d9f.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
            }
            textView.setText("" + longValue);
            findViewById.setContentDescription(activityC1102x9ee2d9f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l8t, java.lang.String.valueOf(longValue)));
        }
    }
}
