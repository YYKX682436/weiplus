package eo2;

/* loaded from: classes2.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eo2.i f337102d;

    public h(eo2.i iVar) {
        this.f337102d = iVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/member/MemberActionBarUIC$initViews$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        eo2.i iVar = this.f337102d;
        if (iVar.f337103e == null) {
            v92.g W6 = iVar.W6();
            iVar.f337103e = W6;
            if (W6 != null) {
                W6.q();
            }
        }
        v92.g gVar = iVar.f337103e;
        if (gVar != null) {
            gVar.u();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/member/MemberActionBarUIC$initViews$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
