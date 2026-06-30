package qj5;

/* loaded from: classes8.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qj5.n f445504d;

    public g(qj5.n nVar) {
        this.f445504d = nVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/screenshot/MMImageBottomSheet$initView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        qj5.n nVar = this.f445504d;
        if (nVar.f445520u2) {
            nVar.x();
            qj5.b bVar = qj5.n.I2;
            qj5.b bVar2 = qj5.n.I2;
            if (bVar2 != null) {
                ((com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.h0) bVar2).b("generate_image_entry_btn", "view_clk");
            }
        } else {
            nVar.z();
            qj5.b bVar3 = qj5.n.I2;
            qj5.b bVar4 = qj5.n.I2;
            if (bVar4 != null) {
                ((com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.h0) bVar4).b("restore_screenshot_btn", "view_clk");
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/screenshot/MMImageBottomSheet$initView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
