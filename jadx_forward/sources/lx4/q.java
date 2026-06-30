package lx4;

/* loaded from: classes8.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2419x8ff2b28.p2420x373aa5.C19355x505bfc55 f403689d;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2419x8ff2b28.p2420x373aa5.C19355x505bfc55 c19355x505bfc55) {
        this.f403689d = c19355x505bfc55;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.content.pm.ActivityInfo activityInfo;
        android.content.pm.ActivityInfo activityInfo2;
        android.content.pm.ResolveInfo resolveInfo;
        android.content.pm.ActivityInfo activityInfo3;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/browser/view/BrowserSettingDialogView$initConfirmButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2419x8ff2b28.p2420x373aa5.C19355x505bfc55 c19355x505bfc55 = this.f403689d;
        ix4.b bVar = c19355x505bfc55.f265550m;
        if (bVar != null) {
            lx4.a aVar = c19355x505bfc55.f265549i;
            hx4.g gVar = (hx4.g) bVar;
            java.lang.Object[] objArr = new java.lang.Object[2];
            hx4.x xVar = gVar.f367202a;
            java.lang.String str = null;
            int i17 = 0;
            objArr[0] = (xVar == null || (resolveInfo = xVar.f367234b) == null || (activityInfo3 = resolveInfo.activityInfo) == null) ? null : activityInfo3.packageName;
            objArr[1] = xVar != null ? java.lang.Integer.valueOf(xVar.f367233a) : null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrowserChooseController", "BrowserSettingDialog onConfirmClick selected: %s, itemType: %s", objArr);
            hx4.x xVar2 = gVar.f367202a;
            if (xVar2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BrowserChooseController", "BrowserSettingDialog selectedInfo is null");
            } else {
                kx4.a aVar2 = kx4.a.f394815a;
                int i18 = xVar2.f367233a;
                if (i18 == 1) {
                    android.content.pm.ResolveInfo resolveInfo2 = xVar2.f367234b;
                    java.lang.String str2 = (resolveInfo2 == null || (activityInfo2 = resolveInfo2.activityInfo) == null) ? null : activityInfo2.packageName;
                    if (str2 == null) {
                        str2 = "";
                    }
                    aVar2.a(str2);
                } else if (i18 == 2) {
                    aVar2.a("");
                }
                hx4.p pVar = gVar.f367204c;
                if (aVar != null) {
                    aVar.setOnDismissListener(new hx4.f(pVar, gVar));
                }
                if (aVar != null) {
                    aVar.dismiss();
                }
                long j17 = pVar.f367216b;
                hx4.x xVar3 = gVar.f367202a;
                int i19 = pVar.f367218d;
                int i27 = gVar.f367203b;
                if (xVar3 != null) {
                    int i28 = xVar3.f367233a;
                    if (i28 == 1) {
                        i17 = 1;
                    } else if (i28 == 2) {
                        i17 = 2;
                    }
                    android.content.pm.ResolveInfo resolveInfo3 = xVar3.f367234b;
                    if (resolveInfo3 != null && (activityInfo = resolveInfo3.activityInfo) != null) {
                        str = activityInfo.packageName;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(21458, 2, java.lang.Integer.valueOf(i17), str == null ? "" : str, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), java.lang.Long.valueOf(j17));
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/browser/view/BrowserSettingDialogView$initConfirmButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
