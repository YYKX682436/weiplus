package ad5;

/* loaded from: classes5.dex */
public final class w implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.q f84854d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ad5.y f84855e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f84856f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f84857g;

    public w(yz5.q qVar, ad5.y yVar, java.util.List list, android.content.Context context) {
        this.f84854d = qVar;
        this.f84855e = yVar;
        this.f84856f = list;
        this.f84857g = context;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        boolean z17 = menuItem.getItemId() == 1;
        java.util.List msgInfoList = this.f84856f;
        yz5.q qVar = this.f84854d;
        if (qVar != null) {
            qVar.mo147xb9724478(this.f84855e, ad5.i.f84800a, msgInfoList);
        }
        android.content.Context context = this.f84857g;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
        e4Var.f293309c = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pbf);
        e4Var.f293315i = new ad5.r(c0Var, h0Var);
        e4Var.c();
        ad5.u uVar = new ad5.u(activity, c0Var, h0Var, z17, context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfoList, "msgInfoList");
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
        if (c20976x6ba6452a == null || v65.i.b(c20976x6ba6452a, null, new yc5.c(msgInfoList, z17, context, uVar, null), 1, null) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHistoryGalleryFileHelper", "executeDownloadAndSave: accountScope is null, skip");
            uVar.mo146xb9724478(new yc5.a(false, false, true));
        }
    }
}
