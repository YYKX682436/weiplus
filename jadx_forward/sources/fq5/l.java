package fq5;

/* loaded from: classes5.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2812xd0cf26bd.ui.p2813x2eaded.C22927xe8447aa8 f347208d;

    public l(com.p314xaae8f345.mm.p2812xd0cf26bd.ui.p2813x2eaded.C22927xe8447aa8 c22927xe8447aa8) {
        this.f347208d = c22927xe8447aa8;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/wedrop/ui/code/TransferFileUIC$onStatusChangedInner$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean c17 = jq5.n.f382815a.c();
        com.p314xaae8f345.mm.p2812xd0cf26bd.ui.p2813x2eaded.C22927xe8447aa8 c22927xe8447aa8 = this.f347208d;
        if (c17) {
            jq5.b.f382788a.b().G("is_first_receive", false);
            c22927xe8447aa8.U6();
        } else {
            v65.i.b(c22927xe8447aa8.f295816o, null, new fq5.k(c22927xe8447aa8, null), 1, null);
        }
        yj0.a.h(this, "com/tencent/mm/wedrop/ui/code/TransferFileUIC$onStatusChangedInner$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
