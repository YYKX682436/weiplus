package rx4;

/* loaded from: classes8.dex */
public final class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx4.s f482770d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rx4.c f482771e;

    public n(rx4.s sVar, rx4.c cVar) {
        this.f482770d = sVar;
        this.f482771e = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachDramaBoxUIC$addMoreButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rx4.s sVar = this.f482770d;
        sVar.m174141x36654fab();
        android.app.Activity context = sVar.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(rx4.h2.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        rx4.h2 h2Var = (rx4.h2) a17;
        rx4.c cVar = this.f482771e;
        java.lang.String str2 = cVar.f482644c == 1 ? "top_more" : "bottom_more";
        vu4.a aVar = vu4.a.f521781r;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(sVar.f482793e);
        sb6.append("|42|");
        rx4.d dVar = sVar.f482795g;
        if (dVar == null || (str = dVar.f482657b) == null) {
            str = "";
        }
        sb6.append(fp.s0.b(str, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6));
        java.lang.String itemInfo = sb6.toString();
        java.lang.String docInfo = "0|0|" + str2 + "||0||||more|2";
        boolean z17 = sVar.f482794f;
        kz5.q0 extInfo = (16 & 16) != 0 ? kz5.q0.f395534d : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemInfo, "itemInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(docInfo, "docInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extInfo, "extInfo");
        h2Var.a7();
        h2Var.q7(aVar, itemInfo, docInfo, z17, kz5.c1.l(new jz5.l("clickId", h2Var.f482716y)));
        sVar.getClass();
        if (cVar.f482645d > 0) {
            try {
                sVar.U6(cVar);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(sVar.f482792d, "handleMoreJump error: " + e17);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachDramaBoxUIC$addMoreButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
