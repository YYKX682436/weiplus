package e33;

/* loaded from: classes10.dex */
public class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e33.b0 f328659d;

    public b(e33.b0 b0Var) {
        this.f328659d = b0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        e33.r rVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/ui/AlbumAdapter$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Object tag = view.getTag(com.p314xaae8f345.mm.R.id.f566921hj1);
        int intValue = tag instanceof java.lang.Integer ? ((java.lang.Integer) tag).intValue() : -1;
        java.lang.Object tag2 = view.getTag(com.p314xaae8f345.mm.R.id.hju);
        int intValue2 = tag2 instanceof java.lang.Integer ? ((java.lang.Integer) tag2).intValue() : -1;
        if (intValue != -1 && intValue2 != -1 && (rVar = this.f328659d.L) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd activityC15653x403456cd = ((e33.z0) rVar).f329091a;
            if (intValue2 == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd.d7(activityC15653x403456cd, intValue, view, intValue2);
            } else if (intValue2 == 1) {
                activityC15653x403456cd.M7(intValue, view, intValue2);
            } else if (intValue2 == 4) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = activityC15653x403456cd.mo55332x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                pf5.z zVar = pf5.z.f435481a;
                ((i33.e) zVar.a(activity).a(i33.e.class)).X6("add_photo_button");
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = activityC15653x403456cd.mo55332x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
                i33.c0 c0Var = (i33.c0) zVar.a(activity2).a(i33.c0.class);
                int i17 = activityC15653x403456cd.F1;
                c0Var.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c0Var.f369701f, "requestShowSystemSelectMediaUI: " + i17 + ", " + c0Var.m158354x19263085());
                java.lang.String[] strArr = i17 != 1 ? i17 != 2 ? new java.lang.String[]{"android.permission.READ_MEDIA_VISUAL_USER_SELECTED", "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"} : new java.lang.String[]{"android.permission.READ_MEDIA_VISUAL_USER_SELECTED", "android.permission.READ_MEDIA_VIDEO"} : new java.lang.String[]{"android.permission.READ_MEDIA_VISUAL_USER_SELECTED", "android.permission.READ_MEDIA_IMAGES"};
                tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = c0Var.m158354x19263085();
                ((sb0.f) jVar).getClass();
                j35.u.l(m158354x19263085, strArr, 145);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/AlbumAdapter$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
