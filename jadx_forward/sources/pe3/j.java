package pe3;

/* loaded from: classes7.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pe3.o f435194d;

    public j(pe3.o oVar) {
        this.f435194d = oVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/magicbrush/scldemo/component/MagicBrushSclDemoUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        pe3.o oVar = this.f435194d;
        if (oVar.f435203f == null) {
            oz5.i a17 = p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null);
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            oVar.f435203f = p3325xe03a0797.p3326xc267989b.z0.a(((p3325xe03a0797.p3326xc267989b.c3) a17).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1848x727d4bff.p1849x373aa5.C16462x4c72b377 c16462x4c72b377 = oVar.f435201d;
        if (c16462x4c72b377 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("frameSetView");
            throw null;
        }
        c16462x4c72b377.setVisibility(0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1848x727d4bff.p1849x373aa5.C16462x4c72b377 c16462x4c72b3772 = oVar.f435201d;
        if (c16462x4c72b3772 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("frameSetView");
            throw null;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = oVar.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f435481a;
        c16462x4c72b3772.e(((pe3.h) zVar.a(activity).a(pe3.h.class)).P6());
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = oVar.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
        p3325xe03a0797.p3326xc267989b.y0 y0Var = oVar.f435203f;
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new pe3.i(oVar, null), 3, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/magicbrush/scldemo/component/MagicBrushSclDemoUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
