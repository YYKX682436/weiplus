package h71;

/* loaded from: classes15.dex */
public class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1016x38927740.ui.C11393x5bd9875c f360948d;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1016x38927740.ui.C11393x5bd9875c c11393x5bd9875c) {
        this.f360948d = c11393x5bd9875c;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/security/ui/SafeDeviceListPreference$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1016x38927740.ui.C11393x5bd9875c c11393x5bd9875c = this.f360948d;
        android.content.Context context = c11393x5bd9875c.L;
        java.lang.String string = c11393x5bd9875c.M.f69208x97de538 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i7h) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i7g);
        android.content.Context context2 = c11393x5bd9875c.L;
        db5.e1.A(context, string, "", i65.a.r(context2, com.p314xaae8f345.mm.R.C30867xcad56011.i7i), i65.a.r(context2, com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new h71.x(c11393x5bd9875c), new h71.y(c11393x5bd9875c)).f(-1).setTextColor(c11393x5bd9875c.f279303d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac));
        yj0.a.h(this, "com/tencent/mm/plugin/account/security/ui/SafeDeviceListPreference$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
