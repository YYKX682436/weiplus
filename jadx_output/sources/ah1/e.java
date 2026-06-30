package ah1;

/* loaded from: classes7.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ah1.i f4820d;

    public e(ah1.i iVar) {
        this.f4820d = iVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/ui/FunctionalPageJsAuthorizePresenterUIView$onCreateView$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ah1.i iVar = this.f4820d;
        java.util.ArrayList D = ah1.i.D(iVar, false);
        ui1.y listener = iVar.getListener();
        if (listener != null) {
            ui1.y.b(listener, 2, D, 0, false, 12, null);
        }
        com.tencent.mm.plugin.appbrand.y yVar = iVar.f4834x0;
        if (yVar == null) {
            kotlin.jvm.internal.o.o("component");
            throw null;
        }
        iVar.p(yVar);
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/ui/FunctionalPageJsAuthorizePresenterUIView$onCreateView$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
