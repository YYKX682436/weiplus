package io;

/* loaded from: classes10.dex */
public final class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xb5.a f374703d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ em.g1 f374704e;

    public c0(xb5.a aVar, em.g1 g1Var) {
        this.f374703d = aVar;
        this.f374704e = g1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatting/viewfactory/ContactItemView$updateViewModel$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xb5.a aVar = this.f374703d;
        aVar.f534541f = !aVar.f534541f;
        em.g1 g1Var = this.f374704e;
        g1Var.a().setSelected(aVar.f534541f);
        g1Var.a().setChecked(aVar.f534541f);
        yz5.l lVar = aVar.f534542g;
        if (lVar != null) {
            lVar.mo146xb9724478(aVar);
        }
        yj0.a.h(this, "com/tencent/mm/chatting/viewfactory/ContactItemView$updateViewModel$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
