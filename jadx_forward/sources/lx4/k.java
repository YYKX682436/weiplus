package lx4;

/* loaded from: classes8.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2419x8ff2b28.p2420x373aa5.C19355x505bfc55 f403674d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lx4.n f403675e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lx4.m f403676f;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2419x8ff2b28.p2420x373aa5.C19355x505bfc55 c19355x505bfc55, lx4.n nVar, lx4.m mVar) {
        this.f403674d = c19355x505bfc55;
        this.f403675e = nVar;
        this.f403676f = mVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.content.pm.ResolveInfo resolveInfo;
        android.content.pm.ActivityInfo activityInfo;
        android.content.pm.ResolveInfo resolveInfo2;
        android.content.pm.ActivityInfo activityInfo2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/browser/view/BrowserSettingDialogView$BrowserItemAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int m8183xf806b362 = this.f403675e.m8183xf806b362();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2419x8ff2b28.p2420x373aa5.C19355x505bfc55 c19355x505bfc55 = this.f403674d;
        c19355x505bfc55.f265552o = m8183xf806b362;
        ix4.b bVar = c19355x505bfc55.f265550m;
        lx4.m mVar = this.f403676f;
        if (bVar != null) {
            lx4.a aVar = c19355x505bfc55.f265549i;
            hx4.x xVar = (hx4.x) kz5.n0.a0(mVar.f403681e, m8183xf806b362);
            hx4.g gVar = (hx4.g) bVar;
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = java.lang.Integer.valueOf(aVar != null ? aVar.hashCode() : 0);
            java.lang.String str = null;
            objArr[1] = xVar != null ? java.lang.Integer.valueOf(xVar.f367233a) : null;
            objArr[2] = (xVar == null || (resolveInfo2 = xVar.f367234b) == null || (activityInfo2 = resolveInfo2.activityInfo) == null) ? null : activityInfo2.packageName;
            if (xVar != null && (resolveInfo = xVar.f367234b) != null && (activityInfo = resolveInfo.activityInfo) != null) {
                str = activityInfo.name;
            }
            objArr[3] = str;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrowserChooseController", "BrowserSettingDialog onBrowserItemClick dialog: %s, itemType: %s, packageName: %s, targetActivity: %s", objArr);
            gVar.f367202a = xVar;
            gVar.f367203b = m8183xf806b362;
        }
        mVar.m8146xced61ae5();
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/browser/view/BrowserSettingDialogView$BrowserItemAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
