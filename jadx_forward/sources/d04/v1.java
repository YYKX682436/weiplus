package d04;

/* loaded from: classes8.dex */
public final class v1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f307058d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d04.w1 f307059e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f307060f;

    public v1(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, d04.w1 w1Var, int i17) {
        this.f307058d = h0Var;
        this.f307059e = w1Var;
        this.f307060f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int indexOf;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/scanner/ui/widget/ScanProductMaskDecorView$ProductInfoAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f307058d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanProductMaskDecorView", "onScanProductItemClick reqKey: %s", ((sz3.w0) h0Var.f391656d).f495672j);
        d04.w1 w1Var = this.f307059e;
        d04.i iVar = w1Var.f307074n;
        if (iVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
            sz3.w0 w0Var = (sz3.w0) h0Var.f391656d;
            java.util.ArrayList arrayList2 = w1Var.f307072i;
            iVar.a(view, w0Var, null, arrayList2 == null ? 0 : arrayList2.size(), ((arrayList2 == null || arrayList2.isEmpty()) || (indexOf = arrayList2.indexOf(java.lang.Integer.valueOf(this.f307060f))) == -1) ? 1 : indexOf + 1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/scanner/ui/widget/ScanProductMaskDecorView$ProductInfoAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
