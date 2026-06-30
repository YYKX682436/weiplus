package ah1;

/* loaded from: classes7.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ah1.i f4822d;

    public f(ah1.i iVar) {
        this.f4822d = iVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean a17;
        fl1.h1 selectedItem;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/ui/FunctionalPageJsAuthorizePresenterUIView$onCreateView$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ah1.i iVar = this.f4822d;
        fl1.s sVar = iVar.A;
        if (sVar == null) {
            kotlin.jvm.internal.o.o("userAgreementComponent");
            throw null;
        }
        if (sVar.c()) {
            fl1.s sVar2 = iVar.A;
            if (sVar2 == null) {
                kotlin.jvm.internal.o.o("userAgreementComponent");
                throw null;
            }
            a17 = sVar2.a();
        } else {
            a17 = true;
        }
        if (!a17) {
            yj0.a.h(this, "com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/ui/FunctionalPageJsAuthorizePresenterUIView$onCreateView$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.util.ArrayList D = ah1.i.D(iVar, true);
        ui1.y listener = iVar.getListener();
        if (listener != null) {
            selectedItem = iVar.getSelectedItem();
            int i17 = selectedItem != null ? selectedItem.f263786h : 0;
            fl1.s sVar3 = iVar.A;
            if (sVar3 == null) {
                kotlin.jvm.internal.o.o("userAgreementComponent");
                throw null;
            }
            listener.a(1, D, i17, sVar3.a());
        }
        com.tencent.mm.plugin.appbrand.y yVar = iVar.f4834x0;
        if (yVar == null) {
            kotlin.jvm.internal.o.o("component");
            throw null;
        }
        iVar.p(yVar);
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/ui/FunctionalPageJsAuthorizePresenterUIView$onCreateView$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
