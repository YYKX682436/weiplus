package c04;

/* loaded from: classes13.dex */
public final class w implements km5.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2043x93a356f9.p2044xd1075a44.C17324xa321818a f119228a;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2043x93a356f9.p2044xd1075a44.C17324xa321818a c17324xa321818a) {
        this.f119228a = c17324xa321818a;
    }

    @Override // km5.f
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanGoodsMaskView", "showCustomView finish result: %b", (java.lang.Boolean) obj);
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2043x93a356f9.p2044xd1075a44.C17324xa321818a c17324xa321818a = this.f119228a;
        c17324xa321818a.E = true;
        android.widget.LinearLayout linearLayout = c17324xa321818a.I;
        if (linearLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("customTipsImageContainer");
            throw null;
        }
        linearLayout.setVisibility(0);
        android.widget.ImageView imageView = c17324xa321818a.F;
        if (imageView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("customMaskView");
            throw null;
        }
        imageView.setVisibility(0);
        c17324xa321818a.Q = c17324xa321818a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.a9b);
        android.view.View view = c17324xa321818a.f241175y;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("successMarkView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/scangoods/widget/ScanGoodsMaskView$onSetCustomBackgroundSuccess$5", "onTerminate", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/scanner/ui/scangoods/widget/ScanGoodsMaskView$onSetCustomBackgroundSuccess$5", "onTerminate", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.ImageView imageView2 = c17324xa321818a.G;
        if (imageView2 != null) {
            c17324xa321818a.f241175y = imageView2;
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("customSuccessView");
            throw null;
        }
    }
}
