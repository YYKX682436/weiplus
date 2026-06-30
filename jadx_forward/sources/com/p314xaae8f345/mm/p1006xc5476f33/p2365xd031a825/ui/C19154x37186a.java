package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.x$$b */
/* loaded from: classes5.dex */
public final /* synthetic */ class C19154x37186a implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.x f262317d;

    public /* synthetic */ C19154x37186a(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.x xVar) {
        this.f262317d = xVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.x xVar = this.f262317d;
        android.widget.TextView textView = xVar.f262314i;
        android.content.Context context = xVar.f262309d;
        if (textView != null) {
            if (bool.booleanValue()) {
                xVar.f262314i.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574220oc3));
            } else {
                xVar.f262314i.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574221oc4));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPay.ContactWidgetWxPayNotify", "[onBottomTipsClick] payBottomTips:" + xVar.f262314i.hashCode() + ",this:" + xVar.hashCode());
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
