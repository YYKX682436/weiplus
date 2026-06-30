package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public class pa implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta f282807d;

    public pa(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta taVar) {
        this.f282807d = taVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta taVar = this.f282807d;
        if (taVar.f282957b != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryViewHolder", "%d video wait play on click, play video %d", java.lang.Integer.valueOf(taVar.hashCode()), java.lang.Integer.valueOf(taVar.f282958c));
            int i17 = taVar.f282958c;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var = taVar.f282957b;
            k1Var.f282631p.A(k1Var.y(i17), i17);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
