package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.l$$b */
/* loaded from: classes5.dex */
public final /* synthetic */ class C19136x31a3f6 implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.l f261926d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f261927e;

    public /* synthetic */ C19136x31a3f6(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.l lVar, android.view.View view) {
        this.f261926d = lVar;
        this.f261927e = view;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.l lVar = this.f261926d;
        lVar.getClass();
        android.view.View view = this.f261927e;
        boolean z17 = view instanceof android.widget.TextView;
        android.content.Context context = lVar.f261917d;
        if (z17) {
            if (bool.booleanValue()) {
                ((android.widget.TextView) view).setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574220oc3));
            } else {
                ((android.widget.TextView) view).setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574221oc4));
            }
        }
        if (bool.booleanValue()) {
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
            e4Var.f293309c = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ikb);
            e4Var.b(com.p314xaae8f345.mm.R.raw.f81211xadecd6f4);
            e4Var.c();
        } else {
            int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
            e4Var2.f293309c = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574514ij5);
            e4Var2.b(com.p314xaae8f345.mm.R.raw.f81211xadecd6f4);
            e4Var2.c();
        }
        return jz5.f0.f384359a;
    }
}
