package te2;

/* loaded from: classes.dex */
public final class bb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.hc f499439d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f499440e;

    public bb(te2.hc hcVar, java.lang.String str) {
        this.f499439d = hcVar;
        this.f499440e = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorNoticeQRCodeUIC$initView$6$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        te2.hc hcVar = this.f499439d;
        r45.h32 h32Var = hcVar.f499601J;
        if (h32Var == null || (str = h32Var.m75945x2fec8307(4)) == null) {
            str = "";
        }
        linkedHashMap.put("notice_id", str);
        i95.m c17 = i95.n0.c(zy2.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.t1 t1Var = ml2.t1.f409542z;
        java.lang.String str2 = hcVar.M;
        if (str2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(dm.i4.f66875xa013b0d5);
            throw null;
        }
        zy2.zb.T8(zbVar, t1Var, linkedHashMap, null, "200", null, str2, false, 84, null);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", this.f499440e);
        j45.l.j(hcVar.m80379x76847179(), "webview", ".ui.tools.WebViewUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorNoticeQRCodeUIC$initView$6$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
