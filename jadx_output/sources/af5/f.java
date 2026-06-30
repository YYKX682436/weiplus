package af5;

/* loaded from: classes9.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z01.b f4570d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f4571e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f4572f;

    public f(z01.b bVar, java.lang.String str, android.content.Context context) {
        this.f4570d = bVar;
        this.f4571e = str;
        this.f4572f = context;
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
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingAppBrandProfileCardMvvmView$onUpdateViewModel$1$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        l81.b1 b1Var = new l81.b1();
        z01.b bVar = this.f4570d;
        b1Var.f317032k = bVar.f468951n;
        bVar.getClass();
        b1Var.f317012a = this.f4571e;
        s05.d dVar = bVar.f468947g;
        java.lang.String str3 = "";
        if (dVar == null || (str = dVar.p()) == null) {
            str = "";
        }
        b1Var.f317022f = str;
        s05.d dVar2 = bVar.f468947g;
        b1Var.f317016c = (dVar2 == null || (q17 = dVar2.q()) == null) ? 0 : q17.getType();
        b1Var.f317018d = -1;
        s05.d dVar3 = bVar.f468947g;
        if (dVar3 == null || (str2 = dVar3.getAppId()) == null) {
            str2 = "";
        }
        b1Var.f317014b = str2;
        bVar.getClass();
        b1Var.Q = 0;
        if (!android.text.TextUtils.isEmpty(b1Var.f317034l)) {
            b1Var.f317034l += ':';
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(b1Var.f317034l);
            bVar.getClass();
            sb6.append("0:null");
            bVar.getClass();
            b1Var.f317034l = sb6.toString();
        }
        bVar.getClass();
        com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer();
        appBrandLaunchReferrer.f77322d = 6;
        s05.d dVar4 = bVar.f468947g;
        if (dVar4 != null && (n17 = dVar4.n()) != null) {
            str3 = n17;
        }
        appBrandLaunchReferrer.f77326h = str3;
        b1Var.f317035m = 0;
        bVar.getClass();
        bVar.getClass();
        java.lang.String format = java.lang.String.format("%s:%s", java.util.Arrays.copyOf(new java.lang.Object[]{null, null}, 2));
        kotlin.jvm.internal.o.f(format, "format(...)");
        b1Var.f317036n = format;
        b1Var.f317041s = appBrandLaunchReferrer;
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(this.f4572f, b1Var);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingAppBrandProfileCardMvvmView$onUpdateViewModel$1$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
