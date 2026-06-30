package at2;

/* loaded from: classes3.dex */
public final class v0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ at2.y0 f95300d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f95301e;

    public v0(at2.y0 y0Var, android.view.ViewGroup viewGroup) {
        this.f95300d = y0Var;
        this.f95301e = viewGroup;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        dt2.a0 a0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/replay/plugin/ReplaySpeedPanelController$initOptions$6$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Object tag = view.getTag();
        java.lang.Float f17 = tag instanceof java.lang.Float ? (java.lang.Float) tag : null;
        float floatValue = f17 != null ? f17.floatValue() : 1.0f;
        at2.y0 y0Var = this.f95300d;
        ((ct2.j) y0Var.m56788xbba4bfc0(ct2.j.class)).B = floatValue;
        at2.u1 u1Var = (at2.u1) y0Var.R6(at2.u1.class);
        if (u1Var != null && (a0Var = u1Var.f95295q) != null) {
            a0Var.f324691a.m58794xeb2d9731(floatValue);
        }
        y0Var.a7();
        org.json.JSONObject b17 = ml2.z0.b(ml2.z0.f409863a, null, 1, null);
        b17.put("select_type", java.lang.Float.valueOf(((ct2.j) y0Var.m56788xbba4bfc0(ct2.j.class)).B));
        java.lang.String jSONObject = b17.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
        zy2.zb zbVar = (zy2.zb) i95.n0.c(zy2.zb.class);
        ml2.o3[] o3VarArr = ml2.o3.f409306d;
        ((ml2.j0) zbVar).Wj("watch_live_speed_select", jSONObject);
        at2.y0.Z6(y0Var);
        android.view.ViewGroup viewGroup = this.f95301e;
        db5.t7.m(viewGroup.getContext(), viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f1v));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/replay/plugin/ReplaySpeedPanelController$initOptions$6$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
