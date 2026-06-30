package ah1;

/* loaded from: classes7.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ah1.c0 f86382d;

    public q(ah1.c0 c0Var) {
        this.f86382d = c0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean a17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/ui/FunctionalPagePhoneNumberManagerPresenterUIView$onCreateView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ah1.c0 c0Var = this.f86382d;
        fl1.s sVar = c0Var.L;
        if (sVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("userAgreementComponent");
            throw null;
        }
        if (sVar.c()) {
            fl1.s sVar2 = c0Var.L;
            if (sVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("userAgreementComponent");
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
        yz5.l m1993xb5f6c93d = c0Var.m1993xb5f6c93d();
        fl1.s sVar3 = c0Var.L;
        if (sVar3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("userAgreementComponent");
            throw null;
        }
        m1993xb5f6c93d.mo146xb9724478(java.lang.Boolean.valueOf(sVar3.a()));
        vi1.l0 l0Var = c0Var.K;
        if (l0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mItemAdapter");
            throw null;
        }
        java.util.Iterator it = l0Var.f518931e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581 c12542x3a17e581 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581) it.next();
            if (c12542x3a17e581.f168940o) {
                c0Var.m1999x74c94168().mo146xb9724478(c12542x3a17e581);
                break;
            }
        }
        c0Var.p(c0Var.f86347w);
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/ui/FunctionalPagePhoneNumberManagerPresenterUIView$onCreateView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
