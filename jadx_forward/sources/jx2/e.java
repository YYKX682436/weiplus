package jx2;

/* loaded from: classes3.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jx2.h f383943d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f383944e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f383945f;

    public e(jx2.h hVar, android.view.View view, android.content.Context context) {
        this.f383943d = hVar;
        this.f383944e = view;
        this.f383945f = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/feedback/FinderAdFeedbackController$showFirstPage$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f383944e;
        android.content.Context context = this.f383945f;
        jx2.h hVar = this.f383943d;
        jx2.h.a(hVar, view2, context);
        jx2.k kVar = hVar.f383954b;
        if (kVar != null) {
            android.view.View view3 = hVar.f383953a;
            android.content.Context context2 = view3 != null ? view3.getContext() : null;
            if (context2 != null) {
                android.widget.TextView textView = hVar.f383955c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                android.widget.TextView textView2 = hVar.f383956d;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
                android.widget.TextView textView3 = hVar.f383957e;
                if (textView3 != null) {
                    textView3.setVisibility(0);
                }
                android.widget.TextView textView4 = hVar.f383956d;
                if (textView4 != null) {
                    java.lang.String string = ((jx2.l) kVar).f383969a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cke);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                    textView4.setText(string);
                }
                android.widget.TextView textView5 = hVar.f383957e;
                if (textView5 != null) {
                    java.lang.String string2 = ((jx2.l) kVar).f383969a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ckc);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                    textView5.setText(string2);
                }
                android.widget.TextView textView6 = hVar.f383961i;
                if (textView6 != null) {
                    textView6.setVisibility(8);
                }
                ((java.util.ArrayList) hVar.f383962j).clear();
                hVar.c(context2);
                com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18 c21475x81dbaa18 = hVar.f383958f;
                if (c21475x81dbaa18 != null) {
                    c21475x81dbaa18.removeAllViews();
                }
                android.content.Context context3 = ((jx2.l) kVar).f383969a;
                java.lang.String string3 = context3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ck9);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
                jx2.a aVar = new jx2.a(0, string3);
                java.lang.String string4 = context3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ck_);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string4, "getString(...)");
                jx2.a aVar2 = new jx2.a(1, string4);
                java.lang.String string5 = context3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cka);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string5, "getString(...)");
                int i17 = 0;
                for (java.lang.Object obj : kz5.c0.i(aVar, aVar2, new jx2.a(2, string5))) {
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    jx2.a aVar3 = (jx2.a) obj;
                    android.view.View b17 = hVar.b(context2, aVar3.f383933b, -1);
                    com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18 c21475x81dbaa182 = hVar.f383958f;
                    if (c21475x81dbaa182 != null) {
                        c21475x81dbaa182.addView(b17);
                    }
                    b17.setOnClickListener(new jx2.f(hVar, b17, aVar3, true, context2));
                    i17 = i18;
                }
                android.widget.TextView textView7 = hVar.f383961i;
                if (textView7 != null) {
                    textView7.setOnClickListener(new jx2.g(kVar, hVar, context2));
                }
                android.view.View view4 = hVar.f383959g;
                if (view4 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/feedback/FinderAdFeedbackController", "showSecondPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view4, "com/tencent/mm/plugin/finder/view/feedback/FinderAdFeedbackController", "showSecondPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View view5 = hVar.f383960h;
                if (view5 != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view5, arrayList3.toArray(), "com/tencent/mm/plugin/finder/view/feedback/FinderAdFeedbackController", "showSecondPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view5.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view5, "com/tencent/mm/plugin/finder/view/feedback/FinderAdFeedbackController", "showSecondPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/feedback/FinderAdFeedbackController$showFirstPage$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
