package fq5;

/* loaded from: classes5.dex */
public final class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2812xd0cf26bd.ui.p2813x2eaded.C22927xe8447aa8 f347209d;

    public m(com.p314xaae8f345.mm.p2812xd0cf26bd.ui.p2813x2eaded.C22927xe8447aa8 c22927xe8447aa8) {
        this.f347209d = c22927xe8447aa8;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/wedrop/ui/code/TransferFileUIC$onStatusChangedInner$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2812xd0cf26bd.ui.p2813x2eaded.C22927xe8447aa8 c22927xe8447aa8 = this.f347209d;
        if (c22927xe8447aa8.f295811g != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeDrop.TransferFileUIC", "loadQrcode() called");
            c22927xe8447aa8.V6(3);
            v65.i.b(c22927xe8447aa8.f295816o, null, new fq5.h(c22927xe8447aa8, null), 1, null);
        } else {
            c22927xe8447aa8.U6();
        }
        yj0.a.h(this, "com/tencent/mm/wedrop/ui/code/TransferFileUIC$onStatusChangedInner$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
