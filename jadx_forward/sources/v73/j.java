package v73;

/* loaded from: classes9.dex */
public class j implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16099xbf243344 f515234d;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16099xbf243344 activityC16099xbf243344) {
        this.f515234d = activityC16099xbf243344;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.ArrayList<com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c> a17;
        at4.z1 z1Var = (at4.z1) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16099xbf243344 activityC16099xbf243344 = this.f515234d;
        activityC16099xbf243344.mo48627xce38d9a();
        java.lang.String str = activityC16099xbf243344.f223793d;
        if (z1Var == null || !z1Var.f95577g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "bind query fail, use default bankcardList");
            a17 = at4.l1.a(false);
        } else {
            a17 = z1Var.f95571a;
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = z1Var.f95573c;
            if (c19091x9511676c != null) {
                a17.add(0, c19091x9511676c);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c2 = z1Var.f95572b;
            if (c19091x9511676c2 != null) {
                a17.add(0, c19091x9511676c2);
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c3 : a17) {
            if (c19091x9511676c3.A0()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "remove honey card %s", c19091x9511676c3.f69225xed6d60f6);
            } else {
                arrayList.add(c19091x9511676c3);
            }
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC16099xbf243344.mo55332x76847179();
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c4 = activityC16099xbf243344.G;
        java.lang.String string = activityC16099xbf243344.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fx8);
        java.lang.String string2 = activityC16099xbf243344.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fx7);
        v73.i iVar = new v73.i(this, arrayList);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) mo55332x76847179, 2, true);
        k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.c1(arrayList, mo55332x76847179, new java.util.HashMap(), k0Var, false, false, "");
        k0Var.f293414s = iVar;
        k0Var.Y1 = true;
        android.view.View inflate = android.view.LayoutInflater.from(mo55332x76847179).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571144d56, (android.view.ViewGroup) null);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
            ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.agb)).setText(string);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string2)) {
            android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.aga);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletBankcardBottomSheetHelper", "showBankcardBottomSheet", "(Landroid/content/Context;Ljava/util/List;Lcom/tencent/mm/plugin/wallet_core/model/Bankcard;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Lcom/tencent/mm/ui/base/MMMenuListener$OnMMMenuItemSelectedListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/wallet_core/ui/WalletBankcardBottomSheetHelper", "showBankcardBottomSheet", "(Landroid/content/Context;Ljava/util/List;Lcom/tencent/mm/plugin/wallet_core/model/Bankcard;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Lcom/tencent/mm/ui/base/MMMenuListener$OnMMMenuItemSelectedListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.aga)).setText(string2);
        }
        k0Var.s(inflate, false);
        if (c19091x9511676c4 != null) {
            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) arrayList.get(i17)).f69225xed6d60f6.equals(c19091x9511676c4.f69225xed6d60f6)) {
                    k0Var.f293384a2 = i17;
                }
            }
        }
        k0Var.v();
        activityC16099xbf243344.T = null;
        return null;
    }
}
