package bk1;

/* loaded from: classes4.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bk1.w f21338d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.privacy.manage.AppBrandPrivacyManagePage f21339e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bk1.f0 f21340f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(bk1.w wVar, com.tencent.mm.plugin.appbrand.ui.privacy.manage.AppBrandPrivacyManagePage appBrandPrivacyManagePage, bk1.f0 f0Var) {
        super(1);
        this.f21338d = wVar;
        this.f21339e = appBrandPrivacyManagePage;
        this.f21340f = f0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Object obj2;
        bk1.x appAuthScopeInfo = (bk1.x) obj;
        kotlin.jvm.internal.o.g(appAuthScopeInfo, "appAuthScopeInfo");
        bk1.w wVar = this.f21338d;
        wVar.getClass();
        java.lang.String username = appAuthScopeInfo.f21357a;
        kotlin.jvm.internal.o.g(username, "username");
        java.util.HashMap hashMap = wVar.f21356e;
        jz5.l lVar = (jz5.l) hashMap.get(username);
        bk1.y yVar = lVar != null ? (bk1.y) lVar.f302833d : null;
        if (yVar != null) {
            java.util.List list = this.f21340f.f21303c;
            bk1.d dVar = com.tencent.mm.plugin.appbrand.ui.privacy.manage.AppBrandPrivacyManagePage.f89928e;
            com.tencent.mm.plugin.appbrand.ui.privacy.manage.AppBrandPrivacyManagePage appBrandPrivacyManagePage = this.f21339e;
            appBrandPrivacyManagePage.getClass();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj3 : appAuthScopeInfo.f21358b) {
                if (list.contains(((bk1.o) obj3).f21341a.f390056d)) {
                    arrayList.add(obj3);
                }
            }
            if (arrayList.isEmpty()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandPrivacyManagePage", "merge, not need");
            } else {
                java.util.LinkedList linkedList = new java.util.LinkedList(yVar.f21360b);
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    bk1.o oVar = (bk1.o) it.next();
                    java.util.Iterator it6 = linkedList.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it6.next();
                        if (kotlin.jvm.internal.o.b(oVar.f21341a.f390056d, ((r45.xf7) obj2).f390056d)) {
                            break;
                        }
                    }
                    r45.xf7 xf7Var = (r45.xf7) obj2;
                    if (oVar.f21342b) {
                        if (xf7Var == null) {
                            r45.xf7 xf7Var2 = new r45.xf7();
                            r45.xf7 xf7Var3 = oVar.f21341a;
                            xf7Var2.f390056d = xf7Var3.f390056d;
                            xf7Var2.f390057e = xf7Var3.f390057e;
                            linkedList.addFirst(xf7Var2);
                        }
                    } else if (xf7Var != null) {
                        linkedList.remove(xf7Var);
                    }
                }
                yVar = new bk1.y(yVar.f21359a, linkedList, yVar.f21361c);
            }
            bk1.y l07 = appBrandPrivacyManagePage.l0(yVar);
            java.lang.String str = l07.f21359a.field_username;
            jz5.l lVar2 = (jz5.l) hashMap.remove(str);
            if (lVar2 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandPrivacyManagePage", "onUserAuthorizeScopeChanged, " + str + " is not exists");
            } else {
                int intValue = ((java.lang.Number) lVar2.f302834e).intValue();
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPrivacyManagePage", "onUserAuthorizeScopeChanged, pos: " + intValue);
                java.util.ArrayList arrayList2 = wVar.f21355d;
                arrayList2.remove(intValue);
                arrayList2.add(intValue, l07);
                kotlin.jvm.internal.o.d(str);
                hashMap.put(str, new jz5.l(l07, java.lang.Integer.valueOf(intValue)));
                wVar.notifyItemChanged(intValue);
            }
        }
        return jz5.f0.f302826a;
    }
}
