package com.tencent.mm.plugin.finder.account.component;

/* loaded from: classes2.dex */
public final class p implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.account.component.s f101724d;

    public p(com.tencent.mm.plugin.finder.account.component.s sVar) {
        this.f101724d = sVar;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        j92.a aVar = (j92.a) holder.f293125i;
        com.tencent.mm.plugin.finder.account.component.s sVar = this.f101724d;
        if (sVar.f101732i.a(sVar.getContext())) {
            return;
        }
        java.lang.String str = aVar.f298352d.field_nickname;
        if (str == null || str.length() == 0) {
            if (!aVar.f298355g) {
                db5.t7.m(sVar.getContext(), sVar.getResources().getString(com.tencent.mm.R.string.f491247ci1, java.lang.Integer.valueOf(sVar.f101735o)));
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            int integer = sVar.f101737q.getInteger(0);
            intent.putExtra("KEY_CREATE_SCENE_USER_TYPE", integer != 1 ? integer != 2 ? integer != 3 ? integer != 4 ? 0 : 103 : 104 : 101 : 102);
            intent.putExtra("KEY_CREATE_SCENE_FEED_ID", sVar.f101737q.getLong(1));
            com.tencent.mars.xlog.Log.i("MicroMsg.NewLife.FinderAccountSwitchUICForNewLife", "onAddAccount() called with: requestCode:11104 context = " + sVar.getContext());
            c61.ub ubVar = (c61.ub) i95.n0.c(c61.ub.class);
            android.app.Activity context = sVar.getContext();
            ((com.tencent.mm.plugin.finder.assist.i0) ubVar).getClass();
            kotlin.jvm.internal.o.g(context, "context");
            intent.addFlags(67108864);
            intent.setClass(context, com.tencent.mm.plugin.finder.ui.FinderCreateContactUI.class);
            com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.ui.MMFragmentActivity) context : null;
            com.tencent.mm.ui.vc startActivityForResult = mMFragmentActivity != null ? mMFragmentActivity.startActivityForResult(intent) : null;
            if (startActivityForResult != null) {
                ((com.tencent.mm.ui.bd) startActivityForResult).f197877a = com.tencent.mm.plugin.finder.account.component.r.f101726a;
            }
            com.tencent.mm.plugin.finder.account.api.component.FinderAccountSwitchDrawer finderAccountSwitchDrawer = sVar.f101728e;
            if (finderAccountSwitchDrawer != null) {
                com.tencent.mm.view.drawer.RecyclerViewDrawer.o(finderAccountSwitchDrawer, false, 1, null);
            }
        }
    }
}
