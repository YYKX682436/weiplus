package com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui;

/* loaded from: classes.dex */
public final class t1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11495xd59e7ca0 f156160d;

    public t1(com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11495xd59e7ca0 activityC11495xd59e7ca0) {
        this.f156160d = activityC11495xd59e7ca0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/address/ui/WalletAddAddressUI$onCreate$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11495xd59e7ca0 lifecycleOwner = this.f156160d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = lifecycleOwner.f156007s;
        if (c22621x7603e017 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("addrCaptureET");
            throw null;
        }
        java.lang.String obj = c22621x7603e017.getText().toString();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = lifecycleOwner.mo55332x76847179();
        int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(mo55332x76847179);
        e4Var.f293309c = lifecycleOwner.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ezh);
        e4Var.f293313g = 2;
        e4Var.f293311e = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.s1 s1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.s1(e4Var.c(), lifecycleOwner);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycleOwner, "lifecycleOwner");
        if (obj == null || r26.n0.N(obj)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AnalyseRcptInfoCgi", "doCgi addr is empty");
            s1Var.mo146xb9724478(null);
        } else {
            v65.i.b(new com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a("AnalyseRcptInfoCgi", lifecycleOwner, 0, 4, null), null, new q71.c(obj, s1Var, null), 1, null);
        }
        lifecycleOwner.mo48674x36654fab();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("recognize_address_edit", "view_clk", lifecycleOwner.f156000i, 33328);
        yj0.a.h(this, "com/tencent/mm/plugin/address/ui/WalletAddAddressUI$onCreate$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
