package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class f6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18631x6637f79d f255396d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f255397e;

    public f6(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18631x6637f79d activityC18631x6637f79d, java.lang.String str) {
        this.f255396d = activityC18631x6637f79d;
        this.f255397e = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivity$showCustomDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18631x6637f79d activityC18631x6637f79d = this.f255396d;
        android.widget.EditText editText = activityC18631x6637f79d.f255063x;
        java.lang.String obj = r26.n0.u0(java.lang.String.valueOf(editText != null ? editText.getText() : null)).toString();
        activityC18631x6637f79d.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "<set-?>");
        activityC18631x6637f79d.f255049g = obj;
        lj4.d dVar = activityC18631x6637f79d.f255050h;
        java.lang.String str = this.f255397e;
        if (dVar != null) {
            java.lang.String str2 = dVar.f400515e;
            if (str2 != null) {
                str = str2;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18631x6637f79d.U6(activityC18631x6637f79d, str);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18631x6637f79d.U6(activityC18631x6637f79d, str);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivity$showCustomDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
