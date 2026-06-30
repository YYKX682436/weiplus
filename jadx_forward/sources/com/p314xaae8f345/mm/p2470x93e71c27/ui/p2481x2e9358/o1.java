package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public class o1 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 f272061d;

    public o1(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33) {
        this.f272061d = c19666xfd6e2f33;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        fl5.i iVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/chat/ChatFooter$21", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        hv4.l lVar = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33.f271483x6;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f272061d;
        c19666xfd6e2f33.getClass();
        if (!c19666xfd6e2f33.f271567o2 || c19666xfd6e2f33.f271543k2 || c19666xfd6e2f33.f271503d2 != 0 || (iVar = c19666xfd6e2f33.f271554m) == null || (iVar.getText() != null && c19666xfd6e2f33.f271554m.getText().length() != 0)) {
            yj0.a.i(false, this, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$21", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
        c19666xfd6e2f33.f271549l2 = true;
        yj0.a.i(true, this, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$21", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
