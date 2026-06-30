package e33;

/* loaded from: classes10.dex */
public class i1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd f328818d;

    public i1(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd activityC15653x403456cd) {
        this.f328818d = activityC15653x403456cd;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd activityC15653x403456cd = this.f328818d;
        activityC15653x403456cd.D = !activityC15653x403456cd.D;
        if (t21.d3.s() && activityC15653x403456cd.E1 == 3) {
            e33.b0 b0Var = activityC15653x403456cd.f220061m;
            b0Var.f328670p = activityC15653x403456cd.D;
            b0Var.m8146xced61ae5();
        }
        if (t21.d3.s()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd.c7(activityC15653x403456cd);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd.e7(activityC15653x403456cd);
        }
        activityC15653x403456cd.f220076t.setText(activityC15653x403456cd.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573715fj0));
        if (activityC15653x403456cd.D || activityC15653x403456cd.H) {
            activityC15653x403456cd.b8(true);
            if (activityC15653x403456cd.h7()) {
                activityC15653x403456cd.R7();
            } else {
                activityC15653x403456cd.f220077u.setVisibility(8);
            }
        } else {
            activityC15653x403456cd.b8(false);
            activityC15653x403456cd.f220077u.setVisibility(8);
            if (t21.d3.s()) {
                activityC15653x403456cd.c8(activityC15653x403456cd.f220061m.J());
            }
        }
        if (!t21.d3.s()) {
            i33.g gVar = (i33.g) pf5.z.f435481a.a(activityC15653x403456cd).a(i33.g.class);
            int size = activityC15653x403456cd.f220061m.f328664g.size();
            gVar.getClass();
            gVar.k6(size > 0);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
