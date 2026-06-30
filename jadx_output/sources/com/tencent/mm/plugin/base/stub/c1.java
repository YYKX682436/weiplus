package com.tencent.mm.plugin.base.stub;

/* loaded from: classes8.dex */
public class c1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.base.stub.WXEntryActivity f93724d;

    public c1(com.tencent.mm.plugin.base.stub.WXEntryActivity wXEntryActivity) {
        this.f93724d = wXEntryActivity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/base/stub/WXEntryActivity$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.base.stub.WXEntryActivity.f93685y;
        com.tencent.mm.plugin.base.stub.WXEntryActivity wXEntryActivity = this.f93724d;
        wXEntryActivity.i7();
        wXEntryActivity.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/base/stub/WXEntryActivity$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
