package com.p314xaae8f345.mm.ui;

/* loaded from: classes14.dex */
public final class xg implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.zg f294087d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f294088e;

    public xg(com.p314xaae8f345.mm.ui.zg zgVar, android.content.Context context) {
        this.f294087d = zgVar;
        this.f294088e = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/ScreenProfileReadyPluginUI$applyClickEvent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.zg zgVar = this.f294087d;
        int i17 = zgVar.f294157d;
        android.content.Context context = this.f294088e;
        if (i17 == 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231716x1.mo522xb5bdeb7a(zgVar.f294166m);
            p012xc85e97e9.p093xedfae76a.j0 j0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231716x1;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            j0Var.mo7806x9d92d11c((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context, zgVar.f294166m);
        } else if (i17 == 4) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, zgVar.f294155b);
            intent.putExtra("fileExt", zgVar.f294156c);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            ((android.app.Activity) context).setResult(-1, intent);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            ((android.app.Activity) context).finish();
        }
        yj0.a.h(this, "com/tencent/mm/ui/ScreenProfileReadyPluginUI$applyClickEvent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
