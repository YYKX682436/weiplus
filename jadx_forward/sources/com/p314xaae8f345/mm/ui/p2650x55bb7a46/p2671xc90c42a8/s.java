package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public class s implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.t f283979d;

    public s(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.t tVar) {
        this.f283979d = tVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        java.lang.Object[] objArr = new java.lang.Object[2];
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.t tVar = this.f283979d;
        objArr[0] = java.lang.Boolean.valueOf(tVar.f284004f.f284080m == null);
        objArr[1] = java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(tVar.f284002d));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseHistoryListPresenter", "[onTimerExpired]  mDataListCache is null?:%s mSearchText is null?:%s", objArr);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(tVar.f284002d)) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y yVar = tVar.f284004f;
            yVar.f284077g.f279966e = tVar.f284002d;
            java.util.ArrayList arrayList = yVar.f284080m;
            if (arrayList == null) {
                yVar.a(true);
            } else {
                yVar.f284079i = arrayList;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.q(this));
            }
            return false;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y yVar2 = tVar.f284004f;
        yVar2.f284079i = yVar2.f284080m;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = tVar.f284004f.f284079i;
        if (arrayList3 != null) {
            java.util.Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.f0 f0Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.f0) it.next();
                if (f0Var.d(tVar.f284002d)) {
                    arrayList2.add(f0Var);
                }
            }
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y yVar3 = tVar.f284004f;
        yVar3.f284079i = arrayList2;
        yVar3.f284077g.f279966e = tVar.f284002d;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.r(this));
        return false;
    }
}
