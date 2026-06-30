package km3;

/* loaded from: classes10.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ km3.t f390790d;

    public q(km3.t tVar) {
        this.f390790d = tVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        km3.k kVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/adapter/MusicMvAlbumAdapter$mOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Object tag = view.getTag(com.p314xaae8f345.mm.R.id.f566922hj2);
        int intValue = tag instanceof java.lang.Integer ? ((java.lang.Number) tag).intValue() : -1;
        java.lang.Object tag2 = view.getTag(com.p314xaae8f345.mm.R.id.hjv);
        int intValue2 = tag2 instanceof java.lang.Integer ? ((java.lang.Number) tag2).intValue() : -1;
        if (intValue != -1 && intValue2 != -1 && (kVar = this.f390790d.f390801o) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16687xe732929a c16687xe732929a = ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.r0) kVar).f233465a;
            if (intValue2 == 1) {
                km3.t tVar = c16687xe732929a.f233154f;
                com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 x17 = tVar != null ? tVar.x(intValue) : null;
                if (x17 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x17.f219963e)) {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    objArr[0] = java.lang.Boolean.valueOf(x17 == null);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Mv.MusicMVCardChooseView", "item is null %s, item original path is null", objArr);
                } else if (c16687xe732929a.h()) {
                    if (x17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b) {
                        int i17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b) x17).f219979x;
                        if (lm3.d0.a(i17) < lm3.d0.c(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16687xe732929a.C1)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Mv.MusicMVCardChooseView", "durationMs:" + i17 + " is not in range of choose to mv ");
                            db5.t7.m(c16687xe732929a.getContext(), c16687xe732929a.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.h5b, java.lang.Integer.valueOf(lm3.d0.c(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16687xe732929a.C1))));
                        }
                    }
                    java.lang.String str = "local_" + x17.f219967i;
                    r45.oc5 oc5Var = com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16648x604060db.f232392d;
                    com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16648x604060db.f232392d = c16687xe732929a.f(str, "0");
                    android.content.Intent intent = new android.content.Intent(c16687xe732929a.getContext(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16648x604060db.class);
                    if (c16687xe732929a.getContext() instanceof android.app.Activity) {
                        android.content.Context context = c16687xe732929a.getContext();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                        android.app.Activity activity = (android.app.Activity) context;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList2.add(10041);
                        arrayList2.add(intent);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.k(activity, arrayList2.toArray(), "com/tencent/mm/plugin/mv/ui/view/MusicMVCardChooseView", "onMediaClick", "(ILandroid/view/View;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                    }
                } else {
                    if (x17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b) {
                        int i18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b) x17).f219979x;
                        if (lm3.d0.a(i18) < lm3.d0.c(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16687xe732929a.B1)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Mv.MusicMVCardChooseView", "durationMs:" + i18 + " is not in range of choose to mv ");
                            db5.t7.m(c16687xe732929a.getContext(), c16687xe732929a.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.h5b, java.lang.Integer.valueOf(lm3.d0.c(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16687xe732929a.B1))));
                        }
                    }
                    boolean z17 = c16687xe732929a.f233177y1;
                    p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
                    p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
                    if (!z17) {
                        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = c16687xe732929a.f233153e;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c1163xf1deaba4);
                        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c1163xf1deaba4.getLayoutManager();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(layoutManager);
                        int m8016xfbd72d54 = layoutManager.m8016xfbd72d54(view) - layoutManager.m8031xf39fff7a();
                        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = c16687xe732929a.f233153e;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c1163xf1deaba42);
                        int computeVerticalScrollRange = c1163xf1deaba42.computeVerticalScrollRange();
                        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = c16687xe732929a.f233153e;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c1163xf1deaba43);
                        int computeVerticalScrollOffset = c1163xf1deaba43.computeVerticalScrollOffset();
                        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba44 = c16687xe732929a.f233153e;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c1163xf1deaba44);
                        int height = c1163xf1deaba44.getHeight();
                        view.getHeight();
                        f0Var.f391649d = java.lang.Math.max(0, java.lang.Math.min(m8016xfbd72d54, ((computeVerticalScrollRange - computeVerticalScrollOffset) - height) + (c16687xe732929a.f233164p1 - c16687xe732929a.f233158l1)));
                    }
                    c16687xe732929a.i(true, new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.u0(z17, f0Var, f0Var2, c16687xe732929a), new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.v0(view, c16687xe732929a, x17));
                }
            } else if (intValue2 == 2) {
                if (c16687xe732929a.P) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Mv.MusicMVCardChooseView", "click open camera, but camera is opening");
                } else {
                    c16687xe732929a.P = true;
                    if (c16687xe732929a.h()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.b0 b0Var = c16687xe732929a.G;
                        if (b0Var != null) {
                            ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16653xffd2636a) b0Var).b7(2000);
                        }
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.b0 b0Var2 = c16687xe732929a.G;
                        if (b0Var2 != null) {
                            ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16653xffd2636a) b0Var2).b7((lm3.d0.c(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16687xe732929a.B1) * 1000) + 500);
                        }
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/adapter/MusicMvAlbumAdapter$mOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
