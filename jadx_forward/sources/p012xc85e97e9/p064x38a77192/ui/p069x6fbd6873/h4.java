package p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873;

/* loaded from: classes14.dex */
public final class h4 implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.AbstractC1058x6d8e7db5 f92111d;

    public h4(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.AbstractC1058x6d8e7db5 abstractC1058x6d8e7db5) {
        this.f92111d = abstractC1058x6d8e7db5;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View v17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View v17) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.AbstractC1058x6d8e7db5 abstractC1058x6d8e7db5 = this.f92111d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(abstractC1058x6d8e7db5, "<this>");
        java.util.Iterator mo144672x467c086e = q26.y.d(abstractC1058x6d8e7db5.getParent(), n3.w1.f415966d).mo144672x467c086e();
        while (true) {
            if (!mo144672x467c086e.hasNext()) {
                break;
            }
            java.lang.Object obj = (android.view.ViewParent) mo144672x467c086e.next();
            if (obj instanceof android.view.View) {
                android.view.View view = (android.view.View) obj;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
                java.lang.Object tag = view.getTag(com.p314xaae8f345.mm.R.id.hgw);
                java.lang.Boolean bool = tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null;
                if (bool != null ? bool.booleanValue() : false) {
                    z17 = true;
                    break;
                }
            }
        }
        if (z17) {
            return;
        }
        n0.f1 f1Var = abstractC1058x6d8e7db5.f91984f;
        if (f1Var != null) {
            ((p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1066x9f035405) f1Var).mo7062x63a5261f();
        }
        abstractC1058x6d8e7db5.f91984f = null;
        abstractC1058x6d8e7db5.requestLayout();
    }
}
