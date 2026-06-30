package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public final class f5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o5 f289206d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s35.b f289207e;

    public f5(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o5 o5Var, s35.b bVar) {
        this.f289206d = o5Var;
        this.f289207e = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/FolderHelper$initBanner$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o5 o5Var = this.f289206d;
        if (currentTimeMillis - o5Var.f289456J < 1000) {
            yj0.a.h(this, "com/tencent/mm/ui/conversation/FolderHelper$initBanner$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        o5Var.f289456J = currentTimeMillis;
        if (this.f289207e.i()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FolderHelper", "fold banner clicked !");
            o5Var.v();
        }
        yj0.a.h(this, "com/tencent/mm/ui/conversation/FolderHelper$initBanner$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
