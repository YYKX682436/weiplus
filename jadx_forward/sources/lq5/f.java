package lq5;

/* loaded from: classes3.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lq5.h f402005d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f402006e;

    public f(lq5.h hVar, int i17) {
        this.f402005d = hVar;
        this.f402006e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/wepicker/WePicker$WePickerAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        lq5.h hVar = this.f402005d;
        yz5.l lVar = hVar.f402014n;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Integer.valueOf(this.f402006e - (hVar.f402008e / 2)));
        }
        yj0.a.h(this, "com/tencent/mm/wepicker/WePicker$WePickerAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
