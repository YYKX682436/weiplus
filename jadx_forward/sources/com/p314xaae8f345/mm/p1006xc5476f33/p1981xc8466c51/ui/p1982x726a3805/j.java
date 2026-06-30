package com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805;

/* loaded from: classes8.dex */
public class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 f237052d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f237053e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f237054f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f237055g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f237056h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.m f237057i;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.m mVar, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 c5886xd11a0be7, android.content.Context context, java.lang.String str, int i17, int i18) {
        this.f237057i = mVar;
        this.f237052d = c5886xd11a0be7;
        this.f237053e = context;
        this.f237054f = str;
        this.f237055g = i17;
        this.f237056h = i18;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/record/ui/viewWrappers/ImageViewWrapper$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageViewWrapper", "request deal QBAR string");
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.m mVar = this.f237057i;
        if (mVar.f237072c.i()) {
            mVar.f237072c.u();
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 c5886xd11a0be7 = this.f237052d;
        if (c5886xd11a0be7 == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/record/ui/viewWrappers/ImageViewWrapper$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5292x67f91197 c5292x67f91197 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5292x67f91197();
        android.app.Activity activity = (android.app.Activity) this.f237053e;
        am.r3 r3Var = c5292x67f91197.f135612g;
        r3Var.f89314b = activity;
        r3Var.f89313a = this.f237054f;
        r3Var.f89315c = this.f237055g;
        r3Var.f89316d = this.f237056h;
        r3Var.f89321i = 30;
        r3Var.f89325m = c5886xd11a0be7.f136194g.f87901a;
        r3Var.f89327o = true;
        r3Var.f89329q = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.s6.b(c5886xd11a0be7);
        mVar.getClass();
        android.os.Bundle bundle = new android.os.Bundle();
        r3Var.f89324l = bundle;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageViewWrapper", "addStatInfo4AppBrand, fromScene: %d, chatType: %d", java.lang.Integer.valueOf(mVar.f237077h), java.lang.Integer.valueOf(mVar.f237076g));
        if (1 == mVar.f237077h) {
            bundle.putInt("LaunchCodeScene_ScanScene", 4);
        } else {
            bundle.putInt("LaunchCodeScene_ScanScene", 1);
            bundle.putInt("LaunchCodeScene_ChatType", mVar.f237076g);
        }
        c5292x67f91197.e();
        yj0.a.h(this, "com/tencent/mm/plugin/record/ui/viewWrappers/ImageViewWrapper$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
