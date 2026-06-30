package rx4;

/* loaded from: classes8.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx4.s f482783d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rx4.b f482784e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f482785f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rx4.d f482786g;

    public q(rx4.s sVar, rx4.b bVar, int i17, rx4.d dVar) {
        this.f482783d = sVar;
        this.f482784e = bVar;
        this.f482785f = i17;
        this.f482786g = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String g07;
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachDramaBoxUIC$renderDramaContent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rx4.s sVar = this.f482783d;
        sVar.m174141x36654fab();
        vu4.a aVar = vu4.a.f521776m;
        sVar.getClass();
        rx4.b bVar = this.f482784e;
        if (bVar.f482633g.length() > 0) {
            g07 = bVar.f482633g;
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("drama click docInfo empty, idx=");
            int i17 = this.f482785f;
            sb6.append(i17);
            sb6.append(", hotword=");
            java.lang.String str2 = bVar.f482628b;
            sb6.append(str2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(sVar.f482792d, sb6.toString());
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            int i18 = i17 + 1;
            sb7.append(i18);
            sb7.append('|');
            sb7.append(i18);
            g07 = kz5.n0.g0(kz5.c0.i(sb7.toString(), bVar.f482629c, "", "0", fp.s0.b(str2, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6), "", "", "short_dramas", "1"), "|", null, null, 0, null, null, 62, null);
        }
        java.lang.String docInfo = g07;
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        sb8.append(sVar.f482793e);
        sb8.append("|42|");
        rx4.d dVar = sVar.f482795g;
        if (dVar == null || (str = dVar.f482657b) == null) {
            str = "";
        }
        sb8.append(fp.s0.b(str, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6));
        java.lang.String itemInfo = sb8.toString();
        boolean z17 = sVar.f482794f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemInfo, "itemInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(docInfo, "docInfo");
        android.app.Activity context = sVar.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(rx4.h2.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        rx4.h2 h2Var = (rx4.h2) a17;
        h2Var.a7();
        h2Var.q7(aVar, itemInfo, docInfo, z17, kz5.c1.l(new jz5.l("clickId", h2Var.f482716y)));
        android.app.Activity context2 = sVar.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
        pf5.z zVar2 = pf5.z.f435481a;
        if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((rx4.h2) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(rx4.h2.class)).m7(this.f482786g.f482658c, bVar.f482628b, bVar.f482632f);
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachDramaBoxUIC$renderDramaContent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
