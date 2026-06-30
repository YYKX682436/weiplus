package tx2;

/* loaded from: classes.dex */
public final class g0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f504097d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tx2.i0 f504098e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f504099f;

    public g0(r45.h32 h32Var, tx2.i0 i0Var, java.lang.String str) {
        this.f504097d = h32Var;
        this.f504098e = i0Var;
        this.f504099f = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/notice/NoticeBigCardWidget$refreshView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        r45.h32 h32Var = this.f504097d;
        r45.t75 t75Var = (r45.t75) h32Var.m75936x14adae67(16);
        intent.putExtra("rawUrl", t75Var != null ? t75Var.m75945x2fec8307(3) : null);
        intent.putExtra("convertActivityFromTranslucent", true);
        tx2.i0 i0Var = this.f504098e;
        j45.l.j(i0Var.f199914d, "webview", ".ui.tools.WebViewUI", intent, null);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.lang.String m75945x2fec8307 = h32Var.m75945x2fec8307(4);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        linkedHashMap.put("notice_id", m75945x2fec8307);
        i95.m c17 = i95.n0.c(zy2.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.t1 t1Var = ml2.t1.A;
        android.content.Context context = i0Var.f199914d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        zy2.zb.T8(zbVar, t1Var, linkedHashMap, null, java.lang.String.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(zy2.ra.class))).V6().m75939xb282bd08(5)), null, this.f504099f, false, 84, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/notice/NoticeBigCardWidget$refreshView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
