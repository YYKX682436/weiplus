package gg1;

/* loaded from: classes7.dex */
public final class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gg1.w f353136d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f353137e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gg1.p f353138f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f353139g;

    public m(gg1.w wVar, int i17, gg1.p pVar, int i18) {
        this.f353136d = wVar;
        this.f353137e = i17;
        this.f353138f = pVar;
        this.f353139g = i18;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/jsapi/xwebplugin/video/cast/SelectDevicesBottomSheet$RecycleViewAdapter$bindDeviceViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gg1.w wVar = this.f353136d;
        if (wVar.f353182v != null) {
            boolean z17 = !wVar.f353168e.f353125e.isEmpty();
            int i17 = this.f353139g;
            gg1.p pVar = this.f353138f;
            int i18 = this.f353137e;
            if (!z17 || i18 > wVar.f353168e.f353125e.size()) {
                yz5.p pVar2 = wVar.f353182v;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(pVar2);
                pVar2.mo149xb9724478(pVar.x(i18).f353101a, java.lang.Integer.valueOf(i17));
            } else {
                yz5.p pVar3 = wVar.f353182v;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(pVar3);
                pVar3.mo149xb9724478(pVar.x(i18).f353101a, java.lang.Integer.valueOf(i17));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/jsapi/xwebplugin/video/cast/SelectDevicesBottomSheet$RecycleViewAdapter$bindDeviceViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
