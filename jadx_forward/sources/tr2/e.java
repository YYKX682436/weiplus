package tr2;

/* loaded from: classes8.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f502912d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tr2.l f502913e;

    public e(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, tr2.l lVar) {
        this.f502912d = activityC0065xcd7aa112;
        this.f502913e = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/post/interactioneasteregg/InteractionEasterEggAddHalfScreen$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = this.f502913e.f502934m;
        ox2.g0 g0Var = ox2.h0.f431194g;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f502912d;
        java.lang.String string = activityC0065xcd7aa112.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574888om4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        ox2.h0 h0Var = new ox2.h0(activityC0065xcd7aa112, interfaceC4987x84e327cb, ox2.g0.a(g0Var, activityC0065xcd7aa112, string, (char) 0, 0, 0, 0, 0, 0, 252, null), null, null, null, 56, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1669x49fc1889.C15409xe873dc34 c15409xe873dc34 = h0Var.f431199e;
        if (c15409xe873dc34 != null) {
            c15409xe873dc34.m62773xab002c4b(true);
        }
        h0Var.a();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/post/interactioneasteregg/InteractionEasterEggAddHalfScreen$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
