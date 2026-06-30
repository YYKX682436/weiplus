package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

/* loaded from: classes3.dex */
public final class c4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.e4 f233327d;

    public c4(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.e4 e4Var) {
        this.f233327d = e4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/view/MusicMvTipsPopupWindow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.e4 e4Var = this.f233327d;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.d4 d4Var = e4Var.f233352b;
        if (d4Var != null) {
            e4Var.getClass();
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.d1) d4Var).f232627a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.q7.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.q7) a17).Q6(null, true, 2);
        }
        e4Var.dismiss();
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/view/MusicMvTipsPopupWindow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
