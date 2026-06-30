package fl1;

/* loaded from: classes7.dex */
public class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f345242d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fl1.f f345243e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fl1.b f345244f;

    public c(fl1.k kVar, java.util.ArrayList arrayList, fl1.f fVar, fl1.b bVar) {
        this.f345242d = arrayList;
        this.f345243e = fVar;
        this.f345244f = bVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandAuthorizeDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int i17 = 0;
        while (true) {
            java.util.ArrayList arrayList3 = this.f345242d;
            if (i17 >= arrayList3.size()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandAuthorizeDialog", "stev acceptButton click!");
                this.f345243e.a(1, arrayList2);
                this.f345244f.dismiss();
                yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandAuthorizeDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            if (((fl1.j) arrayList3.get(i17)).f345327b == 2 || ((fl1.j) arrayList3.get(i17)).f345327b == 3) {
                arrayList2.add(((fl1.j) arrayList3.get(i17)).f345326a);
            }
            i17++;
        }
    }
}
