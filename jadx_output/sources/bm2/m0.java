package bm2;

/* loaded from: classes3.dex */
public final class m0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.e52 f22083d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.v0 f22084e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f22085f;

    public m0(r45.e52 e52Var, bm2.v0 v0Var, android.content.Context context) {
        this.f22083d = e52Var;
        this.f22084e = v0Var;
        this.f22085f = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        gk2.e q57;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorPromoteInfoAdapter$onBindViewHolder$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z17 = false;
        java.util.LinkedList list = this.f22083d.getList(0);
        kotlin.jvm.internal.o.f(list, "getInfos(...)");
        r45.wd5 wd5Var = (r45.wd5) kz5.n0.Z(list);
        java.lang.String string = wd5Var != null ? wd5Var.getString(4) : null;
        bm2.v0 v0Var = this.f22084e;
        com.tencent.mars.xlog.Log.i(v0Var.f22361d, "url: " + string);
        android.content.Intent intent = new android.content.Intent();
        if (string == null) {
            string = "";
        }
        intent.putExtra("rawUrl", string);
        intent.putExtra("convertActivityFromTranslucent", true);
        j45.l.n(this.f22085f, "webview", ".ui.tools.WebViewUI", intent, 1011);
        dk2.ef efVar = dk2.ef.f233372a;
        gk2.e eVar = dk2.ef.I;
        if (eVar != null) {
            wt2.a aVar = v0Var.f22368n;
            if (aVar != null && (q57 = aVar.q5()) != null && ((mm2.c1) q57.a(mm2.c1.class)).S) {
                z17 = true;
            }
            bf2.c.b(bf2.c.f19598a, eVar, z17 ? 8 : 6, 7, null, 0, 24, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorPromoteInfoAdapter$onBindViewHolder$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
