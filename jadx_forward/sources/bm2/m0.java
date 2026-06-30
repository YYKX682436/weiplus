package bm2;

/* loaded from: classes3.dex */
public final class m0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.e52 f103616d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.v0 f103617e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f103618f;

    public m0(r45.e52 e52Var, bm2.v0 v0Var, android.content.Context context) {
        this.f103616d = e52Var;
        this.f103617e = v0Var;
        this.f103618f = context;
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
        java.util.LinkedList m75941xfb821914 = this.f103616d.m75941xfb821914(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getInfos(...)");
        r45.wd5 wd5Var = (r45.wd5) kz5.n0.Z(m75941xfb821914);
        java.lang.String m75945x2fec8307 = wd5Var != null ? wd5Var.m75945x2fec8307(4) : null;
        bm2.v0 v0Var = this.f103617e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(v0Var.f103894d, "url: " + m75945x2fec8307);
        android.content.Intent intent = new android.content.Intent();
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        intent.putExtra("rawUrl", m75945x2fec8307);
        intent.putExtra("convertActivityFromTranslucent", true);
        j45.l.n(this.f103618f, "webview", ".ui.tools.WebViewUI", intent, 1011);
        dk2.ef efVar = dk2.ef.f314905a;
        gk2.e eVar = dk2.ef.I;
        if (eVar != null) {
            wt2.a aVar = v0Var.f103901n;
            if (aVar != null && (q57 = aVar.q5()) != null && ((mm2.c1) q57.a(mm2.c1.class)).S) {
                z17 = true;
            }
            bf2.c.b(bf2.c.f101131a, eVar, z17 ? 8 : 6, 7, null, 0, 24, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorPromoteInfoAdapter$onBindViewHolder$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
