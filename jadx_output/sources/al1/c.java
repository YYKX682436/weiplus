package al1;

/* loaded from: classes7.dex */
public class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public long f5759d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ al1.b f5760e;

    public c(al1.b bVar) {
        this.f5760e = bVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandActionBar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (java.lang.System.currentTimeMillis() - this.f5759d < 250) {
            al1.b bVar = this.f5760e;
            java.util.Iterator it = bVar.E.iterator();
            while (it.hasNext()) {
                ((al1.a) it.next()).a(bVar);
            }
            this.f5759d = 0L;
        }
        this.f5759d = java.lang.System.currentTimeMillis();
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandActionBar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
