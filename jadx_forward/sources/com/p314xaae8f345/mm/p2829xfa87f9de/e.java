package com.p314xaae8f345.mm.p2829xfa87f9de;

/* loaded from: classes7.dex */
public class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.webkit.ValueCallback f296363d;

    public e(android.webkit.ValueCallback valueCallback) {
        this.f296363d = valueCallback;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/xwebutil/FileReaderLogic$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f296363d.onReceiveValue("fileReaderClosed");
        yj0.a.h(this, "com/tencent/mm/xwebutil/FileReaderLogic$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
