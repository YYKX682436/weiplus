package dm1;

/* loaded from: classes5.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dm1.m f323169d;

    public g(dm1.m mVar) {
        this.f323169d = mVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/wmpfvoip/notify/ui/WMPFVoipCallInPopupWindow$show$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        dm1.m window = this.f323169d;
        dm1.a aVar = window.f323190l;
        if (aVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(window, "window");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WMPFVoip.WMPFVoipCallInManager", "click window");
            cm1.t tVar = cm1.t.f124849a;
            android.content.Context context = ((cm1.g) aVar).f124829a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "$context");
            tVar.c();
            tVar.b(context, false);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/wmpfvoip/notify/ui/WMPFVoipCallInPopupWindow$show$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
