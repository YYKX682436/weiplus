package io;

/* loaded from: classes3.dex */
public final class b0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xb5.a f374701d;

    public b0(xb5.a aVar) {
        this.f374701d = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatting/viewfactory/ContactItemView$updateViewModel$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xb5.a aVar = this.f374701d;
        yz5.l lVar = aVar.f534543h;
        if (lVar != null) {
            lVar.mo146xb9724478(aVar);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactItemView", "onClick, viewModel: " + aVar);
        yj0.a.h(this, "com/tencent/mm/chatting/viewfactory/ContactItemView$updateViewModel$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
