package ni2;

/* loaded from: classes10.dex */
public final class d1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ni2.f1 f418810d;

    public d1(ni2.f1 f1Var) {
        this.f418810d = f1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        km2.q qVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicTagEditWidget$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ni2.f1 f1Var = this.f418810d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = f1Var.f418826n;
        if (c22621x7603e017 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editText");
            throw null;
        }
        java.lang.String obj = c22621x7603e017.getEditableText().toString();
        if (((mm2.e1) f1Var.f418824i.a(mm2.e1.class)).g7()) {
            fj2.s sVar = fj2.s.f344716a;
            ml2.w4 w4Var = ml2.w4.f409725m;
            xh2.a aVar = f1Var.f418829q;
            if (aVar == null || (qVar = aVar.f536053a) == null || (str = qVar.f390705c) == null) {
                str = "";
            }
            fj2.s.h(sVar, w4Var, str, 0, 0, 12, null);
        }
        p3325xe03a0797.p3326xc267989b.y0 a17 = f1Var.f418825m.a();
        if (a17 != null) {
            p3325xe03a0797.p3326xc267989b.l.d(a17, null, null, new ni2.c1(f1Var, obj, null), 3, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicTagEditWidget$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
