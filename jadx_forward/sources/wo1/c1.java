package wo1;

/* loaded from: classes4.dex */
public final class c1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1265xac8f1cfd.C12858x7cd09d75 f529447d;

    public c1(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1265xac8f1cfd.C12858x7cd09d75 c12858x7cd09d75) {
        this.f529447d = c12858x7cd09d75;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/component/DialogActionBar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Runnable runnable = this.f529447d.f174280e;
        if (runnable != null) {
            runnable.run();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/component/DialogActionBar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
