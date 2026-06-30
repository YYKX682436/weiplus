package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes12.dex */
public class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21601xaeea84d6 f283447d;

    public l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21601xaeea84d6 activityC21601xaeea84d6) {
        this.f283447d = activityC21601xaeea84d6;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/AppAttachNewDownloadUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.a aVar = new yz5.a() { // from class: com.tencent.mm.ui.chatting.l$$a
            @Override // yz5.a
            /* renamed from: invoke */
            public final java.lang.Object mo152xb9724478() {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21601xaeea84d6.U6(com.p314xaae8f345.mm.ui.p2650x55bb7a46.l.this.f283447d);
                return null;
            }
        };
        int i17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21601xaeea84d6.Y1;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21601xaeea84d6 activityC21601xaeea84d6 = this.f283447d;
        boolean z17 = false;
        if (activityC21601xaeea84d6.C.contains(".apk")) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(activityC21601xaeea84d6.mo55332x76847179(), 1, 2, false);
            z2Var.m(activityC21601xaeea84d6.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), activityC21601xaeea84d6.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571325bt));
            z2Var.o(0);
            com.p314xaae8f345.mm.ui.bk.r0(z2Var.C.getPaint(), 0.8f);
            z2Var.v(activityC21601xaeea84d6.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.m mVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.m(activityC21601xaeea84d6, z2Var);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.n nVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.n(activityC21601xaeea84d6, aVar, z2Var);
            z2Var.D = mVar;
            z2Var.E = nVar;
            z2Var.q(activityC21601xaeea84d6.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dt9));
            android.widget.TextView textView = new android.widget.TextView(activityC21601xaeea84d6);
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.dt8);
            textView.setTextColor(activityC21601xaeea84d6.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560252fa));
            textView.setTextSize(14.0f);
            z2Var.j(textView);
            z2Var.C();
            z17 = true;
        }
        if (!z17) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21601xaeea84d6.U6(activityC21601xaeea84d6);
        }
        com.p314xaae8f345.mm.ui.p2731xc84c5534.b.f291152a.c(activityC21601xaeea84d6.f279650v, null, null, 1, false, false);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/AppAttachNewDownloadUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
