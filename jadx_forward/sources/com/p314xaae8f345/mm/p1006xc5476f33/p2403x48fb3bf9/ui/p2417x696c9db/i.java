package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes5.dex */
public class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19307x65cbeee9 f266347d;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19307x65cbeee9 activityC19307x65cbeee9) {
        this.f266347d = activityC19307x65cbeee9;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/CreateAvatarUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) this.f266347d, 1, false);
        k0Var.f293405n = new db5.o4() { // from class: com.tencent.mm.plugin.webview.ui.tools.i$$a
            @Override // db5.o4
            /* renamed from: onCreateMMMenu */
            public final void mo887xc459429a(db5.g4 g4Var) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19307x65cbeee9 activityC19307x65cbeee9 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.i.this.f266347d;
                g4Var.f(1, activityC19307x65cbeee9.mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lsr));
                g4Var.f(0, activityC19307x65cbeee9.mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lsq));
            }
        };
        k0Var.f293414s = new db5.t4() { // from class: com.tencent.mm.plugin.webview.ui.tools.i$$b
            @Override // db5.t4
            /* renamed from: onMMMenuItemSelected */
            public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.i iVar = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.i.this;
                iVar.getClass();
                int itemId = menuItem.getItemId();
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19307x65cbeee9 activityC19307x65cbeee9 = iVar.f266347d;
                if (itemId != 0) {
                    if (itemId != 1) {
                        return;
                    }
                    ((ub0.r) ((vb0.o) i95.n0.c(vb0.o.class))).getClass();
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.e(activityC19307x65cbeee9, 4, 1, 5, null);
                    return;
                }
                java.lang.String str = activityC19307x65cbeee9.f265121h;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CreateAvatarUI", "doGetRandomAvatar appid: %s", str);
                gm0.j1.d().g(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.e1(str));
                activityC19307x65cbeee9.f265134x = java.lang.System.currentTimeMillis();
            }
        };
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/CreateAvatarUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
