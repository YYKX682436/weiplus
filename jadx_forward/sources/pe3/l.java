package pe3;

/* loaded from: classes7.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pe3.o f435196d;

    public l(pe3.o oVar) {
        this.f435196d = oVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/magicbrush/scldemo/component/MagicBrushSclDemoUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        pe3.o oVar = this.f435196d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1848x727d4bff.p1849x373aa5.C16462x4c72b377 c16462x4c72b377 = oVar.f435201d;
        if (c16462x4c72b377 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("frameSetView");
            throw null;
        }
        c16462x4c72b377.f();
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1848x727d4bff.p1849x373aa5.C16462x4c72b377 c16462x4c72b3772 = oVar.f435201d;
        if (c16462x4c72b3772 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("frameSetView");
            throw null;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = oVar.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        c16462x4c72b3772.e(((pe3.h) pf5.z.f435481a.a(activity).a(pe3.h.class)).P6());
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1848x727d4bff.p1849x373aa5.C16462x4c72b377 c16462x4c72b3773 = oVar.f435201d;
        if (c16462x4c72b3773 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("frameSetView");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = c16462x4c72b3773.getLayoutParams();
        layoutParams.height = 1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1848x727d4bff.p1849x373aa5.C16462x4c72b377 c16462x4c72b3774 = oVar.f435201d;
        if (c16462x4c72b3774 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("frameSetView");
            throw null;
        }
        c16462x4c72b3774.setLayoutParams(layoutParams);
        oVar.O6();
        yj0.a.h(this, "com/tencent/mm/plugin/magicbrush/scldemo/component/MagicBrushSclDemoUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
