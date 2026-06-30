package kk5;

/* loaded from: classes8.dex */
public final class b1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk5.i1 f390148d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xj.m f390149e;

    public b1(kk5.i1 i1Var, xj.m mVar, java.lang.String str) {
        this.f390148d = i1Var;
        this.f390149e = mVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/uic/YuanBaoMultiSelectCopyDialogUIC$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kk5.i1 i1Var = this.f390148d;
        qg5.e3 e3Var = (qg5.e3) i1Var.T6();
        ((cy1.a) e3Var.ij()).Hj("multi_select_sub_open_yuanbao_btn", "view_clk", e3Var.nj("journey_copy"), 35480);
        android.content.Intent intent = new android.content.Intent();
        intent.setPackage("com.tencent.hunyuan.app.chat");
        intent.setAction("android.intent.action.SEND_MULTIPLE");
        intent.setType("*/*");
        intent.putParcelableArrayListExtra("android.intent.extra.STREAM", new java.util.ArrayList<>(kz5.b0.c((android.net.Uri) ((jz5.n) i1Var.f390191i).mo141623x754a37bb())));
        intent.addFlags(268435456);
        intent.addFlags(1);
        intent.addFlags(128);
        intent.addFlags(64);
        intent.putExtra("com.tencent.mm.intent.extra.FROM_CHAT_RECORDS_COPY", true);
        java.lang.String f17 = j62.e.g().f(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2585xce036727.p2586x14f51cd8.C20847xf68aface());
        if (f17 == null) {
            f17 = "";
        }
        intent.putExtra("gVer", f17);
        java.lang.String wi6 = ((ht.w) ((jt.c0) ((jz5.n) i1Var.f390188f).mo141623x754a37bb())).wi(i1Var.m80379x76847179());
        java.lang.String string = i1Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571891sq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        android.content.Context applicationContext = i1Var.m80379x76847179().getApplicationContext();
        xj.m mVar = this.f390149e;
        if (mVar != null) {
            xj.i iVar = (xj.i) ((jz5.n) i1Var.f390189g).mo141623x754a37bb();
            ((wj.j0) iVar).bj(mVar.f536286a, new xj.n(wj.r0.f528032e, intent, applicationContext, null, 8, null), new kk5.z0(i1Var));
        } else {
            ((kt.c) ((lt.i0) ((jz5.n) i1Var.f390187e).mo141623x754a37bb())).hj(applicationContext, intent, wi6, 0, string, new kk5.a1(i1Var), null);
        }
        yz5.a aVar = kk5.i1.f390184m;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        kk5.i1.f390184m = null;
        i1Var.m158354x19263085().finish();
        yj0.a.h(this, "com/tencent/mm/ui/uic/YuanBaoMultiSelectCopyDialogUIC$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
