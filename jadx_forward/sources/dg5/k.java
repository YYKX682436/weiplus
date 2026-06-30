package dg5;

/* loaded from: classes11.dex */
public class k implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f313908d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f313909e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dg5.n f313910f;

    public k(dg5.n nVar, boolean z17, java.lang.String str) {
        this.f313910f = nVar;
        this.f313908d = z17;
        this.f313909e = str;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        s01.a0 a0Var;
        int itemId = menuItem.getItemId();
        dg5.n nVar = this.f313910f;
        if (itemId == 1) {
            boolean a17 = nVar.a();
            com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = nVar.f313913d;
            if (a17) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", nVar.f313919m.f65834x53f3fff9);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EnterpriseConversationDropMenuPresenter", "KRawUrl :%s", nVar.f313919m.f65834x53f3fff9);
                intent.putExtra("useJs", true);
                intent.addFlags(67108864);
                if (activityC21401x6ce6f73f instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
                    ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activityC21401x6ce6f73f).m78545xde66c1f2(nVar);
                } else if (activityC21401x6ce6f73f instanceof com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2698xc90c42a8.AbstractActivityC22393x78692359) {
                    ((com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2698xc90c42a8.AbstractActivityC22393x78692359) activityC21401x6ce6f73f).f289509e = nVar;
                }
                j45.l.n(activityC21401x6ce6f73f, "webview", ".ui.tools.WebViewUI", intent, 1);
                return;
            }
            dp.a.m125854x26a183b(activityC21401x6ce6f73f, nVar.b(com.p314xaae8f345.mm.R.C30867xcad56011.f572290ao1), 0).show();
            s01.d0 Vi = r01.q3.Vi();
            java.lang.String str = nVar.f313918i;
            java.lang.String z07 = Vi.z0(str);
            s01.a0 y07 = r01.q3.Vi().y0(z07);
            nVar.f313919m = y07;
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = str;
            objArr[1] = z07;
            objArr[2] = java.lang.Boolean.valueOf(y07 == null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EnterpriseConversationDropMenuPresenter", "updateBizChatMyUserInfo: %s:%s,myBizChatUserInfo is null:%s", objArr);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z07) || (a0Var = nVar.f313919m) == null || a0Var.u0() || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(nVar.f313919m.f65834x53f3fff9)) {
                r01.q3.Ni().h(str, nVar);
                nVar.f313915f = db5.e1.Q(nVar.f313913d, nVar.b(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), nVar.b(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new dg5.l(nVar));
                return;
            }
            return;
        }
        if (itemId == 2) {
            if (!this.f313908d) {
                nVar.f313920n.a(nVar.f313916g);
                nVar.f313920n.b(nVar.f313913d);
                return;
            }
            android.content.Intent intent2 = new android.content.Intent();
            java.lang.String str2 = this.f313909e;
            intent2.putExtra("rawUrl", str2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EnterpriseConversationDropMenuPresenter", "KRawUrl :%s", str2);
            intent2.putExtra("useJs", true);
            intent2.addFlags(67108864);
            j45.l.n(nVar.f313913d, "webview", ".ui.tools.WebViewUI", intent2, 0);
            return;
        }
        if (itemId == 3) {
            android.content.Intent intent3 = new android.content.Intent();
            intent3.putExtra("Contact_User", nVar.f313916g);
            j45.l.j(nVar.f313913d, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent3, null);
            return;
        }
        if (itemId != 4) {
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(nVar.f313918i)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EnterpriseConversationDropMenuPresenter", "brandUserName null");
            return;
        }
        android.content.Intent intent4 = new android.content.Intent(nVar.f313913d, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21585x4f340ac4.class);
        intent4.putExtra("Contact_User", nVar.f313918i);
        intent4.addFlags(67108864);
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f2 = nVar.f313913d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC21401x6ce6f73f2, arrayList.toArray(), "com/tencent/mm/ui/conversation/presenter/EnterpriseConversationDropMenuPresenter$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC21401x6ce6f73f2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC21401x6ce6f73f2, "com/tencent/mm/ui/conversation/presenter/EnterpriseConversationDropMenuPresenter$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
