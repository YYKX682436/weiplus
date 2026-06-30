package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* loaded from: classes15.dex */
public class v3 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.C19656x5a7dec62 f273565d;

    public v3(com.p314xaae8f345.mm.p2470x93e71c27.ui.C19656x5a7dec62 c19656x5a7dec62) {
        this.f273565d = c19656x5a7dec62;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/VoiceInputLayoutImpl$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19656x5a7dec62 c19656x5a7dec62 = this.f273565d;
        int i17 = c19656x5a7dec62.f271389g;
        c19656x5a7dec62.f271399t = true;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.g3 g3Var = c19656x5a7dec62.f271398s;
        g3Var.f272389s = 7;
        g3Var.f272390t.cancel();
        g3Var.invalidateSelf();
        yj0.a.i(true, this, "com/tencent/mm/pluginsdk/ui/VoiceInputLayoutImpl$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
