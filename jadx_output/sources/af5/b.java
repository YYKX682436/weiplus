package af5;

/* loaded from: classes9.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z01.a f4551d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f4552e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f4553f;

    public b(z01.a aVar, java.lang.String str, android.content.Context context) {
        this.f4551d = aVar;
        this.f4552e = str;
        this.f4553f = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String n17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingAppBrandFakeNativeMvvmView$onUpdateViewModel$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        l81.b1 b1Var = new l81.b1();
        b1Var.f317032k = 1096;
        z01.a aVar = this.f4551d;
        java.lang.String str3 = aVar.f468934o;
        if (str3 != null) {
            b1Var.f317034l = str3;
        }
        b1Var.f317012a = this.f4552e;
        s05.d dVar = aVar.f468928f;
        java.lang.String str4 = "";
        if (dVar == null || (str = dVar.p()) == null) {
            str = "";
        }
        b1Var.f317022f = str;
        b1Var.f317018d = -1;
        s05.d dVar2 = aVar.f468928f;
        if (dVar2 == null || (str2 = dVar2.getAppId()) == null) {
            str2 = "";
        }
        b1Var.f317014b = str2;
        b1Var.Q = aVar.f468933n;
        if (!android.text.TextUtils.isEmpty(b1Var.f317034l)) {
            b1Var.f317034l += ':';
            b1Var.f317034l += aVar.f468933n + ':' + aVar.f468935p;
        }
        int i17 = aVar.f468933n;
        int i18 = 1;
        if (i17 != 1 && i17 != 2) {
            i18 = (i17 == 3 || i17 == 4) ? 2 : 0;
        }
        com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer();
        appBrandLaunchReferrer.f77322d = 6;
        s05.d dVar3 = aVar.f468928f;
        if (dVar3 != null && (n17 = dVar3.n()) != null) {
            str4 = n17;
        }
        appBrandLaunchReferrer.f77326h = str4;
        b1Var.f317035m = i18;
        java.lang.String format = java.lang.String.format("%s:%s", java.util.Arrays.copyOf(new java.lang.Object[]{aVar.f468934o, aVar.f468935p}, 2));
        kotlin.jvm.internal.o.f(format, "format(...)");
        b1Var.f317036n = format;
        b1Var.f317041s = appBrandLaunchReferrer;
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(this.f4553f, b1Var);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingAppBrandFakeNativeMvvmView$onUpdateViewModel$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
