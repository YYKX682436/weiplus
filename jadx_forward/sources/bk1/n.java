package bk1;

/* loaded from: classes4.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bk1.w f102871d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1204xed412388.p1205xbf8a9d65.C12718xe1f0c9d6 f102872e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bk1.f0 f102873f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(bk1.w wVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1204xed412388.p1205xbf8a9d65.C12718xe1f0c9d6 c12718xe1f0c9d6, bk1.f0 f0Var) {
        super(1);
        this.f102871d = wVar;
        this.f102872e = c12718xe1f0c9d6;
        this.f102873f = f0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Object obj2;
        bk1.x appAuthScopeInfo = (bk1.x) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appAuthScopeInfo, "appAuthScopeInfo");
        bk1.w wVar = this.f102871d;
        wVar.getClass();
        java.lang.String username = appAuthScopeInfo.f102890a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        java.util.HashMap hashMap = wVar.f102889e;
        jz5.l lVar = (jz5.l) hashMap.get(username);
        bk1.y yVar = lVar != null ? (bk1.y) lVar.f384366d : null;
        if (yVar != null) {
            java.util.List list = this.f102873f.f102836c;
            bk1.d dVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1204xed412388.p1205xbf8a9d65.C12718xe1f0c9d6.f171461e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1204xed412388.p1205xbf8a9d65.C12718xe1f0c9d6 c12718xe1f0c9d6 = this.f102872e;
            c12718xe1f0c9d6.getClass();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj3 : appAuthScopeInfo.f102891b) {
                if (list.contains(((bk1.o) obj3).f102874a.f471589d)) {
                    arrayList.add(obj3);
                }
            }
            if (arrayList.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandPrivacyManagePage", "merge, not need");
            } else {
                java.util.LinkedList linkedList = new java.util.LinkedList(yVar.f102893b);
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
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(oVar.f102874a.f471589d, ((r45.xf7) obj2).f471589d)) {
                            break;
                        }
                    }
                    r45.xf7 xf7Var = (r45.xf7) obj2;
                    if (oVar.f102875b) {
                        if (xf7Var == null) {
                            r45.xf7 xf7Var2 = new r45.xf7();
                            r45.xf7 xf7Var3 = oVar.f102874a;
                            xf7Var2.f471589d = xf7Var3.f471589d;
                            xf7Var2.f471590e = xf7Var3.f471590e;
                            linkedList.addFirst(xf7Var2);
                        }
                    } else if (xf7Var != null) {
                        linkedList.remove(xf7Var);
                    }
                }
                yVar = new bk1.y(yVar.f102892a, linkedList, yVar.f102894c);
            }
            bk1.y l07 = c12718xe1f0c9d6.l0(yVar);
            java.lang.String str = l07.f102892a.f68924xdec927b;
            jz5.l lVar2 = (jz5.l) hashMap.remove(str);
            if (lVar2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandPrivacyManagePage", "onUserAuthorizeScopeChanged, " + str + " is not exists");
            } else {
                int intValue = ((java.lang.Number) lVar2.f384367e).intValue();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPrivacyManagePage", "onUserAuthorizeScopeChanged, pos: " + intValue);
                java.util.ArrayList arrayList2 = wVar.f102888d;
                arrayList2.remove(intValue);
                arrayList2.add(intValue, l07);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                hashMap.put(str, new jz5.l(l07, java.lang.Integer.valueOf(intValue)));
                wVar.m8147xed6e4d18(intValue);
            }
        }
        return jz5.f0.f384359a;
    }
}
