package db5;

/* loaded from: classes13.dex */
public final class z9 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21536x74125e7f f310131d;

    public z9(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21536x74125e7f c21536x74125e7f) {
        this.f310131d = c21536x74125e7f;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/WeAgreementCheckBox$setTextView$clickSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        db5.t9 t9Var = this.f310131d.f279266e;
        if (t9Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11461x47892174 activityC11461x47892174 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.jf) t9Var).f155494a;
            java.lang.String d17 = u11.b.d(activityC11461x47892174.f155104o);
            c71.b.c(activityC11461x47892174, activityC11461x47892174.getString(d17.equalsIgnoreCase("cn") ? com.p314xaae8f345.mm.R.C30867xcad56011.k4g : com.p314xaae8f345.mm.R.C30867xcad56011.k4h, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d(), d17), 0, false);
        }
        yj0.a.h(this, "com/tencent/mm/ui/base/WeAgreementCheckBox$setTextView$clickSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ds6, "ds");
        ds6.setColor(this.f310131d.getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo));
        ds6.setUnderlineText(false);
        ds6.clearShadowLayer();
    }
}
