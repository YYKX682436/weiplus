package zc3;

/* loaded from: classes7.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1836x2efde3.ui.AbstractActivityC16430x9afbaf30 f552941d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f552942e;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1836x2efde3.ui.AbstractActivityC16430x9afbaf30 abstractActivityC16430x9afbaf30, java.lang.String str) {
        this.f552941d = abstractActivityC16430x9afbaf30;
        this.f552942e = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        zc3.c cVar;
        zc3.c cVar2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/magicbrush/demo/ui/MagicBaseDemoActivity$initEnv$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1836x2efde3.ui.AbstractActivityC16430x9afbaf30.f229449f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1836x2efde3.ui.AbstractActivityC16430x9afbaf30 abstractActivityC16430x9afbaf30 = this.f552941d;
        abstractActivityC16430x9afbaf30.getClass();
        java.lang.String str = this.f552942e;
        switch (str.hashCode()) {
            case -318476791:
                if (str.equals("preload")) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicSimpleDemo", "preload");
                    abstractActivityC16430x9afbaf30.T6().a();
                    break;
                }
                break;
            case 3529469:
                if (str.equals("show") && (cVar = abstractActivityC16430x9afbaf30.f229450d) != null) {
                    cVar.mo178669x35dafd();
                    break;
                }
                break;
            case 3540994:
                if (str.equals("stop") && (cVar2 = abstractActivityC16430x9afbaf30.f229450d) != null) {
                    cVar2.mo178670x360802();
                    ((android.widget.FrameLayout) abstractActivityC16430x9afbaf30.findViewById(com.p314xaae8f345.mm.R.id.p1c)).removeView(abstractActivityC16430x9afbaf30.f229451e);
                    abstractActivityC16430x9afbaf30.f229451e = null;
                    abstractActivityC16430x9afbaf30.f229450d = null;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start") && abstractActivityC16430x9afbaf30.f229450d == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicSimpleDemo", "start");
                    zc3.c T6 = abstractActivityC16430x9afbaf30.T6();
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = abstractActivityC16430x9afbaf30.mo55332x76847179();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
                    zq0.a aVar = new zq0.a(mo55332x76847179);
                    ((android.widget.FrameLayout) abstractActivityC16430x9afbaf30.findViewById(com.p314xaae8f345.mm.R.id.p1c)).addView(aVar);
                    T6.b(aVar);
                    abstractActivityC16430x9afbaf30.f229451e = aVar;
                    abstractActivityC16430x9afbaf30.f229450d = T6;
                    break;
                }
                break;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/magicbrush/demo/ui/MagicBaseDemoActivity$initEnv$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
