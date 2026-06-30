package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class x7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18635xb8188ef9 f255957d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f255958e;

    public x7(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18635xb8188ef9 activityC18635xb8188ef9, java.lang.String str) {
        this.f255957d = activityC18635xb8188ef9;
        this.f255958e = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$showCustomDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18635xb8188ef9 activityC18635xb8188ef9 = this.f255957d;
        android.widget.EditText editText = activityC18635xb8188ef9.f255094y1;
        java.lang.String obj = r26.n0.u0(java.lang.String.valueOf(editText != null ? editText.getText() : null)).toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "<set-?>");
        activityC18635xb8188ef9.f255074i = obj;
        lj4.d dVar = activityC18635xb8188ef9.f255076m;
        if (dVar != null) {
            java.lang.String str = dVar.f400515e;
            if (str == null) {
                str = this.f255958e;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18635xb8188ef9.X6(activityC18635xb8188ef9, str, false, false, 6, null);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18635xb8188ef9.X6(activityC18635xb8188ef9, this.f255958e, false, false, 6, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$showCustomDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
