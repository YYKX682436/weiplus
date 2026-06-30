package xr3;

/* loaded from: classes3.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xr3.i f537749d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f537750e;

    public d(xr3.i iVar, int i17) {
        this.f537749d = iVar;
        this.f537750e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/tab/menu/BizProfileMenuAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xr3.i iVar = this.f537749d;
        yz5.q qVar = iVar.f537762e;
        if (qVar != null) {
            java.util.List list = iVar.f537761d;
            int i17 = this.f537750e;
            qVar.mo147xb9724478(list.get(i17), java.lang.Integer.valueOf(i17), -1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/tab/menu/BizProfileMenuAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
