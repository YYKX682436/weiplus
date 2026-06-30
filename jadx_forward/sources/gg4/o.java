package gg4;

/* loaded from: classes11.dex */
public class o implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f353298d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2249x93e6da0e.ActivityC18539xe0826959 f353299e;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2249x93e6da0e.ActivityC18539xe0826959 activityC18539xe0826959, int i17) {
        this.f353299e = activityC18539xe0826959;
        this.f353298d = i17;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/subapp/ui/pluginapp/ContactSearchResultUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2249x93e6da0e.ActivityC18539xe0826959 activityC18539xe0826959 = this.f353299e;
        int headerViewsCount = i17 - activityC18539xe0826959.f253953d.getHeaderViewsCount();
        if (headerViewsCount < 0 || headerViewsCount >= activityC18539xe0826959.f253953d.getCount()) {
            yj0.a.h(this, "com/tencent/mm/plugin/subapp/ui/pluginapp/ContactSearchResultUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        if (headerViewsCount >= activityC18539xe0826959.f253954e.size()) {
            r45.cx5 cx5Var = (r45.cx5) activityC18539xe0826959.f253955f.get(i17 - activityC18539xe0826959.f253954e.size());
            activityC18539xe0826959.getClass();
            android.content.Intent intent = new android.content.Intent();
            int i18 = cx5Var.f453441o;
            qk.p.b(intent, cx5Var, 2 == i18 ? 15 : 1 == i18 ? 1 : 0);
            j45.l.j(activityC18539xe0826959, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
            yj0.a.h(this, "com/tencent/mm/plugin/subapp/ui/pluginapp/ContactSearchResultUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        r45.gw5 gw5Var = (r45.gw5) activityC18539xe0826959.f253954e.get(headerViewsCount);
        java.lang.String str = gw5Var.f457094d.f454289d;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(str, true);
        if (n17.r2()) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("Contact_User", str);
            intent2.putExtra("Contact_Scene", 3);
            if (str != null && str.length() > 0) {
                if (n17.k2()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(10298, str.concat(",35"));
                    intent2.putExtra("Contact_Scene", 35);
                }
                j45.l.j(activityC18539xe0826959, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent2, null);
            }
        } else {
            if ((gw5Var.f457104q & 8) > 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(10298, gw5Var.f457094d.f454289d + ",35");
            }
            android.content.Intent intent3 = new android.content.Intent();
            intent3.putExtra("Contact_User", gw5Var.f457094d.f454289d);
            intent3.putExtra("Contact_Alias", gw5Var.f457107t);
            intent3.putExtra("Contact_Nick", gw5Var.f457095e.f454289d);
            intent3.putExtra("Contact_Signature", gw5Var.f457102o);
            intent3.putExtra("Contact_RegionCode", com.p314xaae8f345.mm.p2621x8fb0427b.ha.q(gw5Var.A, gw5Var.f457100m, gw5Var.f457101n));
            intent3.putExtra("Contact_Sex", gw5Var.f457098h);
            intent3.putExtra("Contact_VUser_Info", gw5Var.f457105r);
            intent3.putExtra("Contact_VUser_Info_Flag", gw5Var.f457104q);
            intent3.putExtra("Contact_KWeibo_flag", gw5Var.f457109v);
            intent3.putExtra("Contact_KWeibo", gw5Var.f457106s);
            intent3.putExtra("Contact_KWeiboNick", gw5Var.f457108u);
            intent3.putExtra("Contact_KSnsIFlag", gw5Var.f457113z.f452961d);
            intent3.putExtra("Contact_KSnsBgId", gw5Var.f457113z.f452963f);
            intent3.putExtra("Contact_KSnsBgUrl", gw5Var.f457113z.f452962e);
            intent3.putExtra("Contact_Scene", 35);
            int i19 = this.f353298d;
            if (i19 != 0) {
                intent3.putExtra("add_more_friend_search_scene", i19);
            }
            r45.va0 va0Var = gw5Var.C;
            if (va0Var != null) {
                try {
                    intent3.putExtra("Contact_customInfo", va0Var.mo14344x5f01b1f6());
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ContactSearchResultUI", e17, "", new java.lang.Object[0]);
                }
            }
            if ((gw5Var.f457104q & 8) > 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(10298, gw5Var.f457094d.f454289d + ",35");
            }
            j45.l.j(activityC18539xe0826959, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent3, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/subapp/ui/pluginapp/ContactSearchResultUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
