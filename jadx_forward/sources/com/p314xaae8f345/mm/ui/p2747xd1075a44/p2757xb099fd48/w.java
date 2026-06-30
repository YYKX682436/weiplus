package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48;

/* loaded from: classes5.dex */
public class w implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i f293544d;

    public w(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i iVar) {
        this.f293544d = iVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/dialog/MMAlertDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i iVar = this.f293544d;
        if (iVar != null) {
            iVar.a();
        }
        yj0.a.h(this, "com/tencent/mm/ui/widget/dialog/MMAlertDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
