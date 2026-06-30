package ah1;

/* loaded from: classes7.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ah1.c0 f4849d;

    public q(ah1.c0 c0Var) {
        this.f4849d = c0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean a17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/ui/FunctionalPagePhoneNumberManagerPresenterUIView$onCreateView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ah1.c0 c0Var = this.f4849d;
        fl1.s sVar = c0Var.L;
        if (sVar == null) {
            kotlin.jvm.internal.o.o("userAgreementComponent");
            throw null;
        }
        if (sVar.c()) {
            fl1.s sVar2 = c0Var.L;
            if (sVar2 == null) {
                kotlin.jvm.internal.o.o("userAgreementComponent");
                throw null;
            }
            a17 = sVar2.a();
        } else {
            a17 = true;
        }
        if (!a17) {
            yj0.a.h(this, "com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/ui/FunctionalPagePhoneNumberManagerPresenterUIView$onCreateView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        yz5.l onAccept = c0Var.getOnAccept();
        fl1.s sVar3 = c0Var.L;
        if (sVar3 == null) {
            kotlin.jvm.internal.o.o("userAgreementComponent");
            throw null;
        }
        onAccept.invoke(java.lang.Boolean.valueOf(sVar3.a()));
        vi1.l0 l0Var = c0Var.K;
        if (l0Var == null) {
            kotlin.jvm.internal.o.o("mItemAdapter");
            throw null;
        }
        java.util.Iterator it = l0Var.f437398e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem phoneItem = (com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem) it.next();
            if (phoneItem.f87407o) {
                c0Var.getOnPhoneItemSelect().invoke(phoneItem);
                break;
            }
        }
        c0Var.p(c0Var.f4814w);
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/ui/FunctionalPagePhoneNumberManagerPresenterUIView$onCreateView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
