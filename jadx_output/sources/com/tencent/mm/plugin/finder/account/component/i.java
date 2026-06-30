package com.tencent.mm.plugin.finder.account.component;

/* loaded from: classes2.dex */
public final class i implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.account.component.l f101707d;

    public i(com.tencent.mm.plugin.finder.account.component.l lVar, zy2.lc lcVar) {
        this.f101707d = lVar;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        j92.a aVar;
        jz5.f0 f0Var;
        java.lang.String str;
        r45.yn5 yn5Var;
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        j92.a aVar2 = (j92.a) holder.f293125i;
        com.tencent.mm.plugin.finder.account.component.l lVar = this.f101707d;
        if (lVar.f101714i.a(lVar.getContext()) || aVar2.f298353e) {
            return;
        }
        m92.b bVar = aVar2.f298352d;
        java.lang.String str2 = bVar.field_nickname;
        if (!(str2 == null || str2.length() == 0)) {
            java.util.ArrayList arrayList = lVar.f101712g;
            if (arrayList != null) {
                java.util.Iterator it = arrayList.iterator();
                aVar = null;
                while (it.hasNext()) {
                    j92.a aVar3 = (j92.a) it.next();
                    if (aVar3.f298353e) {
                        aVar = aVar3;
                    }
                }
            } else {
                aVar = null;
            }
            if (aVar != null) {
                aVar.f298353e = false;
            }
            aVar2.f298353e = true;
            adapter.notifyDataSetChanged();
            com.tencent.mm.plugin.finder.account.api.component.FinderAccountSwitchDrawer finderAccountSwitchDrawer = lVar.f101710e;
            if (finderAccountSwitchDrawer != null) {
                com.tencent.mm.view.drawer.RecyclerViewDrawer.o(finderAccountSwitchDrawer, false, 1, null);
            }
            lVar.f101710e = null;
            g92.b bVar2 = g92.b.f269769e;
            java.lang.String field_username = bVar.field_username;
            kotlin.jvm.internal.o.f(field_username, "field_username");
            bVar2.P0(field_username, "selfCenterSwitch");
            java.lang.String field_username2 = bVar.field_username;
            kotlin.jvm.internal.o.f(field_username2, "field_username");
            lVar.f101716n = field_username2;
            bVar2.z0(lVar.getContext(), field_username2);
            androidx.appcompat.app.AppCompatActivity activity = lVar.getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var = (com.tencent.mm.plugin.finder.viewmodel.component.f50) ((zy2.xa) pf5.z.f353948a.a(activity).c(zy2.xa.class));
            com.tencent.mars.xlog.Log.i("Finder.SelfUIC", "onAccountChanged");
            ((com.tencent.mm.plugin.finder.extension.reddot.e1) ((c61.l7) i95.n0.c(c61.l7.class)).nk().S()).h(xy2.c.e(f50Var.getContext()), zy2.y8.f477623s);
            f50Var.q7(false);
            db5.t7.m(lVar.getContext(), lVar.getResources().getString(com.tencent.mm.R.string.f6_));
            return;
        }
        if (!aVar2.f298355g) {
            db5.t7.m(lVar.getContext(), lVar.getResources().getString(com.tencent.mm.R.string.f491247ci1, java.lang.Integer.valueOf(lVar.f101717o)));
            return;
        }
        r45.zn5 zn5Var = aVar2.f298354f;
        if (zn5Var != null) {
            java.util.LinkedList list = zn5Var.getList(0);
            if (list == null || (yn5Var = (r45.yn5) kz5.n0.Z(list)) == null || (str = yn5Var.getString(0)) == null) {
                str = "";
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_create_scene", 2);
            intent.putExtra("KEY_OTHER_USER", g92.b.f269769e.T0().length() > 0);
            intent.putExtra("KEY_WX_USERNAME", str);
            ((com.tencent.mm.plugin.finder.assist.i0) ((c61.ub) i95.n0.c(c61.ub.class))).rj(lVar.getActivity(), intent, 11104);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            y61.e eVar = (y61.e) i95.n0.c(y61.e.class);
            androidx.appcompat.app.AppCompatActivity activity2 = lVar.getActivity();
            ((m61.i) eVar).getClass();
            android.content.Intent intent2 = new android.content.Intent(activity2, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.PreCheckAffiliateAccountUI.class);
            intent2.putExtra("RegScene", 2);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(702);
            arrayList2.add(intent2);
            java.util.Collections.reverse(arrayList2);
            yj0.a.k(activity2, arrayList2.toArray(), "com/tencent/mm/plugin/account/PluginAccount", "startAffiliateAccount", "(Landroid/app/Activity;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        }
        com.tencent.mm.plugin.finder.account.api.component.FinderAccountSwitchDrawer finderAccountSwitchDrawer2 = lVar.f101710e;
        if (finderAccountSwitchDrawer2 != null) {
            com.tencent.mm.view.drawer.RecyclerViewDrawer.o(finderAccountSwitchDrawer2, false, 1, null);
        }
        lVar.f101710e = null;
    }
}
