package e33;

/* loaded from: classes10.dex */
public class b1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i33.e f328681d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd f328682e;

    public b1(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd activityC15653x403456cd, i33.e eVar) {
        this.f328682e = activityC15653x403456cd;
        this.f328681d = eVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI$29", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd activityC15653x403456cd = this.f328682e;
        if (!z2.h.b(activityC15653x403456cd, "android.permission.WRITE_EXTERNAL_STORAGE") || ((i17 = android.os.Build.VERSION.SDK_INT) >= 34 && activityC15653x403456cd.getApplicationInfo().targetSdkVersion >= 34)) {
            i33.e eVar = this.f328681d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(eVar.f369707f, "markJumpingPermissionChange: ");
            eVar.f369711m = true;
            eVar.X6("go_grant_purview");
            tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC15653x403456cd.mo55332x76847179();
            ((sb0.f) jVar).getClass();
            j35.u.g(mo55332x76847179);
        } else {
            activityC15653x403456cd.K1 = ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Di(activityC15653x403456cd, new java.lang.String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 145, activityC15653x403456cd.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), activityC15653x403456cd.getString(i17 < 33 ? com.p314xaae8f345.mm.R.C30867xcad56011.fip : com.p314xaae8f345.mm.R.C30867xcad56011.msk));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI$29", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
