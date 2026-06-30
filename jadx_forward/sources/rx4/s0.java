package rx4;

/* loaded from: classes8.dex */
public final class s0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx4.u0 f482800d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rx4.x0 f482801e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f482802f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f482803g;

    public s0(rx4.u0 u0Var, rx4.x0 x0Var, int i17, android.view.ViewGroup viewGroup, java.lang.String str) {
        this.f482800d = u0Var;
        this.f482801e = x0Var;
        this.f482802f = viewGroup;
        this.f482803g = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachRecommendBoxUIC$updateRecommendBox$1$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rx4.u0 u0Var = this.f482800d;
        u0Var.m174141x36654fab();
        u0Var.getClass();
        rx4.x0 item = this.f482801e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        vu4.a aVar = vu4.a.f521776m;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(u0Var.f482815f);
        sb6.append("|39|");
        rx4.w0 w0Var = u0Var.f482817h;
        if (w0Var == null || (str = w0Var.f482850d) == null) {
            str = "";
        }
        sb6.append(fp.s0.b(str, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6));
        java.lang.String itemInfo = sb6.toString();
        java.lang.String docInfo = item.a();
        boolean z17 = u0Var.f482816g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemInfo, "itemInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(docInfo, "docInfo");
        android.app.Activity context = u0Var.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        rx4.h2 h2Var = (rx4.h2) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(rx4.h2.class);
        h2Var.a7();
        java.util.Map l17 = kz5.c1.l(new jz5.l("clickId", h2Var.f482716y));
        l17.put("items", h2Var.f482709r);
        h2Var.q7(aVar, itemInfo, docInfo, z17, l17);
        su4.z0 z0Var = (su4.z0) i95.n0.c(su4.z0.class);
        int i17 = u0Var.f482814e;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("{\"teachData\":{\"type\":");
        rx4.w0 w0Var2 = u0Var.f482817h;
        sb7.append(w0Var2 != null ? java.lang.Integer.valueOf(w0Var2.f482849c) : null);
        sb7.append(",\"item\":");
        sb7.append(item.f482857a);
        sb7.append("}}");
        ((sg0.a2) z0Var).bj(i17, 14, new org.json.JSONObject(sb7.toString()));
        android.content.Context context2 = this.f482802f.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        pf5.z zVar2 = pf5.z.f435481a;
        if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((rx4.h2) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(rx4.h2.class)).t7(64, this.f482803g, item.f482861e, kz5.c1.k(new jz5.l(ya.b.f77502x92235c1b, java.lang.Integer.valueOf(item.f482862f)), new jz5.l("flutterSearchDirectlyAddToKvHistory", java.lang.Boolean.FALSE)));
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachRecommendBoxUIC$updateRecommendBox$1$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
