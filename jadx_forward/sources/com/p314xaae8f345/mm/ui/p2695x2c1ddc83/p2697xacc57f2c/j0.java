package com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c;

/* loaded from: classes5.dex */
public class j0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.k0 f289057d;

    public j0(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.k0 k0Var) {
        this.f289057d = k0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/banner/NetWarnBanner$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.k0 k0Var = this.f289057d;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.b1((android.content.Context) k0Var.f484375g.get(), k0Var.f289069w)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, ((android.content.Context) k0Var.f484375g.get()).getString(com.p314xaae8f345.mm.R.C30867xcad56011.h7m));
            intent.putExtra("rawUrl", ((android.content.Context) k0Var.f484375g.get()).getString(com.p314xaae8f345.mm.R.C30867xcad56011.h7h));
            intent.putExtra("showShare", false);
            j45.l.j((android.content.Context) k0Var.f484375g.get(), "webview", ".ui.tools.WebViewUI", intent, null);
        }
        yj0.a.h(this, "com/tencent/mm/ui/conversation/banner/NetWarnBanner$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
