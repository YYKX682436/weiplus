package eg2;

/* loaded from: classes3.dex */
public final class x extends eg2.c0 {

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f334177g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f334178h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(ju3.d0 status, android.view.ViewGroup parent, qc0.a editContext) {
        super(status, parent, editContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(editContext, "editContext");
        this.f334177g = jz5.h.b(new eg2.w(parent));
    }

    @Override // yt3.r2
    /* renamed from: onAttach */
    public void mo10988x3b13c504() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderCoverPreviewBtnPlugin", "onAttach");
        qc0.a aVar = this.f334079f;
        int i17 = aVar.f442884f;
        android.view.ViewGroup viewGroup = this.f334078e;
        android.view.View findViewById = viewGroup.findViewById(i17);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/cover/FinderCoverPreviewBtnPlugin", "onAttach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/cover/FinderCoverPreviewBtnPlugin", "onAttach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View findViewById2 = viewGroup.findViewById(aVar.f442885g);
        if (findViewById2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/cover/FinderCoverPreviewBtnPlugin", "onAttach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/cover/FinderCoverPreviewBtnPlugin", "onAttach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (this.f334178h == null) {
            android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) viewGroup.findViewById(aVar.f442883e);
            if (relativeLayout == null) {
                return;
            }
            android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(aVar.f442886h);
            android.widget.TextView textView2 = new android.widget.TextView(viewGroup.getContext());
            textView2.setText("预览");
            textView2.setTextColor(-1);
            if (textView != null) {
                textView2.setTextSize(textView.getTextSize() / textView2.getResources().getDisplayMetrics().scaledDensity);
            }
            textView2.setGravity(17);
            textView2.setOnClickListener(new eg2.q(this));
            this.f334178h = textView2;
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(21);
            relativeLayout.addView(textView2, layoutParams);
        }
        android.widget.TextView textView3 = this.f334178h;
        if (textView3 != null) {
            textView3.setVisibility(0);
        }
        jz5.g gVar = this.f334177g;
        ((hk0.u0) ((jz5.n) gVar).mo141623x754a37bb()).Z6(2, new eg2.r(this));
        ((hk0.u0) ((jz5.n) gVar).mo141623x754a37bb()).Z6(3, new eg2.s(this));
        ((hk0.u0) ((jz5.n) gVar).mo141623x754a37bb()).Z6(4, new eg2.t(this));
        ((hk0.u0) ((jz5.n) gVar).mo141623x754a37bb()).a7(1, new eg2.u(this));
    }

    @Override // yt3.r2
    /* renamed from: onDetach */
    public void mo10989x3f5eee52() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderCoverPreviewBtnPlugin", "onDetach");
        android.widget.TextView textView = this.f334178h;
        if (textView == null) {
            return;
        }
        textView.setVisibility(8);
    }
}
