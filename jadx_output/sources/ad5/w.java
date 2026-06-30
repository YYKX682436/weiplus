package ad5;

/* loaded from: classes5.dex */
public final class w implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.q f3321d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ad5.y f3322e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f3323f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f3324g;

    public w(yz5.q qVar, ad5.y yVar, java.util.List list, android.content.Context context) {
        this.f3321d = qVar;
        this.f3322e = yVar;
        this.f3323f = list;
        this.f3324g = context;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        boolean z17 = menuItem.getItemId() == 1;
        java.util.List msgInfoList = this.f3323f;
        yz5.q qVar = this.f3321d;
        if (qVar != null) {
            qVar.invoke(this.f3322e, ad5.i.f3267a, msgInfoList);
        }
        android.content.Context context = this.f3324g;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211776c = context.getString(com.tencent.mm.R.string.pbf);
        e4Var.f211782i = new ad5.r(c0Var, h0Var);
        e4Var.c();
        ad5.u uVar = new ad5.u(activity, c0Var, h0Var, z17, context);
        kotlin.jvm.internal.o.g(msgInfoList, "msgInfoList");
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
        if (lifecycleScope == null || v65.i.b(lifecycleScope, null, new yc5.c(msgInfoList, z17, context, uVar, null), 1, null) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgHistoryGalleryFileHelper", "executeDownloadAndSave: accountScope is null, skip");
            uVar.invoke(new yc5.a(false, false, true));
        }
    }
}
