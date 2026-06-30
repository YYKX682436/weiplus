package vw3;

/* loaded from: classes.dex */
public final class k4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f522548d;

    public k4(android.view.View view) {
        this.f522548d = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerResDownloadUI$onCreate$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int a17 = uk.n.a(((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) this.f522548d.findViewById(com.p314xaae8f345.mm.R.id.orm)).getText().toString(), 0);
        if (a17 != 0) {
            ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).wi(a17);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerResDownloadUI$onCreate$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
