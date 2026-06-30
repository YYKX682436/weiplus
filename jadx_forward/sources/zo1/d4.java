package zo1;

/* loaded from: classes5.dex */
public final class d4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zo1.b4 f556115d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zo1.k4 f556116e;

    public d4(zo1.b4 b4Var, zo1.k4 k4Var) {
        this.f556115d = b4Var;
        this.f556116e = k4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/pkg/SelectPackageUI$PackageListAdapter$onCreateViewHolder$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int m8183xf806b362 = this.f556115d.m8183xf806b362();
        int i17 = -1;
        if (m8183xf806b362 != -1) {
            zo1.k4 k4Var = this.f556116e;
            if (k4Var.mo1894x7e414b06() > 1) {
                if (k4Var.f556210h == ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g) k4Var.f556207e.get(m8183xf806b362)).f297362d) {
                    k4Var.B(-1L);
                    k4Var.m8147xed6e4d18(m8183xf806b362);
                } else {
                    zo1.a4 a4Var = k4Var.f556206d;
                    if (a4Var != null) {
                        ((zo1.r4) a4Var).a(m8183xf806b362);
                    }
                    long j17 = k4Var.f556210h;
                    k4Var.B(((com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g) k4Var.f556207e.get(m8183xf806b362)).f297362d);
                    k4Var.m8147xed6e4d18(m8183xf806b362);
                    if (j17 >= 0) {
                        java.util.Iterator it = k4Var.f556207e.iterator();
                        int i18 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (((com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g) it.next()).f297362d == j17) {
                                i17 = i18;
                                break;
                            }
                            i18++;
                        }
                    }
                    if (i17 >= 0) {
                        k4Var.m8147xed6e4d18(i17);
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/SelectPackageUI$PackageListAdapter$onCreateViewHolder$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
