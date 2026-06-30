package ah1;

/* loaded from: classes7.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ah1.i f86355d;

    public f(ah1.i iVar) {
        this.f86355d = iVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean a17;
        fl1.h1 m2017xf85aaec4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/ui/FunctionalPageJsAuthorizePresenterUIView$onCreateView$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ah1.i iVar = this.f86355d;
        fl1.s sVar = iVar.A;
        if (sVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("userAgreementComponent");
            throw null;
        }
        if (sVar.c()) {
            fl1.s sVar2 = iVar.A;
            if (sVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("userAgreementComponent");
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
        ui1.y m2023xcc17022a = iVar.m2023xcc17022a();
        if (m2023xcc17022a != null) {
            m2017xf85aaec4 = iVar.m2017xf85aaec4();
            int i17 = m2017xf85aaec4 != null ? m2017xf85aaec4.f345319h : 0;
            fl1.s sVar3 = iVar.A;
            if (sVar3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("userAgreementComponent");
                throw null;
            }
            m2023xcc17022a.a(1, D, i17, sVar3.a());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = iVar.f86367x0;
        if (yVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("component");
            throw null;
        }
        iVar.p(yVar);
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/ui/FunctionalPageJsAuthorizePresenterUIView$onCreateView$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
