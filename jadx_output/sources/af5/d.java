package af5;

/* loaded from: classes9.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z01.c f4559d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f4560e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f4561f;

    public d(z01.c cVar, java.lang.String str, android.content.Context context) {
        this.f4559d = cVar;
        this.f4560e = str;
        this.f4561f = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String n17;
        s05.e q17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingAppBrandMvvmView$onUpdateViewModel$1$6$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        l81.b1 b1Var = new l81.b1();
        z01.c cVar = this.f4559d;
        b1Var.f317032k = cVar.f468971t;
        java.lang.String str3 = cVar.f468967p;
        if (str3 != null) {
            b1Var.f317034l = str3;
        }
        b1Var.f317012a = this.f4560e;
        s05.d dVar = cVar.f468961g;
        java.lang.String str4 = "";
        if (dVar == null || (str = dVar.p()) == null) {
            str = "";
        }
        b1Var.f317022f = str;
        s05.d dVar2 = cVar.f468961g;
        int i17 = 0;
        b1Var.f317016c = (dVar2 == null || (q17 = dVar2.q()) == null) ? 0 : q17.getType();
        b1Var.f317018d = -1;
        s05.d dVar3 = cVar.f468961g;
        if (dVar3 == null || (str2 = dVar3.getAppId()) == null) {
            str2 = "";
        }
        b1Var.f317014b = str2;
        b1Var.Q = cVar.f468966o;
        if (!android.text.TextUtils.isEmpty(b1Var.f317034l)) {
            b1Var.f317034l += ':';
            b1Var.f317034l += cVar.f468966o + ':' + cVar.f468968q;
        }
        int i18 = cVar.f468966o;
        if (i18 == 1 || i18 == 2) {
            i17 = 1;
        } else if (i18 == 3 || i18 == 4) {
            i17 = 2;
        }
        com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer();
        appBrandLaunchReferrer.f77322d = 6;
        s05.d dVar4 = cVar.f468961g;
        if (dVar4 != null && (n17 = dVar4.n()) != null) {
            str4 = n17;
        }
        appBrandLaunchReferrer.f77326h = str4;
        b1Var.f317035m = i17;
        java.lang.String format = java.lang.String.format("%s:%s", java.util.Arrays.copyOf(new java.lang.Object[]{cVar.f468967p, cVar.f468968q}, 2));
        kotlin.jvm.internal.o.f(format, "format(...)");
        b1Var.f317036n = format;
        b1Var.f317041s = appBrandLaunchReferrer;
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(this.f4561f, b1Var);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingAppBrandMvvmView$onUpdateViewModel$1$6$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
