package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2491xf1c361fc;

/* loaded from: classes15.dex */
public class a implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2491xf1c361fc.C19758xc331845e f273585d;

    public a(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2491xf1c361fc.C19758xc331845e c19758xc331845e) {
        this.f273585d = c19758xc331845e;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/websearch/WebSearchVoiceInputLayoutImpl$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        int i17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2491xf1c361fc.C19758xc331845e.f273578w;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2491xf1c361fc.C19758xc331845e c19758xc331845e = this.f273585d;
        int i18 = c19758xc331845e.f271389g;
        c19758xc331845e.f273581t = true;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.g3 g3Var = c19758xc331845e.f273580s;
        g3Var.f272389s = 7;
        g3Var.f272390t.cancel();
        g3Var.invalidateSelf();
        yj0.a.i(true, this, "com/tencent/mm/pluginsdk/ui/websearch/WebSearchVoiceInputLayoutImpl$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
